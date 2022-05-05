package orelien.ashlely.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HostingDemoApplication {
	@GetMapping("")
	public String hellWorld(){
		return "Tweet tweet";
	}


	public static void main(String[] args) {
		SpringApplication.run(HostingDemoApplication.class, args);
	}

}
