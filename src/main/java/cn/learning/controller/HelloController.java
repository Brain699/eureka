package cn.learning.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

	private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {

		LOG.info("---------------TEST------------");
		System.out.println("test------------");
		return "1 springboot hello"+name;
	}

}
