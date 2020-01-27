package com.example.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Customer;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByEmail(String email);

	List<Customer> findByDate(Date date);

	// custom query example and return a stream
	@Query("select c from Customer c where c.email = :email")
	Stream<Customer> findByEmailReturnStream(@Param("email") String email);
}
