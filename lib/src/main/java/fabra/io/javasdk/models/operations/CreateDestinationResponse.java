package fabra.io.javasdk.models.operations;



public class CreateDestinationResponse {
    public String contentType;
    public CreateDestinationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public CreateDestinationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public CreateDestination200ApplicationJSON createDestination200ApplicationJSONObject;
    public CreateDestinationResponse withCreateDestination200ApplicationJSONObject(CreateDestination200ApplicationJSON createDestination200ApplicationJSONObject) {
        this.createDestination200ApplicationJSONObject = createDestination200ApplicationJSONObject;
        return this;
    }
    
}
