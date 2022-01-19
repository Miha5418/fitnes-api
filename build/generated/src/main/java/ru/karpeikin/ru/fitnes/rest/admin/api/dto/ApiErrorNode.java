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
 * Описание деталей ошибки
 */
@ApiModel(description = "Описание деталей ошибки")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-19T14:23:02.915674+07:00[Asia/Novosibirsk]")
public class ApiErrorNode   {
  @JsonProperty("node")
  private String node;

  @JsonProperty("error")
  private String error;

  @JsonProperty("message")
  private String message;

  public ApiErrorNode node(String node) {
    this.node = node;
    return this;
  }

  /**
   * Путь к ноде
   * @return node
  */
  @ApiModelProperty(value = "Путь к ноде")


  public String getNode() {
    return node;
  }

  public void setNode(String node) {
    this.node = node;
  }

  public ApiErrorNode error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Техническое описание ошибки
   * @return error
  */
  @ApiModelProperty(value = "Техническое описание ошибки")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ApiErrorNode message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Сообщение об ошибке
   * @return message
  */
  @ApiModelProperty(value = "Сообщение об ошибке")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorNode apiErrorNode = (ApiErrorNode) o;
    return Objects.equals(this.node, apiErrorNode.node) &&
        Objects.equals(this.error, apiErrorNode.error) &&
        Objects.equals(this.message, apiErrorNode.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(node, error, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorNode {\n");
    
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

