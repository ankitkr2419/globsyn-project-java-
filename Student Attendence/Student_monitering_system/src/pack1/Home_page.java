package pack1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class Home_page extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_2;
//	private JLayeredPane layeredPane;
	private JPanel HOME;
	private JPanel PROFILE;
	private JPanel ATTENDENCE;
	private JPanel MARKS;
	private JPanel NOTICE;
	private JLayeredPane layeredPane_1;
	static String id;
	private JTable table_4;
	private JTable table_3;
	private JTextField txtClassTextWill;
	private JTextField txtFootballTournamentWill;
	private JTextField textField_2;
	static int count =1;
	static int count1=1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page frame = new Home_page(id);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchpanels(JPanel panel)
	{
		layeredPane_1.removeAll();
		layeredPane_1.add(panel);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
		
	}
	/**
	 * Create the frame.
	 */
	public Home_page(String idd) {
		setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		setTitle("                                                        STUDENT MONITERING SYSTEM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home_page.class.getResource("/pack1/images/clipboard-icon.png")));
		setResizable(false);
		this.id =idd;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 120, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(12, 72, 720, 318);
		contentPane.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		HOME = new JPanel();
		HOME.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(51, 51, 51)));
		layeredPane_1.add(HOME, "name_1893497277263");
		HOME.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setForeground(new Color(255, 204, 0));
		lblWelcome.setFont(new Font("Cambria", Font.ITALIC, 25));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(270, 0, 162, 41);
		HOME.add(lblWelcome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(204, 255, 255));
		scrollPane.setBounds(434, 46, 274, 131);
		HOME.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(255, 153, 204)));
		table.setBackground(new Color(255, 255, 204));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PAPER", "CLASSES", "V CLASSES", "PRESENT", "ABSENT", "ATT%"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(86);
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 202, 696, 103);
		HOME.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PERIOD", "MON", "TUE", "WED", "THUS", "FRI"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setOpaque(true);
		lblName.setBackground(new Color(0, 204, 255));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(259, 54, 56, 16);
		HOME.add(lblName);
		
		JLabel lblRoll = new JLabel("ROLL");
		lblRoll.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRoll.setOpaque(true);
		lblRoll.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoll.setBackground(new Color(0, 204, 255));
		lblRoll.setBounds(262, 84, 49, 16);
		HOME.add(lblRoll);
		
		JLabel lblStream = new JLabel("STREAM");
		lblStream.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStream.setOpaque(true);
		lblStream.setHorizontalAlignment(SwingConstants.CENTER);
		lblStream.setBackground(new Color(0, 204, 255));
		lblStream.setBounds(262, 113, 56, 16);
		HOME.add(lblStream);
		
		JLabel lblBatch = new JLabel("SEM");
		lblBatch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBatch.setOpaque(true);
		lblBatch.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatch.setBackground(new Color(0, 204, 255));
		lblBatch.setBounds(262, 140, 53, 16);
		HOME.add(lblBatch);
		
		JLabel label_4 = new JLabel("::");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(316, 53, 10, 16);
		HOME.add(label_4);
		
		JLabel label_5 = new JLabel("::");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(316, 83, 10, 16);
		HOME.add(label_5);
		
		JLabel label_6 = new JLabel("::");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(316, 113, 10, 16);
		HOME.add(label_6);
		
		JLabel label_7 = new JLabel("::");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(316, 140, 10, 16);
		HOME.add(label_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		textArea.setBounds(335, 51, 81, 19);
		HOME.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		textArea_1.setBounds(338, 81, 81, 19);
		HOME.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		textArea_2.setBounds(335, 110, 81, 19);
		HOME.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		textArea_3.setBounds(335, 137, 81, 19);
		HOME.add(textArea_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(0, 2, 3, 2, (Color) new Color(255, 102, 204)));
		panel_1.setBackground(new Color(153, 255, 102));
		panel_1.setBounds(12, 13, 234, 25);
		HOME.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NEWS AND NOTIFICATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 0, 210, 16);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 1, 3, 2, (Color) new Color(255, 153, 204)));
		panel_2.setBackground(new Color(255, 204, 102));
		panel_2.setBounds(434, 13, 274, 25);
		HOME.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAttedenceReport = new JLabel("ATTEDENCE REPORT");
		lblAttedenceReport.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAttedenceReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttedenceReport.setBounds(12, 0, 250, 16);
		panel_2.add(lblAttedenceReport);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(12, 43, 232, 131);
		HOME.add(panel_16);
		panel_16.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 232, 131);
		panel_16.add(scrollPane_5);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		scrollPane_5.setViewportView(panel_17);
		
		txtClassTextWill = new JTextField();
		txtClassTextWill.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		txtClassTextWill.setText("class text will began from tommorow");
		txtClassTextWill.setColumns(10);
		txtClassTextWill.setBounds(0, 0, 230, 42);
		panel_17.add(txtClassTextWill);
		
		txtFootballTournamentWill = new JTextField();
		txtFootballTournamentWill.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		txtFootballTournamentWill.setText("football tournament will start soon");
		txtFootballTournamentWill.setColumns(10);
		txtFootballTournamentWill.setBounds(0, 40, 230, 42);
		panel_17.add(txtFootballTournamentWill);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(0, 82, 230, 64);
		panel_17.add(textField_2);
		
		PROFILE = new JPanel();
		PROFILE.setBackground(new Color(245, 222, 179));
		PROFILE.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.DARK_GRAY, Color.DARK_GRAY));
		layeredPane_1.add(PROFILE, "name_1897367502278");
		PROFILE.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/ezgif.com-resize (4).gif")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 13, 139, 164);
		PROFILE.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(173, 13, 533, 164);
		PROFILE.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_5.setBounds(0, 0, 142, 77);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("ID");
		lblNewLabel_4.setForeground(new Color(51, 51, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(35, 9, 56, 16);
		panel_5.add(lblNewLabel_4);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(255, 235, 205));
		textPane_1.setBounds(12, 38, 118, 26);
		panel_5.add(textPane_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(192, 192, 192));
		panel_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_7.setBounds(285, 0, 142, 77);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblSem = new JLabel("SEM");
		lblSem.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblSem.setForeground(new Color(51, 51, 255));
		lblSem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSem.setBounds(30, 9, 77, 16);
		panel_7.add(lblSem);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(new Color(255, 228, 196));
		textPane_3.setBounds(12, 38, 118, 26);
		panel_7.add(textPane_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_8.setBackground(new Color(192, 192, 192));
		panel_8.setBounds(428, 0, 105, 77);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblSex = new JLabel("SEX");
		lblSex.setForeground(new Color(51, 51, 255));
		lblSex.setHorizontalAlignment(SwingConstants.CENTER);
		lblSex.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblSex.setBounds(23, 9, 56, 16);
		panel_8.add(lblSex);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBackground(new Color(255, 228, 196));
		textPane_4.setBounds(12, 38, 81, 26);
		panel_8.add(textPane_4);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_9.setBackground(new Color(192, 192, 192));
		panel_9.setBounds(0, 78, 142, 77);
		panel_3.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblDob.setForeground(new Color(51, 51, 255));
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setBounds(24, 0, 86, 23);
		panel_9.add(lblDob);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 228, 196));
		textPane.setForeground(new Color(255, 228, 225));
		textPane.setBounds(12, 29, 118, 35);
		panel_9.add(textPane);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_10.setBackground(new Color(192, 192, 192));
		panel_10.setBounds(142, 78, 142, 77);
		panel_3.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setForeground(new Color(51, 51, 255));
		lblEmail.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(40, 0, 63, 22);
		panel_10.add(lblEmail);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBackground(new Color(255, 228, 196));
		textPane_5.setBounds(12, 29, 118, 35);
		panel_10.add(textPane_5);
		textPane_5.setEditable(false);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_11.setBackground(new Color(192, 192, 192));
		panel_11.setBounds(285, 78, 142, 77);
		panel_3.add(panel_11);
		panel_11.setLayout(null);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBackground(new Color(255, 228, 196));
		textPane_6.setEditable(false);
		textPane_6.setBounds(12, 29, 118, 35);
		panel_11.add(textPane_6);
		
		JLabel lblFname = new JLabel("F-NAME");
		lblFname.setHorizontalAlignment(SwingConstants.CENTER);
		lblFname.setForeground(new Color(51, 51, 255));
		lblFname.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblFname.setBounds(39, 0, 63, 22);
		panel_11.add(lblFname);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_12.setBackground(new Color(192, 192, 192));
		panel_12.setBounds(428, 78, 105, 77);
		panel_3.add(panel_12);
		panel_12.setLayout(null);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBackground(new Color(255, 228, 196));
		textPane_7.setBounds(12, 29, 80, 35);
		panel_12.add(textPane_7);
		
		JLabel lblYear = new JLabel("YEAR");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setForeground(new Color(51, 51, 255));
		lblYear.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblYear.setBounds(12, 0, 63, 22);
		panel_12.add(lblYear);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(192, 192, 192));
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.MAGENTA));
		panel_6.setBounds(142, 0, 142, 77);
		panel_3.add(panel_6);
		
		JLabel lblName_1 = new JLabel("NAME");
		lblName_1.setForeground(new Color(51, 51, 255));
		lblName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblName_1.setBounds(35, 9, 56, 16);
		panel_6.add(lblName_1);
		
		JTextPane txtpnA = new JTextPane();
		txtpnA.setBackground(new Color(255, 235, 205));
		txtpnA.setBounds(12, 38, 118, 26);
		panel_6.add(txtpnA);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.GRAY, null, null, null));
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBounds(22, 177, 684, 128);
		PROFILE.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 255), new Color(255, 0, 255), new Color(255, 0, 255), new Color(255, 0, 255)));
		panel_13.setBackground(new Color(192, 192, 192));
		panel_13.setBounds(12, 13, 320, 102);
		panel_4.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblAddress.setForeground(new Color(51, 51, 255));
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(78, 0, 160, 28);
		panel_13.add(lblAddress);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setBackground(new Color(255, 228, 196));
		textPane_8.setEditable(false);
		textPane_8.setBounds(12, 41, 296, 48);
		panel_13.add(textPane_8);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.RAISED, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA, Color.MAGENTA));
		panel_14.setBackground(new Color(192, 192, 192));
		panel_14.setBounds(333, 13, 339, 102);
		panel_4.add(panel_14);
		panel_14.setLayout(null);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setBackground(new Color(255, 228, 196));
		textPane_9.setEditable(false);
		textPane_9.setBounds(12, 41, 315, 48);
		panel_14.add(textPane_9);
		
		JLabel lblColageName = new JLabel("COLAGE NAME");
		lblColageName.setForeground(new Color(51, 51, 255));
		lblColageName.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblColageName.setHorizontalAlignment(SwingConstants.CENTER);
		lblColageName.setBounds(94, 0, 160, 28);
		panel_14.add(lblColageName);
		
		ATTENDENCE = new JPanel();
		layeredPane_1.add(ATTENDENCE, "name_1900319960293");
		ATTENDENCE.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(24, 49, 684, 256);
		ATTENDENCE.add(scrollPane_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PAPER", "TCLASS", "VCLASS", "PRESENT", "ABSENT"
			}
		));
		table_4.setBorder(new MatteBorder(1, 2, 2, 2, (Color) new Color(255, 153, 204)));
		table_4.setBackground(new Color(255, 255, 204));
		scrollPane_3.setViewportView(table_4);
		
		JLabel lblNewLabel_5 = new JLabel("Attendence Report");
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_5.setForeground(Color.CYAN);
		lblNewLabel_5.setBounds(231, 0, 255, 37);
		ATTENDENCE.add(lblNewLabel_5);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Education_Thrives_When_You_Keep_It_Under_Five (1).jpg")));
		label_17.setBounds(0, 0, 720, 318);
		ATTENDENCE.add(label_17);
		
		MARKS = new JPanel();
		layeredPane_1.add(MARKS, "name_1903252893592");
		MARKS.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(33, 53, 656, 252);
		MARKS.add(scrollPane_4);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PAPERCODE", "PAPERNAME", "TOTALMARKS", "MARKS OBTAIN", "P OR F"
			}
		));
		table_3.getColumnModel().getColumn(1).setPreferredWidth(113);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(106);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(117);
		scrollPane_4.setViewportView(table_3);
		
		JLabel lblMarksheet = new JLabel("MARKSHEET");
		lblMarksheet.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 19));
		lblMarksheet.setForeground(Color.PINK);
		lblMarksheet.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarksheet.setBounds(235, 13, 255, 27);
		MARKS.add(lblMarksheet);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/ezgif.com-resize.jpg")));
		label_18.setBounds(0, 0, 720, 318);
		MARKS.add(label_18);
		
		NOTICE = new JPanel();
		layeredPane_1.add(NOTICE, "name_1971661824063");
		NOTICE.setLayout(null);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 51, 255), new Color(0, 51, 255), new Color(0, 51, 255), new Color(0, 51, 255)));
		panel_15.setBackground(new Color(255, 204, 255));
		panel_15.setBounds(0, 0, 708, 51);
		NOTICE.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblNoNoticeTo = new JLabel("NO NOTICE TO SHOW FOR NOW");
		lblNoNoticeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoNoticeTo.setForeground(new Color(102, 102, 153));
		lblNoNoticeTo.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNoNoticeTo.setBounds(70, 13, 586, 28);
		panel_15.add(lblNoNoticeTo);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Notice-800x500_c.jpg")));
		label_19.setBounds(0, 0, 708, 318);
		NOTICE.add(label_19);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 51)));
		panel.setBounds(12, 13, 720, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Home-icon.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(HOME);
			}
		});
		btnNewButton.setFont(new Font("Berlin Sans FB", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(102, 204, 255));
		btnNewButton.setBounds(12, 13, 95, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PROFILE");
		btnNewButton_1.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Profile-icon.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(PROFILE);
				
			}
		});
		btnNewButton_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 11));
		btnNewButton_1.setBounds(119, 13, 107, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ATTENDENCE");
		btnNewButton_2.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Categories-applications-education-school-icon.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchpanels(ATTENDENCE);
				if(count >0)
				{
				new duplicateval();
				//System.out.println("id value "+ id);
				List<Integer> list1 = duplicateval.searchId(id);
				ArrayList<Attendence_obj> list = Database2.readDataFromFile();
				Attendence_obj obj;
				//last try
				for(int i=0;i<list1.size();i++)
				{
				int f = list1.get(i);
				obj = list.get(f);
				DefaultTableModel model = (DefaultTableModel) table_4.getModel();
				model.addRow(new Object[]{
							obj.getPaper(),
							obj.getOclass(),
							obj.getVclass(),
							obj.getPresent(),
							obj.getAbsent(),
						});
				
			}
				count--;
			}
			}
		});
		btnNewButton_2.setBackground(new Color(102, 204, 255));
		btnNewButton_2.setFont(new Font("Berlin Sans FB", Font.BOLD, 12));
		btnNewButton_2.setBounds(238, 14, 138, 25);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MARKS");
		btnNewButton_3.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Actions-mail-mark-task-icon.png")));
		btnNewButton_3.setBackground(new Color(102, 204, 255));
		btnNewButton_3.setFont(new Font("Berlin Sans FB", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(MARKS);
			if(count1>0)
			{
				System.out.println("value of "+ id);
				new duplicateval2();
				//System.out.println("id value "+ id);
				List<Integer> list1 = duplicateval2.searchId(id);
				System.out.println("the size"+list1.size());
				ArrayList<Marks_obj> list = Databse3.readDataFromFile();
				Marks_obj obj;
				//last try
				for(int i=0;i<list1.size();i++)
				{
				int f = list1.get(i);
				obj = list.get(f);
				DefaultTableModel model = (DefaultTableModel) table_3.getModel();
				model.addRow(new Object[]{
							obj.getPapercode(),
							obj.getPapername(),
							obj.getTotalmarks(),
							obj.getMarksobtain(),
							obj.getP_f(),
						});
				}
				count1--;
			}
			}
		});
		btnNewButton_3.setBounds(388, 13, 107, 25);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("NOTICE");
		btnNewButton_4.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Notice-Support-icon.png")));
		btnNewButton_4.setBackground(new Color(102, 204, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(NOTICE);
			}
		});
		btnNewButton_4.setFont(new Font("Berlin Sans FB", Font.BOLD, 12));
		btnNewButton_4.setBounds(517, 13, 97, 24);
		panel.add(btnNewButton_4);
		
		JLabel label = new JLabel("|");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(107, 13, 20, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("|");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(226, 14, 13, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("|");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(375, 13, 20, 25);
		panel.add(label_2);
		
		//attendence updated here
		//String id =automatic_update(id1);
		new duplicateval();
		//System.out.println("id value "+ id);
		List<Integer> list1 = duplicateval.searchId(id);
		ArrayList<Attendence_obj> list = Database2.readDataFromFile();
		Attendence_obj obj;
		//last try
		int x;
		int y;
		int per;
		int nper;
		String p;
		for(int i=0;i<list1.size();i++)
		{
		int f = list1.get(i);
		obj = list.get(f);
		//
		x =Integer.parseInt(obj.getOclass());
		y =Integer.parseInt(obj.getAbsent());
		per = (x-y)/x;
		nper =per*100;
		p=Integer.toString(per);
		String pu =p+" %";
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[]{
					obj.getPaper(),
					obj.getOclass(),
					obj.getVclass(),
					obj.getPresent(),
					obj.getAbsent(),
					pu,
				});
		}
		//
		//fields update here
		ArrayList<StudentObj> list1n;
		StudentObj l;
		list1n=DataBase.readDataFromFile();
		new Searchid();
		int nid = Searchid.searchId(id);
		l=list1n.get(nid);
		textArea.setText(l.getName());
		textArea_1.setText(l.getUser_id());
		textArea_2.setText(l.getStream());
		textArea_3.setText(l.getSem());
		
		
		
		ArrayList<StudentObj> userlist;
		Searchid o = new Searchid();
		int pos =Searchid.searchId(id);
		userlist = DataBase.readDataFromFile();
		textPane_1.setText(id);
		txtpnA.setText(userlist.get(pos).getName());
		textPane_3.setText(userlist.get(pos).getSem());
		textPane_4.setText(userlist.get(pos).getSex());
		textPane.setText(userlist.get(pos).getDob());
		textPane_5.setText(userlist.get(pos).getEmail());
		textPane_6.setText(userlist.get(pos).getFathername());
		textPane_7.setText(userlist.get(pos).getMothername());
		textPane_8.setText(userlist.get(pos).getAddress());
		textPane_9.setText(userlist.get(pos).getCname());
		//
		System.out.println("value of "+ id);
		new duplicateval3();
		//System.out.println("id value "+ id);
		List<Integer> list2 = duplicateval3.searchId(id);
		System.out.println("the size"+list1.size());
		ArrayList<Routing_obj> listp = DataBase4.readDataFromFile();
		Routing_obj objp;
		//last try
		for(int i=0;i<list2.size();i++)
		{
		int f = list2.get(i);
		objp = listp.get(f);
		DefaultTableModel model = (DefaultTableModel) table_2.getModel();
		model.addRow(new Object[]{
					objp.getPeriod(),
					objp.getMrout(),
					objp.getTrout(),
					objp.getWrout(),
					objp.getThrout(),
					objp.getFrout(),
				});
		}
		
		JButton btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				New_login o =new New_login();
				o.setVisible(true);
				dispose();
			}
		});
		btnLogout.setBackground(new Color(0, 255, 255));
		btnLogout.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/Apps-Dialog-Logout-icon.png")));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogout.setBounds(638, 13, 70, 25);
		panel.add(btnLogout);
		
		JLabel label_3 = new JLabel("|");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(499, 13, 20, 25);
		panel.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Home_page.class.getResource("/pack1/images/ancient-antique-art-235985.jpg")));
		lblNewLabel_1.setBounds(0, 0, 744, 415);
		contentPane.add(lblNewLabel_1);
		
	}
}
