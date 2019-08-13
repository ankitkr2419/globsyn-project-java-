package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Database2 {
	public static ArrayList<Attendence_obj> readDataFromFile()
	{
		ArrayList<Attendence_obj> list4;
		try
		{
		   FileInputStream fin=new FileInputStream("Attendenceinfo.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<Attendence_obj>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			 list4=new ArrayList<Attendence_obj>();
		 }
		 
		return list4;
	}
	
	public static void writeDatatoFile(ArrayList<Attendence_obj> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("Attendenceinfo.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}
}
