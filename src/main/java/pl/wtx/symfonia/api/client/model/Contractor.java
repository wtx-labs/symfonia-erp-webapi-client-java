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
import pl.wtx.symfonia.api.client.model.PaymentForm;
import pl.wtx.symfonia.api.client.model.PaymentRegistry;

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
 * Contractor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Contractor {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_ACTIVE = "Active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  @javax.annotation.Nullable
  private Boolean active;

  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nullable
  private String code;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_N_I_P = "NIP";
  @SerializedName(SERIALIZED_NAME_N_I_P)
  @javax.annotation.Nullable
  private String NIP;

  public static final String SERIALIZED_NAME_PAYMENT_REGISTRY = "PaymentRegistry";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REGISTRY)
  @javax.annotation.Nullable
  private PaymentRegistry paymentRegistry;

  public static final String SERIALIZED_NAME_PAYMENT_FORM = "PaymentForm";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FORM)
  @javax.annotation.Nullable
  private PaymentForm paymentForm;

  public Contractor() {
  }

  public Contractor id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Id kontrahenta. Odpowiednik pola [id] z obiektu BKontrahent.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public Contractor active(@javax.annotation.Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Status aktywnosci. Odpowiednik pola [aktywny] z obiektu BKontrahent.
   * @return active
   */
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(@javax.annotation.Nullable Boolean active) {
    this.active = active;
  }


  public Contractor code(@javax.annotation.Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Kod kontrahenta. Odpowiednik pola [kod] z obiektu BKontrahent.
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nullable String code) {
    this.code = code;
  }


  public Contractor name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Nazwa kontrahenta. Odpowiednik pola [nazwa] z obiektu BKontrahent.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public Contractor NIP(@javax.annotation.Nullable String NIP) {
    this.NIP = NIP;
    return this;
  }

  /**
   * Numer NIP kontrahenta. Odpowiednik pola [NIP] z obiektu BKontrahent.
   * @return NIP
   */
  @javax.annotation.Nullable
  public String getNIP() {
    return NIP;
  }

  public void setNIP(@javax.annotation.Nullable String NIP) {
    this.NIP = NIP;
  }


  public Contractor paymentRegistry(@javax.annotation.Nullable PaymentRegistry paymentRegistry) {
    this.paymentRegistry = paymentRegistry;
    return this;
  }

  /**
   * Get paymentRegistry
   * @return paymentRegistry
   */
  @javax.annotation.Nullable
  public PaymentRegistry getPaymentRegistry() {
    return paymentRegistry;
  }

  public void setPaymentRegistry(@javax.annotation.Nullable PaymentRegistry paymentRegistry) {
    this.paymentRegistry = paymentRegistry;
  }


  public Contractor paymentForm(@javax.annotation.Nullable PaymentForm paymentForm) {
    this.paymentForm = paymentForm;
    return this;
  }

  /**
   * Get paymentForm
   * @return paymentForm
   */
  @javax.annotation.Nullable
  public PaymentForm getPaymentForm() {
    return paymentForm;
  }

  public void setPaymentForm(@javax.annotation.Nullable PaymentForm paymentForm) {
    this.paymentForm = paymentForm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contractor contractor = (Contractor) o;
    return Objects.equals(this.id, contractor.id) &&
        Objects.equals(this.active, contractor.active) &&
        Objects.equals(this.code, contractor.code) &&
        Objects.equals(this.name, contractor.name) &&
        Objects.equals(this.NIP, contractor.NIP) &&
        Objects.equals(this.paymentRegistry, contractor.paymentRegistry) &&
        Objects.equals(this.paymentForm, contractor.paymentForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, code, name, NIP, paymentRegistry, paymentForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contractor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    NIP: ").append(toIndentedString(NIP)).append("\n");
    sb.append("    paymentRegistry: ").append(toIndentedString(paymentRegistry)).append("\n");
    sb.append("    paymentForm: ").append(toIndentedString(paymentForm)).append("\n");
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
    openapiFields.add("Active");
    openapiFields.add("Code");
    openapiFields.add("Name");
    openapiFields.add("NIP");
    openapiFields.add("PaymentRegistry");
    openapiFields.add("PaymentForm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Contractor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Contractor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contractor is not found in the empty JSON string", Contractor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Contractor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Contractor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) && !jsonObj.get("Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Code").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("NIP") != null && !jsonObj.get("NIP").isJsonNull()) && !jsonObj.get("NIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NIP").toString()));
      }
      // validate the optional field `PaymentRegistry`
      if (jsonObj.get("PaymentRegistry") != null && !jsonObj.get("PaymentRegistry").isJsonNull()) {
        PaymentRegistry.validateJsonElement(jsonObj.get("PaymentRegistry"));
      }
      // validate the optional field `PaymentForm`
      if (jsonObj.get("PaymentForm") != null && !jsonObj.get("PaymentForm").isJsonNull()) {
        PaymentForm.validateJsonElement(jsonObj.get("PaymentForm"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contractor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contractor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contractor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contractor.class));

       return (TypeAdapter<T>) new TypeAdapter<Contractor>() {
           @Override
           public void write(JsonWriter out, Contractor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Contractor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Contractor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Contractor
   * @throws IOException if the JSON string is invalid with respect to Contractor
   */
  public static Contractor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contractor.class);
  }

  /**
   * Convert an instance of Contractor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

