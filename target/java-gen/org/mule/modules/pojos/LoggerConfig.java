
package org.mule.modules.pojos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Default;


/**
 * Definition for fields globally defined in the logger config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prettyPrint",
    "timestamp",
    "rootCorrelationId",
    "correlationId",
    "applicationName",
    "applicationVersion",
    "environment"
})
public class LoggerConfig {

    @JsonProperty("prettyPrint")
    @Placement(group = "JSON Output")
    @Default("true")
    @Configurable
    private Boolean prettyPrint;
    @JsonProperty("timestamp")
    @Placement(group = "Default expressions")
    @Default("#[new org.joda.time.DateTime().withZone(org.joda.time.DateTimeZone.forID(\"${json.logger.timezone}\")).toString(\"${json.logger.dateformat}\")]")
    @Configurable
    private String timestamp;
    @JsonProperty("rootCorrelationId")
    @Placement(group = "Default expressions")
    @Default("#[(message.inboundProperties.'x-root-correlation-id' != null)?message.inboundProperties.'x-root-correlation-id':message.id]")
    @Configurable
    private String rootCorrelationId;
    @JsonProperty("correlationId")
    @Placement(group = "Default expressions")
    @Default("#[message.id]")
    @Configurable
    private String correlationId;
    @JsonProperty("applicationName")
    @Placement(group = "Global")
    @Default("${json.logger.application.name}")
    @Configurable
    private String applicationName;
    @JsonProperty("applicationVersion")
    @Placement(group = "Global")
    @Default("${json.logger.application.version}")
    @Configurable
    private String applicationVersion;
    @JsonProperty("environment")
    @Placement(group = "Global")
    @Default("${mule.env}")
    @Configurable
    private String environment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prettyPrint")
    public Boolean getPrettyPrint() {
        return prettyPrint;
    }

    @JsonProperty("prettyPrint")
    public void setPrettyPrint(Boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("rootCorrelationId")
    public String getRootCorrelationId() {
        return rootCorrelationId;
    }

    @JsonProperty("rootCorrelationId")
    public void setRootCorrelationId(String rootCorrelationId) {
        this.rootCorrelationId = rootCorrelationId;
    }

    @JsonProperty("correlationId")
    public String getCorrelationId() {
        return correlationId;
    }

    @JsonProperty("correlationId")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @JsonProperty("applicationName")
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty("applicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @JsonProperty("applicationVersion")
    public String getApplicationVersion() {
        return applicationVersion;
    }

    @JsonProperty("applicationVersion")
    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(prettyPrint).append(timestamp).append(rootCorrelationId).append(correlationId).append(applicationName).append(applicationVersion).append(environment).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoggerConfig) == false) {
            return false;
        }
        LoggerConfig rhs = ((LoggerConfig) other);
        return new EqualsBuilder().append(prettyPrint, rhs.prettyPrint).append(timestamp, rhs.timestamp).append(rootCorrelationId, rhs.rootCorrelationId).append(correlationId, rhs.correlationId).append(applicationName, rhs.applicationName).append(applicationVersion, rhs.applicationVersion).append(environment, rhs.environment).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
