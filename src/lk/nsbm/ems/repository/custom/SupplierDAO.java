package lk.nsbm.ems.repository.custom;

import lk.nsbm.ems.entity.Supplier;
import lk.nsbm.ems.repository.SuperDAO;

import java.util.List;

public interface SupplierDAO extends SuperDAO {
    boolean save(Supplier customer);
    boolean update(Supplier customer);
    List<Supplier> findAll();
    Supplier findById(int id);
    boolean deleteById(int id);
}
