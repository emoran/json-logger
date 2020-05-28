
package org.mule.modules.pojos.generated.transformers;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.MessageTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.config.i18n.CoreMessages;
import org.mule.devkit.processor.ExpressionEvaluatorSupport;
import org.mule.modules.pojos.LoggerProcessor;
import org.mule.modules.pojos.LoggerProcessor.Priority;
import org.mule.modules.pojos.LoggerProcessor.TracePoint;
import org.mule.modules.pojos.generated.holders.LoggerProcessorExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2020-05-28T02:36:43-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class LoggerProcessorExpressionHolderTransformer
    extends ExpressionEvaluatorSupport
    implements DiscoverableTransformer, MessageTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;
    private ImmutableEndpoint endpoint;
    private MuleContext muleContext;
    private String name;

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

    public boolean isSourceTypeSupported(Class<?> aClass) {
        return (aClass == LoggerProcessorExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == LoggerProcessorExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {LoggerProcessorExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(LoggerProcessorExpressionHolder.class)});
    }

    public boolean isAcceptNull() {
        return false;
    }

    public boolean isIgnoreBadInput() {
        return false;
    }

    public Object transform(Object src)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public Object transform(Object src, String encoding)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public void setReturnClass(Class<?> theClass) {
        throw new UnsupportedOperationException();
    }

    public Class<?> getReturnClass() {
        return LoggerProcessor.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(LoggerProcessor.class);
    }

    public void setEndpoint(ImmutableEndpoint ep) {
        endpoint = ep;
    }

    public ImmutableEndpoint getEndpoint() {
        return endpoint;
    }

    public void dispose() {
    }

    public void initialise()
        throws InitialisationException
    {
    }

    public void setMuleContext(MuleContext context) {
        muleContext = context;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Object transform(Object src, MuleEvent event)
        throws TransformerMessagingException
    {
        return transform(src, null, event);
    }

    public Object transform(Object src, String encoding, MuleEvent event)
        throws TransformerMessagingException
    {
        if (src == null) {
            return null;
        }
        LoggerProcessorExpressionHolder holder = ((LoggerProcessorExpressionHolder) src);
        LoggerProcessor result = new LoggerProcessor();
        try {
            final String _transformedApplicationName = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_applicationNameType").getGenericType(), null, holder.getApplicationName()));
            result.setApplicationName(_transformedApplicationName);
            final String _transformedApplicationVersion = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_applicationVersionType").getGenericType(), null, holder.getApplicationVersion()));
            result.setApplicationVersion(_transformedApplicationVersion);
            final String _transformedEnvironment = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_environmentType").getGenericType(), null, holder.getEnvironment()));
            result.setEnvironment(_transformedEnvironment);
            final String _transformedTimestamp = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_timestampType").getGenericType(), null, holder.getTimestamp()));
            result.setTimestamp(_transformedTimestamp);
            final String _transformedRootCorrelationId = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_rootCorrelationIdType").getGenericType(), null, holder.getRootCorrelationId()));
            result.setRootCorrelationId(_transformedRootCorrelationId);
            final String _transformedCorrelationId = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_correlationIdType").getGenericType(), null, holder.getCorrelationId()));
            result.setCorrelationId(_transformedCorrelationId);
            final String _transformedThreadName = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_threadNameType").getGenericType(), null, holder.getThreadName()));
            result.setThreadName(_transformedThreadName);
            final String _transformedElapsed = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_elapsedType").getGenericType(), null, holder.getElapsed()));
            result.setElapsed(_transformedElapsed);
            final Priority _transformedPriority = ((Priority) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_priorityType").getGenericType(), null, holder.getPriority()));
            result.setPriority(_transformedPriority);
            final TracePoint _transformedTracePoint = ((TracePoint) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_tracePointType").getGenericType(), null, holder.getTracePoint()));
            result.setTracePoint(_transformedTracePoint);
            final String _transformedMessage = ((String) evaluateAndTransform(this.muleContext, event, LoggerProcessorExpressionHolder.class.getDeclaredField("_messageType").getGenericType(), null, holder.getMessage()));
            result.setMessage(_transformedMessage);
        } catch (NoSuchFieldException e) {
            throw new TransformerMessagingException(CoreMessages.createStaticMessage("internal error"), event, this, e);
        } catch (TransformerException e) {
            throw new TransformerMessagingException(e.getI18nMessage(), event, this, e);
        }
        return result;
    }

    public MuleEvent process(MuleEvent event) {
        return null;
    }

    public String getMimeType() {
        return null;
    }

    public String getEncoding() {
        return null;
    }

    public MuleContext getMuleContext() {
        return muleContext;
    }

}
