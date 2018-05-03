/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_common.observer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kavindu
 */
public interface CustomerObserver  extends Remote{
    public void update(String message)throws RemoteException;
}
