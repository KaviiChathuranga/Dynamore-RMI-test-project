/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.buisness;

import bun_server.buisness.custom.impl.CallCenterBOImpl;
import bun_server.buisness.custom.impl.ItemBOImpl;
import bun_server.buisness.custom.impl.loginBOImpl;

/**
 *
 * @author Kavindu
 */
public class BuisnessFactory {
    private static BuisnessFactory buisnessFactory;
    
    private BuisnessFactory(){
        
    }
    public enum BOTypes{
        CUSTOMER,ORDERS,ITEM,LOGIN
    }
    public static BuisnessFactory getInstance(){
        if (buisnessFactory==null) {
            buisnessFactory=new BuisnessFactory();
        }
        return buisnessFactory;
    }
    public SuperBO getBOTypes(BOTypes types){
      
        switch(types){
            case LOGIN:return new loginBOImpl();
            case ITEM : return new ItemBOImpl();
            case ORDERS : return new CallCenterBOImpl();
            default:return null;
        }
    }
}
