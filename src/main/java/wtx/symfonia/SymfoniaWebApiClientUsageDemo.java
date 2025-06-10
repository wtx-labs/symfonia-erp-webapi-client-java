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
