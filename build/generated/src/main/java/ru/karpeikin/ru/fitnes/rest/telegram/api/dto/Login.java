package ru.karpeikin.ru.fitnes.rest.telegram.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Запрос сообщение на вход в систему
 */
@ApiModel(description = "Запрос сообщение на вход в систему")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-13T16:55:53.134072+07:00[Asia/Novosibirsk]")
public class Login   {
  @JsonProperty("telegramId")
  private String telegramId;

  @JsonProperty("memberShipNumber")
  private String memberShipNumber;

  public Login telegramId(String telegramId) {
    this.telegramId = telegramId;
    return this;
  }

  /**
   * Идентификатор в телеграмме
   * @return telegramId
  */
  @ApiModelProperty(required = true, value = "Идентификатор в телеграмме")
  @NotNull

@Size(min=1,max=100) 
  public String getTelegramId() {
    return telegramId;
  }

  public void setTelegramId(String telegramId) {
    this.telegramId = telegramId;
  }

  public Login memberShipNumber(String memberShipNumber) {
    this.memberShipNumber = memberShipNumber;
    return this;
  }

  /**
   * Номер абонемента
   * @return memberShipNumber
  */
  @ApiModelProperty(required = true, value = "Номер абонемента")
  @NotNull

@Size(min=1,max=300) 
  public String getMemberShipNumber() {
    return memberShipNumber;
  }

  public void setMemberShipNumber(String memberShipNumber) {
    this.memberShipNumber = memberShipNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.telegramId, login.telegramId) &&
        Objects.equals(this.memberShipNumber, login.memberShipNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telegramId, memberShipNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    telegramId: ").append(toIndentedString(telegramId)).append("\n");
    sb.append("    memberShipNumber: ").append(toIndentedString(memberShipNumber)).append("\n");
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

