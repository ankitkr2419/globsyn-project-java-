package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Databse3 {
	public static ArrayList<Marks_obj> readDataFromFile()
	{
		ArrayList<Marks_obj> list4;
		try
		{
		   FileInputStream fin=new FileInputStream("Marksinfo.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<Marks_obj>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}catch(Exception e)
		 {
			 list4=new ArrayList<Marks_obj>();
		 }
		 
		return list4;
	}
	
	public static void writeDatatoFile(ArrayList<Marks_obj> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("Marksinfo.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}

}
