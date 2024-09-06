package com.klef.jfsd.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.jfsd.project.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService
{
	@Autowired
	private EventRepository eventRepository;
	
}
