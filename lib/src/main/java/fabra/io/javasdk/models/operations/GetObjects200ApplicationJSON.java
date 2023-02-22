package fabra.io.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetObjects200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("objects")
    public fabra.io.javasdk.models.shared.Object[] objects;
    public GetObjects200ApplicationJSON withObjects(fabra.io.javasdk.models.shared.Object[] objects) {
        this.objects = objects;
        return this;
    }
    
}
