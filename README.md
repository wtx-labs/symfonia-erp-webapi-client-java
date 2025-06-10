# Klient Symfonia ERP WebAPI dla aplikacji Java

[![Licencja: MIT](https://img.shields.io/badge/Licencja-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Wersja Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.java.com)

Lekka biblioteka kliencka w języku Java do integracji z Symfonia WebAPI. Stworzona dla programistów Java, którzy potrzebują zintegrować swoje aplikacje z systemem Symfonia ERP. 🚀

Ten klient API zapewnia interfejsy Java dla Symfonia WebAPI, umożliwiając płynne zarządzanie:
- Towarami i stanami magazynowymi
- Kontrahentami i zamówieniami
- Dokumentami sprzedaży
- Operacjami systemowymi poprzez API

## ✨ Dlaczego warto wybrać tego klienta?

- 💡 **Typowane interfejsy Java** - w pełni typowane interfejsy dla endpointów Symfonia WebAPI
- 🛡️ **Uwierzytelnianie sesyjne** - bezpieczny dostęp do API Symfonii
- 📚 **Przejrzysta dokumentacja** - kompleksowe przykłady integracji w Javie
- 🚀 **Nowoczesne wsparcie Java** - kompatybilność z Java 17 i nowszymi wersjami
- ⚡ **Wygenerowany z OpenAPI** - bazujący na specyfikacji OpenAPI 3.0

## 🎯 Zaimplementowane funkcje

- ✅ API Systemowe
  - Endpoint ping do sprawdzenia statusu systemu
  - Informacje o modułach
  - Aktywne instancje HMF
- ✅ API Sesji
  - Otwieranie nowej sesji
  - Pobieranie informacji o sesji
- ✅ API Kontrahentów
  - Lista/wyszukiwanie kontrahentów
  - Pobieranie szczegółów kontrahenta po ID, kodzie lub NIP
- ✅ API Towarów
  - Lista/wyszukiwanie towarów
  - Pobieranie szczegółów towaru po ID lub kodzie kreskowym
  - Filtrowanie towarów przy użyciu kryteriów SQL
  - Pobieranie wymiarów towaru
- ✅ API Cen Towarów
  - Pobieranie cen zamówień
  - Obliczanie cen na podstawie kryteriów
- ✅ API Stanów Magazynowych
  - Pobieranie wszystkich stanów magazynowych
  - Pobieranie stanów magazynowych dla towaru
- ✅ API Zamówień
  - Pobieranie szczegółów zamówienia
  - Pobieranie faktur dla zamówienia
- ✅ API Wystawiania Zamówień
  - Tworzenie nowych zamówień
- ✅ API Sprzedaży
  - Pobieranie dokumentów sprzedaży
  - Filtrowanie sprzedaży według zakresu dat i nabywcy

## 🚨 Status Projektu

> ⚠️ **Uwaga: To jest wczesna wersja rozwojowa!**
> 
> Aktywnie implementujemy kolejne funkcje Symfonia ERP WebAPI.
> Zapraszamy do współpracy i zgłaszania uwag na GitHubie!

## 📦 Informacje o Wersji

- **Aktualna Wersja**: `0.1.0-alpha-20250610`
- **Wymagana wersja Java**: Java 17+

## 🔓 Licencja

**Licencja MIT**

Niniejszym udziela się zgody na bezpłatne korzystanie z tego oprogramowania i powiązanych plików dokumentacji ("Oprogramowanie"), do korzystania z Oprogramowania bez ograniczeń, w tym bez ograniczeń praw do używania, kopiowania, modyfikowania, łączenia, publikowania, dystrybuowania, sublicencjonowania i/lub sprzedaży kopii Oprogramowania.

Jedynym wymogiem jest zachowanie oryginalnych informacji o autorze w kodzie źródłowym i dokumentacji.

## 🚀 Szybki Start

### 1️⃣ Instalacja

Sklonuj i zbuduj bibliotekę ze źródeł:

```sh
git clone https://github.com/wtx-labs/symfonia-erp-webapi-client-java.git
cd symfonia-erp-webapi-client-java
mvn clean install
```

Następnie dodaj zbudowany artefakt do swojego projektu:

```xml
<dependency>
    <groupId>wtx.symfonia</groupId>
    <artifactId>symfonia-erp-webapi-client</artifactId>
    <version>0.1.0-alpha-20250610</version>
</dependency>
```

### 2️⃣ Przykład Integracji w Javie

Oto jak używać klienta Symfonia ERP WebAPI:

```java
package wtx.symfonia;

import wtx.symfonia.api.client.SystemApi;
import wtx.symfonia.api.client.invoker.ApiException;
import wtx.symfonia.api.client.model.PingResponse;

public class SymfoniaWebApiClientUsageDemo {

    // TODO: Set your Symfonia ERP WebAPI base path!
    private static final String API_BASE_PATH = "http://127.0.0.1:9000/api";

    public static void main(String[] args) {

        System.out.println(">>> Start running the SymfoniaWebApiClientUsageDemo...");

        // Use SymfoniaWebApiClient(true) if you need to log API communication messages.
        SymfoniaWebApiClient apiClient = new SymfoniaWebApiClient();

        apiClient.setBasePath(API_BASE_PATH);

        // TODO: If you need to invoke an API that requires authorization, provide a valid session token as shown below:
        // apiClient.addDefaultHeader("Authorization", "Session 2ab29954-ca2d-4c6b-873b-9b136e892d7d")

        // The System API does not require authorization, so there is no need to provide a session token in the Authorization header.
        SystemApi systemApi = new SystemApi(apiClient);

        try {

            PingResponse pingResponse = systemApi.pingSymfoniaApi();

            System.out.println("Number of open sessions: " + pingResponse.getOpenSessionsNumber());

        } catch (ApiException e) {

            System.err.println("Error occurred during API call: " + e);

        }

        System.out.println("<<< The SymfoniaWebApiClientUsageDemo has been finished.");

    }

}
```

## 📚 Dokumentacja API

Klient udostępnia następujące główne interfejsy API:

### API Systemowe
- `pingSymfoniaApi()` - Sprawdzenie statusu systemu i pobranie informacji o modułach

### API Sesji
- `openNewSession(deviceName)` - Otwarcie nowej sesji
- `getSessionInformation()` - Pobranie szczegółów bieżącej sesji

### API Kontrahentów
- `getContractors(id, code, nip)` - Pobranie informacji o kontrahencie

### API Towarów
- `getProducts(id, barcode)` - Pobranie informacji o towarze
- `getProductsByFilterSql(productCriteriaFilter)` - Filtrowanie towarów przy użyciu kryteriów SQL
- `getProductDimensions(productId)` - Pobranie wymiarów towaru

### API Cen Towarów
- `getOrderPrices(priceOrderCriteria)` - Obliczanie cen zamówień

### API Stanów Magazynowych
- `getInventoryStates()` - Pobranie wszystkich stanów magazynowych
- `getInventoryStatesByProduct(id, code)` - Pobranie stanów magazynowych dla towaru

### API Zamówień
- `getOrder(number)` - Pobranie szczegółów zamówienia
- `getInvoicesForOrder(orderNumber)` - Pobranie faktur dla zamówienia

### API Wystawiania Zamówień
- `addNewOrdersIssue(orderIssue, issue)` - Utworzenie nowego zamówienia

### API Sprzedaży
- `getSaleDocument(id, number)` - Pobranie dokumentu sprzedaży
- `getSalesByBuyerAndDateRange(buyerId, dateFrom, dateTo)` - Filtrowanie dokumentów sprzedaży

## 🤝 Współpraca

Zapraszamy do współpracy! Możesz zgłaszać swoje propozycje poprzez Pull Request.

## 📝 Licencja

Ten projekt jest udostępniany na licencji MIT - szczegóły znajdują się w pliku [LICENSE](LICENSE). 
