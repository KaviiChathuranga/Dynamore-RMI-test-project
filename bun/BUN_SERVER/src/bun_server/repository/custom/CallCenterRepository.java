/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.repository.custom;

import bun_common.dto.OrdersDto;
import bun_server.entity.Orders;
import bun_server.repository.SuperRepository;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public interface CallCenterRepository extends SuperRepository<Orders, String>{
    
    public List<Orders> searchDate(String date)throws Exception;
    public boolean addTempory(Orders orders)throws Exception;
    public List<Orders>getAllTempory()throws Exception;
    public int getCount()throws Exception;
}
