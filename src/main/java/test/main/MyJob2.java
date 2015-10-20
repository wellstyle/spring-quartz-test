package test.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import test.control.TestController;

public class MyJob2 extends MyAbstractJob{
	
	private TestController testController;

	@Override
	protected void executeJob(JobExecutionContext context) {
		testController = (TestController) super.getBean("testController");
		testController.showMe("MyJob2 called ");			
	}
}
