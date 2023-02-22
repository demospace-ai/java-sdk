package fabra.io.javasdk.models.operations;



public class CreateSourceResponse {
    public String contentType;
    public CreateSourceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public CreateSourceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public CreateSource200ApplicationJSON createSource200ApplicationJSONObject;
    public CreateSourceResponse withCreateSource200ApplicationJSONObject(CreateSource200ApplicationJSON createSource200ApplicationJSONObject) {
        this.createSource200ApplicationJSONObject = createSource200ApplicationJSONObject;
        return this;
    }
    
}
