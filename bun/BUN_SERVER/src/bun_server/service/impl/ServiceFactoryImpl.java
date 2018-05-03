/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.service.impl;

import bun_common.service.ServiceFactory;
import bun_common.service.SuperService;
import bun_server.service.custom.impl.CallCenterServiceImpl;
import bun_server.service.custom.impl.ItemServiceImpl;
import bun_server.service.custom.impl.loginServiceImpl;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Kavindu
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory{
    private static ServiceFactory serviceFactory;
    private ServiceFactoryImpl()throws RemoteException{
        
    }
    @Override
    public SuperService getServiceType(ServiceTypes types) throws Exception {
        
        switch(types){
            case LOGIN:return new loginServiceImpl();
            case ITEM : return new ItemServiceImpl();
            case ORDERS:return new CallCenterServiceImpl();
            default:return null;
        }
    }
    public static ServiceFactory getInstance() throws RemoteException{
        if (serviceFactory==null) {
            serviceFactory= new ServiceFactoryImpl();
        }
        return serviceFactory;
    }
}
