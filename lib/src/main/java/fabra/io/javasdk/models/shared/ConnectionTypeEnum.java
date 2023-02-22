package fabra.io.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ConnectionTypeEnum {
    SNOWFLAKE("snowflake"),
    BIGQUERY("bigquery"),
    REDSHIFT("redshift"),
    MONGODB("mongodb"),
    WEBHOOK("webhook");

    @JsonValue
    public final String value;

    private ConnectionTypeEnum(String value) {
        this.value = value;
    }
}
