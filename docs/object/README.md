# object

## Overview

Operations on objects

### Available Operations

* [createObject](#createobject) - Create a new object
* [getObjects](#getobjects) - Get all objects

## createObject

Create a new object

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.CreateObjectResponse;
import fabra.io.javasdk.models.shared.FieldTypeEnum;
import fabra.io.javasdk.models.shared.ObjectField;
import fabra.io.javasdk.models.shared.ObjectInput;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("ipsa") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            fabra.io.javasdk.models.shared.ObjectInput req = new ObjectInput(2L, "BigQuery", "end_customer_id", "bigquery_dataset", "events") {{
                objectFields = new fabra.io.javasdk.models.shared.ObjectField[]{{
                    add(new ObjectField() {{
                        name = "event_name";
                        type = FieldTypeEnum.INTEGER;
                    }}),
                    add(new ObjectField() {{
                        name = "event_name";
                        type = FieldTypeEnum.INTEGER;
                    }}),
                    add(new ObjectField() {{
                        name = "event_name";
                        type = FieldTypeEnum.TIMESTAMP;
                    }}),
                    add(new ObjectField() {{
                        name = "event_name";
                        type = FieldTypeEnum.JSON;
                    }}),
                }};
            }};            

            CreateObjectResponse res = sdk.object.createObject(req);

            if (res.createObject200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getObjects

Get all objects

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.GetObjectsResponse;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("placeat") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetObjectsResponse res = sdk.object.getObjects();

            if (res.getObjects200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
