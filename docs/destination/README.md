# destination

## Overview

Operations on destinations

### Available Operations

* [createDestination](#createdestination) - Create a new destination
* [getDestinations](#getdestinations) - Get all destinations

## createDestination

Create a new destination

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.CreateDestinationResponse;
import fabra.io.javasdk.models.shared.BigQueryConfig;
import fabra.io.javasdk.models.shared.ConnectionTypeEnum;
import fabra.io.javasdk.models.shared.DestinationInput;
import fabra.io.javasdk.models.shared.MongoDbConfig;
import fabra.io.javasdk.models.shared.RedshiftConfig;
import fabra.io.javasdk.models.shared.Security;
import fabra.io.javasdk.models.shared.SnowflakeConfig;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("suscipit") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            fabra.io.javasdk.models.shared.DestinationInput req = new DestinationInput(ConnectionTypeEnum.REDSHIFT, "BigQuery") {{
                bigqueryConfig = new BigQueryConfig("us-west1") {{
                    credentials = "Paste JSON from GCP";
                }};;
                mongodbConfig = new MongoDbConfig("examplecluster.abc123.mongodb.net", "securePassword123", "jane_doe") {{
                    connectionOptions = "retryWrites=true&w=majority";
                }};;
                redshiftConfig = new RedshiftConfig("your_database", "examplecluster.12345.us-west-1.redshift.amazonaws.com", "securePassword123", "5432", "jane_doe");;
                snowflakeConfig = new SnowflakeConfig("your_database", "abc123.us-east4.gcp.snowflakecomputing.com", "securePassword123", "your_role", "jane_doe", "your_warehouse");;
            }};            

            CreateDestinationResponse res = sdk.destination.createDestination(req);

            if (res.createDestination200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getDestinations

Get all destinations

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.GetDestinationsResponse;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("magnam") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetDestinationsResponse res = sdk.destination.getDestinations();

            if (res.getDestinations200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
