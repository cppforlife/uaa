package org.cloudfoundry.identity.uaa.mfa_provider;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.cloudfoundry.identity.uaa.mfa_provider.MfaProvider.GOOGLE_AUTH;
import static org.junit.Assert.assertTrue;


public class MfaProviderEndpointsTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    MfaProviderEndpoints endpoint = new MfaProviderEndpoints();
}