package lk.nsbm.ems.repository.custom;

import lk.nsbm.ems.entity.Event;
import lk.nsbm.ems.repository.SuperDAO;

import java.util.List;

public interface EventDAO extends SuperDAO {
    boolean save(Event customer);
    boolean update(Event customer);
    List<Event> findAll();
    Event findById(int eid);
    boolean deleteById(int eid);
}
