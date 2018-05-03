/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.buisness.custom.impl;

import bun_common.dto.OrdersDto;
import bun_server.buisness.custom.CallCenterBO;
import bun_server.entity.Orders;
import bun_server.repository.RepositoryFactory;
import bun_server.repository.custom.CallCenterRepository;
import bun_server.resouce.DBConnecton;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 *
 * @author Kavindu
 */
public class CallCenterBOImpl implements CallCenterBO{
    private static CallCenterRepository callCenterRepository;
    
    public static Queue <OrdersDto> orderQ=new LinkedList<>();
    
    public static ArrayList<OrdersDto>processList=new ArrayList<>();
  
    public CallCenterBOImpl(){
        callCenterRepository=(CallCenterRepository) RepositoryFactory.getInstance().getBOTypes(RepositoryFactory.BOTypes.ORDERS);
    }
    
    @Override
    public void addToQue(OrdersDto ordersDto) throws Exception {
              orderQ.add(ordersDto);
    }

    @Override
    public List<OrdersDto> viewAll() throws Exception {
        Connection connection = DBConnecton.getInstance().getConnection();
        callCenterRepository.setConnection(connection);
        
        List<Orders>list=callCenterRepository.view();
              
        List<OrdersDto>dtoLost=new ArrayList<>();
         if (list != null) {
        for (Orders orders : list) {
            OrdersDto od=new OrdersDto(
                orders.getOid(),
                orders.getDate(),
                orders.getQty(),
                orders.getItemCode(),
                orders.getCid(),
                orders.getName(),
                orders.getAddress(),
                orders.getTel(),
                orders.getType(),
                orders.getStartTime(),
                orders.getEndTime(),
                orders.getChefName(),
                orders.getCount()
           );
            dtoLost.add(od);
            
        }
        return dtoLost;
         }else{
             return null;
         }
        }

    

    @Override
    public OrdersDto searchOrder(String id) throws Exception {
        Connection connection = DBConnecton.getInstance().getConnection();
        callCenterRepository.setConnection(connection);
         
        Orders orders= callCenterRepository.search(id);
        OrdersDto ordersDto=new OrdersDto(
                orders.getOid(),
                orders.getDate(),
                orders.getQty(),
                orders.getItemCode(),
                orders.getCid(),
                orders.getName(),
                orders.getAddress(),
                orders.getTel(),
                orders.getType(),
                orders.getStartTime(),
                orders.getEndTime(),
                orders.getChefName(),
                orders.getCount()
        );
        return ordersDto;
    }

    @Override
    public boolean updateOrder(OrdersDto ordersDto)throws Exception {
         Connection connection = DBConnecton.getInstance().getConnection();
        callCenterRepository.setConnection(connection);
        Orders orders=new Orders(
                ordersDto.getOid(),
                ordersDto.getDate(),
                ordersDto.getQty(),
                ordersDto.getItemCode(),
                ordersDto.getCid(),
                ordersDto.getName(),
                ordersDto.getAddress(),
                ordersDto.getTel(),
                ordersDto.getType(),
                ordersDto.getStartTime(),
                ordersDto.getEndTime(),
                ordersDto.getChefName(),
                ordersDto.getCount()
        );
        
        return callCenterRepository.update(orders);
    }

   

    @Override
    public List<OrdersDto> searchDate(String date) throws Exception {
        Connection connection = DBConnecton.getInstance().getConnection();
        callCenterRepository.setConnection(connection);
         
        List<Orders>list=callCenterRepository.searchDate(date);
       
        List<OrdersDto>dtoLost=new ArrayList<>();
        for (Orders orders : list) {
            OrdersDto od=new OrdersDto(
                orders.getOid(),
                orders.getDate(),
                orders.getQty(),
                orders.getItemCode(),
                orders.getCid(),
                orders.getName(),
                orders.getAddress(),
                orders.getTel(),
                orders.getType(),
                orders.getStartTime(),
                orders.getEndTime(),
                orders.getChefName(),
                orders.getCount()
           );
            System.out.println("BO IMPL "+orders.getOid());
            dtoLost.add(od);
            
        }
        return dtoLost;
    }

    @Override
    public OrdersDto takeOrder() throws Exception {
        OrdersDto ordersDto=null;
        if (!orderQ.isEmpty()) {
            ordersDto=orderQ.poll();
            processList.add(ordersDto);
        }
        return ordersDto;
    }

    @Override
    public boolean addOrder(OrdersDto ordersDto) throws Exception {
      Connection connection = DBConnecton.getInstance().getConnection();
       callCenterRepository.setConnection(connection);
        Orders orders=new Orders(
                ordersDto.getOid(),
                ordersDto.getDate(),
                ordersDto.getQty(),
                ordersDto.getItemCode(),
                ordersDto.getCid(),
                ordersDto.getName(),
                ordersDto.getAddress(),
                ordersDto.getTel(),
                ordersDto.getType(),
                ordersDto.getStartTime(),
                ordersDto.getEndTime(),
                ordersDto.getChefName(),
                ordersDto.getCount()
                
        );
         return callCenterRepository.save(orders);
     }

    @Override
    public boolean addTempory(OrdersDto ordersDto) throws Exception {
       Connection connection = DBConnecton.getInstance().getConnection();
       callCenterRepository.setConnection(connection);
        Orders orders=new Orders(
                ordersDto.getOid(),
                ordersDto.getDate(),
                ordersDto.getQty(),
                ordersDto.getItemCode(),
                ordersDto.getCid(),
                ordersDto.getName(),
                ordersDto.getAddress(),
                ordersDto.getTel(),
                ordersDto.getType(),
                ordersDto.getStartTime(),
                ordersDto.getEndTime(),
                ordersDto.getChefName(),
                ordersDto.getCount()
        );
         return callCenterRepository.addTempory(orders);
    }

    @Override
    public List<OrdersDto> getAllTempory() throws Exception {
         Connection connection = DBConnecton.getInstance().getConnection();
        callCenterRepository.setConnection(connection);
        
        List<Orders>list=callCenterRepository.getAllTempory();
              
        List<OrdersDto>dtoLost=new ArrayList<>();
         if (list != null) {
        for (Orders orders : list) {
            OrdersDto od=new OrdersDto(
                orders.getOid(),
                orders.getDate(),
                orders.getQty(),
                orders.getItemCode(),
                orders.getCid(),
                orders.getName(),
                orders.getAddress(),
                orders.getTel(),
                orders.getType(),
                orders.getStartTime(),
                orders.getEndTime(),
                orders.getChefName(),
                orders.getCount()
           );
            dtoLost.add(od);
            
        }
        return dtoLost;
         }else{
             return null;
         }
       
    }

    @Override
    public int getCount() throws Exception {
      int count=0;
        for (OrdersDto ordersDto : orderQ) {
         
            count++;
        }
        return count;
    }


}
