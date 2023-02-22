package fabra.io.javasdk.models.operations;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class GetTablesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connectionID")
    public Long connectionID;
    public GetTablesQueryParams withConnectionID(Long connectionID) {
        this.connectionID = connectionID;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=namespace")
    public String namespace;
    public GetTablesQueryParams withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
}
