package fabra.io.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FrequencyUnitsEnum {
    MINUTES("minutes"),
    HOURS("hours"),
    DAYS("days"),
    WEEKS("weeks");

    @JsonValue
    public final String value;

    private FrequencyUnitsEnum(String value) {
        this.value = value;
    }
}
