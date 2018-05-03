/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_client.controler;

/**
 *
 * @author Kavindu
 */
public class VlidateControler {
     public static boolean setTelNumber(String telNumber) throws Exception {
        if(telNumber.matches(("\\d{3}-\\d{7}"))){
            return true;
        }else{
            return false;
        }
    }

   
    public static boolean setName(String name) throws Exception {
        if(name.matches("\\W[A-Za-z]")){
            return true;
        }else{
            return false;
        }
    }
}
