package fabra.io.javasdk.models.operations;



public class GetSyncsResponse {
    public String contentType;
    public GetSyncsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetSyncsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public GetSyncs200ApplicationJSON getSyncs200ApplicationJSONObject;
    public GetSyncsResponse withGetSyncs200ApplicationJSONObject(GetSyncs200ApplicationJSON getSyncs200ApplicationJSONObject) {
        this.getSyncs200ApplicationJSONObject = getSyncs200ApplicationJSONObject;
        return this;
    }
    
}
