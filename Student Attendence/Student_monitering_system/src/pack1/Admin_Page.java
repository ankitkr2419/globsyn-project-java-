package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DropMode;
import java.awt.Toolkit;

public class Admin_Page extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLayeredPane layeredPane;
	private JPanel ATTENDENCE;
	private JPanel USHEUDELE;
	private JPanel HOME;
	private JTable table_1;
	private String val[] = new String[5];
	private String val1[] =new String[6];
	private String id;
	ArrayList<Attendence_obj> userlist;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Page frame = new Admin_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void switchpanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}
	/**
	 * Create the frame.
	 */
	

	public Admin_Page() {
		setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		setTitle("                                                      STUDENT MONITERING SYSTEM");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admin_Page.class.getResource("/pack1/images/clipboard-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(560, 120, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.WHITE);
		layeredPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 0, 255)));
		layeredPane.setBounds(10, 66, 722, 324);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		HOME = new JPanel();
		layeredPane.add(HOME, "name_20124511258334");
		HOME.setBackground(new Color(255, 182, 193));
		HOME.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(176, 196, 222));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Admin_Page.class.getResource("/pack1/images/web.png")));
		lblNewLabel_1.setBounds(0, 0, 317, 314);
		HOME.add(lblNewLabel_1);
		
	//from here
		
		JLabel lblNewLabel_2 = new JLabel("ENTER ID TO UPDATE");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(379, 74, 264, 60);
		HOME.add(lblNewLabel_2);
		
		JLabel lblHappyTeacherStudent = new JLabel("HAPPY TEACHER STUDENT RELATION");
		lblHappyTeacherStudent.setFont(new Font("Sitka Subheading", Font.ITALIC, 15));
		lblHappyTeacherStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblHappyTeacherStudent.setBounds(336, 13, 338, 54);
		HOME.add(lblHappyTeacherStudent);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textArea_1.setBounds(432, 147, 166, 40);
		HOME.add(textArea_1);
		
		JButton btnNewButton = new JButton("ADDRECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dilognew o = new dilognew();
				o.setVisible(true);
				for(int i=0; i<=2;i++)
				{
				 id =textArea_1.getText().trim();
				 
				 Attendence_obj r =new Attendence_obj(id, "","", "", "", "");
			   	userlist = Database2.readDataFromFile();
				  userlist.add(r);
			     Database2.writeDatatoFile(userlist);
				}
				 
				 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setIcon(new ImageIcon(Admin_Page.class.getResource("/pack1/images/pencil-icon.png")));
		btnNewButton.setBounds(507, 231, 167, 40);
		HOME.add(btnNewButton);
		
		ATTENDENCE = new JPanel();
		layeredPane.add(ATTENDENCE, "name_15212934468920");
		ATTENDENCE.setLayout(null);
		
		JLabel lblEnterUserId = new JLabel("UPDATE THE ATTENDENCE ");
		lblEnterUserId.setForeground(new Color(128, 0, 128));
		lblEnterUserId.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblEnterUserId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterUserId.setBounds(224, 13, 247, 24);
		ATTENDENCE.add(lblEnterUserId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 50, 676, 223);
		ATTENDENCE.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PAPER", "CLASS", "V CLASS", "PRESENT", "ABSENT"
			}
		));
		

	/*	for(int i=0;i<table.getRowCount();i++)
		{
			for(int j=0;j<table.getColumnCount();j++)
			{
				val =(String)table.getValueAt(j, i);
				
			}
		}*/
		//here wait
		scrollPane.setViewportView(table);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String paper,oclass,vclass,present,absent;
				Attendence_obj r;
				id =textArea_1.getText().trim();
				ArrayList<Attendence_obj> userlist1;
				//
				new SearchAid();
				int idfoundpos = SearchAid.searchId(id);
				System.out.println("there id" +idfoundpos);
				//
				new duplicateval();
				List<Integer> list1 = duplicateval.searchId(id);
				
				if(idfoundpos == -1)
				{
					JOptionPane.showMessageDialog(null,"INVALID USER ID");
				}
				else {
				ArrayList<Attendence_obj> list = Database2.readDataFromFile();
				Attendence_obj obj;
				List<Integer> arr = new ArrayList<>();
				for(int z1=0;z1<list1.size();z1++)
				{
					int f =list1.get(z1);
					arr.add(f);
				}
				int gd=arr.size();
				for(int i=0;i<table.getRowCount();i++)
				{
					for(int j=0;j<table.getColumnCount();j++)
					{
						val[j] =(String)table.getValueAt(i,j);
					}
					paper = val[0];
					oclass =val[1];
					vclass = val[2];
					present = val[3];
					int v1=Integer.parseInt(val[1]);
					int v2= Integer.parseInt(val[3]);
					int val= v1-v2;
					absent = Integer.toString(val);
					
					if(gd>0)
					{
					int k=0;
					obj = list.get(list1.get(k));
					obj.setId(id);
					obj.setPaper(paper);
					obj.setVclass(vclass);
					obj.setOclass(oclass);
					obj.setPresent(present);
					obj.setAbsent(absent);
						  userlist1 = Database2.readDataFromFile();
						  int z = arr.get(i);
					      userlist1.set(z,obj);
					      Database2.writeDatatoFile(userlist1);
					      k++;
					      gd--;
					}
					else
					{
						System.out.println("nnnnot in");
					    	Attendence_obj obj1;
					    	obj1 =new Attendence_obj(id, paper, oclass, vclass, present, absent);
						  userlist1 = Database2.readDataFromFile();
					      userlist1.add(obj1);
					      Database2.writeDatatoFile(userlist1);
					}
			}	
			dilognew ob =new dilognew();
			ob.setVisible(true);
			}	
			}
		});
		btnUpdate.setForeground(new Color(65, 105, 225));
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpdate.setBounds(234, 276, 97, 25);
		ATTENDENCE.add(btnUpdate);
		
		JButton btnSearch = new JButton(" SEARCH");
		btnSearch.setIcon(new ImageIcon(Admin_Page.class.getResource("/pack1/images/Zoom-icon.png")));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Searchid();
				id =textArea_1.getText().trim();
				int idfoundpos = Searchid.searchId(id);
				if(idfoundpos==-1)
				{
					JOptionPane.showMessageDialog(null, "the user is not registered");
				}
				else
				{
				new duplicateval();
				id =textArea_1.getText().trim();
				List<Integer> list1 = duplicateval.searchId(id);
				ArrayList<Attendence_obj> list = Database2.readDataFromFile();
				Attendence_obj obj;
				System.out.println("list size "+list1.size());
				for(int i=0;i<list1.size();i++)
				{
				int f = list1.get(i);
				obj = list.get(f);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
							obj.getPaper(),
							obj.getOclass(),
							obj.getVclass(),
							obj.getPresent(),
							obj.getAbsent(),
						});
				}
				
				//
				new duplicateval2();
				id =textArea_1.getText().trim();
				List<Integer> list2 = duplicateval2.searchId(id);
				ArrayList<Marks_obj> lisst = Databse3.readDataFromFile();
				Marks_obj obj1;
				for(int i=0;i<list2.size();i++)
				{
				int f = list1.get(i);
				obj1 = lisst.get(f);
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				model.addRow(new Object[]{
							obj1.getPapername(),
							obj1.getPapercode(),
							obj1.getTotalmarks(),
							obj1.getMarksobtain(),
							obj1.getP_f(),
						});
				}	
		
			new duplicateval3();
			id =textArea_1.getText().trim();
			List<Integer> listn= duplicateval3.searchId(id);
			System.out.println(list1.size());
			ArrayList<Routing_obj> listt = DataBase4.readDataFromFile();
			Routing_obj objn;
			System.out.println("list size"+listt.size());
			for(int i=0;i<listn.size();i++)
			{
			int f = listn.get(i);
			objn = listt.get(f);
			DefaultTableModel model = (DefaultTableModel) table_2.getModel();
			model.addRow(new Object[]{
						objn.getPeriod(),
						objn.getMrout(),
						objn.getTrout(),
						objn.getWrout(),
						objn.getThrout(),
						objn.getFrout(),
					});
			}
			}
			}//
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnSearch.setBounds(348, 231, 147, 40);
		HOME.add(btnSearch);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 New_login nl =new New_login();
				 dispose();
				 nl.setVisible(true);
				 
			}
		});
		button_2.setIcon(new ImageIcon(Admin_Page.class.getResource("/pack1/images/Apps-Dialog-Logout-icon.png")));
		button_2.setBackground(Color.PINK);
		button_2.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		button_2.setBounds(666, 13, 34, 40);
		HOME.add(button_2);
		
		JButton btnAddrow = new JButton("ADDROW");
		btnAddrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//id to be set
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
					null,
					null,
					null,
					null,
					null,
				});
			}
		});
		btnAddrow.setForeground(new Color(65, 105, 225));
		btnAddrow.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddrow.setBounds(365, 276, 114, 25);
		ATTENDENCE.add(btnAddrow);
		
		JButton btnLoadData = new JButton("LOAD DATA");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*ArrayList<Attendence_obj> list;
				list = Database2.readDataFromFile();
				for(Attendence_obj re : list)
				{
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					//all the content is added in the model type object
					model.addRow(new Object[]{
									re.getPaper(),
									re.getOclass(),
									re.getVclass(),
									re.getPresent(),
									re.getAbsent(),
							});*/
				new duplicateval();
				id =textArea_1.getText().trim();
				List<Integer> list1 = duplicateval.searchId(id);
				ArrayList<Attendence_obj> list = Database2.readDataFromFile();
				Attendence_obj obj;
				System.out.println("list size "+list1.size());
				for(int i=0;i<list1.size();i++)
				{
				int f = list1.get(i);
				obj = list.get(f);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
							obj.getPaper(),
							obj.getOclass(),
							obj.getVclass(),
							obj.getPresent(),
							obj.getAbsent(),
						});
				}
			}
		});
		btnLoadData.setFont(new Font("Stencil", Font.BOLD, 15));
		btnLoadData.setBounds(535, 12, 153, 25);
		ATTENDENCE.add(btnLoadData);
		
		USHEUDELE = new JPanel();
		layeredPane.add(USHEUDELE, "name_15614272559146");
		USHEUDELE.setLayout(null);
		
		JLabel lblUpdateTheShedule = new JLabel("UPDATE THE SHEDULE");
		lblUpdateTheShedule.setBounds(258, 13, 201, 20);
		lblUpdateTheShedule.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateTheShedule.setForeground(new Color(128, 0, 128));
		lblUpdateTheShedule.setFont(new Font("Sitka Text", Font.BOLD, 15));
		USHEUDELE.add(lblUpdateTheShedule);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 46, 676, 210);
		USHEUDELE.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PERIOD", "MON", "TUE", "WED", "THUS", "FRI"
			}
		));
		table_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		scrollPane_2.setViewportView(table_2);
		
		JButton button = new JButton("ADDROW");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table_2.getModel();
				model.addRow(new Object[]{
					null,
					null,
					null,
					null,
					null,
					null,
				});
			}
		});
		button.setForeground(new Color(65, 105, 225));
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(379, 269, 111, 25);
		USHEUDELE.add(button);
		
		JButton btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peroid,mrout,trour,wrout,throut,frout;
				Routing_obj r;
				id =textArea_1.getText().trim();
				ArrayList<Routing_obj> userlist3;
				//
				new SearchAid();
				int idfoundpos = Searchid.searchId(id);
				//
				new duplicateval3();
				List<Integer> list1 = duplicateval3.searchId(id);
				
				if(idfoundpos == -1)
				{
					JOptionPane.showMessageDialog(null,"INVALID USER ID");
				}
				else {
				ArrayList<Routing_obj> list = DataBase4.readDataFromFile();
				Routing_obj obj;
				List<Integer> arr = new ArrayList<>();
				for(int z1=0;z1<list1.size();z1++)
				{
					int f =list1.get(z1);
					arr.add(f);
				}
				int gd=arr.size();
				for(int i=0;i<table_2.getRowCount();i++)
				{
					for(int j=0;j<table_2.getColumnCount();j++)
					{
						val1[j] =(String)table_2.getValueAt(i,j);
					}
					peroid = val1[0];
					mrout =val1[1];
					trour= val1[2];
					wrout= val1[3];
					throut =val1[4];
					frout = val1[5];
					
					if(gd!=0)
					{
					int k=0;
					obj = list.get(list1.get(k));
					obj =new Routing_obj(id,peroid,mrout,trour,wrout,throut,frout);
						  userlist3 = DataBase4.readDataFromFile();
						  int z = arr.get(i);
					      userlist3.set(z,obj);
					      DataBase4.writeDatatoFile(userlist3);
					      k++;
					      gd--;
					}
					else
					{
					    Routing_obj obj2;
					    	obj2 =new Routing_obj(id,peroid,mrout,trour,wrout,throut,frout);
						  userlist3 = DataBase4.readDataFromFile();
					      userlist3.add(obj2);
					     DataBase4.writeDatatoFile(userlist3);
					}	
			}	
				dilognew ob =new dilognew();
				ob.setVisible(true);
			}	
			}
		});
		btnUpdate_1.setForeground(new Color(65, 105, 225));
		btnUpdate_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpdate_1.setBounds(232, 269, 111, 25);
		USHEUDELE.add(btnUpdate_1);
		
		JPanel UMARKS = new JPanel();
		layeredPane.add(UMARKS, "name_20135810357652");
		UMARKS.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 46, 676, 219);
		UMARKS.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PAPERCD", "PAPER NAME", "TOTAL MARKS ", "MARKS OBT", "P OR F"
			}
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(170);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(114);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(109);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblUpdateTheMarks = new JLabel("UPDATE THE MARKS");
		lblUpdateTheMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateTheMarks.setForeground(new Color(128, 0, 128));
		lblUpdateTheMarks.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblUpdateTheMarks.setBounds(214, 9, 247, 24);
		UMARKS.add(lblUpdateTheMarks);
		
		JButton btnAddrows = new JButton("ADDROW");
		btnAddrows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model1 = (DefaultTableModel) table_1.getModel();
				model1.addRow(new Object[]{
					null,
					null,
					null,
					null,
					null,
				});
			}
		});
		btnAddrows.setForeground(new Color(65, 105, 225));
		btnAddrows.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddrows.setBounds(364, 278, 111, 25);
		UMARKS.add(btnAddrows);
		
		JButton button_1 = new JButton("UPDATE");
		button_1.addActionListener(new ActionListener() {
			private ArrayList<Routing_obj> obj2;
			public void actionPerformed(ActionEvent e) {
				String pcode,pname,tmarks,mobtain,p_f;
				Marks_obj r;
				id =textArea_1.getText().trim();
				ArrayList<Marks_obj> userlist2;
				new SearchAid();
				int idfoundpos = SearchAid.searchId(id);
				new duplicateval2();
				List<Integer> list1 = duplicateval2.searchId(id);
				
				if(idfoundpos == -1)
				{
					JOptionPane.showMessageDialog(null,"INVALID USER ID");
				}
				else {
				ArrayList<Marks_obj> list = Databse3.readDataFromFile();
				Marks_obj obj;
				List<Integer> arr = new ArrayList<>();

				for(int z1=0;z1<list1.size();z1++)
				{
					int f =list1.get(z1);
					arr.add(f);
				}
				int gd=arr.size();
				for(int i=0;i<table_1.getRowCount();i++)
				{
					for(int j=0;j<table_1.getColumnCount();j++)
					{
						val[j] =(String)table_1.getValueAt(i,j);
						System.out.println("value of j is " +j);
					}
					pcode = val[0];
					pname =val[1];
					tmarks = val[2];
					mobtain = val[3];
					int v1=Integer.parseInt(val[2]);
					int v2= Integer.parseInt(val[3]);
					int d=v1-v2;
					if(d>40)
					{
						p_f ="pass";
					}
					else
					{
						p_f ="fail";
					}
					
					if(gd!=0)
					{
					int k=0;
					obj = list.get(list1.get(k));
					obj.setId(id);
					obj.setPapername(pname);;
					obj.setPapercode(pcode);;
					obj.setTotalmarks(tmarks);;
					obj.setMarksobtain(mobtain);;
					obj.setP_f(p_f);
					
						  userlist2 = Databse3.readDataFromFile();
						  int z = arr.get(i);
					      userlist2.set(z,obj);
					      Databse3.writeDatatoFile(userlist2);
					      k++;
					      gd--;
					}
					else
					{
					    Marks_obj obj2;
					    obj2 =new Marks_obj(id, pname, pcode, tmarks, mobtain,p_f);
						  userlist2 = Databse3.readDataFromFile();
					      userlist2.add(obj2);
					      Databse3.writeDatatoFile(userlist2);
					}
					dilognew ob =new dilognew();
					ob.setVisible(true);
			}	
			}	
		
				}
		});
		button_1.setForeground(new Color(65, 105, 225));
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBounds(237, 278, 97, 25);
		UMARKS.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 255, 0)));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(0, 0, 744, 53);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm registrationform = new RegistrationForm();
				registrationform.setVisible(true);
				dispose();
			}
		});
		btnRegister.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnRegister.setBounds(121, 13, 127, 25);
		panel_1.add(btnRegister);
		
		JButton btnAttendence = new JButton("ATTENDENCE");
		btnAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(ATTENDENCE);
			}
		});
		btnAttendence.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnAttendence.setBounds(260, 13, 140, 25);
		panel_1.add(btnAttendence);
		
		JButton btnMarksU = new JButton("MARKS U");
		btnMarksU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchpanels(UMARKS);
			}
		});
		btnMarksU.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnMarksU.setBounds(412, 13, 121, 25);
		panel_1.add(btnMarksU);
		
		JButton btnUshedule = new JButton("USHEDULE");
		btnUshedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(USHEUDELE);
				
			}
		});
		btnUshedule.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnUshedule.setBounds(545, 13, 155, 25);
		panel_1.add(btnUshedule);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(HOME);
			}
		});
		btnHome.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnHome.setBounds(12, 13, 97, 25);
		panel_1.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 744, 415);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Admin_Page.class.getResource("/pack1/images/abstract-1846962_1280.jpg")));
	}
}
