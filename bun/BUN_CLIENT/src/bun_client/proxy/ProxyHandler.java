/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_client.proxy;

import bun_common.service.ServiceFactory;
import bun_common.service.SuperService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavindu
 */
public class ProxyHandler implements ServiceFactory{
    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    
    public ProxyHandler(){
        try {
            serviceFactory=(ServiceFactory) Naming.lookup("rmi://localhost:5050/chef");
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProxyHandler getInstanse(){
        if (proxyHandler==null) {
            proxyHandler=new ProxyHandler();
        }
        return proxyHandler;
    }
    
    @Override
    public SuperService getServiceType(ServiceTypes types) throws Exception {
        return serviceFactory.getServiceType(types);
    }
    
}
