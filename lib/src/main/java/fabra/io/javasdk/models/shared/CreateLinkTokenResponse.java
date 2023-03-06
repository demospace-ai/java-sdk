package fabra.io.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateLinkTokenResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_token")
    public String linkToken;
    public CreateLinkTokenResponse withLinkToken(String linkToken) {
        this.linkToken = linkToken;
        return this;
    }
    
}
