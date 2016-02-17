
package org.mule.modules.instagramconnect.oauth;

import java.io.Serializable;
import javax.annotation.Generated;
import org.mule.api.store.ObjectStore;
import org.mule.common.security.oauth.OAuthState;
import org.mule.modules.instagramconnect.adapters.InstagramConnectConnectorOAuth2Adapter;
import org.mule.security.oauth.BaseOAuthClientFactory;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-02-16T01:01:20+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class InstagramConnectConnectorOAuthClientFactory
    extends BaseOAuthClientFactory
{

    private InstagramConnectConnectorOAuthManager oauthManager;

    public InstagramConnectConnectorOAuthClientFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        super(oauthManager, objectStore);
        this.oauthManager = (InstagramConnectConnectorOAuthManager) oauthManager;
    }

    @Override
    protected Class<? extends OAuth2Adapter> getAdapterClass() {
        return (org.mule.modules.instagramconnect.adapters.InstagramConnectConnectorRestClientAdapter.class);
    }

    @Override
    protected void setCustomAdapterProperties(OAuth2Adapter adapter, OAuthState state) {
        InstagramConnectConnectorOAuth2Adapter connector = ((InstagramConnectConnectorOAuth2Adapter) adapter);
    }

    @Override
    protected void setCustomStateProperties(OAuth2Adapter adapter, OAuthState state) {
        InstagramConnectConnectorOAuth2Adapter connector = ((InstagramConnectConnectorOAuth2Adapter) adapter);
    }

}
