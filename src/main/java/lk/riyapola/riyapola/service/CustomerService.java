package lk.riyapola.riyapola.service;

import lk.riyapola.riyapola.dto.CustomerDto;
import lk.riyapola.riyapola.entity.Customer;
import lk.riyapola.riyapola.repo.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    public Customer saveCustomer(CustomerDto customerDto){
        String encodePassword= Base64.getEncoder().encodeToString(customerDto.getPassword().getBytes());
        Customer saved=customerRepo.save(new Customer(customerDto.getFirstName(),customerDto.getLastname(),customerDto.getNic(),customerDto.getAddress()));
      return saved;
    }
}
