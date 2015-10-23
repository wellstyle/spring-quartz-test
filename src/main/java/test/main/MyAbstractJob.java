package test.main;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import test.control.TestController;

public abstract class MyAbstractJob  extends QuartzJobBean {
	
	private ApplicationContext ctx;
	private TestController testController;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {		
		ctx = (ApplicationContext)context.getJobDetail().getJobDataMap().get("applicationContext");		
		jobInit(context);
	}	
	
	private void jobInit(JobExecutionContext context) {
		testController = (TestController) ctx.getBean("testController");
		executeJob(testController);
	}
	
	protected abstract void executeJob(TestController testController);
}
