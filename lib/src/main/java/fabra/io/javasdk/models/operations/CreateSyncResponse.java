package fabra.io.javasdk.models.operations;



public class CreateSyncResponse {
    public String contentType;
    public CreateSyncResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public CreateSyncResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public CreateSync200ApplicationJSON createSync200ApplicationJSONObject;
    public CreateSyncResponse withCreateSync200ApplicationJSONObject(CreateSync200ApplicationJSON createSync200ApplicationJSONObject) {
        this.createSync200ApplicationJSONObject = createSync200ApplicationJSONObject;
        return this;
    }
    
}
