
package org.mule.modules.pojos.generated.transformers;

import javax.annotation.Generated;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.modules.pojos.LoggerProcessor.Priority;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2020-05-28T02:36:43-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class LoggerProcessorPriorityEnumTransformer
    extends AbstractTransformer
    implements DiscoverableTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;

    public LoggerProcessorPriorityEnumTransformer() {
        registerSourceType(DataTypeFactory.create(String.class));
        setReturnClass(Priority.class);
        setName("LoggerProcessorPriorityEnumTransformer");
    }

    protected Object doTransform(Object src, String encoding)
        throws TransformerException
    {
        Priority result = null;
        result = Enum.valueOf(Priority.class, ((String) src));
        return result;
    }

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

}
