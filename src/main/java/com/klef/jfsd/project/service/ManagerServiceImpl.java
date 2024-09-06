package com.klef.jfsd.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.project.model.Customer;
import com.klef.jfsd.project.model.Event;
import com.klef.jfsd.project.model.Manager;
import com.klef.jfsd.project.repository.ManagerRepository;
import com.klef.jfsd.project.repository.EventRepository;


@Service
public class ManagerServiceImpl implements ManagerService
{
	@Autowired
	private ManagerRepository managerRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public String addmanager(Manager m) {
		managerRepository.save(m);
			return "Manager Registered Successfully";
	}

	@Override
	public Manager checkmanagerlogin(String email, String pwd) {
		return managerRepository.checkmanagerlogin(email, pwd);
	}
	@Override
	public String addevent(Event e) {
		eventRepository.save(e);
		return "Event Added Successfully";
	}

	@Override
	public List<Event> viewallevents() {
		return eventRepository.findAll();
	}

	@Override
	public String deleteevent(int eid) {
		Optional <Event> obj =eventRepository.findById(eid);
	    String msg = null;
	    if(obj.isPresent())
	    {
	      Event event = obj.get();
	      eventRepository.delete(event);
	      msg="Event Deleted Successfully";
	    }
	    else
	    {
	      msg="Event Not Found";
	    }
	    return msg;
	}
}
