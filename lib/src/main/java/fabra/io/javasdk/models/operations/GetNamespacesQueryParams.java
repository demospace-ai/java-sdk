package fabra.io.javasdk.models.operations;

import fabra.io.javasdk.utils.SpeakeasyMetadata;

public class GetNamespacesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connectionID")
    public Long connectionID;
    public GetNamespacesQueryParams withConnectionID(Long connectionID) {
        this.connectionID = connectionID;
        return this;
    }
    
}
