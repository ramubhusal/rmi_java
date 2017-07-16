import java.rmi.*;
import java.rmi.server.*;

public class Server{
	public static void main(String args[]) throws Exception{
		try{
			Implementation imp=new Implementation();
			Naming.rebind("Server",imp);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}