package com.nitie.bgyan.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.nitie.bgyan.exception.FileStorageException;
import com.nitie.bgyan.exception.MyFileNotFoundException;
import com.nitie.bgyan.generated.dto.CAResponseDto;
import com.nitie.bgyan.generated.dto.CAResponseDtoList;
import com.nitie.bgyan.model.Abstract;
import com.nitie.bgyan.model.CurrentAffair;
import com.nitie.bgyan.model.Finance;
import com.nitie.bgyan.model.Marketing;
import com.nitie.bgyan.model.Operations;
import com.nitie.bgyan.repo.AbstractRepo;
import com.nitie.bgyan.repo.CurrentAffairRepo;
import com.nitie.bgyan.repo.FinanceRepo;
import com.nitie.bgyan.repo.MarketingRepo;
import com.nitie.bgyan.repo.OperationsRepo;

@Service
public class CAAnalysisService {
	@Autowired
	OperationsRepo opRepo;
	@Autowired
	AbstractRepo absRepo;
	@Autowired
	CurrentAffairRepo caRepo;
	@Autowired
	FinanceRepo financeRepo;
	@Autowired
	MarketingRepo marketingRepo;

	public Void deleteCAAnalysis(String section) {
		switch (section) {
		case "maketing":
			marketingRepo.deleteAll();
			break;
		case "operations":
			opRepo.deleteAll();
			break;
		case "currentaffair":
			caRepo.deleteAll();
			break;
		case "finance":
			financeRepo.deleteAll();
			break;
		case "abstract":
			absRepo.deleteAll();
			break;
		default:
			break;
		}
		return null;
	}

	public Void deleteCAAnalysisWithId(String section, String caId) {
		switch (section) {
		case "maketing":
			marketingRepo.deleteById(Integer.valueOf(caId));
			break;
		case "operations":
			opRepo.deleteById(Integer.valueOf(caId));
			break;
		case "currentaffair":
			caRepo.deleteById(Integer.valueOf(caId));
			break;
		case "finance":
			financeRepo.deleteById(Integer.valueOf(caId));
			break;
		case "abstract":
			absRepo.deleteById(Integer.valueOf(caId));
			break;
		default:
			break;
		}
		return null;
	}

	public CAResponseDtoList getAllCAIdList(String section) {
		CAResponseDtoList list = new CAResponseDtoList();
		switch (section) {
		case "maketing":
			marketingRepo.findAll().forEach(e -> list.addCaIdListItem(e.getFileName()));
			break;
		case "operations":
			opRepo.findAll().forEach(e -> list.addCaIdListItem(e.getFileName()));
			break;
		case "currentaffair":
			caRepo.findAll().forEach(e -> list.addCaIdListItem(e.getFileName()));
			break;
		case "finance":
			financeRepo.findAll().forEach(e -> list.addCaIdListItem(e.getFileName()));
			break;
		case "abstract":
			absRepo.findAll().forEach(e -> list.addCaIdListItem(e.getFileName()));
			break;
		default:
			break;
		}
		return list;
	}

	public CAResponseDto uploadCAAnalysis(MultipartFile upfile, String author, String date, String section) {
		CAResponseDto cAResponseDto = new CAResponseDto();
		String fileName = StringUtils.cleanPath(upfile.getOriginalFilename());
		try {
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}
			switch (section) {
			case "maketing":
				Marketing market = new Marketing();
				market.setAuthor(author);
				market.setData(upfile.getBytes());
				market.setDate(date);
				market.setFileName(fileName);
				market.setFileType(upfile.getContentType());
				market.setId(fileName.hashCode());
				marketingRepo.save(market);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "operations":
				Operations op = new Operations();
				op.setAuthor(author);
				op.setData(upfile.getBytes());
				op.setDate(date);
				op.setFileName(fileName);
				op.setFileType(upfile.getContentType());
				op.setId(fileName.hashCode());
				opRepo.save(op);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "currentaffair":
				CurrentAffair ca = new CurrentAffair();
				ca.setAuthor(author);
				ca.setData(upfile.getBytes());
				ca.setDate(date);
				ca.setFileName(fileName);
				ca.setFileType(upfile.getContentType());
				ca.setId(fileName.hashCode());
				caRepo.save(ca);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "finance":
				Finance fin = new Finance();
				fin.setAuthor(author);
				fin.setData(upfile.getBytes());
				fin.setDate(date);
				fin.setFileName(fileName);
				fin.setFileType(upfile.getContentType());
				fin.setId(fileName.hashCode());
				financeRepo.save(fin);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "abstract":
				Abstract ab = new Abstract();
				ab.setAuthor(author);
				ab.setData(upfile.getBytes());
				ab.setDate(date);
				ab.setFileName(fileName);
				ab.setFileType(upfile.getContentType());
				ab.setId(fileName.hashCode());
				absRepo.save(ab);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			default:
				break;
			}
		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
		return cAResponseDto;
	}

	public CAResponseDto updateCAAnalysis(MultipartFile upfile, String author, String date, String section) {
		CAResponseDto cAResponseDto = new CAResponseDto();
		String fileName = StringUtils.cleanPath(upfile.getOriginalFilename());
		try {
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}
			switch (section) {
			case "maketing":
				Marketing market = marketingRepo.findById(fileName.hashCode())
						.orElseThrow(() -> new MyFileNotFoundException("File not found with id "
								+ StringUtils.cleanPath(upfile.getOriginalFilename()).hashCode()));
				;
				market.setAuthor(author);
				market.setData(upfile.getBytes());
				market.setDate(date);
				market.setFileName(fileName);
				market.setFileType(upfile.getContentType());
				market.setId(fileName.hashCode());
				marketingRepo.save(market);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "operations":
				Operations op = opRepo.findById(fileName.hashCode()).orElseThrow(() -> new MyFileNotFoundException(
						"File not found with id " + StringUtils.cleanPath(upfile.getOriginalFilename()).hashCode()));
				;
				op.setAuthor(author);
				op.setData(upfile.getBytes());
				op.setDate(date);
				op.setFileName(fileName);
				op.setFileType(upfile.getContentType());
				op.setId(fileName.hashCode());
				opRepo.save(op);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "currentaffair":
				CurrentAffair ca = caRepo.findById(fileName.hashCode()).orElseThrow(() -> new MyFileNotFoundException(
						"File not found with id " + StringUtils.cleanPath(upfile.getOriginalFilename()).hashCode()));
				;
				ca.setAuthor(author);
				ca.setData(upfile.getBytes());
				ca.setDate(date);
				ca.setFileName(fileName);
				ca.setFileType(upfile.getContentType());
				ca.setId(fileName.hashCode());
				caRepo.save(ca);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "finance":
				Finance fin = financeRepo.findById(fileName.hashCode()).orElseThrow(() -> new MyFileNotFoundException(
						"File not found with id " + StringUtils.cleanPath(upfile.getOriginalFilename()).hashCode()));
				;
				fin.setAuthor(author);
				fin.setData(upfile.getBytes());
				fin.setDate(date);
				fin.setFileName(fileName);
				fin.setFileType(upfile.getContentType());
				fin.setId(fileName.hashCode());
				financeRepo.save(fin);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			case "abstract":
				Abstract ab = absRepo.findById(fileName.hashCode()).orElseThrow(() -> new MyFileNotFoundException(
						"File not found with id " + StringUtils.cleanPath(upfile.getOriginalFilename()).hashCode()));
				;
				ab.setAuthor(author);
				ab.setData(upfile.getBytes());
				ab.setDate(date);
				ab.setFileName(fileName);
				ab.setFileType(upfile.getContentType());
				ab.setId(fileName.hashCode());
				absRepo.save(ab);
				cAResponseDto.setAuthor(author);
				cAResponseDto.setDate(date);
				cAResponseDto.setHeadline(fileName);
				cAResponseDto.setSection(section);
				break;
			default:
				break;
			}
		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
		return cAResponseDto;

	}

	public ResponseEntity<Resource> getCAAnalysis(String section, String caId) {
		switch (section) {
		case "maketing":
			Marketing market = marketingRepo.findById(Integer.valueOf(caId))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + caId));
			;
			return ResponseEntity.ok().contentType(MediaType.parseMediaType(market.getFileType()))
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + market.getFileName() + "\"")
					.body(new ByteArrayResource(market.getData()));

		case "operations":
			Operations op = opRepo.findById(Integer.valueOf(caId))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + caId));
			;
			return ResponseEntity.ok().contentType(MediaType.parseMediaType(op.getFileType()))
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + op.getFileName() + "\"")
					.body(new ByteArrayResource(op.getData()));
		case "currentaffair":
			CurrentAffair ca = caRepo.findById(Integer.valueOf(caId))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + caId));
			;
			return ResponseEntity.ok().contentType(MediaType.parseMediaType(ca.getFileType()))
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + ca.getFileName() + "\"")
					.body(new ByteArrayResource(ca.getData()));
		case "finance":
			Finance fin = financeRepo.findById(Integer.valueOf(caId))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + caId));
			;
			return ResponseEntity.ok().contentType(MediaType.parseMediaType(fin.getFileType()))
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fin.getFileName() + "\"")
					.body(new ByteArrayResource(fin.getData()));
		case "abstract":
			Abstract ab = absRepo.findById(Integer.valueOf(caId))
					.orElseThrow(() -> new MyFileNotFoundException("File not found with id " + caId));
			;
			return ResponseEntity.ok().contentType(MediaType.parseMediaType(ab.getFileType()))
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + ab.getFileName() + "\"")
					.body(new ByteArrayResource(ab.getData()));
		default:
			break;
		}
		return null;
	}

}
