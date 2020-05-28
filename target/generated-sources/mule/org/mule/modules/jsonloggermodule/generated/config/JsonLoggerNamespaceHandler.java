
package org.mule.modules.jsonloggermodule.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/json-logger</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2020-05-28T02:36:43-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JsonLoggerNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(JsonLoggerNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [json-logger] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [json-logger] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("json-logger-with-mq-config", new JsonLoggerModuleConnectorJsonLoggerWithMQConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("json-logger-with-mq-config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("json-logger-config", new JsonLoggerModuleConnectorJsonLoggerConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("json-logger-config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("logger", new LoggerDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("logger", "@Processor", ex);
        }
    }

}
