package test.main;

import test.control.TestController;

public class MyJob2 extends MyAbstractJob{
	
	@Override
	protected void executeJob(TestController testController) {	
		testController.showMe("MyJob2 called ");			
	}
}
