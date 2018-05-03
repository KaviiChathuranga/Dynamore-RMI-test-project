/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.buisness.custom.impl;

import bun_common.dto.ItemDto;
import bun_server.buisness.custom.ItemBO;
import bun_server.entity.Item;

import bun_server.repository.RepositoryFactory;
import bun_server.repository.custom.ItemRepository;
import bun_server.resouce.DBConnecton;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public class ItemBOImpl implements ItemBO{
    private static ItemRepository itemRepository;
    public ItemBOImpl(){
        itemRepository=(ItemRepository) RepositoryFactory.getInstance().getBOTypes(RepositoryFactory.BOTypes.ITEM);
    }
    @Override
    public ItemDto searchItem(String id) throws Exception {
        Connection connection = DBConnecton.getInstance().getConnection();
        itemRepository.setConnection(connection);
        Item item= itemRepository.search(id);
        ItemDto itemDto=new ItemDto(
                item.getItemCode(),
                item.getItemName(),
                item.getQoh(),
                item.getUnitPrice()
        );
        return itemDto;
    }

    @Override
    public List<ItemDto> view() throws Exception {
        Connection connection = DBConnecton.getInstance().getConnection();
        itemRepository.setConnection(connection); 
        List<Item> itemlList= itemRepository.view();
        List<ItemDto>itemsDto=new ArrayList<>();
        for (Item item : itemlList) {
            ItemDto itemDto=new ItemDto(
                item.getItemCode(),
                    item.getItemName(),
                    item.getQoh(),
                    item.getUnitPrice()
            );
            itemsDto.add(itemDto);
        } 
        return itemsDto;
    }
    
}
