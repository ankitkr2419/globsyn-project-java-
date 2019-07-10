package login;

import java.awt.Color;
//import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Registration extends JFrame
{
	private JTextField tname;
	private JPasswordField tpass;
	private JLabel lname,lpass;
	private JButton bregister, bclear,blogin;
	//private Component lblank;
	
	
	Registration()
	{
		super("LOGIN");
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		Font f=new Font("",Font.BOLD,19);
		Font s=new Font("",Font.BOLD,19);

		
		
		lname = new JLabel("ENTER USERID");
		lname.setForeground(Color.BLACK);
		lname.setFont(f);
		tname=new JTextField();
		
		
		
		lpass = new JLabel("ENTER PASSWORD");
		lpass.setForeground(Color.BLACK);
		lpass.setFont(s);
		tpass=new JPasswordField();
		
		bregister = new JButton("NEW USER");
		bclear=new JButton("LOGIN");
		//blogin=new JButton("LOGIN");

	
		c.add(lname);c.add(tname);
		c.add(lpass);c.add(tpass);
		c.add(bregister);c.add(bclear);
		//c.add(blogin);
		
		//JMenuBar mbr=new JMenuBar();
		//JMenu mobj= new JMenu("OPTION");
	//	JMenuItem mit1=new JMenuItem("REG");
	//	JMenuItem mit2=new JMenuItem("CLEAR");
		
      
		
		//ADD MENU ITEM IN MENU
	//	mobj.add(mit1);
		//mobj.add(mit2);
		
		//ADD MENU IN MENUBAR
		//mbr.add(mobj);
		
		//DISPLAY MENU
		//setJMenuBar(mbr);
		
				
		setLocation(300,200);
		setSize(550,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	
	
	
	
}

public class Ragestration {

	public static void main(String[] args) 
	{
		new Registration();
	
	}

}
