package com.ethan.java.XPS8700Monitor.entities;

import java.util.Date;

public class PageEntity {
	
	private String uri = null;
	private String content = null;
	private String contentType = null;
	private Date timestamp = null;
	private int statusCode = 0;
	
	/**
	 * Constructor
	 * 
	 * @param content The string representing the content of the object
	 * @param contentType The MIME type of the object
	 * @param date The date the content was retrieved
	 */
	public PageEntity(String uri, String content, String contentType,
			Date timestamp, int statusCode) {
		
		if(uri == null || content == null || timestamp == null) {
			throw new IllegalArgumentException("content, timestamp and uri parameters cannot be null");
		}
		this.uri = uri;
		this.content = content;
		this.contentType = contentType;
		this.timestamp = timestamp;
		this.statusCode = statusCode;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
