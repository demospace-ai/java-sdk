package fabra.io.javasdk.models.operations;

import java.net.http.HttpResponse;

public class GetTablesResponse {
    public String contentType;
    public GetTablesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public GetTablesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetTablesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetTables200ApplicationJSON getTables200ApplicationJSONObject;
    public GetTablesResponse withGetTables200ApplicationJSONObject(GetTables200ApplicationJSON getTables200ApplicationJSONObject) {
        this.getTables200ApplicationJSONObject = getTables200ApplicationJSONObject;
        return this;
    }
    
}
