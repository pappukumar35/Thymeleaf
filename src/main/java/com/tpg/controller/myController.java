package com.tpg.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class myController {

	
	  @RequestMapping(value = "/about", method = RequestMethod.GET) public String
	  about(Model model) { System.out.println("Inside the about handler method");
	  
	  model.addAttribute("name", "pappu"); model.addAttribute("currentDate", new
	  Date().toLocaleString());
	  
	  return "about"; }
	 
    @GetMapping("/about2")
   public String iterateHandler(Model m) {
    	
    	List<String> names = List.of("Pappu","rohit","vicky","prince");
    	m.addAttribute("names",names);
    	
	   return "iterate";
   }
    
    @GetMapping("/condition")
    public String conditionalHandling(Model m) {
    	System.out.println("starting for the loop thmeleaf condition");
    	m.addAttribute("isActive",false);
    	m.addAttribute("gender","f");
    	List<Integer> list = List.of(2012,2010,2310,1524,0312);
		m.addAttribute("mylist",list);
    	return "condition";
    }
    
    @GetMapping("/service")
    public String serviceHandler() {
    	return "service";
    }
    
    
    @GetMapping("/aboutnew")
    public String newAbout() {
    	return "aboutnew";
    }
        
    @GetMapping("/content")
    public String getContect() {
    	return "content";
    }
    
    
}
