
package org.mule.modules.jsonloggermodule.generated.adapters;

import java.io.IOException;
import javax.annotation.Generated;
import org.json.JSONException;
import org.mule.api.DefaultMuleException;
import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.store.ObjectStoreException;
import org.mule.common.MuleVersion;
import org.mule.config.MuleManifest;
import org.mule.config.i18n.CoreMessages;
import org.mule.modules.jsonloggermodule.JsonLoggerModuleConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A <code>JsonLoggerModuleConnectorLifecycleInjectionAdapter</code> is a wrapper around {@link JsonLoggerModuleConnector } that adds lifecycle methods to the pojo. This adapter also allows the injection of several Mule facilities when a MuleContext is set.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2020-05-28T02:36:43-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JsonLoggerModuleConnectorLifecycleInjectionAdapter
    extends JsonLoggerModuleConnectorMetadataAdapter
    implements MuleContextAware, Disposable, Initialisable, Startable, Stoppable
{


    @Override
    public void start()
        throws MuleException
    {
        try {
            super.init();
        } catch (ObjectStoreException e0) {
            throw new DefaultMuleException(e0);
        } catch (JSONException e1) {
            throw new DefaultMuleException(e1);
        } catch (IOException e2) {
            throw new DefaultMuleException(e2);
        }
    }

    @Override
    public void stop()
        throws MuleException
    {
    }

    @Override
    public void initialise()
        throws InitialisationException
    {
        Logger log = LoggerFactory.getLogger(JsonLoggerModuleConnectorLifecycleInjectionAdapter.class);
        MuleVersion connectorVersion = new MuleVersion("3.5.0");
        MuleVersion muleVersion = new MuleVersion(MuleManifest.getProductVersion());
        if (!muleVersion.atLeastBase(connectorVersion)) {
            throw new InitialisationException(CoreMessages.minMuleVersionNotMet(this.getMinMuleVersion()), this);
        }
    }

    @Override
    public void dispose() {
    }

    @Override
    public void setMuleContext(MuleContext context) {
        super.setExpressionManager(context.getExpressionManager());
        super.setRegistry(context.getRegistry());
        super.setMuleContext(context);
    }

}
