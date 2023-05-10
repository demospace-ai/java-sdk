# connection

## Overview

Operations on connections

### Available Operations

* [getNamespaces](#getnamespaces) - Get all namespaces
* [getSchema](#getschema) - Get schema for table
* [getTables](#gettables) - Get all tables

## getNamespaces

Get all namespaces

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.GetNamespacesRequest;
import fabra.io.javasdk.models.operations.GetNamespacesResponse;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("distinctio") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetNamespacesRequest req = new GetNamespacesRequest(844266L);            

            GetNamespacesResponse res = sdk.connection.getNamespaces(req);

            if (res.namespaces != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSchema

Get schema for table

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.GetSchemaRequest;
import fabra.io.javasdk.models.operations.GetSchemaResponse;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("unde") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSchemaRequest req = new GetSchemaRequest(857946L, "corrupti", "illum");            

            GetSchemaResponse res = sdk.connection.getSchema(req);

            if (res.getSchema200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getTables

Get all tables

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.GetTablesRequest;
import fabra.io.javasdk.models.operations.GetTablesResponse;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("vel") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetTablesRequest req = new GetTablesRequest(623564L, "deserunt");            

            GetTablesResponse res = sdk.connection.getTables(req);

            if (res.getTables200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
