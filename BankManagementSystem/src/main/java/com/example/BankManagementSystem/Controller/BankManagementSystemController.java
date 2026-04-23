package com.example.BankManagementSystem.Controller;

import com.example.BankManagementSystem.ApiResponse.ApiResponse;
import com.example.BankManagementSystem.Model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/bank")
public class BankManagementSystemController {
    ArrayList<Customer> customers = new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @PostMapping("/add")
    public ApiResponse addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return new ApiResponse("Customer added successfully");
    }

    @PutMapping("/update/{index}")
    public ApiResponse updateCustomer(@PathVariable int index, @RequestBody Customer customer) {
        customers.set(index, customer);
        return new ApiResponse("Customer updated successfully");
    }

    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteCustomer(@PathVariable int index) {
        customers.remove(index);
        return new ApiResponse("Customer deleted successfully");
    }

    @PutMapping("/deposit/{index}/{amount}")
    public ApiResponse depositMoney(@PathVariable int index, @PathVariable double amount) {
        double newBalance = customers.get(index).getBalance() + amount;
        customers.get(index).setBalance(newBalance);
        return new ApiResponse("Money deposited successfully");
    }

    @PutMapping("/withdraw/{index}/{amount}")
    public ApiResponse withdrawMoney(@PathVariable int index, @PathVariable double amount) {
        if (customers.get(index).getBalance() < amount) {
            return new ApiResponse("Insufficient balance");
        }

        double newBalance = customers.get(index).getBalance() - amount;
        customers.get(index).setBalance(newBalance);
        return new ApiResponse("Money withdrawn successfully");
    }
}
