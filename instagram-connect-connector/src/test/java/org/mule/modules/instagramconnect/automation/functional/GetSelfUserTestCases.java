package org.mule.modules.instagramconnect.automation.functional;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.instagramconnect.InstagramConnectConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class GetSelfUserTestCases extends
		AbstractTestCase<InstagramConnectConnector> {

	public GetSelfUserTestCases() {
		super(InstagramConnectConnector.class);
	}

	@Before
	public void setup() {
		// TODO
	}

	@After
	public void tearDown() {
		// TODO
	}

	@Test
public void verify() throws IOException {
org.mule.api.MuleMessage expected=null;
assertEquals(getConnector().getSelfUser(),expected);
}
}