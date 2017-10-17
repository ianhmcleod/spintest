package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}

@RestController
class TestController {

	@RequestMapping("/healthcheck")
	public Map<String, String> health() {
		return new HashMap<String, String>() {{put("healthy", "yep");}};
	}

    @RequestMapping("/hello")
    public Map<String, String> yo() {
        return new HashMap<String, String>() {{put("hi", "hello");}};
    }
}
