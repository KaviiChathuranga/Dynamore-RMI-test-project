/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_common.service;

import java.rmi.Remote;

/**
 *
 * @author Kavindu
 */
public interface ServiceFactory extends Remote{
    public enum ServiceTypes{
        CUSTOMER,ORDERS,ITEM,LOGIN
    }
    public SuperService getServiceType(ServiceTypes types)throws Exception;
}
