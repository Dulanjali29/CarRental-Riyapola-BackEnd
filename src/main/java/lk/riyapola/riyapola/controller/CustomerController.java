package lk.riyapola.riyapola.controller;

import lk.riyapola.riyapola.dto.CustomerDto;
import lk.riyapola.riyapola.entity.Admin;
import lk.riyapola.riyapola.entity.Customer;
import lk.riyapola.riyapola.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
  final CustomerService customerService;
@Autowired
    public CustomerController(CustomerService customerService) {

    this.customerService = customerService;
    }
    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerDto customerDto){
        Customer ad=customerService.saveCustomer(customerDto);
        return new ResponseEntity<>(ad, HttpStatus.CREATED);
    }
}
