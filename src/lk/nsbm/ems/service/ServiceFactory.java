package lk.nsbm.ems.service;

import lk.nsbm.ems.service.custom.impl.CustomerServiceImpl;
import lk.nsbm.ems.service.custom.impl.EventServiceImpl;
import lk.nsbm.ems.service.custom.impl.PackageServiceImpl;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if(serviceFactory == null)
            serviceFactory = new ServiceFactory();
        return serviceFactory;
    }

    public SuperService getService (ServiceTypes serviceType) {
        switch (serviceType) {
            case CUSTOMER:
                return new CustomerServiceImpl();
            case PACKAGE:
                return new PackageServiceImpl();
            case EVENT:
                return new EventServiceImpl();
                default:
                    return null;
        }
    }

    public enum ServiceTypes {
        CUSTOMER,EVENT,PACKAGE
    }
}
