package ru.karpeikin.ru.fitnes.rest.admin.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import ru.karpeikin.ru.fitnes.rest.admin.api.dto.ClientInfo;
import ru.karpeikin.ru.fitnes.rest.admin.api.dto.PageParams;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientInfoPageable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-13T16:55:52.923522+07:00[Asia/Novosibirsk]")
public class ClientInfoPageable   {
  @JsonProperty("data")
  @Valid
  private List<ClientInfo> data = null;

  @JsonProperty("pageParams")
  private PageParams pageParams;

  public ClientInfoPageable data(List<ClientInfo> data) {
    this.data = data;
    return this;
  }

  public ClientInfoPageable addDataItem(ClientInfo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ClientInfo> getData() {
    return data;
  }

  public void setData(List<ClientInfo> data) {
    this.data = data;
  }

  public ClientInfoPageable pageParams(PageParams pageParams) {
    this.pageParams = pageParams;
    return this;
  }

  /**
   * Get pageParams
   * @return pageParams
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageParams getPageParams() {
    return pageParams;
  }

  public void setPageParams(PageParams pageParams) {
    this.pageParams = pageParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfoPageable clientInfoPageable = (ClientInfoPageable) o;
    return Objects.equals(this.data, clientInfoPageable.data) &&
        Objects.equals(this.pageParams, clientInfoPageable.pageParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, pageParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfoPageable {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pageParams: ").append(toIndentedString(pageParams)).append("\n");
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

