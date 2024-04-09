package jsp.org.Spring_practice.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Chandru {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
    String name;
	Long mobile;
	int english;
	int kannada;
	LocalDate dob;
	double percentage;
	String result;
}
