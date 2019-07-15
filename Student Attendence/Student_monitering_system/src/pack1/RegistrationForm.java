package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class RegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JFrame frame; 
	ArrayList<StudentObj> userlist;
	ArrayList<StudentObj> list;
	ArrayList<StudentObj> liste;
	StudentObj r;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private String id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationForm() {
		setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrationForm.class.getResource("/pack1/images/clipboard-icon.png")));
		setTitle("                                                                                                                  STUDENT MONITERING SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 120, 1293, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 0, 1253, 407);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(95, 158, 160)));
		panel_1.setBounds(19,19,1210,62);
		panel_1.setBackground(new Color(176, 224, 230));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblStudentRegistration = new JLabel("STUDENT REGISTRATION");
		lblStudentRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentRegistration.setBounds(423, 12, 306, 37);
		lblStudentRegistration.setFont(new Font("Calibri", Font.BOLD, 18));
		panel_1.add(lblStudentRegistration);
		
		JButton button = new JButton("");
		button.setBackground(new Color(102, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<StudentObj> list;
				list = DataBase.readDataFromFile();
				for(StudentObj re : list)
				{
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					//all the content is added in the model type object
					model.addRow(new Object[]{
									re.getUser_id(),
									re.getName(),
									re.getEmail(),
									re.getStream(),
									re.getSem(),
									re.getDob(),
									re.getSex(),
									re.getFathername(),
									re.getMothername(),
									re.getAddress(),
									re.getCname(),
							});
				}
			}
		});
		button.setIcon(new ImageIcon(RegistrationForm.class.getResource("/pack1/images/Button-White-Load-icon.png")));
		button.setBounds(1156, 12, 42, 37);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(19, 94, 417, 223);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(12, 13, 56, 16);
		lblNewLabel.setEnabled(false);
	//	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setEnabled(false);
		lblName.setBounds(12, 48, 56, 16);
		panel_2.add(lblName);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setEnabled(false);
		lblEmail.setBounds(12, 77, 56, 16);
		panel_2.add(lblEmail);
		
		JLabel lblStream = new JLabel("Stream");
		lblStream.setEnabled(false);
		lblStream.setBounds(12, 106, 56, 16);
		panel_2.add(lblStream);
		
		JLabel lblSem = new JLabel("Sem");
		lblSem.setEnabled(false);
		lblSem.setBounds(12, 135, 56, 16);
		panel_2.add(lblSem);
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setEnabled(false);
		lblDob.setBounds(12, 164, 56, 16);
		panel_2.add(lblDob);
		
		textField = new JTextField();
		textField.setBounds(77, 11, 121, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 46, 121, 19);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 75, 118, 19);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 104, 118, 19);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(77, 133, 121, 19);
		panel_2.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"}));
		comboBox.setBounds(154, 162, 47, 22);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(77, 161, 38, 22);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_2.setBounds(117, 161, 37, 22);
		panel_2.add(comboBox_2);
		
		JLabel lblSex = new JLabel("sex");
		lblSex.setHorizontalAlignment(SwingConstants.CENTER);
		lblSex.setEnabled(false);
		lblSex.setBounds(220, 13, 56, 16);
		panel_2.add(lblSex);
		
		JLabel lblFname = new JLabel("F-name");
		lblFname.setHorizontalAlignment(SwingConstants.CENTER);
		lblFname.setEnabled(false);
		lblFname.setBounds(220, 48, 56, 16);
		panel_2.add(lblFname);
		
		JLabel lblMname = new JLabel("M-name");
		lblMname.setHorizontalAlignment(SwingConstants.CENTER);
		lblMname.setEnabled(false);
		lblMname.setBounds(220, 77, 56, 16);
		panel_2.add(lblMname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setEnabled(false);
		lblAddress.setBounds(230, 106, 172, 16);
		panel_2.add(lblAddress);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(220, 133, 185, 19);
		panel_2.add(textField_8);
		
		JLabel lblCollageName = new JLabel("Collage name");
		lblCollageName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollageName.setEnabled(false);
		lblCollageName.setBounds(230, 164, 172, 16);
		panel_2.add(lblCollageName);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(220, 184, 182, 19);
		panel_2.add(textField_9);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		panel_5.setBackground(new Color(153, 204, 204));
		panel_5.setForeground(new Color(204, 51, 255));
		panel_5.setBounds(201, 13, 10, 217);
		panel_2.add(panel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(278, 11, 127, 19);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(278, 46, 127, 19);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(278, 75, 127, 19);
		panel_2.add(textField_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(new Color(176, 224, 230));
		panel_3.setBounds(19, 330, 1210, 50);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("ADD_USER");
		String d_o_b;
		String d=(String)comboBox_1.getSelectedItem();
		String m=(String)comboBox_2.getSelectedItem();
		String y=(String)comboBox.getSelectedItem();
		d_o_b=d + "-" + m + "-" + y;
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				//all the content is added in the model type objectnew Searchid();
				id =textField.getText().trim();
				int idfoundpos = Searchid.searchId(id);
				
				if(idfoundpos == -1) {
				model.addRow(new Object[]{
								textField.getText(),
								textField_1.getText(),
								textField_2.getText(),
								textField_3.getText(),
								textField_4.getText(),
								d_o_b,
								textField_5.getText(),
								textField_6.getText(),
								textField_7.getText(),
								textField_8.getText(),
								textField_9.getText(),
						});
				if(table.getSelectedRow() == -1)
				{
					if(table.getRowCount() == 0)
					{
						JOptionPane.showMessageDialog(null, "STudent Update Conformed","Student Manegement System",
								JOptionPane.OK_OPTION);
					}
				}
			String id,name,email,stream,sem,dob,sex,fname,mname,add,cname;
			id = textField.getText().trim();
			name = textField_1.getText().trim();
			email =textField_2.getText().trim();
			stream = textField_3.getText().trim();
			sem=textField_4.getText().trim();
			sex =textField_8.getText().trim();
			fname= textField_9.getText().trim();
			mname = textField_5.getText().trim();
			add =textField_6.getText().trim();
			cname =textField_7.getText().trim();
			
			r =new StudentObj(id,name,email,stream,sem,d_o_b,sex,fname,mname,add,cname);
			
			int con=JOptionPane.showConfirmDialog(null, "Are You Sure to Register?");
		       if(con==JOptionPane.YES_OPTION)
		       {
			      userlist =DataBase.readDataFromFile();
			      userlist.add(r);
			      DataBase.writeDatatoFile(userlist);
			      JOptionPane.showMessageDialog(null, "Registration Successful...");
			}
		       else
		       {
		    	   JOptionPane.showMessageDialog(null, "Registration failed");
		       }
			}
			else {
				JOptionPane.showMessageDialog(null, "duplicate user not allowed");
			}
		}});
		tglbtnNewToggleButton.setFont(new Font("Chiller", Font.BOLD, 16));
		tglbtnNewToggleButton.setBounds(12, 13, 107, 25);
		panel_3.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnReset = new JToggleButton("RESET");
		tglbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_9.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				comboBox.setSelectedItem("Select Year");
			}
		});
		tglbtnReset.setFont(new Font("Chiller", Font.BOLD, 20));
		tglbtnReset.setBounds(271, 13, 107, 25);
		panel_3.add(tglbtnReset);
		
		
		//
		
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					int i =table.getSelectedRow();
					TableModel model =table.getModel();
					id = model.getValueAt(i, 0).toString();
					System.out.println("id get "+id);
					textField.setText(model.getValueAt(i, 0).toString());
					textField_1.setText(model.getValueAt(i, 1).toString());
					textField_2.setText(model.getValueAt(i, 2).toString());
					textField_3.setText(model.getValueAt(i, 3).toString());
					textField_4.setText(model.getValueAt(i, 4).toString());
					textField_5.setText(model.getValueAt(i, 6).toString());
					textField_6.setText(model.getValueAt(i, 7).toString());
					textField_7.setText(model.getValueAt(i, 8).toString());
					textField_8.setText(model.getValueAt(i, 9).toString());
					textField_9.setText(model.getValueAt(i, 10).toString());
			}
		});
		
		
		
		//
		JToggleButton tglbtnDelete = new JToggleButton("DELETE");
		tglbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1)
				{
					if(table.getSelectedRow() ==0)
					{
					JOptionPane.showMessageDialog(null, "no data to delete",
							"Student Registration System",JOptionPane.OK_OPTION);
				}else {
					JOptionPane.showMessageDialog(null, "select a row to delete",
							"Student Registration System",JOptionPane.OK_OPTION);
				}
			}
				else {
					model.removeRow(table.getSelectedRow());
					new Searchid();
					int s=Searchid.searchId(id);
					list=DataBase.readDataFromFile();
					
					list.remove(s);
					 
					DataBase.writeDatatoFile(list);
				}
		
				
			}
		});
		tglbtnDelete.setFont(new Font("Chiller", Font.BOLD, 20));
		tglbtnDelete.setBounds(542, 13, 107, 25);
		panel_3.add(tglbtnDelete);
		
		JToggleButton tglbtnExit = new JToggleButton("EXIT");
		tglbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "conform if you want to exit","Student Registration System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					Admin_Page back=new Admin_Page();
					back.setVisible(true);
					dispose();
				}
			}
		});
		tglbtnExit.setFont(new Font("Chiller", Font.BOLD, 20));
		tglbtnExit.setBounds(1091, 13, 107, 25);
		panel_3.add(tglbtnExit);
		
		JToggleButton tglbtnUpdate = new JToggleButton("UPDATE");
		tglbtnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Searchid();
				id = textField.getText().trim();
				int s=Searchid.searchId(id);
				System.out.println("s value"+s);
				
				String id,name,email,stream,sem,dob,sex,fname,mname,add,cname;
				id = textField.getText().trim();
				name = textField_1.getText().trim();
				email =textField_2.getText().trim();
				stream = textField_3.getText().trim();
				sem=textField_4.getText().trim();
				sex =textField_5.getText().trim();
				fname= textField_6.getText().trim();
				mname = textField_7.getText().trim();
				add =textField_8.getText().trim();
				cname =textField_9.getText().trim();
				
				r =new StudentObj(id,name,email,stream,sem,d_o_b,sex,fname,mname,add,cname);
				
				int con=JOptionPane.showConfirmDialog(null, "Are You Sure to Update?");
			       if(con==JOptionPane.YES_OPTION)
			       {
				      liste =DataBase.readDataFromFile();
				      liste.set(s,r);
				      DataBase.writeDatatoFile(liste);
				      JOptionPane.showMessageDialog(null, "Updated Sucessfull...");
				}
			       else
			       {
			    	   JOptionPane.showMessageDialog(null, "failed");
			       }
				
			}
		});
		tglbtnUpdate.setFont(new Font("Chiller", Font.BOLD, 20));
		tglbtnUpdate.setBounds(833, 13, 107, 25);
		panel_3.add(tglbtnUpdate);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBounds(448, 94, 780, 223);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 756, 197);
		panel_4.add(scrollPane);
		

		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student_id", "Name", "E-mail", "Stream", "Sem", "D.O.B", "sex", "F-name", "M-name", "Address", "c-name"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(64);
		table.getColumnModel().getColumn(4).setPreferredWidth(55);
		table.getColumnModel().getColumn(5).setPreferredWidth(61);
		table.getColumnModel().getColumn(6).setPreferredWidth(56);
		table.getColumnModel().getColumn(7).setPreferredWidth(68);
		table.getColumnModel().getColumn(8).setPreferredWidth(61);
		table.getColumnModel().getColumn(9).setPreferredWidth(120);
		table.getColumnModel().getColumn(10).setPreferredWidth(137);
		scrollPane.setViewportView(table);
	}
}
