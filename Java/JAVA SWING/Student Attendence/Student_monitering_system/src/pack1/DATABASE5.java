package pack1;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;

	public class DATABASE5 
	{
		public static ArrayList<ADMINOBJ> readDataFromFile()
		{
			ArrayList<ADMINOBJ> list4;
			try
			{
			   FileInputStream fin=new FileInputStream("admin_info.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list4=(ArrayList<ADMINOBJ>)oin.readObject();
			   
			   oin.close();
			   fin.close();
			}catch(Exception e)
			 {
				 list4=new ArrayList<ADMINOBJ>();
			 }
			 
			return list4;
		}
		
		public static void writeDatatoFile(ArrayList<ADMINOBJ> wlist)
		{
			try	
			 {
			       FileOutputStream fout=new FileOutputStream("admin_info.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(wlist);
			       
			       oout.close();
			}catch(Exception e){System.out.println(e);}
		}
	}
