package com.nitie.bgyan.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * CAResponseDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-14T13:29:59.698+05:30")

public class CAResponseDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("headline")
  private String headline = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("section")
  private String section = null;

  @JsonProperty("date")
  private String date = null;

  public CAResponseDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CAResponseDto headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public CAResponseDto author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public CAResponseDto section(String section) {
    this.section = section;
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public CAResponseDto date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CAResponseDto caResponseDto = (CAResponseDto) o;
    return Objects.equals(this.id, caResponseDto.id) &&
        Objects.equals(this.headline, caResponseDto.headline) &&
        Objects.equals(this.author, caResponseDto.author) &&
        Objects.equals(this.section, caResponseDto.section) &&
        Objects.equals(this.date, caResponseDto.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, headline, author, section, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CAResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

