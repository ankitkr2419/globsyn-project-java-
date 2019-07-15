package pack1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dilog2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	//private int var;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dilog2 dialog = new dilog2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dilog2() {
		setBounds(100, 100, 482, 324);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNo = new JButton("NO");
		btnNo.setBounds(235, 237, 71, 27);
		contentPanel.add(btnNo);
		btnNo.setForeground(Color.MAGENTA);
		btnNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNo.setBackground(Color.CYAN);
		
		JLabel lblClickYesTo = new JLabel("Click YES to accept change");
		lblClickYesTo.setBounds(87, 197, 256, 27);
		contentPanel.add(lblClickYesTo);
		lblClickYesTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickYesTo.setForeground(new Color(0, 102, 153));
		lblClickYesTo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 16));
		
		JButton btnYes = new JButton("YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//var = 1;
			}
		});
		btnYes.setForeground(Color.MAGENTA);
		btnYes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnYes.setBackground(Color.CYAN);
		btnYes.setBounds(134, 237, 71, 27);
		contentPanel.add(btnYes);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Desktop\\projects\\globsyn-project-java-\\Student Attendence\\Student_monitering_system\\images\\ezgif.com-resize (3).gif"));
		lblNewLabel.setBounds(0, 0, 464, 277);
		contentPanel.add(lblNewLabel);
	}

}
