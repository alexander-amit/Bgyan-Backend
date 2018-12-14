package com.nitie.bgyan.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * NewsResponseDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-14T20:19:56.469+05:30")

public class NewsResponseDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("headline")
  private String headline = null;

  public NewsResponseDto id(String id) {
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

  public NewsResponseDto author(String author) {
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

  public NewsResponseDto headline(String headline) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewsResponseDto newsResponseDto = (NewsResponseDto) o;
    return Objects.equals(this.id, newsResponseDto.id) &&
        Objects.equals(this.author, newsResponseDto.author) &&
        Objects.equals(this.headline, newsResponseDto.headline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, headline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewsResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
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

