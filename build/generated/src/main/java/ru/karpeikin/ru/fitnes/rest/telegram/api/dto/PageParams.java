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
 * Параметры страницы с данными
 */
@ApiModel(description = "Параметры страницы с данными")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-13T16:55:53.134072+07:00[Asia/Novosibirsk]")
public class PageParams   {
  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("pageCurrent")
  private Integer pageCurrent;

  @JsonProperty("pageTotal")
  private Integer pageTotal;

  public PageParams pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Количество элементов на странице
   * minimum: 1
   * maximum: 100
   * @return pageSize
  */
  @ApiModelProperty(value = "Количество элементов на странице")

@Min(1) @Max(100) 
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PageParams pageCurrent(Integer pageCurrent) {
    this.pageCurrent = pageCurrent;
    return this;
  }

  /**
   * Номер текущей страницы
   * minimum: 1
   * @return pageCurrent
  */
  @ApiModelProperty(value = "Номер текущей страницы")

@Min(1)
  public Integer getPageCurrent() {
    return pageCurrent;
  }

  public void setPageCurrent(Integer pageCurrent) {
    this.pageCurrent = pageCurrent;
  }

  public PageParams pageTotal(Integer pageTotal) {
    this.pageTotal = pageTotal;
    return this;
  }

  /**
   * Общее количество страниц
   * @return pageTotal
  */
  @ApiModelProperty(value = "Общее количество страниц")


  public Integer getPageTotal() {
    return pageTotal;
  }

  public void setPageTotal(Integer pageTotal) {
    this.pageTotal = pageTotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageParams pageParams = (PageParams) o;
    return Objects.equals(this.pageSize, pageParams.pageSize) &&
        Objects.equals(this.pageCurrent, pageParams.pageCurrent) &&
        Objects.equals(this.pageTotal, pageParams.pageTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageCurrent, pageTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageParams {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCurrent: ").append(toIndentedString(pageCurrent)).append("\n");
    sb.append("    pageTotal: ").append(toIndentedString(pageTotal)).append("\n");
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

