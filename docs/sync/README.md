# sync

## Overview

Operations on syncs

### Available Operations

* [createSync](#createsync) - Create a new sync
* [getSyncs](#getsyncs) - Get all syncs

## createSync

Create a new sync

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.CreateSyncResponse;
import fabra.io.javasdk.models.shared.FieldMapping;
import fabra.io.javasdk.models.shared.FrequencyUnitsEnum;
import fabra.io.javasdk.models.shared.Security;
import fabra.io.javasdk.models.shared.SyncInput;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("nisi") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            fabra.io.javasdk.models.shared.SyncInput req = new SyncInput(2L, "Event Sync",                 new fabra.io.javasdk.models.shared.FieldMapping[]{{
                                add(new FieldMapping() {{
                                    destinationFieldName = "event";
                                    sourceFieldName = "event_name";
                                }}),
                                add(new FieldMapping() {{
                                    destinationFieldName = "event";
                                    sourceFieldName = "event_name";
                                }}),
                                add(new FieldMapping() {{
                                    destinationFieldName = "event";
                                    sourceFieldName = "event_name";
                                }}),
                                add(new FieldMapping() {{
                                    destinationFieldName = "event";
                                    sourceFieldName = "event_name";
                                }}),
                            }}, 30L, FrequencyUnitsEnum.WEEKS, 3L, 1L) {{
                cursorField = "updated_at";
                customJoin = "select * from events join additional_properties on events.id = additional_properties.event_id;";
                namespace = "end_customer_bigquery_dataset";
                primaryKey = "event_id";
                tableName = "end_customer_events";
            }};            

            CreateSyncResponse res = sdk.sync.createSync(req);

            if (res.createSync200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getSyncs

Get all syncs

### Example Usage

```java
package hello.world;

import fabra.io.javasdk.Fabra;
import fabra.io.javasdk.models.operations.GetSyncsResponse;
import fabra.io.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Fabra sdk = Fabra.builder()
                .setSecurity(new Security("ab") {{
                    apiKeyAuth = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetSyncsResponse res = sdk.sync.getSyncs();

            if (res.getSyncs200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
