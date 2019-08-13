package pack1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class dilognew extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dilognew dialog = new dilognew();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dilognew() {
		setBounds(780, 300, 476, 295);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.setForeground(Color.MAGENTA);
		btnOk.setBackground(Color.CYAN);
		btnOk.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnOk.setIcon(new ImageIcon(dilognew.class.getResource("/pack1/images/Accept-icon.png")));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOk.setBounds(185, 210, 98, 25);
		contentPanel.add(btnOk);
		
		JLabel lblEnterOkIf = new JLabel("The change has been made sucessfull");
		lblEnterOkIf.setForeground(new Color(0, 153, 51));
		lblEnterOkIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterOkIf.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 16));
		lblEnterOkIf.setBounds(91, 161, 283, 36);
		contentPanel.add(lblEnterOkIf);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBackground(new Color(153, 204, 255));
			lblNewLabel.setIcon(new ImageIcon(dilognew.class.getResource("/pack1/images/ezgif.com-resize (1).gif")));
			lblNewLabel.setBounds(0, 0, 458, 248);
			contentPanel.add(lblNewLabel);
		}
	}
}
