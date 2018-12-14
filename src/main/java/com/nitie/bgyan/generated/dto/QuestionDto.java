package com.nitie.bgyan.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * QuestionDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-14T13:29:59.698+05:30")

public class QuestionDto   {
  @JsonProperty("Question")
  private String question = null;

  @JsonProperty("Answer")
  private String answer = null;

  @JsonProperty("id")
  private String id = null;

  public QuestionDto question(String question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public QuestionDto answer(String answer) {
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public QuestionDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionDto questionDto = (QuestionDto) o;
    return Objects.equals(this.question, questionDto.question) &&
        Objects.equals(this.answer, questionDto.answer) &&
        Objects.equals(this.id, questionDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answer, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionDto {\n");
    
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

