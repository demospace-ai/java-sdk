package fabra.io.javasdk.models.operations;

import java.net.http.HttpResponse;

public class GetSchemaResponse {
    public String contentType;
    public GetSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetSchemaResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetSchema200ApplicationJSON getSchema200ApplicationJSONObject;
    public GetSchemaResponse withGetSchema200ApplicationJSONObject(GetSchema200ApplicationJSON getSchema200ApplicationJSONObject) {
        this.getSchema200ApplicationJSONObject = getSchema200ApplicationJSONObject;
        return this;
    }
    
}
