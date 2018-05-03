/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_client.controler;

import bun_client.proxy.ProxyHandler;
import bun_common.dto.ItemDto;
import bun_common.service.ServiceFactory;
import bun_common.service.custom.ItemService;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public class ItemControler {
     public static ItemDto serarchItm(String id) throws Exception{
     ItemService itemcenter=(ItemService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ITEM);
         return itemcenter.searchItem(id);
         }
     
     public static List<ItemDto> view() throws Exception{
     ItemService itemcenter=(ItemService) ProxyHandler.getInstanse().getServiceType(ServiceFactory.ServiceTypes.ITEM);
         return itemcenter.viewAllItem();
         }
}
