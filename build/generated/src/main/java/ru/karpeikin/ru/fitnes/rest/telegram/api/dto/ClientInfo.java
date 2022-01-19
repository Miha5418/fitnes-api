package ru.karpeikin.ru.fitnes.rest.telegram.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.time.Instant;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Информация о клиенте для создания и отображения
 */
@ApiModel(description = "Информация о клиенте для создания и отображения")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-19T14:23:03.136589+07:00[Asia/Novosibirsk]")
public class ClientInfo   {
  @JsonProperty("memberShipNumber")
  private String memberShipNumber;

  @JsonProperty("memberShipDateEnd")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private Instant memberShipDateEnd;

  @JsonProperty("isActive")
  private Boolean isActive;

  public ClientInfo memberShipNumber(String memberShipNumber) {
    this.memberShipNumber = memberShipNumber;
    return this;
  }

  /**
   * Номер абонемента
   * @return memberShipNumber
  */
  @ApiModelProperty(value = "Номер абонемента")


  public String getMemberShipNumber() {
    return memberShipNumber;
  }

  public void setMemberShipNumber(String memberShipNumber) {
    this.memberShipNumber = memberShipNumber;
  }

  public ClientInfo memberShipDateEnd(Instant memberShipDateEnd) {
    this.memberShipDateEnd = memberShipDateEnd;
    return this;
  }

  /**
   * Дата окончания действия абонемента
   * @return memberShipDateEnd
  */
  @ApiModelProperty(value = "Дата окончания действия абонемента")

  @Valid

  public Instant getMemberShipDateEnd() {
    return memberShipDateEnd;
  }

  public void setMemberShipDateEnd(Instant memberShipDateEnd) {
    this.memberShipDateEnd = memberShipDateEnd;
  }

  public ClientInfo isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Активен адонемент или нет
   * @return isActive
  */
  @ApiModelProperty(value = "Активен адонемент или нет")


  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfo clientInfo = (ClientInfo) o;
    return Objects.equals(this.memberShipNumber, clientInfo.memberShipNumber) &&
        Objects.equals(this.memberShipDateEnd, clientInfo.memberShipDateEnd) &&
        Objects.equals(this.isActive, clientInfo.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberShipNumber, memberShipDateEnd, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfo {\n");
    
    sb.append("    memberShipNumber: ").append(toIndentedString(memberShipNumber)).append("\n");
    sb.append("    memberShipDateEnd: ").append(toIndentedString(memberShipDateEnd)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

