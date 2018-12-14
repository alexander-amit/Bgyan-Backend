package com.nitie.bgyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.nitie.bgyan.generated.api.QuestionsApi;
import com.nitie.bgyan.generated.dto.QuestionDto;
import com.nitie.bgyan.generated.dto.QuestionDtoList;
import com.nitie.bgyan.service.QuestionsService;

@RestController
public class QuestionsController implements QuestionsApi {

	@Autowired
	QuestionsService qservice;
	@Override
	public ResponseEntity<QuestionDto> deleteQuestionWithId(String section, String id) {
		return new ResponseEntity<QuestionDto>(qservice.deleteQuestionWithId(section, id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<QuestionDtoList> getRandomQuestion(String section) {
		return new ResponseEntity<QuestionDtoList>(qservice.getRandomQuestion(section), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<QuestionDto> updateQuestion(QuestionDto questionDto) {
		return new ResponseEntity<QuestionDto>(qservice.updateQuestion(questionDto), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<QuestionDto> uploadQuestion(QuestionDto questionDto) {
		return new ResponseEntity<QuestionDto>(qservice.uploadQuestion(questionDto), HttpStatus.OK);	}

	
	

}
