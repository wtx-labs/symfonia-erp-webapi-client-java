package pl.wtx.symfonia;

import pl.wtx.symfonia.api.client.config.GsonConfig;
import pl.wtx.symfonia.api.client.config.OkHttpClientConfig;
import pl.wtx.symfonia.api.client.invoker.ApiClient;
import pl.wtx.symfonia.api.client.invoker.JSON;

public class SymfoniaWebApiClient extends ApiClient {

    // Default setup of the API Client to provide ignoring not recognized fields in the response.
    public SymfoniaWebApiClient() {
        JSON.setGson(GsonConfig.createGson());
        setUserAgent("SymfoniaWebApiClient (by wtx-labs)");
    }

    // Default configuration improved with logging API communication messages.
    public SymfoniaWebApiClient(boolean enableLoggingApiMessages) {

        JSON.setGson(GsonConfig.createGson());
        setUserAgent("SymfoniaWebApiClient (by wtx-labs)");

        if (enableLoggingApiMessages) {
            setHttpClient(OkHttpClientConfig.configureClient(getHttpClient()));
        }

    }

}
