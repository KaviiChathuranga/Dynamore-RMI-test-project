/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_common.service.custom;

import bun_common.dto.loginDto;
import bun_common.service.SuperService;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public interface loginService extends SuperService{
    public boolean addUser(loginDto dto)throws Exception;
    public List<loginDto> viewAll()throws Exception;
    
     public boolean addChef(loginDto dto)throws Exception;
    public List<loginDto> getAllChef()throws Exception;
}
