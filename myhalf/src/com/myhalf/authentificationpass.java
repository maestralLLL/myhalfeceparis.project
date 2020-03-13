package com.myhalf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;

import com.myhalf.xmlprocessing.*;

public class authentificationpass {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtEnterHere;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					authentificationpass window = new authentificationpass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public authentificationpass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setText("Enter here");
		txtUsername.setBounds(462, 163, 96, 19);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtEnterHere = new JTextField();
		txtEnterHere.setText("Enter here");
		txtEnterHere.setBounds(462, 217, 96, 19);
		frame.getContentPane().add(txtEnterHere);
		txtEnterHere.setColumns(10);
		
		JLabel lblUserneame = new JLabel("username :");
		lblUserneame.setBounds(353, 157, 96, 33);
		frame.getContentPane().add(lblUserneame);
		
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setBounds(353, 221, 56, 13);
		frame.getContentPane().add(lblPassword);
		
		JButton btnWelcome = new JButton("WELCOME");
		btnWelcome.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		btnWelcome.setBounds(455, 304, 85, 21);
		frame.getContentPane().add(btnWelcome);
		
		JLabel lblWelcomeTouYour = new JLabel("Welcome to your");
		lblWelcomeTouYour.setForeground(Color.WHITE);
		lblWelcomeTouYour.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblWelcomeTouYour.setBounds(370, 107, 145, 19);
		frame.getContentPane().add(lblWelcomeTouYour);
		
		JLabel lblNewLabel = new JLabel("HALF");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(512, 107, 56, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("!");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setForeground(Color.WHITE);
		label.setBounds(560, 110, 20, 13);
		frame.getContentPane().add(label);
		
		JLabel lblHalf = new JLabel("HALF");
		lblHalf.setBounds(372, 30, 168, 50);
		frame.getContentPane().add(lblHalf);
		lblHalf.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 39));
		lblHalf.setForeground(new Color(255, 255, 255));
		lblHalf.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(15, 0, 237, 382);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 634, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnWelcome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				@SuppressWarnings("deprecation")
				String psw = txtEnterHere.getText();
				if(XMLProcessingSession.verifUserInXmlFile(username,psw)) {
					try {	
						frame.dispose();
						gui window = new gui();
						window.getFrame().setVisible(true);
					} catch (Exception exp) {
						exp.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Connection error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
	}
}
