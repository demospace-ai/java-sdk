<!-- Start SDK Example Usage -->
```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.shared.Security;
import fabra.io.javasdk.models.operations.GetNamespacesRequest;
import fabra.io.javasdk.models.operations.GetNamespacesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("corrupti") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetNamespacesRequest req = new GetNamespacesRequest(592845);            

            GetNamespacesResponse res = sdk.connection.getNamespaces(req);

            if (res.namespaces.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->