package lk.nsbm.ems.repository.custom;

import lk.nsbm.ems.entity.Package;
import lk.nsbm.ems.repository.SuperDAO;

import java.util.List;

public interface PackageDAO extends SuperDAO {
    boolean save(Package customer);
    boolean update(Package customer);
    List<Package> findAll();
    Package findById(String pId);
    boolean deleteById(String pId);
}
