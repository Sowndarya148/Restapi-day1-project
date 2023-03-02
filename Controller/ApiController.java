package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Child;
import Services.ApiService;

@RestController
public class ApiController {
	@Autowired
	private ApiService childServe;
	
	@GetMapping("/getChild")
    public List<Child> getSortedDetails()
    {
    	return childServe.sort();
    }
}
