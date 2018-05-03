/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_server.observable;

import bun_common.observer.CustomerObserver;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author kavindu
 */
public class CustomerObservable {
    
    private ArrayList<CustomerObserver> observerList=new ArrayList<>();
    
    public boolean addCustomerObserver(CustomerObserver customerObserver){
        return  observerList.add(customerObserver);
    }
    public boolean removeCustomerObserver(CustomerObserver customerObserver){
        return  observerList.remove(customerObserver);
    }
    public void notifyObservers(String message) throws RemoteException{
        for (CustomerObserver observer : observerList) {
            new Thread(){
                   public void run(){
                       try {
                           observer.update(message);
                       } catch (RemoteException ex) {
                           Logger.getLogger(CustomerObservable.class.getName()).log(Level.SEVERE, null, ex);
                       } 
                   }
            }.start(); 
        }
    }
}
