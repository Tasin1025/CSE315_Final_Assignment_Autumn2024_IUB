import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Compute compute = (Compute) registry.lookup("Compute");
            System.out.println("Result: " + compute.add(5, 10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
