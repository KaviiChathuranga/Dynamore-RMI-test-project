/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_common.service.custom;

import bun_common.dto.ItemDto;
import bun_common.service.SuperService;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public interface ItemService extends SuperService{
    public ItemDto searchItem(String id)throws Exception;
    public List<ItemDto> viewAllItem()throws Exception;
}
