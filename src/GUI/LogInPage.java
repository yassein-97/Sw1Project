package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import Model.User;
import Model.UserManagment;
public class LogInPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	UserManagment ua;
	static User U;
	static UserManagment ug;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage frame = new LogInPage();
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
	public LogInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,794, 417);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(5, 0,315, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sociable");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 20));
		lblNewLabel.setBounds(48, 49, 190, 45);
		panel.add(lblNewLabel);
		
		JLabel lblLogIn = new JLabel("LogIn Page");
		lblLogIn.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		lblLogIn.setForeground(Color.WHITE);
		lblLogIn.setBounds(75, 159, 131, 45);
		panel.add(lblLogIn);
		
		Button button = new Button("Log In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UN=textField.getText();
				char[]arr=passwordField.getPassword();
				String Pass="";for(int i=0;i<arr.length;i++){Pass+=arr[i];}
				U=new User();
				U.SetUserName(UN);U.SetPassword(Pass);
				ug=new UserManagment();
				boolean Succeded=U.Login(ug);
				if(!Succeded)
				{
					JOptionPane.showMessageDialog(null, "Wrong password Or E-Mail, please try again.");
				}
				else
				{

					JOptionPane.showMessageDialog(null, "LogIn Completed Successfully.");
					
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241, 57,83));
		button.setBounds(358, 249, 262, 35);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(361, 93, 259, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(361, 167, 259, 47);
		contentPane.add(passwordField);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(361, 69, 91, 21);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(361, 151, 91, 14);
		contentPane.add(lblPassword);
	}
}
