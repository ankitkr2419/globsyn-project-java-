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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Home_page extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
//	private JLayeredPane layeredPane;
	private JPanel HOME;
	private JPanel ATTENDENCE;
	private JPanel NOTICE;
	private JPanel PROFILE;
	private JPanel MARKS;
	private JLayeredPane layeredPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page frame = new Home_page();
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
	public void automatic_update()
	{
		ArrayList<Attendence_obj> list;
		list = Database2.readDataFromFile();
		for(Attendence_obj re : list)
		{	
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{
						re.getPaper(),
						re.getOclass(),
						re.getVclass(),
						re.getPresent(),
						re.getAbsent(),
					});
		}
	}
	/**
	 * Create the frame.
	 */
	public Home_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(12, 72, 708, 318);
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
		lblWelcome.setBounds(248, 13, 162, 41);
		HOME.add(lblWelcome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(204, 255, 255));
		scrollPane.setBounds(422, 43, 274, 131);
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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 43, 238, 131);
		HOME.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 202, 684, 103);
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
		
		JLabel lblBatch = new JLabel("BATCH");
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
		textArea.setBounds(335, 51, 81, 19);
		HOME.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(338, 81, 81, 19);
		HOME.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(335, 110, 81, 19);
		HOME.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
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
		panel_2.setBounds(422, 13, 274, 25);
		HOME.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAttedenceReport = new JLabel("ATTEDENCE REPORT");
		lblAttedenceReport.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAttedenceReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttedenceReport.setBounds(12, 0, 250, 16);
		panel_2.add(lblAttedenceReport);
		
		ATTENDENCE = new JPanel();
		layeredPane_1.add(ATTENDENCE, "name_1897367502278");
		ATTENDENCE.setLayout(null);
		
		NOTICE = new JPanel();
		layeredPane_1.add(NOTICE, "name_1900319960293");
		NOTICE.setLayout(null);
		
		PROFILE = new JPanel();
		layeredPane_1.add(PROFILE, "name_1903252893592");
		PROFILE.setLayout(null);
		
		MARKS = new JPanel();
		layeredPane_1.add(MARKS, "name_1971661824063");
		MARKS.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 51)));
		panel.setBounds(12, 13, 708, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(HOME);
			}
		});
		btnNewButton.setFont(new Font("Berlin Sans FB", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(102, 204, 255));
		btnNewButton.setBounds(12, 13, 95, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PROFILE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(PROFILE);
			}
		});
		btnNewButton_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 13));
		btnNewButton_1.setBounds(119, 13, 97, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ATTENDENCE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(ATTENDENCE);
			}
		});
		btnNewButton_2.setBackground(new Color(102, 204, 255));
		btnNewButton_2.setFont(new Font("Berlin Sans FB", Font.BOLD, 13));
		btnNewButton_2.setBounds(228, 14, 124, 25);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MARKS");
		btnNewButton_3.setBackground(new Color(102, 204, 255));
		btnNewButton_3.setFont(new Font("Berlin Sans FB", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(MARKS);
			}
		});
		btnNewButton_3.setBounds(366, 14, 97, 25);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("NOTICE");
		btnNewButton_4.setBackground(new Color(102, 204, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchpanels(NOTICE);
			}
		});
		btnNewButton_4.setFont(new Font("Berlin Sans FB", Font.BOLD, 15));
		btnNewButton_4.setBounds(475, 13, 97, 25);
		panel.add(btnNewButton_4);
		
		JLabel label = new JLabel("|");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(107, 13, 20, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("|");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(217, 13, 20, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("|");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(356, 13, 20, 25);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("|");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(465, 13, 20, 25);
		panel.add(label_3);
		
		JButton btnLogout = new JButton("");
		btnLogout.setBackground(new Color(0, 255, 255));
		btnLogout.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\projects\\globsyn-project-java-\\Student Attendence\\Student_monitering_system\\images\\logout-icon (1).png"));
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogout.setBounds(626, 13, 70, 25);
		panel.add(btnLogout);
	}
}
