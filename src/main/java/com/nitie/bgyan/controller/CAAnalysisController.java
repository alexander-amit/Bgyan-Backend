package com.nitie.bgyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;

import com.nitie.bgyan.generated.api.CAAnalysisApi;
import com.nitie.bgyan.generated.dto.CAResponseDto;
import com.nitie.bgyan.generated.dto.CAResponseDtoList;
import com.nitie.bgyan.service.CAAnalysisService;

public class CAAnalysisController implements CAAnalysisApi {
	
	@Autowired
	CAAnalysisService cAAnalysisService; 
	
	@Override
	public ResponseEntity<Void> deleteCAAnalysis(String section) {
		// TODO Auto-generated method stub
		return CAAnalysisApi.super.deleteCAAnalysis(section);
	}

	@Override
	public ResponseEntity<Void> deleteCAAnalysisWithId(String section, String caId) {
		// TODO Auto-generated method stub
		return CAAnalysisApi.super.deleteCAAnalysisWithId(section, caId);
	}

	@Override
	public ResponseEntity<CAResponseDtoList> getAllCAIdList(String section) {
		// TODO Auto-generated method stub
		return CAAnalysisApi.super.getAllCAIdList(section);
	}

	@GetMapping("/CAAnalysis/{section}/{CAId}")
	public ResponseEntity<CAResponseDto> getCAAnalysis(String section, String caId) {
		return null;
	}

	@Override
	public ResponseEntity<CAResponseDto> updateCAAnalysis(MultipartFile upfile, String author, String date,
			String section) {
		// TODO Auto-generated method stub
		return CAAnalysisApi.super.updateCAAnalysis(upfile, author, date, section);
	}

	@Override
	public ResponseEntity<CAResponseDto> uploadCAAnalysis(MultipartFile upfile, String author, String date,
			String section) {
		// TODO Auto-generated method stub
		return CAAnalysisApi.super.uploadCAAnalysis(upfile, author, date, section);
	}

}
