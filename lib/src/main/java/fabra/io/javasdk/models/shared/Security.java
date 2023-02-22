package fabra.io.javasdk.models.shared;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header")
    public SchemeAPIKeyAuth apiKeyAuth;
    public Security withApiKeyAuth(SchemeAPIKeyAuth apiKeyAuth) {
        this.apiKeyAuth = apiKeyAuth;
        return this;
    }
    
}
