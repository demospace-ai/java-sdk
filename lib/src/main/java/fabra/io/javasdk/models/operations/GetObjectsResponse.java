package fabra.io.javasdk.models.operations;



public class GetObjectsResponse {
    public String contentType;
    public GetObjectsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetObjectsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public GetObjects200ApplicationJSON getObjects200ApplicationJSONObject;
    public GetObjectsResponse withGetObjects200ApplicationJSONObject(GetObjects200ApplicationJSON getObjects200ApplicationJSONObject) {
        this.getObjects200ApplicationJSONObject = getObjects200ApplicationJSONObject;
        return this;
    }
    
}
