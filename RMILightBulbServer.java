import java.rmi.*;

public class RMILightBulbServer {
    public static void main(String args[]) {
        try {
            RMILightBulbImpl bulbService = new RMILightBulbImpl();                           
            Naming.rebind("Hello", bulbService);
	    System.out.println("Server started");
        } catch (Exception e) {System.out.println("Error: " + e);} 
    } 
}
