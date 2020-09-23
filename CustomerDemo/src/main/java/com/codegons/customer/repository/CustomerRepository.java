package com.codegons.customer.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegons.customer.model.Customer;
@Repository("CustomerRepository")
public interface CustomerRepository extends JpaRepository<Customer,Integer>{


}
