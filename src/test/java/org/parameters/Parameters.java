package org.parameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameters {
@org.testng.annotations.Parameters({"username","password"})
	@Test
	private void tc1(@Optional("mkb") String s1,@Optional("1995") String s2) {
	System.out.println(s1);
	System.out.println(s2);

	}

}
