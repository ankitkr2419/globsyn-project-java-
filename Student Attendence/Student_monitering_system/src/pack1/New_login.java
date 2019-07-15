package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class New_login extends JFrame {

	private JPanel contentPane;
	private JTextField txtrEnterId;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_login frame = new New_login();
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
	public New_login() {
		setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		setTitle("                                              STUDENT MONITERING SYSTEM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(New_login.class.getResource("/pack1/images/clipboard-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(540, 120, 667, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("LOGIN PAGE");
		lblLoginPage.setForeground(new Color(153, 0, 153));
		lblLoginPage.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 23));
		lblLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginPage.setBounds(98, 25, 448, 73);
		contentPane.add(lblLoginPage);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 51, 204), new Color(0, 51, 204), new Color(0, 51, 204), new Color(0, 51, 204)));
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(0, 121, 649, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtrEnterId = new JTextField();
		txtrEnterId.setHorizontalAlignment(SwingConstants.CENTER);
		txtrEnterId.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtrEnterId.setBackground(new Color(204, 255, 204));
		txtrEnterId.setBounds(226, 24, 181, 44);
		panel.add(txtrEnterId);
		txtrEnterId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("  USER ID");
		lblNewLabel.setIcon(new ImageIcon(New_login.class.getResource("/pack1/images/administrator-icon.png")));
		lblNewLabel.setBounds(12, 22, 181, 49);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(51, 0, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Poor Richard", Font.BOLD, 23));
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setIcon(new ImageIcon(New_login.class.getResource("/pack1/images/Apps-preferences-desktop-user-password-icon.png")));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(new Color(51, 0, 102));
		lblPassword.setFont(new Font("Poor Richard", Font.BOLD, 23));
		lblPassword.setBounds(32, 103, 181, 49);
		panel.add(lblPassword);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtrEnterId.getText().isEmpty()||passwordField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Plsese enter empty fields");
				}
				if(txtrEnterId.getText().equals("ADMIN")&&passwordField.getText().equals("ADMIN"))
				{
				//	JOptionPane.showConfirmDialog(null,"ARE YOU SURE TO WANT TO GO TO ADMIN PAGE","STUDENT MONTER",JOptionPane.YES_NO_CANCEL_OPTION);
					Admin_Page ap = new Admin_Page();
					ap.setVisible(true);
					
					dispose();
				}
				else
				{
				new Searchid();
				int idfoundpos = Searchid.searchId(txtrEnterId.getText().trim());
				if(idfoundpos == -1)
				{
					JOptionPane.showMessageDialog(null,"INVALID USER ID");
				}
				else {
				ArrayList<StudentObj> list = DataBase.readDataFromFile();
				StudentObj obj;
				obj = list.get(idfoundpos);
				if(passwordField.getText().equals(obj.getEmail()))
				{
					String id =txtrEnterId.getText().trim();
					Home_page obj1 = new Home_page(id);
					obj1.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"WRONG PASSWORD");
				}
				}
				}
			}
		});
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setIcon(new ImageIcon(New_login.class.getResource("/pack1/images/secrecy-icon.png")));
		btnNewButton.setForeground(new Color(51, 51, 0));
		btnNewButton.setFont(new Font("Century", Font.BOLD, 17));
		btnNewButton.setBounds(142, 185, 181, 44);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 51, 255), new Color(0, 51, 255), new Color(0, 51, 255), new Color(0, 51, 255)));
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBounds(450, 0, 199, 252);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnOt = new JButton(" O_P");
		btnOt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtrEnterId.setText("");
				passwordField.setText("");
			}
		});
		btnOt.setBackground(new Color(102, 204, 153));
		btnOt.setIcon(new ImageIcon(New_login.class.getResource("/pack1/images/Groups-Meeting-Light-icon.png")));
		btnOt.setForeground(new Color(204, 0, 153));
		btnOt.setFont(new Font("Century Schoolbook", Font.BOLD, 17));
		btnOt.setBounds(25, 31, 162, 59);
		panel_1.add(btnOt);
		
		JButton btnAdmin = new JButton(" ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtrEnterId.setText("ADMIN");
				 passwordField.setText("ADMIN");
			}
		});
		btnAdmin.setBackground(new Color(102, 204, 153));
		btnAdmin.setIcon(new ImageIcon(New_login.class.getResource("/pack1/images/10417-man-police-officer-icon.png")));
		btnAdmin.setForeground(new Color(204, 51, 153));
		btnAdmin.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		btnAdmin.setBounds(25, 155, 162, 59);
		panel_1.add(btnAdmin);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 153));
		panel_2.setBounds(0, 117, 199, 10);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 153));
		panel_3.setBounds(0, 242, 199, 10);
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 51, 153));
		panel_4.setBounds(0, 0, 199, 10);
		panel_1.add(panel_4);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 21));
		passwordField.setBackground(new Color(204, 255, 204));
		passwordField.setBounds(226, 108, 181, 44);
		panel.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(New_login.class.getResource("/pack1/images/ezgif.com-resize (5).gif")));
		label.setBounds(0, 0, 649, 455);
		contentPane.add(label);
	}
}
