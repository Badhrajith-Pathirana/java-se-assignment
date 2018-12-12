package lk.nsbm.ems.repository.custom.impl;

import lk.nsbm.ems.entity.Package;
import lk.nsbm.ems.repository.custom.PackageDAO;

import java.util.List;

public class PackageDAOImpl implements PackageDAO {
    @Override
    public boolean save(Package customer) {
        return false;
    }

    @Override
    public boolean update(Package customer) {
        return false;
    }

    @Override
    public List<Package> findAll() {
        return null;
    }

    @Override
    public Package findById(String pId) {
        return null;
    }

    @Override
    public boolean deleteById(String pId) {
        return false;
    }
}
