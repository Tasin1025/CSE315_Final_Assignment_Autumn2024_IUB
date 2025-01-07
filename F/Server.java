import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            ComputeImpl compute = new ComputeImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Compute", compute);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
