package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_rpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	ArrayList<ADMINOBJ> userlist;
	ADMINOBJ r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_rpage frame = new Admin_rpage();
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
	public Admin_rpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(540, 120, 667, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminRegistration = new JLabel("ADMIN REGISTRATION");
		lblAdminRegistration.setForeground(Color.DARK_GRAY);
		lblAdminRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminRegistration.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAdminRegistration.setBounds(205, 13, 245, 51);
		contentPane.add(lblAdminRegistration);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.MAGENTA);
		lblName.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		lblName.setBounds(59, 90, 185, 33);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Sitka Small", Font.BOLD, 14));
		textField.setBounds(256, 90, 194, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.MAGENTA);
		lblId.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		lblId.setBounds(74, 152, 185, 33);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(256, 152, 194, 29);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.MAGENTA);
		lblPassword.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		lblPassword.setBounds(74, 207, 185, 33);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Sitka Small", Font.BOLD, 14));
		passwordField.setBounds(256, 214, 194, 26);
		contentPane.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ASSISTANT PROFFESER", "PROFESSER", "PRINCIPAL", "LAB ASSISTANCE "}));
		comboBox.setBounds(256, 267, 194, 29);
		contentPane.add(comboBox);
		
		JLabel lblPost = new JLabel("POST");
		lblPost.setHorizontalAlignment(SwingConstants.CENTER);
		lblPost.setForeground(Color.MAGENTA);
		lblPost.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		lblPost.setBounds(59, 263, 185, 33);
		contentPane.add(lblPost);
		
		JLabel lblSecurityCode = new JLabel("SECURITY CODE");
		lblSecurityCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecurityCode.setForeground(Color.MAGENTA);
		lblSecurityCode.setFont(new Font("Trebuchet MS", Font.ITALIC, 18));
		lblSecurityCode.setBounds(59, 311, 185, 33);
		contentPane.add(lblSecurityCode);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		passwordField_1.setBounds(256, 316, 194, 26);
		contentPane.add(passwordField_1);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(0, 204, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userlist =DATABASE5.readDataFromFile();
				String name, pass,post,id;
				new Searchidnew();
				int idfoundpos = Searchidnew.searchId(textField_1.getText().trim());
				String idspos = Integer.toString(idfoundpos);
				if(textField_1.getText().equals(idspos))
				{
					JOptionPane.showMessageDialog(null, "plese choose an differnt id");
				}
				else if(passwordField_1.getText().equals("123"))
				{

					
					name = textField.getText();
					id =textField_1.getText();
					pass =passwordField.getText();
					post=(String)comboBox.getSelectedItem();
					r = new ADMINOBJ(name,pass,id,post);
					userlist.add(r);
					DATABASE5.writeDatatoFile(userlist);
					dilognew obj = new dilognew();
					obj.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "you are not autharized to sign as admin");
				}
			}
		});
		
		
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		btnNewButton.setBounds(236, 371, 214, 33);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("LOGIN PAGE");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				New_login log = new New_login();
				log.setVisible(true);
			}
		});
		btnLogin.setForeground(new Color(102, 0, 51));
		btnLogin.setIcon(new ImageIcon(Admin_rpage.class.getResource("/pack1/images/Apps-Dialog-Logout-icon.png")));
		btnLogin.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		btnLogin.setBackground(new Color(51, 204, 153));
		btnLogin.setBounds(462, 0, 187, 33);
		contentPane.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Admin_rpage.class.getResource("/pack1/images/y1ostvqnr4711 (1).jpg")));
		label.setBounds(0, 0, 649, 455);
		contentPane.add(label);
		
		
		
	}
}
