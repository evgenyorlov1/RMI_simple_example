import java.rmi.*;

public class RMILightBulbClient {        
    
    public static void main(String[] args) {      
        try {                         
            RMILightBulb bulbService = (RMILightBulb)Naming.lookup("Hello");           
            System.out.println(bulbService.hello());
        } catch (NotBoundException nbe) {
            System.out.println ("No light bulb service available in registry!: " + nbe);
        } catch (RemoteException re) {System.out.println ("RMI - " + re);
        } catch (Exception e) {System.out.println ("Error - " + e);}
    }    
    
}
