package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*@author Administrator
 * *handle the /start endpoint
 */
@Controller
public class PlantPlacesController {

	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		
		return "start";
	}	
	/*
	 * Handle the / endpoints
	 * @return
	 */
	
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
}
