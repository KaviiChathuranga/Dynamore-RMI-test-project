/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.repository.custom;

import bun_server.entity.login;
import bun_server.repository.SuperRepository;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public interface loginRepository extends SuperRepository<login, String>{
    
    public boolean addUser(login dto)throws Exception;
    public List<login> viewAll()throws Exception;
    
    public boolean addChef(login dto)throws Exception;
    public List<login> getAllChef()throws Exception;
    
}
