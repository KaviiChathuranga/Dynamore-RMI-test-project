/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.service.custom.impl;

import bun_common.dto.loginDto;
import bun_common.service.custom.loginService;
import bun_server.buisness.BuisnessFactory;
import bun_server.buisness.custom.loginBO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public class loginServiceImpl extends UnicastRemoteObject implements loginService{
    private loginBO bo;
        
    public loginServiceImpl()throws RemoteException{
      bo=(loginBO) BuisnessFactory.getInstance().getBOTypes(BuisnessFactory.BOTypes.LOGIN);
    }
    
    @Override
    public boolean addUser(loginDto dto) throws Exception {
       return bo.addUser(dto);
    }

    @Override
    public List<loginDto> viewAll() throws Exception {
       return bo.viewAll();
    }

    @Override
    public boolean addChef(loginDto dto) throws Exception {
        return bo.addChef(dto);
    }

    @Override
    public List<loginDto> getAllChef() throws Exception {
        return bo.getAllChef();
    }
    
}
