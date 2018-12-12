package lk.nsbm.ems.repository.custom;

import lk.nsbm.ems.entity.Customer;
import lk.nsbm.ems.repository.SuperDAO;

import java.util.List;

public interface CustomerDAO extends SuperDAO {
    boolean save(Customer customer);
    boolean update(Customer customer);
    List<Customer> findAll();
    Customer findById(String nic);
    boolean deleteById(String nic);
}
