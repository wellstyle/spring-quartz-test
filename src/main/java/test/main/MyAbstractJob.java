package test.main;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

public abstract class MyAbstractJob  extends QuartzJobBean {
	private ApplicationContext ctx;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {		
		ctx = (ApplicationContext)context.getJobDetail().getJobDataMap().get("applicationContext");		
		executeJob(context);
	}	
	protected Object getBean(String beanId) {
        return ctx.getBean(beanId);
    }
	protected abstract void executeJob(JobExecutionContext context);
}
