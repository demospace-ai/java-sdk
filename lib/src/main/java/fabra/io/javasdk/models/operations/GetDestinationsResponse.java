package fabra.io.javasdk.models.operations;

import java.net.http.HttpResponse;

public class GetDestinationsResponse {
    public String contentType;
    public GetDestinationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetDestinationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetDestinationsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetDestinations200ApplicationJSON getDestinations200ApplicationJSONObject;
    public GetDestinationsResponse withGetDestinations200ApplicationJSONObject(GetDestinations200ApplicationJSON getDestinations200ApplicationJSONObject) {
        this.getDestinations200ApplicationJSONObject = getDestinations200ApplicationJSONObject;
        return this;
    }
    
}
