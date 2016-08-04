package aml.app.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.Scheduler;

import aml.app.main.JobScheduler;


/**
 * Application Lifecycle Listener implementation class SchedulerListener
 *
 */
public class SchedulerListener implements ServletContextListener {
    /**
     * Default constructor. 
     */
    public SchedulerListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    
    @Override
    public void contextInitialized(ServletContextEvent arg0)  { 
		JobScheduler job=new JobScheduler();
		job.runScheduler();
    	System.out.println("Loagding");
    }
	
}
