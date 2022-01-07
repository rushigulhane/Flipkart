package com.Automation.StepDef;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUpUITest() {
		com.Automation.Generic.DriverUtils.createDriver();
		com.Automation.Generic.PropertyReader.initProperty();
	}

}
