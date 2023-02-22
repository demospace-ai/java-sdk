package fabra.io.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Source {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection")
    public Connection connection;
    public Source withConnection(Connection connection) {
        this.connection = connection;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_name")
    public String displayName;
    public Source withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_customer_id")
    public Long endCustomerId;
    public Source withEndCustomerId(Long endCustomerId) {
        this.endCustomerId = endCustomerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;
    public Source withId(Long id) {
        this.id = id;
        return this;
    }
    
}
