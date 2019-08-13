package pack1;

import java.util.ArrayList;
import java.util.List;
public class duplicateval {
	 
	public static List<Integer> searchId(String id)
	{
		
	List<Integer> arr = new ArrayList<>();
	ArrayList<Attendence_obj> list2;
	list2=Database2.readDataFromFile();
	//System.out.println(id.equalsIgnoreCase(list2.get(2).getId()));
	for(int i = 0; i < list2.size(); i++) { 
        if(id.equals(list2.get(i).getId()))
        {
        	arr.add(i);
        	System.out.println(arr);
        }
	}
	return arr;
}	
}