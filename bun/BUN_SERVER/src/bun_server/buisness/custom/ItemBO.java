/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.buisness.custom;

import bun_common.dto.ItemDto;
import bun_server.buisness.SuperBO;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public interface ItemBO extends SuperBO{
    public ItemDto searchItem(String id)throws Exception;
    public List<ItemDto> view()throws Exception;
}
