package com.org.repository;
import org.springframework.data.repository.CrudRepository;

 
import com.org.model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  