/*
 * Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * 
 * Loyalty Wifi API
 * The Loyalty Boingo Wifi API offers cardholders, via their issuers, the ability to search and connect to Mastercard Global Wifi hotspots around the world through this digital channel. These APIs can be used to build a rich, interactive wifi experience within the issuer's existing mobile or web application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_wifi_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Photo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-07T11:17:22.737-06:00[America/Chicago]")
public class Photo {
  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Photo display(String display) {
    this.display = display;
    return this;
  }

   /**
   * A human-readable name, primarily used for display purposes. read-only.
   * @return display
  **/
  @ApiModelProperty(example = "portrait", value = "A human-readable name, primarily used for display purposes. read-only.")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Photo operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public Photo primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * If this is the primary photo for user
   * @return primary
  **/
  @ApiModelProperty(example = "false", value = "If this is the primary photo for user")
  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public Photo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A label indicating the attribute&#39;s function, Accepted values include: [photo, thumbnail]
   * @return type
  **/
  @ApiModelProperty(example = "thumbnail", value = "A label indicating the attribute's function, Accepted values include: [photo, thumbnail]")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Photo value(String value) {
    this.value = value;
    return this;
  }

   /**
   * URL of a photo of the User.
   * @return value
  **/
  @ApiModelProperty(example = "mastercard.com/patrickStar/photos/1", value = "URL of a photo of the User.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Photo photo = (Photo) o;
    return Objects.equals(this.display, photo.display) &&
        Objects.equals(this.operation, photo.operation) &&
        Objects.equals(this.primary, photo.primary) &&
        Objects.equals(this.type, photo.type) &&
        Objects.equals(this.value, photo.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, operation, primary, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Photo {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

