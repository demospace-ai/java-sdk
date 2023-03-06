package fabra.io.javasdk.models.operations;

import java.net.http.HttpResponse;

public class GetSourcesResponse {
    public String contentType;
    public GetSourcesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetSourcesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetSourcesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetSources200ApplicationJSON getSources200ApplicationJSONObject;
    public GetSourcesResponse withGetSources200ApplicationJSONObject(GetSources200ApplicationJSON getSources200ApplicationJSONObject) {
        this.getSources200ApplicationJSONObject = getSources200ApplicationJSONObject;
        return this;
    }
    
}
