package fabra.io.javasdk.models.operations;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class CreateSourceRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public fabra.io.javasdk.models.shared.SourceInput request;
    public CreateSourceRequest withRequest(fabra.io.javasdk.models.shared.SourceInput request) {
        this.request = request;
        return this;
    }
    
}
