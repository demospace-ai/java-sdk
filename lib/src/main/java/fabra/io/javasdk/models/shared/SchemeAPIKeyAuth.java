package fabra.io.javasdk.models.shared;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class SchemeAPIKeyAuth {
    @SpeakeasyMetadata("security:name=X-API-Key")
    public String apiKey;
    public SchemeAPIKeyAuth withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
