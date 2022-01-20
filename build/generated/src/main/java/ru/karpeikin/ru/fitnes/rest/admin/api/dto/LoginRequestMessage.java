package ru.karpeikin.ru.fitnes.rest.admin.api.dto;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-20T13:51:57.681634+07:00[Asia/Novosibirsk]")
public class LoginRequestMessage   {
  @JsonProperty("mail")
  private String mail;

  @JsonProperty("password")
  private String password;

  public LoginRequestMessage mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Адрес электронной почты
   * @return mail
  */
  @ApiModelProperty(required = true, value = "Адрес электронной почты")
  @NotNull

@Size(min=1,max=100) @javax.validation.constraints.Email
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public LoginRequestMessage password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Пароль
   * @return password
  */
  @ApiModelProperty(required = true, value = "Пароль")
  @NotNull

@Size(min=10,max=300) 
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
    LoginRequestMessage loginRequestMessage = (LoginRequestMessage) o;
    return Objects.equals(this.mail, loginRequestMessage.mail) &&
        Objects.equals(this.password, loginRequestMessage.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mail, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequestMessage {\n");
    
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
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

