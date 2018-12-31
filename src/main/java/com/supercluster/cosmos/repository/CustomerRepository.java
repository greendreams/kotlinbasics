package com.supercluster.cosmos.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.supercluster.cosmos.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

}