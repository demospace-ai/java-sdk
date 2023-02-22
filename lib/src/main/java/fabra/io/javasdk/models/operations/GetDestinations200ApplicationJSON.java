package fabra.io.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetDestinations200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destinations")
    public fabra.io.javasdk.models.shared.Destination[] destinations;
    public GetDestinations200ApplicationJSON withDestinations(fabra.io.javasdk.models.shared.Destination[] destinations) {
        this.destinations = destinations;
        return this;
    }
    
}
