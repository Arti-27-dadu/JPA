package com.JPlogger.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	 
	@GetMapping("/check")
	
	public String meth()
	{
		
		Logger log=LoggerFactory.getLogger(Control.class);
		log.info("debug check first");
		String msg="hi welcome to logger demo....maven-> project update -> otherwise file not shown";
		log.info("debub check second");
		return msg;
	}

}
