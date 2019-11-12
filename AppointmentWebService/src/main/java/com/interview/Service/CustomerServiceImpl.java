package com.interview.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.interview.model.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {

	private static List<Customer> customers = new ArrayList<>();
	private static Date now = new java.util.Date();
	static {
		Customer jack1 = new Customer(1, 123,"Amrith", "Singh", "amrith@gmail.com", now);
		Customer jack2 = new Customer(1, 123,"Mrith", "Singh", "amrith@gmail.com", now);
		Customer jack3 = new Customer(1, 123,"Rith", "Singh", "amrith@gmail.com", now);
		
		customers.add(jack1);
		customers.add(jack2);
		customers.add(jack3);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Random random = new Random();
		int nextId = random.nextInt(1000) + 10;

		customer.setId(nextId);
		customers.add(customer);

		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		for (Customer oldCustomer : customers) {
			if (oldCustomer.getId() == customer.getId()) {
				oldCustomer.setFirstName(customer.getFirstName());
				oldCustomer.setEmail(customer.getEmail());
				oldCustomer.setLastName(customer.getLastName());
				oldCustomer.setStoreNumber(customer.getStoreNumber());
				oldCustomer.setAppointment(now);
			}
		}
	}

	@Override
	public void deleteCustomer(int id) {
		for (Customer c : customers) {
			if (c.getId() == id) {
				customers.remove(c);
				break;
			}
		}
	}

}