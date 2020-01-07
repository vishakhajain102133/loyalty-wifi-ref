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
 * Name to capture different parts of the user&#39;s name
 */
@ApiModel(description = "Name to capture different parts of the user's name")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-07T11:17:22.737-06:00[America/Chicago]")
public class Name {
  public static final String SERIALIZED_NAME_FAMILY_NAME = "familyName";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_FORMATTED = "formatted";
  @SerializedName(SERIALIZED_NAME_FORMATTED)
  private String formatted;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "givenName";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_HONORIFIC_PREFIX = "honorificPrefix";
  @SerializedName(SERIALIZED_NAME_HONORIFIC_PREFIX)
  private String honorificPrefix;

  public static final String SERIALIZED_NAME_HONORIFIC_SUFFIX = "honorificSuffix";
  @SerializedName(SERIALIZED_NAME_HONORIFIC_SUFFIX)
  private String honorificSuffix;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public Name familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Last name of user
   * @return familyName
  **/
  @ApiModelProperty(example = "Cardholder", value = "Last name of user")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Name formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

   /**
   * The full name, including all middle names, titles, and suffixes as appropriate, formatted for display(e.g., &#39;Ms. Barbara J Jensen, III&#39;).
   * @return formatted
  **/
  @ApiModelProperty(example = "Sally Cardholder", value = "The full name, including all middle names, titles, and suffixes as appropriate, formatted for display(e.g., 'Ms. Barbara J Jensen, III').")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public Name givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * First name of user
   * @return givenName
  **/
  @ApiModelProperty(example = "Sally", value = "First name of user")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public Name honorificPrefix(String honorificPrefix) {
    this.honorificPrefix = honorificPrefix;
    return this;
  }

   /**
   * Honorific prefix such as &#39;Mr.&#39;, &#39;Ms.&#39;, &#39;Dr.&#39;
   * @return honorificPrefix
  **/
  @ApiModelProperty(example = "Ms.", value = "Honorific prefix such as 'Mr.', 'Ms.', 'Dr.'")
  public String getHonorificPrefix() {
    return honorificPrefix;
  }

  public void setHonorificPrefix(String honorificPrefix) {
    this.honorificPrefix = honorificPrefix;
  }

  public Name honorificSuffix(String honorificSuffix) {
    this.honorificSuffix = honorificSuffix;
    return this;
  }

   /**
   * Honorific suffix such as &#39;Sr.&#39;, &#39;III&#39;, &#39;MD&#39;
   * @return honorificSuffix
  **/
  @ApiModelProperty(example = "Sr.", value = "Honorific suffix such as 'Sr.', 'III', 'MD'")
  public String getHonorificSuffix() {
    return honorificSuffix;
  }

  public void setHonorificSuffix(String honorificSuffix) {
    this.honorificSuffix = honorificSuffix;
  }

  public Name middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name of user
   * @return middleName
  **/
  @ApiModelProperty(example = "Q.", value = "Middle name of user")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.familyName, name.familyName) &&
        Objects.equals(this.formatted, name.formatted) &&
        Objects.equals(this.givenName, name.givenName) &&
        Objects.equals(this.honorificPrefix, name.honorificPrefix) &&
        Objects.equals(this.honorificSuffix, name.honorificSuffix) &&
        Objects.equals(this.middleName, name.middleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, formatted, givenName, honorificPrefix, honorificSuffix, middleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    honorificPrefix: ").append(toIndentedString(honorificPrefix)).append("\n");
    sb.append("    honorificSuffix: ").append(toIndentedString(honorificSuffix)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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

