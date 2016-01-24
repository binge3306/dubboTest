package com.gdupt.boostrap;

import javax.servlet.annotation.WebListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.google.common.util.concurrent.AbstractIdleService;


@WebListener
public class BootstrapListener  extends AbstractIdleService{
	
	private ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		BootstrapListener bootstrap = new BootstrapListener();
		bootstrap.startAsync();

		  try {
	            Object lock = new Object();
	            synchronized (lock) {
	               
	                    lock.wait();
	                
	            }
	        } catch (InterruptedException ex) {
	        	ex.printStackTrace();
	           // log.error("ignore interruption ");
	        }
	}

	@Override
	protected void startUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		context.registerShutdownHook();
      
	}

	@Override
	protected void shutDown() throws Exception {
		context.stop();

	}

}
