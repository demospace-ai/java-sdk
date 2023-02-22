package fabra.io.javasdk.models.operations;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class CreateObjectRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public fabra.io.javasdk.models.shared.ObjectInput request;
    public CreateObjectRequest withRequest(fabra.io.javasdk.models.shared.ObjectInput request) {
        this.request = request;
        return this;
    }
    
}
