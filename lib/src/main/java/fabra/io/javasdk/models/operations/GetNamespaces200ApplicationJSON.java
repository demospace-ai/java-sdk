package fabra.io.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetNamespaces200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaces")
    public String[] namespaces;
    public GetNamespaces200ApplicationJSON withNamespaces(String[] namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    
}
