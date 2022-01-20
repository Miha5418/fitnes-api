package ru.karpeikin.ru.fitnes.rest.admin.api.dto;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-20T13:51:57.681634+07:00[Asia/Novosibirsk]")
public class ClientInfo   {
  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("surName")
  private String surName;

  @JsonProperty("midleName")
  private String midleName;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("memberShipNumber")
  private String memberShipNumber;

  @JsonProperty("mail")
  private String mail;

  @JsonProperty("memberShipDateStart")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private Instant memberShipDateStart;

  @JsonProperty("memberShipDateEnd")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private Instant memberShipDateEnd;

  @JsonProperty("isActive")
  private Boolean isActive;

  public ClientInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * имя клиента
   * @return lastName
  */
  @ApiModelProperty(required = true, value = "имя клиента")
  @NotNull

@Size(max=250) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClientInfo surName(String surName) {
    this.surName = surName;
    return this;
  }

  /**
   * фамилия клиента
   * @return surName
  */
  @ApiModelProperty(required = true, value = "фамилия клиента")
  @NotNull

@Size(max=250) 
  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public ClientInfo midleName(String midleName) {
    this.midleName = midleName;
    return this;
  }

  /**
   * отчество клиента
   * @return midleName
  */
  @ApiModelProperty(value = "отчество клиента")

@Size(max=250) 
  public String getMidleName() {
    return midleName;
  }

  public void setMidleName(String midleName) {
    this.midleName = midleName;
  }

  public ClientInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Номер телефона
   * @return phone
  */
  @ApiModelProperty(value = "Номер телефона")

@Size(min=11,max=11) 
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ClientInfo memberShipNumber(String memberShipNumber) {
    this.memberShipNumber = memberShipNumber;
    return this;
  }

  /**
   * Номер абонемента
   * @return memberShipNumber
  */
  @ApiModelProperty(required = true, value = "Номер абонемента")
  @NotNull


  public String getMemberShipNumber() {
    return memberShipNumber;
  }

  public void setMemberShipNumber(String memberShipNumber) {
    this.memberShipNumber = memberShipNumber;
  }

  public ClientInfo mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Адрес электронной почты
   * @return mail
  */
  @ApiModelProperty(value = "Адрес электронной почты")

@Size(min=1,max=100) @javax.validation.constraints.Email
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public ClientInfo memberShipDateStart(Instant memberShipDateStart) {
    this.memberShipDateStart = memberShipDateStart;
    return this;
  }

  /**
   * Дата начала действия абонемента
   * @return memberShipDateStart
  */
  @ApiModelProperty(value = "Дата начала действия абонемента")

  @Valid

  public Instant getMemberShipDateStart() {
    return memberShipDateStart;
  }

  public void setMemberShipDateStart(Instant memberShipDateStart) {
    this.memberShipDateStart = memberShipDateStart;
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
    return Objects.equals(this.lastName, clientInfo.lastName) &&
        Objects.equals(this.surName, clientInfo.surName) &&
        Objects.equals(this.midleName, clientInfo.midleName) &&
        Objects.equals(this.phone, clientInfo.phone) &&
        Objects.equals(this.memberShipNumber, clientInfo.memberShipNumber) &&
        Objects.equals(this.mail, clientInfo.mail) &&
        Objects.equals(this.memberShipDateStart, clientInfo.memberShipDateStart) &&
        Objects.equals(this.memberShipDateEnd, clientInfo.memberShipDateEnd) &&
        Objects.equals(this.isActive, clientInfo.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, surName, midleName, phone, memberShipNumber, mail, memberShipDateStart, memberShipDateEnd, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfo {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    surName: ").append(toIndentedString(surName)).append("\n");
    sb.append("    midleName: ").append(toIndentedString(midleName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    memberShipNumber: ").append(toIndentedString(memberShipNumber)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    memberShipDateStart: ").append(toIndentedString(memberShipDateStart)).append("\n");
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

