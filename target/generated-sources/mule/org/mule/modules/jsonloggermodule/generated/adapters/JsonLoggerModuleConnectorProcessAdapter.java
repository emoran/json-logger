
package org.mule.modules.jsonloggermodule.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.jsonloggermodule.JsonLoggerModuleConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>JsonLoggerModuleConnectorProcessAdapter</code> is a wrapper around {@link JsonLoggerModuleConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2020-05-28T02:36:43-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JsonLoggerModuleConnectorProcessAdapter
    extends JsonLoggerModuleConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<JsonLoggerModuleConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, JsonLoggerModuleConnectorCapabilitiesAdapter> getProcessTemplate() {
        final JsonLoggerModuleConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,JsonLoggerModuleConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, JsonLoggerModuleConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, JsonLoggerModuleConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
