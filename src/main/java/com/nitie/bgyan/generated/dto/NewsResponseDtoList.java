package com.nitie.bgyan.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * NewsResponseDtoList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-14T20:56:45.582+05:30")

public class NewsResponseDtoList   {
  @JsonProperty("newsIdList")
  private List<String> newsIdList = new ArrayList<String>();

  public NewsResponseDtoList newsIdList(List<String> newsIdList) {
    this.newsIdList = newsIdList;
    return this;
  }

  public NewsResponseDtoList addNewsIdListItem(String newsIdListItem) {
    this.newsIdList.add(newsIdListItem);
    return this;
  }

   /**
   * Get newsIdList
   * @return newsIdList
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<String> getNewsIdList() {
    return newsIdList;
  }

  public void setNewsIdList(List<String> newsIdList) {
    this.newsIdList = newsIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewsResponseDtoList newsResponseDtoList = (NewsResponseDtoList) o;
    return Objects.equals(this.newsIdList, newsResponseDtoList.newsIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newsIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewsResponseDtoList {\n");
    
    sb.append("    newsIdList: ").append(toIndentedString(newsIdList)).append("\n");
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

