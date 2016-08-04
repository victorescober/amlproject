package aml.app.jobs;

import java.util.Calendar;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class DescargarArchivosAmlJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		
		System.out.println("Downloading Files" + Calendar.getInstance().getTime().toString());
		
	}
	
}
