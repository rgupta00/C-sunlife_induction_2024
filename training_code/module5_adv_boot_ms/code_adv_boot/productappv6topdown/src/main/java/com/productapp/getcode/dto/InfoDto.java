package com.productapp.getcode.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InfoDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-06T11:35:02.499881800+05:30[Asia/Calcutta]")
public class InfoDto {

  private String message;

  @Valid
  private Map<String, String> contactDetails = new HashMap<>();

  @Valid
  private List<String> onCallSupport;

  public InfoDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InfoDto(String message) {
    this.message = message;
  }

  public InfoDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InfoDto contactDetails(Map<String, String> contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

  public InfoDto putContactDetailsItem(String key, String contactDetailsItem) {
    if (this.contactDetails == null) {
      this.contactDetails = new HashMap<>();
    }
    this.contactDetails.put(key, contactDetailsItem);
    return this;
  }

  /**
   * Get contactDetails
   * @return contactDetails
  */
  
  @Schema(name = "contactDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetails")
  public Map<String, String> getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(Map<String, String> contactDetails) {
    this.contactDetails = contactDetails;
  }

  public InfoDto onCallSupport(List<String> onCallSupport) {
    this.onCallSupport = onCallSupport;
    return this;
  }

  public InfoDto addOnCallSupportItem(String onCallSupportItem) {
    if (this.onCallSupport == null) {
      this.onCallSupport = new ArrayList<>();
    }
    this.onCallSupport.add(onCallSupportItem);
    return this;
  }

  /**
   * Get onCallSupport
   * @return onCallSupport
  */
  
  @Schema(name = "onCallSupport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onCallSupport")
  public List<String> getOnCallSupport() {
    return onCallSupport;
  }

  public void setOnCallSupport(List<String> onCallSupport) {
    this.onCallSupport = onCallSupport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoDto infoDto = (InfoDto) o;
    return Objects.equals(this.message, infoDto.message) &&
        Objects.equals(this.contactDetails, infoDto.contactDetails) &&
        Objects.equals(this.onCallSupport, infoDto.onCallSupport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, contactDetails, onCallSupport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoDto {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    onCallSupport: ").append(toIndentedString(onCallSupport)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

