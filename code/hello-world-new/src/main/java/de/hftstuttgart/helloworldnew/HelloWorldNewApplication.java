package de.hftstuttgart.helloworldnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldNewApplication {

	@GetMapping("/")
	public String sayHello(){

		return "Hello, Happy HfT Students!";
	}

	@GetMapping(value = "/test/{name}")
	public String sayHelloFromOtherEndpoint(@PathVariable String name){
		return "Hello, from " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldNewApplication.class, args);
	}

}
