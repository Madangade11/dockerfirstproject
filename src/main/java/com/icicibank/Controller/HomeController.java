package com.icicibank.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
  // @GetMapping(value ="/DockerProducts")
	@GetMapping
	public String index() {
		return "Products";		
	}
}
