package fabra.io.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSyncs200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncs")
    public fabra.io.javasdk.models.shared.Sync[] syncs;
    public GetSyncs200ApplicationJSON withSyncs(fabra.io.javasdk.models.shared.Sync[] syncs) {
        this.syncs = syncs;
        return this;
    }
    
}
