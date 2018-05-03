/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.buisness.custom;

import bun_common.dto.OrdersDto;
import bun_common.observer.CustomerObserver;
import bun_server.buisness.SuperBO;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public interface CallCenterBO extends SuperBO{
    public void addToQue(OrdersDto ordersDto)throws Exception;
    public boolean addOrder(OrdersDto ordersDto)throws Exception;
    public List<OrdersDto>viewAll()throws Exception;
    public OrdersDto searchOrder(String id)throws Exception;
    public boolean updateOrder(OrdersDto ordersDto)throws Exception;
    
    public List<OrdersDto> searchDate(String date)throws Exception;
    public OrdersDto takeOrder()throws Exception;
    public boolean addTempory(OrdersDto ordersDto)throws Exception;
    public List<OrdersDto>getAllTempory()throws Exception;
    public int getCount()throws Exception;
    
    
    
}
