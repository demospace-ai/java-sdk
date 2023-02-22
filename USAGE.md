<!-- Start SDK Example Usage -->
```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra.Builder builder = Fabra.builder();

            builder.setSecurity(
                new Security() {{
                    apiKeyAuth = new SchemeAPIKeyAuth() {{
                        apiKey = "YOUR_API_KEY_HERE";
                    }};
                }}
            );

            Fabra sdk = builder.build();

            GetNamespacesRequest req = new GetNamespacesRequest() {{
                queryParams = new GetNamespacesQueryParams() {{
                    connectionID = 548814;
                }};
            }};

            GetNamespacesResponse res = sdk.connection.getNamespaces(req);

            if (res.getNamespaces200ApplicationJSONObject.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->