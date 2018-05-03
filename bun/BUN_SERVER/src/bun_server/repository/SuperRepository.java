/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.repository;

import java.sql.Connection;
import java.util.List;


/**
 *
 * @author Kavindu
 */
public interface SuperRepository <T,Id>{
    
    
    public void setConnection(Connection connection);
    
    public boolean save(T t)throws Exception;
    public T search(Id id)throws Exception;
    public boolean update(T t)throws Exception;
    public void delete(Id id)throws Exception;
    public List<T> view()throws Exception;
    
}
