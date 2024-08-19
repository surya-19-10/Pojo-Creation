package com.online.retail.composite.clients;

import com.online.retail.composite.core.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "customer", url = "http://localhost:8080/customer")
public interface CustomerClient {
    @PostMapping("/add")
    ResponseEntity<Customer> addCustomer(@RequestBody Customer customer);
    @GetMapping("/search/{id}")
    ResponseEntity<Customer> getCustomer(@PathVariable int id);
}
