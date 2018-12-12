package com.nitie.bgyan.generated.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nitie.bgyan.generated.dto.CAResponseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * CAResponseDtoList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-12T12:52:35.847+05:30")

public class CAResponseDtoList   {
  @JsonProperty("CAIdList")
  private List<CAResponseDto> caIdList = new ArrayList<CAResponseDto>();

  public CAResponseDtoList caIdList(List<CAResponseDto> caIdList) {
    this.caIdList = caIdList;
    return this;
  }

  public CAResponseDtoList addCaIdListItem(CAResponseDto caIdListItem) {
    this.caIdList.add(caIdListItem);
    return this;
  }

   /**
   * Get caIdList
   * @return caIdList
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<CAResponseDto> getCaIdList() {
    return caIdList;
  }

  public void setCaIdList(List<CAResponseDto> caIdList) {
    this.caIdList = caIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CAResponseDtoList caResponseDtoList = (CAResponseDtoList) o;
    return Objects.equals(this.caIdList, caResponseDtoList.caIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CAResponseDtoList {\n");
    
    sb.append("    caIdList: ").append(toIndentedString(caIdList)).append("\n");
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

