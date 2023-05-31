package com.magd.springbatch3csv2db.repository;


import com.magd.springbatch3csv2db.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
