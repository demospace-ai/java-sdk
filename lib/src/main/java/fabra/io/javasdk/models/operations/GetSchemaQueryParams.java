package fabra.io.javasdk.models.operations;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class GetSchemaQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connectionID")
    public Long connectionID;
    public GetSchemaQueryParams withConnectionID(Long connectionID) {
        this.connectionID = connectionID;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=namespace")
    public String namespace;
    public GetSchemaQueryParams withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=table_name")
    public String tableName;
    public GetSchemaQueryParams withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
}
