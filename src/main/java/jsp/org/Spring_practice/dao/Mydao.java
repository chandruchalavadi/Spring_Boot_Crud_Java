package jsp.org.Spring_practice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jsp.org.Spring_practice.dto.Chandru;
import jsp.org.Spring_practice.repository.Myrepository;

@Component
public class Mydao {
	@Autowired
	Myrepository repository;

	public void save(Chandru chandru) {
		repository.save(chandru);
	}

	public List<Chandru> fetchAll() {
		return repository.findAll();
	}

	public void deleteById(int id) {
		repository.deleteById(id);
	}

	public Chandru findById(int id) {
		return repository.findById(id).get();
	}

}
