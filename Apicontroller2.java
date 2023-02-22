package com.example.demo;

	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMethod;

	@RestController
	public class Apicontroller2 {
	
		
		@RequestMapping(value="/MyFav/{color}",method=RequestMethod.GET)
		public String getMyFav(@PathVariable String color)
		{
			return "My favorite color is "+color;
		}
	}

