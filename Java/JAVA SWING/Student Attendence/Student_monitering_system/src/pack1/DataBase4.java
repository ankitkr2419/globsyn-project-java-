package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataBase4 {
	public static ArrayList<Routing_obj> readDataFromFile()
	{
		ArrayList<Routing_obj> list4;
		try
		{
		   FileInputStream fin=new FileInputStream("shedule.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<Routing_obj>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			 list4=new ArrayList<Routing_obj>();
		 }
		 
		return list4;
	}
	
	public static void writeDatatoFile(ArrayList<Routing_obj> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("shedule.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}

}