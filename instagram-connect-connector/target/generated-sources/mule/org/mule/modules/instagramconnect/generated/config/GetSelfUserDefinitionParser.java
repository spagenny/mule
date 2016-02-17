
package org.mule.modules.instagramconnect.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.instagramconnect.generated.processors.GetSelfUserMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-02-16T01:01:20+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class GetSelfUserDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(GetSelfUserDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(GetSelfUserMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [get-self-user] within the connector [instagram-connect] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [get-self-user] within the connector [instagram-connect] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("getSelfUser");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [get-self-user] within the connector [instagram-connect] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
