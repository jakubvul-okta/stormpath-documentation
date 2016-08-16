import com.stormpath.sdk.oauth;
import com.stormpath.sdk.resource;
import io.jsonwebtoken;

try {
  OAuthBearerRequestAuthentication authRequest = OAuthRequests.OAUTH_BEARER_REQUEST
      .builder()
      .setJwt(grantResult.getAccessTokenString())
      .build();

  OAuthBearerRequestAuthenticationResult authResult = Authenticators.OAUTH_BEARER_REQUEST_AUTHENTICATOR
      .forApplication(app).authenticate(authRequest);
} catch (ResourceException e) {
  //Not a valid authentication request
  e.printStackTrace();
} catch (JwtException e) {
  //Not a valid token
  e.printStackTrace();
}
