package aml.app.main;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import aml.app.jobs.DescargarArchivosAmlJob;

import org.quartz.JobBuilder;

public class JobScheduler {
	
	public JobScheduler() {
		
	}
	
	public void runScheduler(){
		 Scheduler scheduler = null;
		 
		 JobDetail descargarJob= JobBuilder.newJob(DescargarArchivosAmlJob.class)
				 .withIdentity("DescargarArchivosAml", "Aml").build();
		 
		 
		 Trigger descargarTrigger = TriggerBuilder
		 .newTrigger()
		 .withIdentity("DescargarArchivosAmlTrigger","test")
		 .withSchedule(
				 SimpleScheduleBuilder.simpleSchedule()
				.withIntervalInSeconds(5).repeatForever())
		 .build();
		 
			try {
				scheduler = new StdSchedulerFactory().getScheduler();
				scheduler.start();
				scheduler.scheduleJob(descargarJob, descargarTrigger);
			} catch (SchedulerException e) {
				e.printStackTrace();
			}

		}
}
