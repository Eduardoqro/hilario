package org.generation.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorInicio {
	@GetMapping("/saludo") // localhost:808/saludo
	public String saludo() {
		return "Holi Crayoli desde Spring Boot";
	}
}
