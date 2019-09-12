package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*@author Administrator
 * *handle the /start endpoint
 */
@Controller
public class PlantPlacesController {

	@RequestMapping("/index")
	public String start() {
		
		return "start";
	}
	
	@RequestMapping("/")
	public String start() {
		
		return "start";
	}
}
