
package org.mule.modules.instagramconnect.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.instagramconnect.InstagramConnectConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>InstagramConnectConnectorProcessAdapter</code> is a wrapper around {@link InstagramConnectConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-02-16T01:01:20+01:00", comments = "Build UNNAMED.2762.e3b1307")
public abstract class InstagramConnectConnectorProcessAdapter
    extends InstagramConnectConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<InstagramConnectConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, InstagramConnectConnectorCapabilitiesAdapter> getProcessTemplate() {
        final InstagramConnectConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,InstagramConnectConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, InstagramConnectConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, InstagramConnectConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
