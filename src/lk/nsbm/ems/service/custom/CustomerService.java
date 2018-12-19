package lk.nsbm.ems.service.custom;

import lk.nsbm.ems.dto.CustomerDTO;
import lk.nsbm.ems.service.SuperService;

import java.util.List;

public interface CustomerService extends SuperService {
    boolean saveCustomer(CustomerDTO customerDTO);
    boolean updateCustomer(CustomerDTO customerDTO);
    CustomerDTO getCustomerByNic(String nic);
    List<CustomerDTO> getAllCustomers();
}
