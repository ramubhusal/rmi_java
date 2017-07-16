import java.rmi.*;
import java.util.*;

public class Client{
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		String aa=sc.nextLine();
		double bb=sc.nextDouble();
		double cc=sc.nextDouble();
		try{
			Interfaces in=(Interfaces)Naming.lookup("rmi://"+aa+"/Server");
			System.out.println("Result is "+in.adds(bb,cc));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}