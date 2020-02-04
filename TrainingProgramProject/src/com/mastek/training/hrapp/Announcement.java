package com.mastek.training.hrapp;
// we declare classes as abstract on the following two rules:
// 1. any one of the methods in the class is declared as abstract
// 2.if any one of the abstract methods from the base class is not overridden
public abstract class Announcement {
	
	private String from;
	private String forGroup;
	private String subject;
	private String contentText;
	
	
	//we declare the method as abstract when we want derived class to define
	// the logic of this method/behaviour
	// we cannot declare abstract method/class as 'final'
	// we cannot declare the abstract method as a'private' method, it must be only public/public
	public abstract void sendAnnouncement();
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getForGroup() {
		return forGroup;
	}
	public void setForGroup(String forGroup) {
		this.forGroup = forGroup;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContentText() {
		return contentText;
	}
	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

}
