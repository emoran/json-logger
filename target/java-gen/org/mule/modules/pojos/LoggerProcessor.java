
package org.mule.modules.pojos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mule.api.annotations.Ignore;
import org.mule.api.annotations.param.Default;


/**
 * Definition for fields used in the logger message processor
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "applicationName",
    "applicationVersion",
    "environment",
    "timestamp",
    "rootCorrelationId",
    "correlationId",
    "threadName",
    "elapsed",
    "priority",
    "tracePoint",
    "message"
})
public class LoggerProcessor {

    @JsonProperty("applicationName")
    @Default("should be defined on the connector config schema")
    @Ignore
    private String applicationName;
    @JsonProperty("applicationVersion")
    @Default("should be defined on the connector config schema")
    @Ignore
    private String applicationVersion;
    @JsonProperty("environment")
    @Default("should be defined on the connector config schema")
    @Ignore
    private String environment;
    @JsonProperty("timestamp")
    @Default("should be defined on the connector config schema")
    @Ignore
    private String timestamp;
    @JsonProperty("rootCorrelationId")
    @Default("should be defined on the connector config schema")
    @Ignore
    private String rootCorrelationId;
    @JsonProperty("correlationId")
    @Default("should be defined on the connector config schema")
    @Ignore
    private String correlationId;
    @JsonProperty("threadName")
    @Default("calculated internally")
    @Ignore
    private String threadName;
    @JsonProperty("elapsed")
    @Default("calculated internally")
    @Ignore
    private String elapsed;
    @JsonProperty("priority")
    @Default("INFO")
    private LoggerProcessor.Priority priority;
    @JsonProperty("tracePoint")
    @Default("START")
    private LoggerProcessor.TracePoint tracePoint;
    @JsonProperty("message")
    @Default("")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("threadName")
    public String getThreadName() {
        return threadName;
    }

    @JsonProperty("threadName")
    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @JsonProperty("elapsed")
    public String getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    @JsonProperty("priority")
    public LoggerProcessor.Priority getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(LoggerProcessor.Priority priority) {
        this.priority = priority;
    }

    @JsonProperty("tracePoint")
    public LoggerProcessor.TracePoint getTracePoint() {
        return tracePoint;
    }

    @JsonProperty("tracePoint")
    public void setTracePoint(LoggerProcessor.TracePoint tracePoint) {
        this.tracePoint = tracePoint;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
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
        return new HashCodeBuilder().append(applicationName).append(applicationVersion).append(environment).append(timestamp).append(rootCorrelationId).append(correlationId).append(threadName).append(elapsed).append(priority).append(tracePoint).append(message).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoggerProcessor) == false) {
            return false;
        }
        LoggerProcessor rhs = ((LoggerProcessor) other);
        return new EqualsBuilder().append(applicationName, rhs.applicationName).append(applicationVersion, rhs.applicationVersion).append(environment, rhs.environment).append(timestamp, rhs.timestamp).append(rootCorrelationId, rhs.rootCorrelationId).append(correlationId, rhs.correlationId).append(threadName, rhs.threadName).append(elapsed, rhs.elapsed).append(priority, rhs.priority).append(tracePoint, rhs.tracePoint).append(message, rhs.message).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public enum Priority {

        DEBUG("DEBUG"),
        INFO("INFO"),
        WARN("WARN"),
        ERROR("ERROR");
        private final String value;
        private final static Map<String, LoggerProcessor.Priority> CONSTANTS = new HashMap<String, LoggerProcessor.Priority>();

        static {
            for (LoggerProcessor.Priority c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Priority(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static LoggerProcessor.Priority fromValue(String value) {
            LoggerProcessor.Priority constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TracePoint {

        START("START"),
        BEFORE_TRANSFORM("BEFORE TRANSFORM"),
        AFTER_TRANSFORM("AFTER TRANSFORM"),
        BEFORE_API_OR_BACKEND("BEFORE API OR BACKEND"),
        AFTER_API_OR_BACKEND("AFTER API OR BACKEND"),
        END("END"),
        EXCEPTION("EXCEPTION");
        private final String value;
        private final static Map<String, LoggerProcessor.TracePoint> CONSTANTS = new HashMap<String, LoggerProcessor.TracePoint>();

        static {
            for (LoggerProcessor.TracePoint c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TracePoint(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static LoggerProcessor.TracePoint fromValue(String value) {
            LoggerProcessor.TracePoint constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
