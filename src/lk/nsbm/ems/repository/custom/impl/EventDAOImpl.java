package lk.nsbm.ems.repository.custom.impl;

import lk.nsbm.ems.entity.Event;
import lk.nsbm.ems.repository.custom.EventDAO;

import java.util.List;

public class EventDAOImpl implements EventDAO {
    @Override
    public boolean save(Event customer) {
        return false;
    }

    @Override
    public boolean update(Event customer) {
        return false;
    }

    @Override
    public List<Event> findAll() {
        return null;
    }

    @Override
    public Event findById(int eid) {
        return null;
    }

    @Override
    public boolean deleteById(int eid) {
        return false;
    }
}
