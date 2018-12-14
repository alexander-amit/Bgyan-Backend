package com.nitie.bgyan.generated.api;

import com.nitie.bgyan.generated.dto.QuestionDto;
import com.nitie.bgyan.generated.dto.QuestionDtoList;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-14T13:29:59.698+05:30")

@Api(value = "Questions", description = "the Questions API")
public interface QuestionsApi {

    @ApiOperation(value = "Get 10 random question from section", notes = "", response = QuestionDtoList.class, tags={ "MustKnowQuestion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returned List of All News Id", response = QuestionDtoList.class),
        @ApiResponse(code = 405, message = "Invalid input", response = QuestionDtoList.class) })
    @RequestMapping(value = "/Questions/{section}",
        method = RequestMethod.GET)
    default ResponseEntity<QuestionDtoList> getRandomQuestion(@ApiParam(value = "Section of CA",required=true ) @PathVariable("section") String section) {
        // do some magic!
        return new ResponseEntity<QuestionDtoList>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get 10 random question from section", notes = "", response = Void.class, tags={ "MustKnowQuestion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted question with Id", response = Void.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/Questions/{section}/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> getRandomQuestion(@ApiParam(value = "Section of CA",required=true ) @PathVariable("section") String section,
        @ApiParam(value = "Id of question",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Repository of Must Know Question", notes = "", response = QuestionDto.class, tags={ "MustKnowQuestion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Question Uploaded", response = QuestionDto.class),
        @ApiResponse(code = 405, message = "Invalid Question format", response = QuestionDto.class) })
    @RequestMapping(value = "/Questions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<QuestionDto> updateQuestion() {
        // do some magic!
        return new ResponseEntity<QuestionDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Repository of Must Know Question", notes = "", response = QuestionDto.class, tags={ "MustKnowQuestion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Question Uploaded", response = QuestionDto.class),
        @ApiResponse(code = 405, message = "Invalid Question format", response = QuestionDto.class) })
    @RequestMapping(value = "/Questions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<QuestionDto> uploadQuestion() {
        // do some magic!
        return new ResponseEntity<QuestionDto>(HttpStatus.OK);
    }

}
