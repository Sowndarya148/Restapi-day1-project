package Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import Entity.Child;

public interface paging extends PagingAndSortingRepository<Child,Integer>{

}
