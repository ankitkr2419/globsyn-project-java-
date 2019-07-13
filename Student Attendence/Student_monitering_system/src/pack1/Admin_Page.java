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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DropMode;

public class Admin_Page extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLayeredPane layeredPane;
	private JPanel ATTENDENCE;
	private JPanel USHEUDELE;
	private JPanel HOME;
	private JTable table_1;
	private String val[] = new String[5];
	private String id;
	ArrayList<Attendence_obj> userlist;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.WHITE);
		layeredPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 0, 255)));
		layeredPane.setBounds(10, 66, 710, 324);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		HOME = new JPanel();
		layeredPane.add(HOME, "name_20124511258334");
		HOME.setBackground(new Color(255, 182, 193));
		HOME.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(176, 196, 222));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\projects\\globsyn-project-java-\\Student Attendence\\Student_monitering_system\\images\\Webp.net-compress-image.jpg"));
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
				 id =textArea_1.getText().trim();
				 
				 Attendence_obj r =new Attendence_obj(id, "","", "", "", "");
			   	userlist = Database2.readDataFromFile();
				     userlist.add(r);
			     Database2.writeDatatoFile(userlist);
				 
				 
				 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\projects\\globsyn-project-java-\\Student Attendence\\Student_monitering_system\\images\\pencil-icon.png"));
		btnNewButton.setBounds(527, 231, 147, 40);
		HOME.add(btnNewButton);
		
		//
		
		
		
		
		
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
				ArrayList<Integer[]> list1 = duplicateval.searchId(id);
				
				if(idfoundpos == -1)
				{
					JOptionPane.showMessageDialog(null,"INVALID USER ID");
				}
				else {
				ArrayList<Attendence_obj> list = Database2.readDataFromFile();
				Attendence_obj obj;
			//	obj = list.get(idfoundpos);

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
					absent = val[4];
					for(int r1=0;r1<list1.size();r1++)
					{
					Integer[] z =list1.get(i);
					String c;
					c =z.toString();
					int f =Integer.parseInt(c);
					obj = list.get(f);
					
					System.out.println(obj.getPaper());
					
					obj.setId(id);
					obj.setPaper(paper);
					obj.setVclass(vclass);
					obj.setOclass(oclass);
					obj.setPresent(present);
					obj.setAbsent(absent);
					
					if(obj.getPaper().equals(paper))
					{
			   		  userlist1 = Database2.readDataFromFile();
			   		  //userlist1.set(,obj);
				      userlist1.set(idfoundpos,obj);
				      Database2.writeDatatoFile(userlist1);
					}
					else
					{
						userlist1 = Database2.readDataFromFile();
					      userlist1.add(obj);
					      Database2.writeDatatoFile(userlist1);
					}
					}
				}
				JOptionPane.showMessageDialog(null, "UPDATED SUCESSFULLY");
			}
				
			}
				
				
		});
		btnUpdate.setForeground(new Color(65, 105, 225));
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpdate.setBounds(270, 276, 97, 25);
		ATTENDENCE.add(btnUpdate);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		/*		id =textArea_1.getText().trim();
				new SearchAid();
				System.out.println(id);
				int idfoundpos = SearchAid.searchId(id);
				System.out.println(idfoundpos);
				if(idfoundpos == -1)
				{
					JOptionPane.showMessageDialog(null,"INVALID USER ID");
				}
				else {
				ArrayList<Attendence_obj> list = Database2.readDataFromFile();
				Attendence_obj obj;
				obj = list.get(idfoundpos);
				System.out.println("here paper " + obj.getId() + "  here name" + obj.getPaper());
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
								obj.getPaper(),
								obj.getOclass(),
								obj.getVclass(),
								obj.getPresent(),
								obj.getAbsent(),
							});
			}
			}*/
				new duplicateval();
				ArrayList<Integer[]> list1 = duplicateval.searchId(id);
				ArrayList<Attendence_obj> list = Database2.readDataFromFile();
				Attendence_obj obj;
				for(int r1=0;r1<list1.size();r1++)
				{
				Integer[] z =list1.get(r1);
				String c;
				c =z.toString();
				int f =Integer.parseInt(c);
				obj = list.get(f);
				
				System.out.println("duplicates values"+f);
				System.out.println(obj.getPaper());
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
							obj.getPaper(),
							obj.getOclass(),
							obj.getVclass(),
							obj.getPresent(),
							obj.getAbsent(),
						});
				}
			}//
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnSearch.setBounds(348, 231, 147, 40);
		HOME.add(btnSearch);
		
		JButton btnAddrow = new JButton("ADDROW");
		btnAddrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		btnAddrow.setBounds(379, 276, 114, 25);
		ATTENDENCE.add(btnAddrow);
		
		JButton btnLoadData = new JButton("LOAD DATA");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Attendence_obj> list;
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
		
		JButton button = new JButton("UPDATE");
		button.setForeground(new Color(65, 105, 225));
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(289, 276, 97, 25);
		UMARKS.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 255, 0)));
		panel_1.setBackground(UIManager.getColor("Button.darkShadow"));
		panel_1.setBounds(0, 0, 732, 53);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm registrationform = new RegistrationForm();
				registrationform.setVisible(true);
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
		lblNewLabel.setBounds(0, 0, 732, 403);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\projects\\globsyn-project-java-\\Student Attendence\\Student_monitering_system\\images\\abstract-1846962_1280.jpg"));
	}
}
