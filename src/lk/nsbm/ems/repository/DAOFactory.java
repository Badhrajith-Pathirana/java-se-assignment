package lk.nsbm.ems.repository;

import lk.nsbm.ems.repository.custom.impl.CustomerDAOImpl;
import lk.nsbm.ems.repository.custom.impl.EventDAOImpl;
import lk.nsbm.ems.repository.custom.impl.PackageDAOImpl;
import lk.nsbm.ems.repository.custom.impl.SupplierDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if(daoFactory == null)
            daoFactory = new DAOFactory();
        return daoFactory;
    }

    public SuperDAO getDAO (DAOType daoType) {
        switch (daoType) {
            case EVENT:
                return new EventDAOImpl();
            case PACKAGE:
                return new PackageDAOImpl();
            case CUSTOMER:
                return new CustomerDAOImpl();
            case SUPPLIER:
                return new SupplierDAOImpl();
                default:
                    return null;
        }
    }

    public static enum DAOType{
        CUSTOMER,EVENT,PACKAGE,SUPPLIER
    }
}
