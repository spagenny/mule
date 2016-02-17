
package org.mule.modules.instagramconnect.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-02-16T01:01:20+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class InstagramConnectConnectorConnectorConfigConfigDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(InstagramConnectConnectorConnectorConfigConfigDefinitionParser.class);

    public String moduleName() {
        return "InstagramConnect";
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, (org.mule.modules.instagramconnect.oauth.InstagramConnectConnectorOAuthManager.class));
        setDestroyMethodIfNeeded(builder, (org.mule.modules.instagramconnect.oauth.InstagramConnectConnectorOAuthManager.class));
        parseProperty(builder, element, "name", "name");
        parseProperty(builder, element, "authorizationUrl");
        parseProperty(builder, element, "accessTokenUrl");
        parseProperty(builder, element, "onNoToken");
        Element oauthHttpCallbackConfigElement = DomUtils.getChildElementByTagName(element, "oauth-callback-config");
        if (oauthHttpCallbackConfigElement!= null) {
            parseProperty(builder, oauthHttpCallbackConfigElement, "domain");
            parseProperty(builder, oauthHttpCallbackConfigElement, "localPort");
            parseProperty(builder, oauthHttpCallbackConfigElement, "remotePort");
            parseProperty(builder, oauthHttpCallbackConfigElement, "async");
            parseProperty(builder, oauthHttpCallbackConfigElement, "path");
            parseProperty(builder, oauthHttpCallbackConfigElement, "defaultAccessTokenId");
            if (hasAttribute(oauthHttpCallbackConfigElement, "connector-ref")) {
                builder.addPropertyValue("connector", new RuntimeBeanReference(oauthHttpCallbackConfigElement.getAttribute("connector-ref")));
            }
        }
        Element oauthStoreConfigElement = DomUtils.getChildElementByTagName(element, "oauth-store-config");
        if (oauthStoreConfigElement!= null) {
            parsePropertyRef(builder, oauthStoreConfigElement, "objectStore-ref", "accessTokenObjectStore");
        }
        parseProperty(builder, element, "consumerKey", "consumerKey");
        parseProperty(builder, element, "consumerSecret", "consumerSecret");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition((org.mule.modules.instagramconnect.oauth.InstagramConnectConnectorOAuthManager.class).getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config-with-oauth] within the connector [instagram-connect] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config-with-oauth] within the connector [instagram-connect] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
