package lk.nsbm.ems.repository.custom.impl;

import lk.nsbm.ems.entity.Supplier;
import lk.nsbm.ems.repository.custom.SupplierDAO;

import java.util.List;

public class SupplierDAOImpl implements SupplierDAO {
    @Override
    public boolean save(Supplier customer) {
        return false;
    }

    @Override
    public boolean update(Supplier customer) {
        return false;
    }

    @Override
    public List<Supplier> findAll() {
        return null;
    }

    @Override
    public Supplier findById(int id) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
