# linkToken

## Overview

Operations on link tokens

### Available Operations

* [createLinkToken](#createlinktoken) - Create a new link token

## createLinkToken

Create a new link token

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.CreateLinkTokenResponse;
import fabra.io.javasdk.models.shared.CreateLinkTokenRequest;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("debitis") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            fabra.io.javasdk.models.shared.CreateLinkTokenRequest req = new CreateLinkTokenRequest("abcd-1234-efgh-5678");            

            CreateLinkTokenResponse res = sdk.linkToken.createLinkToken(req);

            if (res.createLinkTokenResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
