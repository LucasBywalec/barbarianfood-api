package com.zaiapi.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProfileSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T22:00:30.436912600+02:00[Europe/Warsaw]")
public class ProfileSettingsRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  public ProfileSettingsRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfileSettingsRequest surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public ProfileSettingsRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ProfileSettingsRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileSettingsRequest profileSettingsRequest = (ProfileSettingsRequest) o;
    return Objects.equals(this.name, profileSettingsRequest.name) &&
        Objects.equals(this.surname, profileSettingsRequest.surname) &&
        Objects.equals(this.email, profileSettingsRequest.email) &&
        Objects.equals(this.password, profileSettingsRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileSettingsRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

