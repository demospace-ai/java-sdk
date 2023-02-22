package fabra.io.javasdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTables200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tables")
    public String[] tables;
    public GetTables200ApplicationJSON withTables(String[] tables) {
        this.tables = tables;
        return this;
    }
    
}
