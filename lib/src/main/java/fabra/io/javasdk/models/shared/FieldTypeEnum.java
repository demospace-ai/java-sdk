package fabra.io.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FieldTypeEnum {
    STRING("string"),
    INTEGER("integer"),
    TIMESTAMP("timestamp"),
    JSON("json"),
    BOOLEAN_("boolean");

    @JsonValue
    public final String value;

    private FieldTypeEnum(String value) {
        this.value = value;
    }
}
