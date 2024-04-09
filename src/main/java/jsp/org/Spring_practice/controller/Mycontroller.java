package jsp.org.Spring_practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jsp.org.Spring_practice.dto.Chandru;
import jsp.org.Spring_practice.service.Myservice;

@Controller
public class Mycontroller {
	@Autowired
	Myservice service;
	@GetMapping("/")
	public String hello() {
		return "Main";
	}
	@GetMapping("/insert")
	public String loadinsert() {
		return "insert";
	}
	@PostMapping("/insert")
		public String insert(Chandru chandru,ModelMap map) {
			return service.insert(chandru,map);
		}
	@GetMapping("/fetchall")
	   public String fetchAll(ModelMap map) {
		   return service.fetchAll(map);
	   }
	    @GetMapping("/delete")
	    public String deleteById(@RequestParam int id,ModelMap map) {
	    	return service.deleteById(id,map);
	    }
	    @GetMapping("/edit")
	    public String edit(@RequestParam int id,ModelMap map) {
	    	return service.findById(id, map);
	    }
	   @PostMapping("/update")
	   public String update(Chandru chandru,ModelMap map) {
		   return service.update(chandru,map);
	   }
	}

