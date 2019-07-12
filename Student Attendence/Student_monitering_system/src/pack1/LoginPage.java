package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 13, 558, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 13, 512, 47);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		
		JLabel lblLoginPage = new JLabel("  LOGIN PAGE");
		lblLoginPage.setFont(new Font("Cooper Black", Font.BOLD, 20));
		lblLoginPage.setBounds(149, 13, 226, 21);
		panel_1.add(lblLoginPage);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(12, 84, 534, 278);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(24, 64, 159, 47);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 255)));
		panel_3.setBackground(new Color(176, 224, 230));
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setBackground(new Color(245, 245, 245));
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.PLAIN, 17));
		lblNewLabel.setBounds(29, 13, 95, 16);
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 255)));
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBounds(26, 135, 159, 47);
		panel_2.add(panel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 255)));
		panel_6.setBackground(new Color(176, 224, 230));
		panel_6.setBounds(0, 0, 159, 47);
		panel_4.add(panel_6);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Century Schoolbook", Font.PLAIN, 17));
		lblPassword.setBackground(new Color(245, 245, 245));
		lblPassword.setBounds(22, 13, 112, 16);
		panel_6.add(lblPassword);
		
		JTextArea txtrEnterId = new JTextArea();
		txtrEnterId.setFont(new Font("Monospaced", Font.ITALIC, 21));
		txtrEnterId.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		txtrEnterId.setBackground(new Color(240, 230, 140));
		txtrEnterId.setToolTipText("");
		txtrEnterId.setText("\r\n");
		txtrEnterId.setWrapStyleWord(true);
		txtrEnterId.setBounds(227, 68, 249, 43);
		panel_2.add(txtrEnterId);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 21));
		passwordField.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBackground(new Color(240, 230, 140));
		passwordField.setBounds(227, 135, 249, 43);
		panel_2.add(passwordField);
		
		JLabel lblSelectOne = new JLabel("  SELECT ONE");
		lblSelectOne.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSelectOne.setBounds(24, 13, 152, 24);
		panel_2.add(lblSelectOne);
		
		JLabel label = new JLabel(":--");
		label.setFont(new Font("Tahoma", Font.BOLD, 23));
		label.setBounds(180, 15, 56, 16);
		panel_2.add(label);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtrEnterId.setText("ADMIN");
				 passwordField.setText("ADMIN");
			//	dispose();
		
			}
		});
		btnAdmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAdmin.setBounds(242, 15, 118, 25);
		panel_2.add(btnAdmin);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblOr.setBounds(372, 13, 40, 28);
		panel_2.add(lblOr);
		
		JButton btnOt = new JButton("OT");
		btnOt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtrEnterId.setText("");
				passwordField.setText("");
			}
		});
		btnOt.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOt.setBounds(425, 15, 97, 25);
		panel_2.add(btnOt);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtrEnterId.getText().isEmpty()||passwordField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Plsese enter empty fields");
				}
				if(txtrEnterId.getText().equals("ADMIN")&&passwordField.getText().equals("ADMIN"))
				{
				//	JOptionPane.showConfirmDialog(null,"ARE YOU SURE TO WANT TO GO TO ADMIN PAGE","STUDENT MONTER",JOptionPane.YES_NO_CANCEL_OPTION);
					RegistrationForm registrationform = new RegistrationForm();
					registrationform.setVisible(true);
					
					dispose();
				}
				/*else
				{
					JOptionPane.showMessageDialog(null,"you dont have admin permission");
				}*/
				new Searchid();
				int idfoundpos = Searchid.searchId(txtrEnterId.getText().trim());
				
				ArrayList<StudentObj> list = DataBase.readDataFromFile();
				StudentObj obj;
				obj = list.get(idfoundpos);
				if(passwordField.getText().equals(obj.getEmail()))
				{
					JOptionPane.showMessageDialog(null,"USER LOGGED IN");
				}
				
			}
		});
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD, 20));
		btnNewButton.setBounds(172, 218, 159, 47);
		panel_2.add(btnNewButton);
	}
}
