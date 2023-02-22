package fabra.io.javasdk.models.operations;



public class GetNamespacesResponse {
    public String contentType;
    public GetNamespacesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetNamespacesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public GetNamespaces200ApplicationJSON getNamespaces200ApplicationJSONObject;
    public GetNamespacesResponse withGetNamespaces200ApplicationJSONObject(GetNamespaces200ApplicationJSON getNamespaces200ApplicationJSONObject) {
        this.getNamespaces200ApplicationJSONObject = getNamespaces200ApplicationJSONObject;
        return this;
    }
    
}
