package com.nitie.bgyan.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nitie.bgyan.generated.dto.QuestionDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * QuestionDtoList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-14T13:29:59.698+05:30")

public class QuestionDtoList   {
  @JsonProperty("QuestionList")
  private List<QuestionDto> questionList = new ArrayList<QuestionDto>();

  public QuestionDtoList questionList(List<QuestionDto> questionList) {
    this.questionList = questionList;
    return this;
  }

  public QuestionDtoList addQuestionListItem(QuestionDto questionListItem) {
    this.questionList.add(questionListItem);
    return this;
  }

   /**
   * Get questionList
   * @return questionList
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<QuestionDto> getQuestionList() {
    return questionList;
  }

  public void setQuestionList(List<QuestionDto> questionList) {
    this.questionList = questionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionDtoList questionDtoList = (QuestionDtoList) o;
    return Objects.equals(this.questionList, questionDtoList.questionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionDtoList {\n");
    
    sb.append("    questionList: ").append(toIndentedString(questionList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

