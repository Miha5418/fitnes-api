package ru.karpeikin.ru.fitnes.rest.telegram.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import ru.karpeikin.ru.fitnes.rest.telegram.api.dto.ApiErrorNode;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Расширенная информация об ошибке
 */
@ApiModel(description = "Расширенная информация об ошибке")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-13T16:55:53.134072+07:00[Asia/Novosibirsk]")
public class ApiResponseError   {
  @JsonProperty("timestamp")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private Instant timestamp;

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("status")
  private Long status;

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("errorObject")
  private String errorObject;

  @JsonProperty("errorNodes")
  @Valid
  private List<ApiErrorNode> errorNodes = null;

  @JsonProperty("instance")
  private String instance;

  public ApiResponseError timestamp(Instant timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Метка времени ответа
   * @return timestamp
  */
  @ApiModelProperty(required = true, value = "Метка времени ответа")
  @NotNull

  @Valid

  public Instant getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Instant timestamp) {
    this.timestamp = timestamp;
  }

  public ApiResponseError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * URI идентификатор категоризации ошибки
   * @return type
  */
  @ApiModelProperty(required = true, value = "URI идентификатор категоризации ошибки")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ApiResponseError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Краткое сообщение об ошибке
   * @return title
  */
  @ApiModelProperty(required = true, value = "Краткое сообщение об ошибке")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ApiResponseError status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP код ответа
   * @return status
  */
  @ApiModelProperty(required = true, value = "HTTP код ответа")
  @NotNull


  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public ApiResponseError detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Полное сообщение об ошибке
   * @return detail
  */
  @ApiModelProperty(value = "Полное сообщение об ошибке")


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ApiResponseError errorObject(String errorObject) {
    this.errorObject = errorObject;
    return this;
  }

  /**
   * Какой объект сломан при запросе
   * @return errorObject
  */
  @ApiModelProperty(value = "Какой объект сломан при запросе")


  public String getErrorObject() {
    return errorObject;
  }

  public void setErrorObject(String errorObject) {
    this.errorObject = errorObject;
  }

  public ApiResponseError errorNodes(List<ApiErrorNode> errorNodes) {
    this.errorNodes = errorNodes;
    return this;
  }

  public ApiResponseError addErrorNodesItem(ApiErrorNode errorNodesItem) {
    if (this.errorNodes == null) {
      this.errorNodes = new ArrayList<>();
    }
    this.errorNodes.add(errorNodesItem);
    return this;
  }

  /**
   * Детали, где произошла ошибка
   * @return errorNodes
  */
  @ApiModelProperty(value = "Детали, где произошла ошибка")

  @Valid

  public List<ApiErrorNode> getErrorNodes() {
    return errorNodes;
  }

  public void setErrorNodes(List<ApiErrorNode> errorNodes) {
    this.errorNodes = errorNodes;
  }

  public ApiResponseError instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * URI идентифицирует конретное место возникновения ошибки
   * @return instance
  */
  @ApiModelProperty(value = "URI идентифицирует конретное место возникновения ошибки")


  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseError apiResponseError = (ApiResponseError) o;
    return Objects.equals(this.timestamp, apiResponseError.timestamp) &&
        Objects.equals(this.type, apiResponseError.type) &&
        Objects.equals(this.title, apiResponseError.title) &&
        Objects.equals(this.status, apiResponseError.status) &&
        Objects.equals(this.detail, apiResponseError.detail) &&
        Objects.equals(this.errorObject, apiResponseError.errorObject) &&
        Objects.equals(this.errorNodes, apiResponseError.errorNodes) &&
        Objects.equals(this.instance, apiResponseError.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, type, title, status, detail, errorObject, errorNodes, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseError {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    errorObject: ").append(toIndentedString(errorObject)).append("\n");
    sb.append("    errorNodes: ").append(toIndentedString(errorNodes)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

