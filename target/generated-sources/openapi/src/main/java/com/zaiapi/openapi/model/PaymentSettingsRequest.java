package com.zaiapi.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-20T22:00:30.436912600+02:00[Europe/Warsaw]")
public class PaymentSettingsRequest   {
  @JsonProperty("creditCardNumber")
  private String creditCardNumber;

  @JsonProperty("creditCardOwner")
  private String creditCardOwner;

  @JsonProperty("creditCardExpDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate creditCardExpDate;

  @JsonProperty("creditCardSecret")
  private String creditCardSecret;

  public PaymentSettingsRequest creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

  /**
   * Get creditCardNumber
   * @return creditCardNumber
  */
  @ApiModelProperty(value = "")


  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public PaymentSettingsRequest creditCardOwner(String creditCardOwner) {
    this.creditCardOwner = creditCardOwner;
    return this;
  }

  /**
   * Get creditCardOwner
   * @return creditCardOwner
  */
  @ApiModelProperty(value = "")


  public String getCreditCardOwner() {
    return creditCardOwner;
  }

  public void setCreditCardOwner(String creditCardOwner) {
    this.creditCardOwner = creditCardOwner;
  }

  public PaymentSettingsRequest creditCardExpDate(LocalDate creditCardExpDate) {
    this.creditCardExpDate = creditCardExpDate;
    return this;
  }

  /**
   * Get creditCardExpDate
   * @return creditCardExpDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreditCardExpDate() {
    return creditCardExpDate;
  }

  public void setCreditCardExpDate(LocalDate creditCardExpDate) {
    this.creditCardExpDate = creditCardExpDate;
  }

  public PaymentSettingsRequest creditCardSecret(String creditCardSecret) {
    this.creditCardSecret = creditCardSecret;
    return this;
  }

  /**
   * Get creditCardSecret
   * @return creditCardSecret
  */
  @ApiModelProperty(value = "")


  public String getCreditCardSecret() {
    return creditCardSecret;
  }

  public void setCreditCardSecret(String creditCardSecret) {
    this.creditCardSecret = creditCardSecret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettingsRequest paymentSettingsRequest = (PaymentSettingsRequest) o;
    return Objects.equals(this.creditCardNumber, paymentSettingsRequest.creditCardNumber) &&
        Objects.equals(this.creditCardOwner, paymentSettingsRequest.creditCardOwner) &&
        Objects.equals(this.creditCardExpDate, paymentSettingsRequest.creditCardExpDate) &&
        Objects.equals(this.creditCardSecret, paymentSettingsRequest.creditCardSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardNumber, creditCardOwner, creditCardExpDate, creditCardSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSettingsRequest {\n");
    
    sb.append("    creditCardNumber: ").append(toIndentedString(creditCardNumber)).append("\n");
    sb.append("    creditCardOwner: ").append(toIndentedString(creditCardOwner)).append("\n");
    sb.append("    creditCardExpDate: ").append(toIndentedString(creditCardExpDate)).append("\n");
    sb.append("    creditCardSecret: ").append(toIndentedString(creditCardSecret)).append("\n");
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

