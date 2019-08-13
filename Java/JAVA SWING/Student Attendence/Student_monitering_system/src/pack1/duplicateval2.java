package pack1;

import java.util.ArrayList;
import java.util.List;
public class duplicateval2 {
	 
	public static List<Integer> searchId(String id)
	{
	List<Integer> arr = new ArrayList<>();
	ArrayList<Marks_obj> list2;
	list2=Databse3.readDataFromFile();
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