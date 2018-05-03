/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.service.custom.impl;

import bun_common.dto.OrdersDto;
import bun_common.observer.CustomerObserver;
import bun_common.service.custom.CallCenterService;
import bun_server.buisness.BuisnessFactory;
import bun_server.buisness.custom.CallCenterBO;
import bun_server.observable.CustomerObservable;
import bun_server.reservation.CustomerReservation;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public class CallCenterServiceImpl extends UnicastRemoteObject implements CallCenterService{
    private CallCenterBO callCenterBO;
    
    private static final CustomerObservable CUSTOMER_OBSERVABLE=new CustomerObservable();
    private final static CustomerReservation CUSTOMER_RESERVATION = new CustomerReservation();
    
    public CallCenterServiceImpl()throws RemoteException{
      callCenterBO=(CallCenterBO) BuisnessFactory.getInstance().getBOTypes(BuisnessFactory.BOTypes.ORDERS);
    }
    
    @Override
    public boolean addOrder(OrdersDto ordersDto) throws Exception {
        boolean isAdded= callCenterBO.addOrder(ordersDto);
         if(isAdded){ 
            CUSTOMER_OBSERVABLE.notifyObservers(ordersDto.getOid()+" is added" );
        } 
        return isAdded;
        
    }

    @Override
    public List<OrdersDto> viewAll() throws Exception {
        
       return callCenterBO.viewAll();
    }
     @Override
    public OrdersDto searchOrder(String id) throws Exception {
        return callCenterBO.searchOrder(id);
    }
    
    @Override
    public boolean updatteOrder(OrdersDto ordersDto) throws Exception {
        if (CUSTOMER_RESERVATION.reserveCustomer(ordersDto.getOid(), this)) {
            return callCenterBO.updateOrder(ordersDto);
        }
        
        return false;
        
    }
 
   
    @Override
    public boolean reserveCustomer(String id) throws RemoteException {
        return CUSTOMER_RESERVATION.reserveCustomer(id, this);
    }

    @Override
    public boolean releaseCustomer(String id) throws RemoteException {
        return CUSTOMER_RESERVATION.releaseCustomer(id, this);
    }

    @Override
    public boolean addCustomerObserver(CustomerObserver customerObserver) throws RemoteException {
        return  CUSTOMER_OBSERVABLE.addCustomerObserver(customerObserver);
    }

    @Override
    public boolean removeCustomerObserver(CustomerObserver customerObserver) throws RemoteException {
        return  CUSTOMER_OBSERVABLE.removeCustomerObserver(customerObserver);
    }

    @Override
    public List<OrdersDto> searchDate(String date) throws Exception {
        return callCenterBO.searchDate(date);
    }

    @Override
    public OrdersDto takeOrder() throws Exception {
        return callCenterBO.takeOrder();
    }

    @Override
    public void addToQue(OrdersDto ordersDto) throws Exception {
         callCenterBO.addToQue(ordersDto);
    }

    @Override
    public boolean addTempory(OrdersDto ordersDto) throws Exception {
        boolean isAdded= callCenterBO.addTempory(ordersDto);
         if(isAdded){ 
            CUSTOMER_OBSERVABLE.notifyObservers(ordersDto.getOid()+" is added" );
        } 
        return isAdded;
    }

    @Override
    public List<OrdersDto> getAllTempory() throws Exception {
        return callCenterBO.getAllTempory();
    }

    @Override
    public int getCount() throws Exception {
        return callCenterBO.getCount();
    }
    
}
