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
import pl.wtx.symfonia.api.client.model.PriceOrderContractorCriteria;
import pl.wtx.symfonia.api.client.model.PriceOrderProductResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PriceOrderResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PriceOrderResult {
  public static final String SERIALIZED_NAME_DEPARTMENT = "Department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  @javax.annotation.Nullable
  private String department;

  public static final String SERIALIZED_NAME_DATE = "Date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_CURRENCY = "Currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_SALE_PRICE_TYPE = "SalePriceType";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE_TYPE)
  @javax.annotation.Nullable
  private Integer salePriceType;

  public static final String SERIALIZED_NAME_CONTRACTOR = "Contractor";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR)
  @javax.annotation.Nullable
  private PriceOrderContractorCriteria contractor;

  public static final String SERIALIZED_NAME_PRODUCTS = "Products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  @javax.annotation.Nullable
  private List<PriceOrderProductResult> products = new ArrayList<>();

  public PriceOrderResult() {
  }

  public PriceOrderResult department(@javax.annotation.Nullable String department) {
    this.department = department;
    return this;
  }

  /**
   * Dzial, w ktorym ma zostac utworzony dokument. Odpowiednik pola [dzial] z importu specjalnego. Pole jest wymagane.
   * @return department
   */
  @javax.annotation.Nullable
  public String getDepartment() {
    return department;
  }

  public void setDepartment(@javax.annotation.Nullable String department) {
    this.department = department;
  }


  public PriceOrderResult date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Data wystawienia i sprzedazy na dokumencie. Odpowiednik pola [dataWystawienia] i [dataSprzedazy] z importu specjalnego. Pole jest wymagane.
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public PriceOrderResult currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Waluta. Odpowiednik pola [waluta] z importu specjalnego.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public PriceOrderResult salePriceType(@javax.annotation.Nullable Integer salePriceType) {
    this.salePriceType = salePriceType;
    return this;
  }

  /**
   * Typ ceny dla dokumentu. Odpowiednik pola [typCeny] z importu specjalnego. Pole jest wymagane. [0&#x3D;Niezdefiniowany, 1&#x3D;Cena A, 2&#x3D;Cena B, 3&#x3D;Cena C, 4&#x3D;Cena D, 16&#x3D;Cena E ... 31&#x3D;Cena T]
   * @return salePriceType
   */
  @javax.annotation.Nullable
  public Integer getSalePriceType() {
    return salePriceType;
  }

  public void setSalePriceType(@javax.annotation.Nullable Integer salePriceType) {
    this.salePriceType = salePriceType;
  }


  public PriceOrderResult contractor(@javax.annotation.Nullable PriceOrderContractorCriteria contractor) {
    this.contractor = contractor;
    return this;
  }

  /**
   * Get contractor
   * @return contractor
   */
  @javax.annotation.Nullable
  public PriceOrderContractorCriteria getContractor() {
    return contractor;
  }

  public void setContractor(@javax.annotation.Nullable PriceOrderContractorCriteria contractor) {
    this.contractor = contractor;
  }


  public PriceOrderResult products(@javax.annotation.Nullable List<PriceOrderProductResult> products) {
    this.products = products;
    return this;
  }

  public PriceOrderResult addProductsItem(PriceOrderProductResult productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
   */
  @javax.annotation.Nullable
  public List<PriceOrderProductResult> getProducts() {
    return products;
  }

  public void setProducts(@javax.annotation.Nullable List<PriceOrderProductResult> products) {
    this.products = products;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceOrderResult priceOrderResult = (PriceOrderResult) o;
    return Objects.equals(this.department, priceOrderResult.department) &&
        Objects.equals(this.date, priceOrderResult.date) &&
        Objects.equals(this.currency, priceOrderResult.currency) &&
        Objects.equals(this.salePriceType, priceOrderResult.salePriceType) &&
        Objects.equals(this.contractor, priceOrderResult.contractor) &&
        Objects.equals(this.products, priceOrderResult.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(department, date, currency, salePriceType, contractor, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceOrderResult {\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    salePriceType: ").append(toIndentedString(salePriceType)).append("\n");
    sb.append("    contractor: ").append(toIndentedString(contractor)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
    openapiFields.add("Department");
    openapiFields.add("Date");
    openapiFields.add("Currency");
    openapiFields.add("SalePriceType");
    openapiFields.add("Contractor");
    openapiFields.add("Products");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceOrderResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceOrderResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceOrderResult is not found in the empty JSON string", PriceOrderResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceOrderResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceOrderResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Department") != null && !jsonObj.get("Department").isJsonNull()) && !jsonObj.get("Department").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Department` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Department").toString()));
      }
      if ((jsonObj.get("Date") != null && !jsonObj.get("Date").isJsonNull()) && !jsonObj.get("Date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Date").toString()));
      }
      if ((jsonObj.get("Currency") != null && !jsonObj.get("Currency").isJsonNull()) && !jsonObj.get("Currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Currency").toString()));
      }
      // validate the optional field `Contractor`
      if (jsonObj.get("Contractor") != null && !jsonObj.get("Contractor").isJsonNull()) {
        PriceOrderContractorCriteria.validateJsonElement(jsonObj.get("Contractor"));
      }
      if (jsonObj.get("Products") != null && !jsonObj.get("Products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("Products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Products` to be an array in the JSON string but got `%s`", jsonObj.get("Products").toString()));
          }

          // validate the optional field `Products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            PriceOrderProductResult.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceOrderResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceOrderResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceOrderResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceOrderResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceOrderResult>() {
           @Override
           public void write(JsonWriter out, PriceOrderResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceOrderResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceOrderResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceOrderResult
   * @throws IOException if the JSON string is invalid with respect to PriceOrderResult
   */
  public static PriceOrderResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceOrderResult.class);
  }

  /**
   * Convert an instance of PriceOrderResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

