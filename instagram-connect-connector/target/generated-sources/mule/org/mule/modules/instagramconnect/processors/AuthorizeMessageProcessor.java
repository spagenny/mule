
package org.mule.modules.instagramconnect.processors;

import java.util.regex.Pattern;
import javax.annotation.Generated;
import org.mule.modules.instagramconnect.oauth.InstagramConnectConnectorOAuthManager;
import org.mule.security.oauth.processor.BaseOAuth2AuthorizeMessageProcessor;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-02-16T01:01:20+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class AuthorizeMessageProcessor
    extends BaseOAuth2AuthorizeMessageProcessor<InstagramConnectConnectorOAuthManager>
{

    private final static Pattern AUTH_CODE_PATTERN = Pattern.compile("code=([^&]+)");

    @Override
    protected String getAuthCodeRegex() {
        return AUTH_CODE_PATTERN.pattern();
    }

    @Override
    protected Class<InstagramConnectConnectorOAuthManager> getOAuthManagerClass() {
        return InstagramConnectConnectorOAuthManager.class;
    }

}
