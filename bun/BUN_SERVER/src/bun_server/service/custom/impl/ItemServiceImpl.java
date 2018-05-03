/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.service.custom.impl;

import bun_common.dto.ItemDto;
import bun_common.service.custom.ItemService;
import bun_server.buisness.BuisnessFactory;
import bun_server.buisness.custom.ItemBO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public class ItemServiceImpl extends UnicastRemoteObject implements ItemService{
    private ItemBO itemBO;
    
    public ItemServiceImpl()throws RemoteException{
        itemBO=(ItemBO) BuisnessFactory.getInstance().getBOTypes(BuisnessFactory.BOTypes.ITEM);
    }
    @Override
    public ItemDto searchItem(String id) throws Exception {
       return itemBO.searchItem(id);
    }

    @Override
    public List<ItemDto> viewAllItem() throws Exception {
      return itemBO.view();
    }
    
}
