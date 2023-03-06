package fabra.io.javasdk.models.operations;

import java.net.http.HttpResponse;

public class CreateLinkTokenResponse {
    public String contentType;
    public CreateLinkTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public fabra.io.javasdk.models.shared.CreateLinkTokenResponse createLinkTokenResponse;
    public CreateLinkTokenResponse withCreateLinkTokenResponse(fabra.io.javasdk.models.shared.CreateLinkTokenResponse createLinkTokenResponse) {
        this.createLinkTokenResponse = createLinkTokenResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateLinkTokenResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CreateLinkTokenResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
