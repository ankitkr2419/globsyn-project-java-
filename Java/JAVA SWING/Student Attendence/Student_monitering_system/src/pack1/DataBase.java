package pack1;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;

	public class DataBase 
	{
		public static ArrayList<StudentObj> readDataFromFile()
		{
			ArrayList<StudentObj> list4;
			try
			{
			   FileInputStream fin=new FileInputStream("RegistrationInfo.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list4=(ArrayList<StudentObj>)oin.readObject();
			   
			   oin.close();
			   fin.close();
			}catch(Exception e)
			 {
				 list4=new ArrayList<StudentObj>();
			 }
			 
			return list4;
		}
		
		public static void writeDatatoFile(ArrayList<StudentObj> wlist)
		{
			try	
			 {
			       FileOutputStream fout=new FileOutputStream("RegistrationInfo.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(wlist);
			       
			       oout.close();
			}catch(Exception e){System.out.println(e);}
		}
	}
