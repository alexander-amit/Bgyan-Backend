package com.nitie.bgyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nitie.bgyan.generated.api.WeeklyNewsAnalysisApi;
import com.nitie.bgyan.generated.dto.NewsResponseDto;
import com.nitie.bgyan.generated.dto.NewsResponseDtoList;
import com.nitie.bgyan.model.NewsAnalysis;
import com.nitie.bgyan.service.NewsAnalysisService;

@RestController
public class NewsAnalysisController implements WeeklyNewsAnalysisApi {

	@Autowired
	NewsAnalysisService newsAnalysisService;

	@Override
	public ResponseEntity<NewsResponseDto> deleteNewsAnalysis(String newsId) {
		return new ResponseEntity<NewsResponseDto>(newsAnalysisService.deleteNewsAnalysis(newsId), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<NewsResponseDtoList> getAllNewsIdList() {
		return new ResponseEntity<NewsResponseDtoList>(newsAnalysisService.getAllNewsIdList(), HttpStatus.OK);
	}
	
	@GetMapping("/WeeklyNewsAnalysis/{newsId}")
	public ResponseEntity<Resource> getNewsAnalysis(@PathVariable String newsId) {
		NewsAnalysis newsAnalysis = newsAnalysisService.getNewsAnalysis(newsId);

		return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(newsAnalysis.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + newsAnalysis.getFileName() + "\"")
				.body(new ByteArrayResource(newsAnalysis.getData()));
	}

	@Override
	public ResponseEntity<NewsResponseDto> updateWeeklyNewsAnalysis(MultipartFile upfile, String author, String date) {
		return new ResponseEntity<NewsResponseDto>(newsAnalysisService.updateNewsAnalysis(upfile,author,date), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<NewsResponseDto> uploadWeeklyNewsAnalysis(MultipartFile upfile, String author, String date) {
		return new ResponseEntity<NewsResponseDto>(newsAnalysisService.saveAnalysis(upfile,author,date), HttpStatus.OK);
	}

}
