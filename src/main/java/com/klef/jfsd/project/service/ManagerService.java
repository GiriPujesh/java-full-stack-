package com.klef.jfsd.project.service;

import java.util.List;

import com.klef.jfsd.project.model.Event;
import com.klef.jfsd.project.model.Manager;

public interface ManagerService 
{
	public String addmanager(Manager m);
	public Manager checkmanagerlogin(String email,String pwd);
	public String addevent(Event e);
	public List<Event> viewallevents();
	public String deleteevent(int eid);
}
