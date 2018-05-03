/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_client.controler;

import bun_client.proxy.ProxyHandler;
import bun_common.dto.OrdersDto;
import bun_common.observer.CustomerObserver;
import bun_common.service.ServiceFactory;
import bun_common.service.custom.CallCenterService;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public class CallCenterControler {
    public static boolean addOrder(OrdersDto ordersDto) throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS);
         return centerService.addOrder(ordersDto);
 }
    public static List<OrdersDto> viewOrders() throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS); 
         return centerService.viewAll();
 }
      public static boolean updateOrder(OrdersDto ordersDto) throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS);
         return centerService.updatteOrder(ordersDto);
 }
      public static OrdersDto searchOrder(String  id) throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS);
         return centerService.searchOrder(id);
 }
    
    public static boolean customerObs(CustomerObserver customerObserver) throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS);
         return centerService.addCustomerObserver(customerObserver);
 }

     public static List<OrdersDto> searchDate(String date) throws Exception{
         
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS); 
         return centerService.searchDate(date);
 }
     
     public static boolean reserve(String id)throws Exception{
               
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS); 
         return centerService.reserveCustomer(id);        
     }
      public static boolean release(String id)throws Exception{
               
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS); 
         return centerService.releaseCustomer(id);        
     }
      
       public static OrdersDto takeOrders()throws Exception{
               
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS); 
         return centerService.takeOrder();        
     }
        public static void addToQue(OrdersDto ordersDto) throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS);
          centerService.addToQue(ordersDto);
    }
          public static boolean addTempory(OrdersDto ordersDto) throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS);
         return centerService.addTempory(ordersDto);
    }
            public static List<OrdersDto> getAllTemp() throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS); 
         return centerService.getAllTempory();
     }
             public static int getCount() throws Exception{
    CallCenterService centerService=(CallCenterService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ORDERS);
         return centerService.getCount();
    }
 
}
