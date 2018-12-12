package lk.nsbm.ems.repository.custom.impl;

import lk.nsbm.ems.entity.Customer;
import lk.nsbm.ems.repository.custom.CustomerDAO;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(String nic) {
        return null;
    }

    @Override
    public boolean deleteById(String nic) {
        return false;
    }
}
