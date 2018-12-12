package com.nitie.bgyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nitie.bgyan.generated.api.CAAnalysisApi;
import com.nitie.bgyan.generated.dto.CAResponseDto;
import com.nitie.bgyan.generated.dto.CAResponseDtoList;
import com.nitie.bgyan.service.CAAnalysisService;

@RestController
public class CAAnalysisController implements CAAnalysisApi {
	
	@Autowired
	CAAnalysisService cAAnalysisService; 
	
	@Override
	public ResponseEntity<Void> deleteCAAnalysis(String section) {
		return new ResponseEntity<Void>(cAAnalysisService.deleteCAAnalysis(section), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deleteCAAnalysisWithId(String section, String caId) {
		return new ResponseEntity<Void>(cAAnalysisService.deleteCAAnalysisWithId(section, caId), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<CAResponseDtoList> getAllCAIdList(String section) {
		return new ResponseEntity<CAResponseDtoList>(cAAnalysisService.getAllCAIdList(section), HttpStatus.OK);
	}

	@GetMapping("/CAAnalysis/{section}/{caId}")
	public ResponseEntity<Resource> getCAAnalysis(@PathVariable String section, @PathVariable String caId) {
		return cAAnalysisService.getCAAnalysis(section, caId);
		
	}

	@Override
	public ResponseEntity<CAResponseDto> updateCAAnalysis(MultipartFile upfile, String author, String date,
			String section) {
		return new ResponseEntity<CAResponseDto>(cAAnalysisService.updateCAAnalysis(upfile, author, date, section), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<CAResponseDto> uploadCAAnalysis(MultipartFile upfile, String author, String date,
			String section) {
		return new ResponseEntity<CAResponseDto>(cAAnalysisService.uploadCAAnalysis(upfile, author, date, section), HttpStatus.OK);
		}

}
