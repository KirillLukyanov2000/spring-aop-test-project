package ru.lukyanov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lukyanov.entity.Customer;
import ru.lukyanov.repo.Repo;

@Service
public class CustomerService {

    private Repo<Customer> customerRepo;

    @Autowired
    public void setCustomerRepo(Repo<Customer> customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer get(Long id) {
        return customerRepo.getById(id);
    }

    public void update(Customer customer) {
        customerRepo.update(customer);
    }
}
