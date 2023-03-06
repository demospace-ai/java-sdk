package fabra.io.javasdk.models.operations;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class CreateLinkTokenRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public fabra.io.javasdk.models.shared.CreateLinkTokenRequest request;
    public CreateLinkTokenRequest withRequest(fabra.io.javasdk.models.shared.CreateLinkTokenRequest request) {
        this.request = request;
        return this;
    }
    
}
