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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;

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
	  
	StudentObj r;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(840, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 710, 380);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(95, 158, 160)));
		panel_1.setBounds(19,19,668,42);
		panel_1.setBackground(new Color(176, 224, 230));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblStudentRegistration = new JLabel("STUDENT REGISTRATION");
		lblStudentRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentRegistration.setBounds(234, 10, 187, 23);
		lblStudentRegistration.setFont(new Font("Calibri", Font.BOLD, 18));
		panel_1.add(lblStudentRegistration);
		
		JButton button = new JButton("");
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
							});
				}
			}
		});
		button.setIcon(new ImageIcon(RegistrationForm.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		button.setBounds(623, 8, 33, 25);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(19, 74, 255, 216);
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
		textField.setBounds(80, 11, 131, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(80, 45, 131, 19);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 74, 131, 19);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 103, 131, 19);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 132, 131, 19);
		panel_2.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"}));
		comboBox.setBounds(178, 162, 47, 22);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(79, 161, 38, 22);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_2.setBounds(129, 161, 37, 22);
		panel_2.add(comboBox_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(new Color(176, 224, 230));
		panel_3.setBounds(19, 303, 656, 50);
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
				//all the content is added in the model type object
				model.addRow(new Object[]{
								textField.getText(),
								textField_1.getText(),
								textField_2.getText(),
								textField_3.getText(),
								textField_4.getText(),
								d_o_b,
						});
				if(table.getSelectedRow() == -1)
				{
					if(table.getRowCount() == 0)
					{
						JOptionPane.showMessageDialog(null, "STudent Update Conformed","Student Manegement System",
								JOptionPane.OK_OPTION);
					}
				}
			String id,name,email,stream,sem,dob;
			id = textField.getText().trim();
			name = textField_1.getText().trim();
			email =textField_2.getText().trim();
			stream = textField_3.getText().trim();
			sem=textField_4.getText().trim();
			
			r =new StudentObj(id,name,email,stream,sem,d_o_b);
			
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
				comboBox.setSelectedItem("Select Year");
			}
		});
		tglbtnReset.setFont(new Font("Chiller", Font.BOLD, 20));
		tglbtnReset.setBounds(125, 13, 107, 25);
		panel_3.add(tglbtnReset);
		
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
				}
		
				
			}
		});
		tglbtnDelete.setFont(new Font("Chiller", Font.BOLD, 20));
		tglbtnDelete.setBounds(244, 13, 107, 25);
		panel_3.add(tglbtnDelete);
		
		JToggleButton tglbtnExit = new JToggleButton("EXIT");
		tglbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "conform if you want to exit","Student Registration System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		tglbtnExit.setFont(new Font("Chiller", Font.BOLD, 20));
		tglbtnExit.setBounds(537, 13, 107, 25);
		panel_3.add(tglbtnExit);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(7, 7, 7, 7, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBounds(286, 74, 389, 216);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 365, 190);
		panel_4.add(scrollPane);
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student_id", "Name", "E-mail", "Stream", "Sem", "D.O.B"
			}
		));
		scrollPane.setViewportView(table);
	}
}
