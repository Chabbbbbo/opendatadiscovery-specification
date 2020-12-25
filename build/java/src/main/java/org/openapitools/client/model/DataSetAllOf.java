/*
 * OpenDataDiscovery API Contract
 * OpenDataDiscovery API Contract
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DataSet;
import org.openapitools.client.model.DataSetField;
import org.threeten.bp.OffsetDateTime;

/**
 * DataSetAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-25T17:26:01.976053+03:00[Europe/Moscow]")
public class DataSetAllOf {
  public static final String SERIALIZED_NAME_PARENT_ODDRN = "parentOddrn";
  @SerializedName(SERIALIZED_NAME_PARENT_ODDRN)
  private String parentOddrn;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * Gets or Sets subtype
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    TABLE("DATASET_TABLE"),
    
    FILE("DATASET_FILE"),
    
    FEATURE_GROUP("DATASET_FEATURE_GROUP");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private SubtypeEnum subtype;

  public static final String SERIALIZED_NAME_FIELD_LIST = "fieldList";
  @SerializedName(SERIALIZED_NAME_FIELD_LIST)
  private List<DataSetField> fieldList = null;

  public static final String SERIALIZED_NAME_DATA_SET_LIST = "dataSetList";
  @SerializedName(SERIALIZED_NAME_DATA_SET_LIST)
  private List<DataSet> dataSetList = null;


  public DataSetAllOf parentOddrn(String parentOddrn) {
    
    this.parentOddrn = parentOddrn;
    return this;
  }

   /**
   * Get parentOddrn
   * @return parentOddrn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentOddrn() {
    return parentOddrn;
  }


  public void setParentOddrn(String parentOddrn) {
    this.parentOddrn = parentOddrn;
  }


  public DataSetAllOf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DataSetAllOf updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public DataSetAllOf subtype(SubtypeEnum subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubtypeEnum getSubtype() {
    return subtype;
  }


  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }


  public DataSetAllOf fieldList(List<DataSetField> fieldList) {
    
    this.fieldList = fieldList;
    return this;
  }

  public DataSetAllOf addFieldListItem(DataSetField fieldListItem) {
    if (this.fieldList == null) {
      this.fieldList = new ArrayList<DataSetField>();
    }
    this.fieldList.add(fieldListItem);
    return this;
  }

   /**
   * Get fieldList
   * @return fieldList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataSetField> getFieldList() {
    return fieldList;
  }


  public void setFieldList(List<DataSetField> fieldList) {
    this.fieldList = fieldList;
  }


  public DataSetAllOf dataSetList(List<DataSet> dataSetList) {
    
    this.dataSetList = dataSetList;
    return this;
  }

  public DataSetAllOf addDataSetListItem(DataSet dataSetListItem) {
    if (this.dataSetList == null) {
      this.dataSetList = new ArrayList<DataSet>();
    }
    this.dataSetList.add(dataSetListItem);
    return this;
  }

   /**
   * Get dataSetList
   * @return dataSetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataSet> getDataSetList() {
    return dataSetList;
  }


  public void setDataSetList(List<DataSet> dataSetList) {
    this.dataSetList = dataSetList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSetAllOf dataSetAllOf = (DataSetAllOf) o;
    return Objects.equals(this.parentOddrn, dataSetAllOf.parentOddrn) &&
        Objects.equals(this.description, dataSetAllOf.description) &&
        Objects.equals(this.updatedAt, dataSetAllOf.updatedAt) &&
        Objects.equals(this.subtype, dataSetAllOf.subtype) &&
        Objects.equals(this.fieldList, dataSetAllOf.fieldList) &&
        Objects.equals(this.dataSetList, dataSetAllOf.dataSetList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentOddrn, description, updatedAt, subtype, fieldList, dataSetList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSetAllOf {\n");
    sb.append("    parentOddrn: ").append(toIndentedString(parentOddrn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    dataSetList: ").append(toIndentedString(dataSetList)).append("\n");
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

