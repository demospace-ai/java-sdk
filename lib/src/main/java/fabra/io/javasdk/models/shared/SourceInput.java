package fabra.io.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceInput {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bigquery_config")
    public BigQueryConfig bigqueryConfig;
    public SourceInput withBigqueryConfig(BigQueryConfig bigqueryConfig) {
        this.bigqueryConfig = bigqueryConfig;
        return this;
    }
    
    @JsonProperty("connection_type")
    public ConnectionTypeEnum connectionType;
    public SourceInput withConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    
    @JsonProperty("display_name")
    public String displayName;
    public SourceInput withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    @JsonProperty("end_customer_id")
    public Long endCustomerId;
    public SourceInput withEndCustomerId(Long endCustomerId) {
        this.endCustomerId = endCustomerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mongodb_config")
    public MongoDbConfig mongodbConfig;
    public SourceInput withMongodbConfig(MongoDbConfig mongodbConfig) {
        this.mongodbConfig = mongodbConfig;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redshift_config")
    public RedshiftConfig redshiftConfig;
    public SourceInput withRedshiftConfig(RedshiftConfig redshiftConfig) {
        this.redshiftConfig = redshiftConfig;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("snowflake_config")
    public SnowflakeConfig snowflakeConfig;
    public SourceInput withSnowflakeConfig(SnowflakeConfig snowflakeConfig) {
        this.snowflakeConfig = snowflakeConfig;
        return this;
    }
    
}
