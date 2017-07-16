import java.rmi.*;
import java.rmi.server.*;

public class Implementation extends UnicastRemoteObject implements Interfaces{
	public Implementation() throws Exception{
		
	}
	public double adds(double d1,double d2){
		return d1+d2;
	}
}