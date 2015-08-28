package com.ethan.java.dell8700monitor.entities;

import io.github.lorenzosaino.webmonitor.WebMonitorServlet;
import io.github.lorenzosaino.webmonitor.services.DataStoreService;
import io.github.lorenzosaino.webmonitor.services.NotificationService;
import io.github.lorenzosaino.webmonitor.services.ObjectRetrievalService;

import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Dell8700MonitorServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -151901049126769893L;
	
	private static final Logger log = 
			Logger.getLogger(Dell8700MonitorServlet.class.getName());
	
	/* Instances of services needed */
	private DataStoreService datastore = null;
	private NotificationService notifier = null;
	private ObjectRetrievalService retriever = null;
	
	private int maxRetrievalAttempts = 2;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		/* Get all config parameters */
		String userAgent = config.getInitParameter("retriever.userAgent");
		String senderName = config.getInitParameter("notifer.senderName");
		String senderEmail = config.getInitParameter("notifer.senderEmail");
		
		/* Instantiate all services required */
		this.datastore = DataStoreService.getInstance();
		this.notifier = new NotificationService(senderEmail, senderName);
		this.retriever = new ObjectRetrievalService(userAgent);
	}

}
