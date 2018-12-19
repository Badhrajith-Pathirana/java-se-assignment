package lk.nsbm.ems.service.custom.impl;

import lk.nsbm.ems.dto.CustomerDTO;
import lk.nsbm.ems.entity.Customer;
import lk.nsbm.ems.repository.DAOFactory;
import lk.nsbm.ems.repository.custom.CustomerDAO;
import lk.nsbm.ems.repository.custom.impl.CustomerDAOImpl;
import lk.nsbm.ems.service.custom.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDAO customerDAO;

    public CustomerServiceImpl() {
        customerDAO =(CustomerDAOImpl) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.CUSTOMER);
    }

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getNic(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getContact());
        return customerDAO.save(customer);
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        return customerDAO.update(new Customer(customerDTO.getNic(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getContact()));
    }

    @Override
    public CustomerDTO getCustomerByNic(String nic) {
        Customer customer = customerDAO.findById(nic);
        return new CustomerDTO(customer.getNIC(),customer.getName(),customer.getAddress(),customer.getContact());
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerDAO.findAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();

        for (Customer customer:customers) {
            customerDTOS.add(new CustomerDTO(customer.getNIC(),customer.getName(),customer.getAddress(),customer.getContact()));
        }
        return customerDTOS;
    }
}
