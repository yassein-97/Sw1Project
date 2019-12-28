package GUI;import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Gui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 417);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 315, 462);
		contentPane.add(panel);
		panel.setLayout(null);
										 
		JLabel lblNewLabel = new JLabel("Sociable SMApp");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 20));
		lblNewLabel.setBounds(70, 159, 177, 55);
		panel.add(lblNewLabel);
		
		JLabel lblWelcomeAt = new JLabel("Welcome at");
		lblWelcomeAt.setForeground(Color.WHITE);
		lblWelcomeAt.setBounds(94, 119, 126, 29);
		lblWelcomeAt.setFont(new Font("Snap ITC", Font.BOLD, 16));
		panel.add(lblWelcomeAt);
		
		Button button = new Button("Home Page");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow mw=new MainWindow();
				mw.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241, 57,83));
		button.setBounds(374, 208, 262, 35);
		contentPane.add(button);

		button.setForeground(Color.WHITE);

		
		Label label = new Label("Start Page");
		label.setFont(new Font("Segoe Print", Font.BOLD, 14));
		label.setBounds(459, 60, 143, 35);
		contentPane.add(label);
	}
}
