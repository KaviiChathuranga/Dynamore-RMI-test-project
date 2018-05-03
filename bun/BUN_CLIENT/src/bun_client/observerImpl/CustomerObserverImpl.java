/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_client.observerImpl;

import bun_client.view.CallCenterViewer;
import bun_client.view.ChefForm;
import bun_client.view.Report;
import bun_common.observer.CustomerObserver;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * @author student
 */
public class CustomerObserverImpl extends UnicastRemoteObject implements CustomerObserver{
    private ChefForm chefForm;
    private CallCenterViewer callCenterViewer;
    private Report report;
    
    
    public CustomerObserverImpl(ChefForm chefForm)throws RemoteException{
        this.chefForm=chefForm;
    }

    public CustomerObserverImpl(Report report)throws RemoteException{
        this.report=report;
    }
   
    @Override
    public void update(String message) throws RemoteException {
        chefForm.setMessage(message);
       // callCenterViewer.setMessage(message); 
//       report.setMessage(message);
    }
   
}
