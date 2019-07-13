package pack1;

import java.util.ArrayList;
public class duplicateval {
	public static ArrayList<Integer[]> searchId(String id)
	{
		ArrayList<Attendence_obj> list2;
		list2=Database2.readDataFromFile();
		ArrayList<Integer[]>  arr = new ArrayList<>();
		//Searches for duplicate element  
		for(int i = 0; i < list2.size(); i++) {  
            if(id == list2.get(i).getId())
            {
            	arr.add(i,null);
            	
            }
        }
		return arr;
}	
}