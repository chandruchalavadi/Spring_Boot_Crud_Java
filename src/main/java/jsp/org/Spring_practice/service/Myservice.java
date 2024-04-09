package jsp.org.Spring_practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import jsp.org.Spring_practice.dao.Mydao;
import jsp.org.Spring_practice.dto.Chandru;

@Service
public class Myservice {
@Autowired
Mydao dao;
	public String insert(Chandru chandru, ModelMap map) {
	    chandru.setPercentage(chandru.getEnglish()+chandru.getKannada()/2.0);
	    if(chandru.getKannada()<35 && chandru.getEnglish()<35) {
	    	chandru.setResult("Fail");
	    }
	    else {
	    if(chandru.getPercentage()>=60)
	    	chandru.setResult("First class");
	    }
	     if(chandru.getPercentage()>=80) {
	    	chandru.setResult("distinction");
	    }
	    else {
	    	chandru.setResult("Second class");
	    }
	     dao.save(chandru);
	     map.put("pass", "Record added");
	     return "Main";
	}
	public String fetchAll(ModelMap map) {
		List<Chandru>list=dao.fetchAll();
		if(list.isEmpty()) {
			map.put("Fail", "Fail to Fetch");
			return "Main";
		}
		else {
			map.put("fetch", list);
			return "fetchall";
		}
	}
	public String deleteById(int id, ModelMap map) {
	    dao.deleteById(id);
	    map.put("delete", "deleted");
	    return fetchAll(map);
	}
	public String findById(int id, ModelMap map) {
		Chandru chandru=dao.findById(id);
		map.put("chandru", chandru);
		return "edit";
	}
	public String update(Chandru chandru, ModelMap map) {
		  chandru.setPercentage(chandru.getEnglish()+chandru.getKannada()/2.0);
		    if(chandru.getKannada()<35 && chandru.getEnglish()<35) {
		    	chandru.setResult("Fail");
		    }
		    else {
		    if(chandru.getPercentage()>=60)
		    	chandru.setResult("First class");
		    }
		     if(chandru.getPercentage()>=80) {
		    	chandru.setResult("distinction");
		    }
		    else {
		    	chandru.setResult("Second class");
		    }
		     dao.save(chandru);
		     map.put("update", "Updated success");
		     return "Main";
	}
	
}


