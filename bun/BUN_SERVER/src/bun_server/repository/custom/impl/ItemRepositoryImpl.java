/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.repository.custom.impl;

import bun_common.dto.ItemDto;
import bun_server.entity.Item;
import bun_server.entity.Orders;
import bun_server.repository.custom.ItemRepository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Kavindu
 */
public class ItemRepositoryImpl implements ItemRepository{
    private Connection connection;

    @Override
    public boolean save(Item t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item search(String id) throws Exception {
       String sql="Select * from item where itemCode='"+id+"'";
       Statement stm=connection.createStatement();
       ResultSet resultSet=stm.executeQuery(sql);
       if(resultSet.next()){
           Item i=new Item(resultSet.getString("itemCode"),resultSet.getString("itemName"),resultSet.getInt("itemQOH"),resultSet.getDouble("unitPrice"));
           return i;
       }
       return null;
    }

    @Override
    public boolean update(Item t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> view() throws Exception {
      String Sql="SELECT * from Item ";
        Statement statement=connection.createStatement();
        ResultSet res=statement.executeQuery(Sql);
        ArrayList<Item>list=new ArrayList<>();
        while(res.next()){
            
            Item item=new Item(res.getString("itemCode"),res.getString("itemName"),res.getInt("itemQOH"),res.getDouble("unitPrice"));
            
            list.add(item);
         }
        return list;
    }

    @Override
    public void setConnection(Connection connection) {
        this.connection=connection;
    }
    
}
