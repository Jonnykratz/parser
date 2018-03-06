package com.ef.model;

import java.sql.Timestamp;

/**Java Class ~ a Blue print for each log*/
public class LogEntry {

	private String ipAddress;
	private Timestamp accessTime;
	private int StatusCode;
	private String comment;

	public String getIpAddress() {
		return ipAddress;
	}
	public LogEntry(String ipAddress, Timestamp accessTime, int statusCode) {
		super();
		this.ipAddress = ipAddress;
		this.accessTime = accessTime;
		StatusCode = statusCode;
	}
	public LogEntry() {
		// TODO Auto-generated constructor stub
	}

	public LogEntry(String ipAddress, String comment) {
		this.ipAddress = ipAddress;
		this.comment = comment;
	}

	public Timestamp getAccessTime() {
		return accessTime;
	}
	public int getStatusCode() {
		return StatusCode;
	}
	@Override// delimited by pipe (|)
	public String toString() {
		return ipAddress+"|" + accessTime + "|" + StatusCode ;
	}

	public String getComment() {
		return comment;
	}
}
