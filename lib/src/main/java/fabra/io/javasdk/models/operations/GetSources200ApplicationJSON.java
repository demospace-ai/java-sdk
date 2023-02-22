package fabra.io.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSources200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sources")
    public fabra.io.javasdk.models.shared.Source[] sources;
    public GetSources200ApplicationJSON withSources(fabra.io.javasdk.models.shared.Source[] sources) {
        this.sources = sources;
        return this;
    }
    
}
