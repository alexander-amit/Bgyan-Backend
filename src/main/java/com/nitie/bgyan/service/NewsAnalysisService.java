package com.nitie.bgyan.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.nitie.bgyan.exception.FileStorageException;
import com.nitie.bgyan.exception.MyFileNotFoundException;
import com.nitie.bgyan.generated.dto.NewsResponseDto;
import com.nitie.bgyan.generated.dto.NewsResponseDtoList;
import com.nitie.bgyan.model.NewsAnalysis;
import com.nitie.bgyan.repo.NewsAnalysisRepo;

@Service
public class NewsAnalysisService {

	@Autowired
	NewsAnalysisRepo newsAnalysisRepo;

	public NewsResponseDto deleteNewsAnalysis(String newsId) {
		try {
			newsAnalysisRepo.deleteById(newsId.hashCode());
		} catch (Exception e) {
			throw new FileStorageException("Sorry! Filename not found" + newsId);
		}
		NewsResponseDto newsResponseDto = new NewsResponseDto();
		newsResponseDto.setId(String.valueOf(newsId.hashCode()));
		return newsResponseDto;
	}

	public NewsResponseDtoList getAllNewsIdList() {
		NewsResponseDtoList newsResponseDtoList = new NewsResponseDtoList();
		newsAnalysisRepo.findAll().forEach(news -> newsResponseDtoList.addNewsIdListItem(news.getFileName()));
		;
		// newsResponseDtoList.addNewsIdListItem(newsIdListItem)
		return newsResponseDtoList;
	}

	public NewsAnalysis getNewsAnalysis(String newsId) {
		return newsAnalysisRepo.findById(newsId.hashCode())
				.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + newsId.hashCode()));
	}

	public NewsResponseDto saveAnalysis(MultipartFile upfile, String author, String date) {
		String fileName = StringUtils.cleanPath(upfile.getOriginalFilename());
		NewsResponseDto newsResponseDto = new NewsResponseDto();
		try {
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}
			NewsAnalysis newsAnalysis = new NewsAnalysis(fileName, author, upfile.getContentType(), date, upfile.getBytes());
			newsAnalysisRepo.save(newsAnalysis);
			newsResponseDto.setAuthor(author);
			newsResponseDto.setId(String.valueOf(fileName.hashCode()));
			return newsResponseDto;
		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	public NewsResponseDto updateNewsAnalysis(MultipartFile upfile, String author, String date) {
		NewsAnalysis newsAnalysis = newsAnalysisRepo
				.findById(StringUtils.cleanPath(upfile.getOriginalFilename()).hashCode())
				.orElseThrow(() -> new MyFileNotFoundException(
						"File not found with id " + StringUtils.cleanPath(upfile.getOriginalFilename()).hashCode()));
		newsAnalysis.setAuthor(author);
		newsAnalysis.setDate(date);
		try {
			newsAnalysis.setData(upfile.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newsAnalysisRepo.save(newsAnalysis);
		NewsResponseDto newsResponseDto = new NewsResponseDto();
		newsResponseDto.setAuthor(author);
		newsResponseDto.setId(String.valueOf(newsAnalysis.getFileName()));
		return newsResponseDto;

	}
}