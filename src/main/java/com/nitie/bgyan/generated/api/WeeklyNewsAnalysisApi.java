package com.nitie.bgyan.generated.api;

import java.io.File;
import com.nitie.bgyan.generated.dto.NewsResponseDto;
import com.nitie.bgyan.generated.dto.NewsResponseDtoList;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-12T12:52:35.847+05:30")

@Api(value = "WeeklyNewsAnalysis", description = "the WeeklyNewsAnalysis API")
public interface WeeklyNewsAnalysisApi {

    @ApiOperation(value = "Delete news analysis", notes = "", response = NewsResponseDto.class, tags={ "WeeklyNewsAnalysis", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delete operation with News Id", response = NewsResponseDto.class),
        @ApiResponse(code = 405, message = "Invalid input", response = NewsResponseDto.class) })
    @RequestMapping(value = "/WeeklyNewsAnalysis/{newsId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<NewsResponseDto> deleteNewsAnalysis(@ApiParam(value = "Id of news",required=true ) @PathVariable("newsId") String newsId) {
        // do some magic!
        return new ResponseEntity<NewsResponseDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get news analysis List", notes = "", response = NewsResponseDtoList.class, tags={ "WeeklyNewsAnalysis", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returned List of All News Id", response = NewsResponseDtoList.class),
        @ApiResponse(code = 405, message = "Invalid input", response = NewsResponseDtoList.class) })
    @RequestMapping(value = "/WeeklyNewsAnalysis",
        method = RequestMethod.GET)
    default ResponseEntity<NewsResponseDtoList> getAllNewsIdList() {
        // do some magic!
        return new ResponseEntity<NewsResponseDtoList>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update Existing News", notes = "", response = NewsResponseDto.class, tags={ "WeeklyNewsAnalysis", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = NewsResponseDto.class),
        @ApiResponse(code = 405, message = "Invalid News Analysis format", response = NewsResponseDto.class) })
    @RequestMapping(value = "/WeeklyNewsAnalysis",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.PUT)
    default ResponseEntity<NewsResponseDto> updateWeeklyNewsAnalysis(@ApiParam(value = "file detail") @RequestPart("file") MultipartFile upfile,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="author", required=true)  String author,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="date", required=true)  String date) {
        // do some magic!
        return new ResponseEntity<NewsResponseDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Repository of Weekly News Analysis", notes = "", response = NewsResponseDto.class, tags={ "WeeklyNewsAnalysis", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "News Uploaded", response = NewsResponseDto.class),
        @ApiResponse(code = 405, message = "Invalid News Analysis format", response = NewsResponseDto.class) })
    @RequestMapping(value = "/WeeklyNewsAnalysis",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<NewsResponseDto> uploadWeeklyNewsAnalysis(@ApiParam(value = "file detail") @RequestPart("file") MultipartFile upfile,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="author", required=true)  String author,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="date", required=true)  String date) {
        // do some magic!
        return new ResponseEntity<NewsResponseDto>(HttpStatus.OK);
    }

}
