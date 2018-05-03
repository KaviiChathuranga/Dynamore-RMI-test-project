/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_common.service.custom;

import bun_common.dto.OrdersDto;
import bun_common.observer.CustomerObserver;
import bun_common.service.SuperService;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public interface CallCenterService extends SuperService{
    public boolean addOrder(OrdersDto ordersDto)throws Exception;
    public void addToQue(OrdersDto ordersDto)throws Exception;
    public List<OrdersDto> viewAll()throws Exception;
    public OrdersDto searchOrder(String id)throws Exception;
    public boolean updatteOrder(OrdersDto ordersDto)throws Exception;
    
    public List<OrdersDto> searchDate(String date)throws Exception;
    public OrdersDto takeOrder()throws Exception;
    public boolean addTempory(OrdersDto ordersDto)throws Exception;
    public List<OrdersDto>getAllTempory()throws Exception;
    public int getCount()throws Exception;
        
    public boolean reserveCustomer(String id)throws RemoteException;
    public boolean releaseCustomer(String id)throws RemoteException;
    public boolean addCustomerObserver(CustomerObserver customerObserver)throws RemoteException;
    public boolean removeCustomerObserver(CustomerObserver customerObserver)throws RemoteException;

    
    
}
