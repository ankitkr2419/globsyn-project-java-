package pack1;
import java.util.ArrayList;
import java.util.Scanner;

public class ALEmpLogic {
	ArrayList<ALEmpInfo> emplist = new ArrayList<ALEmpInfo>();
	private Scanner sc = new Scanner(System.in); 
	public void UserInput()
	{
		String s = "";
		do{
			ALEmpInfo obj = new ALEmpInfo();
			
			System.out.println("enter the name");
			String ename =sc.next();
			obj.setEmpname(ename);
			System.out.println("Enter emp mobile");
			String emobile =sc.next();
			obj.setEmpmobile(emobile);
			

			System.out.println("Enter emp email");
			String eemail =sc.next();
			obj.setEmailid(eemail);
			

			System.out.println("Enter emp password");
			String epass =sc.next();
			obj.setEmppassword(epass);
			//add emp object in arraylist
			
			emplist.add(obj);
			System.out.println("want to add another Y/N");
			s =sc.next();
		}while(s.equalsIgnoreCase("y"));
	}
	public void display()
	{
		for(ALEmpInfo eobj : emplist)
		{
			System.out.println(eobj.getEmpname()+" "+eobj.getEmpmobile()+" "+eobj.getEmailid()+" "+eobj.getEmppassword());
		}
	}
	public int search(String mail)
	{
		int flag = -1;
		System.out.println("enter the email you want to search");
		
		ALEmpInfo obj =null;
		for(int i=0;i<emplist.size();i++)			
		//for(ALEmpInfo eobj : emplist)
		{
			obj = emplist.get(i);
		if(mail.equals(obj.getEmailid()))
		{
			flag = i;
			break;
		}
		}
		return flag;
/*		if(flag == -1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found at" + flag);
		}	*/
	}
	public void update()
	{
		System.out.println("enter the email you want to update");
		String mail = sc.next();
		int index =search(mail);
		String mailnew = sc.next();
		ALEmpInfo obj = null;
		obj = emplist.get(index);
		obj.setEmailid(mailnew);
		emplist.set(index,obj);
	}
}
