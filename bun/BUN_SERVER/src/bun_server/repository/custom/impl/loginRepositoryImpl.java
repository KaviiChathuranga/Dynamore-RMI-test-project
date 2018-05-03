/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.repository.custom.impl;

import bun_server.entity.login;
import bun_server.repository.custom.loginRepository;
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
public class loginRepositoryImpl implements loginRepository{
    private Connection connection;
    @Override
    public boolean addUser(login dto) throws Exception {
       String sql="INSERT INTO login VALuES('"+dto.getUser()+"','"+dto.getPassword()+"')";
        Statement statement=connection.createStatement();
        int res=statement.executeUpdate(sql);
        return res>0;
    }

    @Override
    public List<login> viewAll() throws Exception {
        String Sql="SELECT * FROM login";
        Statement statement=connection.createStatement();
        ResultSet res=statement.executeQuery(Sql);
        ArrayList<login>list=new ArrayList<>();
        while(res.next()){
           
            login l=new login(res.getString("user"),res.getString("password"));
            list.add(l);
        }
        
        return list;
    }

    @Override
     public void setConnection(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean save(login t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public login search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(login t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public List<login> view() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addChef(login dto) throws Exception {
         String sql="INSERT INTO clogin VALuES('"+dto.getUser()+"','"+dto.getPassword()+"')";
        Statement statement=connection.createStatement();
        int res=statement.executeUpdate(sql);
        return res>0;
    }

    @Override
    public List<login> getAllChef() throws Exception {
        String Sql="SELECT * FROM clogin";
        Statement statement=connection.createStatement();
        ResultSet res=statement.executeQuery(Sql);
        ArrayList<login>list=new ArrayList<>();
        while(res.next()){
           
            login l=new login(res.getString("user"),res.getString("password"));
            list.add(l);
        }
        
        return list;
    }

    @Override
    public void delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
