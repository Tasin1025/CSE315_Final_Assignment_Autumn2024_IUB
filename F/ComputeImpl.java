import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ComputeImpl extends UnicastRemoteObject implements Compute {
    protected ComputeImpl() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
