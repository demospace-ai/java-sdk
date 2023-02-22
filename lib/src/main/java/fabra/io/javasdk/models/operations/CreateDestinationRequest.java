package fabra.io.javasdk.models.operations;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class CreateDestinationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public fabra.io.javasdk.models.shared.DestinationInput request;
    public CreateDestinationRequest withRequest(fabra.io.javasdk.models.shared.DestinationInput request) {
        this.request = request;
        return this;
    }
    
}
