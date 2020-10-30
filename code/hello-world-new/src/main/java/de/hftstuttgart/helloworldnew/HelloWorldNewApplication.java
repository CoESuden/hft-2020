package de.hftstuttgart.helloworldnew;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldNewApplication {
	
	private static Collection<String> _randomStrings = new ArrayList<>();
	
	@GetMapping("/")
	public String sayHello(){
		return "Hello, Happy HfT Students!";
	}

	@GetMapping("/test/{name}")
	public String sayHelloFromOtherEndpoint(@PathVariable String name){
		return "Hello, from " + name;
	}
	
	@PutMapping("/myinput/{input}")
	public Collection<String> addNewString(@PathVariable String input) {
		_randomStrings.add(input);
		return _randomStrings;
	}
	
	@GetMapping("/myinput/getall")
	public String getMyInput() {
		return _randomStrings.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldNewApplication.class, args);
	}
}
