/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.RemoteException;

/**
 *
 * @author pc
 */
public class RMILightBulbImpl extends java.rmi.server.UnicastRemoteObject implements RMILightBulb {            
    
    public RMILightBulbImpl() throws java.rmi.RemoteException {
        super();
    }        
    
    @Override
    public String hello() throws RemoteException {
        return "Hello!";
    }
}
