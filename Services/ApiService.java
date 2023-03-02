package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



import Entity.Child;
import Repositories.ChildRepo;
import Repositories.paging;

@Service
public class ApiService {
	private ChildRepo chi;
	
	@Autowired
	private paging pg;
	

	public List<Child> getAllDetails()
    {
   	 Pageable p=PageRequest.of(0,2);
   	 Page<Child> s=pg.findAll(p);
   	 return s.toList();
   }
	public List<Child> sort(){
		List<Child>list=chi.findAll(Sort.by(Sort.Direction.ASC,"id"));
		return list;
	}
}
