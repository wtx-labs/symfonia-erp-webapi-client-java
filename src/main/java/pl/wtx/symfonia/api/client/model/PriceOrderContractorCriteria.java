/*
 * Symfonia WebAPI
 * Symfonia WebAPI - specyfikacja wybranych endpointow API systemu ERP Symfonia. Modele danych sa uproszczone i ograniczone do niektorych parametrow (wersja rozwojowa).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pl.wtx.symfonia.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import pl.wtx.symfonia.api.client.invoker.JSON;

import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * PriceOrderContractorCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PriceOrderContractorCriteria {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nullable
  private String code;

  public PriceOrderContractorCriteria() {
  }

  public PriceOrderContractorCriteria id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Id kontrahenta wykorzystywane do pobrania kontrahenta i uzupelnienia pola [KhKod] z sekcji [DaneKh] i [DaneOd] w imporcie specjalnym. Jezeli id nie zostanie podany, dokument zostanie wystawiony na kontrahenta o podanym kodzie.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public PriceOrderContractorCriteria code(@javax.annotation.Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Kod kontrahenta. Odpowiednik pola [KhKod] z sekcji [DaneKh] i [DaneOd] w imporcie specjalnym.
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = code;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceOrderContractorCriteria priceOrderContractorCriteria = (PriceOrderContractorCriteria) o;
    return Objects.equals(this.id, priceOrderContractorCriteria.id) &&
        Objects.equals(this.code, priceOrderContractorCriteria.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceOrderContractorCriteria {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("Id");
    openapiFields.add("Code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceOrderContractorCriteria
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceOrderContractorCriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceOrderContractorCriteria is not found in the empty JSON string", PriceOrderContractorCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceOrderContractorCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceOrderContractorCriteria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) && !jsonObj.get("Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceOrderContractorCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceOrderContractorCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceOrderContractorCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceOrderContractorCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceOrderContractorCriteria>() {
           @Override
           public void write(JsonWriter out, PriceOrderContractorCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceOrderContractorCriteria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceOrderContractorCriteria given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceOrderContractorCriteria
   * @throws IOException if the JSON string is invalid with respect to PriceOrderContractorCriteria
   */
  public static PriceOrderContractorCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceOrderContractorCriteria.class);
  }

  /**
   * Convert an instance of PriceOrderContractorCriteria to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

