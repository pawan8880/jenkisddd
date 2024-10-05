package jenkinddd.jenkinddd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
	
	@GetMapping("/hello")
	public String helloMassage() {
		return "This is jenkis program";
	}

}
