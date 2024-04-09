package jsp.org.Spring_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jsp.org.Spring_practice.dto.Chandru;
@Repository
public interface Myrepository extends JpaRepository<Chandru, Integer> {

}
