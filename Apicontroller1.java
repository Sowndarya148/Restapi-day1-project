package com.example.demo;



	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMethod;
	
	@RestController
	public class Apicontroller1
	{
		@RequestMapping(value="/name/{name}",method=RequestMethod.GET)
		public String hello(@PathVariable String name)
		{
			return "Hello "+name+"!";
		}
}

