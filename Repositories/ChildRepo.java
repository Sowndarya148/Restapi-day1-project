package Repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Child;



public interface ChildRepo extends JpaRepository<Child,Integer>{
	//List<Child> findAll();
}
