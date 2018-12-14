package com.nitie.bgyan.generated.api;

import com.nitie.bgyan.generated.dto.CAResponseDto;
import com.nitie.bgyan.generated.dto.CAResponseDtoList;
import java.io.File;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-14T20:56:45.582+05:30")

@Api(value = "CAAnalysis", description = "the CAAnalysis API")
public interface CAAnalysisApi {

    @ApiOperation(value = "Delete all CA analysis of a particular section", notes = "", response = Void.class, tags={ "CurrentAffairAnalysisGDPrepration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully Deleted all CA analysis with specified section", response = Void.class),
        @ApiResponse(code = 405, message = "Invalid input to delete CA analysis of section.", response = Void.class) })
    @RequestMapping(value = "/CAAnalysis/{section}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteCAAnalysis(@ApiParam(value = "Section of CA",required=true ) @PathVariable("section") String section) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete CA analysis of a particular section with particular ID", notes = "", response = Void.class, tags={ "CurrentAffairAnalysisGDPrepration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully Deleted CA analysis with specified section and ID", response = Void.class),
        @ApiResponse(code = 405, message = "Invalid input to delete CA analysis of section.", response = Void.class) })
    @RequestMapping(value = "/CAAnalysis/{section}/{CAId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteCAAnalysisWithId(@ApiParam(value = "Section of CA",required=true ) @PathVariable("section") String section,
        @ApiParam(value = "Id of CA",required=true ) @PathVariable("caId") String caId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get CA analysis List", notes = "", response = CAResponseDtoList.class, tags={ "CurrentAffairAnalysisGDPrepration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returned List of All CA Id", response = CAResponseDtoList.class),
        @ApiResponse(code = 405, message = "Invalid input for get all CA Id", response = CAResponseDtoList.class) })
    @RequestMapping(value = "/CAAnalysis/{section}",
        method = RequestMethod.GET)
    default ResponseEntity<CAResponseDtoList> getAllCAIdList(@ApiParam(value = "Section of CA",required=true ) @PathVariable("section") String section) {
        // do some magic!
        return new ResponseEntity<CAResponseDtoList>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update Existing News", notes = "", response = CAResponseDto.class, tags={ "CurrentAffairAnalysisGDPrepration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Updated", response = CAResponseDto.class),
        @ApiResponse(code = 405, message = "Invalid CA update Analysis format", response = CAResponseDto.class) })
    @RequestMapping(value = "/CAAnalysis",
        consumes = { "multipart/form-data" },
        method = RequestMethod.PUT)
    default ResponseEntity<CAResponseDto> updateCAAnalysis(@ApiParam(value = "file detail") @RequestPart("file") MultipartFile upfile,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="author", required=true)  String author,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="date", required=true)  String date,
        @ApiParam(value = "Description of section of contents.", required=true ) @RequestPart(value="section", required=true)  String section) {
        // do some magic!
        return new ResponseEntity<CAResponseDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Repository of CA Analysis", notes = "", response = CAResponseDto.class, tags={ "CurrentAffairAnalysisGDPrepration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "News Uploaded", response = CAResponseDto.class),
        @ApiResponse(code = 405, message = "Invalid CA upload Analysis format", response = CAResponseDto.class) })
    @RequestMapping(value = "/CAAnalysis",
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<CAResponseDto> uploadCAAnalysis(@ApiParam(value = "file detail") @RequestPart("file") MultipartFile upfile,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="author", required=true)  String author,
        @ApiParam(value = "Description of file contents.", required=true ) @RequestPart(value="date", required=true)  String date,
        @ApiParam(value = "Description of section of contents.", required=true ) @RequestPart(value="section", required=true)  String section) {
        // do some magic!
        return new ResponseEntity<CAResponseDto>(HttpStatus.OK);
    }

}
