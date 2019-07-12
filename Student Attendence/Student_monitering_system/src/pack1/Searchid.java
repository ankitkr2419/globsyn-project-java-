package pack1;

import java.util.ArrayList;

public class Searchid 
{
	public static int searchId(String id)
	{
		ArrayList<StudentObj> list2;
		int f = -1;
		try
		{
			list2=DataBase.readDataFromFile();
			
			for(int p=0; p<list2.size(); p++)
			{
				if(id.equals(list2.get(p).getUser_id()))
				{
				   f = p;
				   break;
				}	
			}
			 
			return(f);
		}catch(Exception e)
		{
			System.out.println(e);
			return(-2);
		}
 	}
}