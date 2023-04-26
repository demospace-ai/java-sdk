# source

## Overview

Operations on sources

### Available Operations

* [createSource](#createsource) - Create a new source
* [getSources](#getsources) - Get all sources

## createSource

Create a new source

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.CreateSourceResponse;
import fabra.io.javasdk.models.shared.BigQueryConfig;
import fabra.io.javasdk.models.shared.ConnectionTypeEnum;
import fabra.io.javasdk.models.shared.MongoDbConfig;
import fabra.io.javasdk.models.shared.RedshiftConfig;
import fabra.io.javasdk.models.shared.Security;
import fabra.io.javasdk.models.shared.SnowflakeConfig;
import fabra.io.javasdk.models.shared.SourceInput;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("voluptatum") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            fabra.io.javasdk.models.shared.SourceInput req = new SourceInput(ConnectionTypeEnum.REDSHIFT, "Frontend Events", 123L) {{
                bigqueryConfig = new BigQueryConfig("us-west1") {{
                    credentials = "Paste JSON from GCP";
                }};;
                mongodbConfig = new MongoDbConfig("examplecluster.abc123.mongodb.net", "securePassword123", "jane_doe") {{
                    connectionOptions = "retryWrites=true&w=majority";
                }};;
                redshiftConfig = new RedshiftConfig("your_database", "examplecluster.12345.us-west-1.redshift.amazonaws.com", "securePassword123", "5432", "jane_doe");;
                snowflakeConfig = new SnowflakeConfig("your_database", "abc123.us-east4.gcp.snowflakecomputing.com", "securePassword123", "your_role", "jane_doe", "your_warehouse");;
            }};            

            CreateSourceResponse res = sdk.source.createSource(req);

            if (res.createSource200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSources

Get all sources

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.GetSourcesResponse;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("excepturi") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSourcesResponse res = sdk.source.getSources();

            if (res.getSources200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
