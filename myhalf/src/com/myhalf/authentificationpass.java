package com.myhalf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class authentificationpass {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtEnterHere;

	/**
	 * Launch the application.
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
		frame.getContentPane().setBackground(SystemColor.controlDkShadow);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(151, 40, 125, 62);
		frame.getContentPane().add(panel);
		
		JLabel lblHalf = new JLabel("HALF");
		panel.add(lblHalf);
		lblHalf.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 39));
		lblHalf.setForeground(new Color(255, 255, 255));
		lblHalf.setBackground(new Color(0, 0, 0));
		
		txtUsername = new JTextField();
		txtUsername.setText("Enter here");
		txtUsername.setBounds(161, 163, 96, 19);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtEnterHere = new JTextField();
		txtEnterHere.setText("Enter here");
		txtEnterHere.setBounds(161, 192, 96, 19);
		frame.getContentPane().add(txtEnterHere);
		txtEnterHere.setColumns(10);
		
		JLabel lblUserneame = new JLabel("userneame :");
		lblUserneame.setBounds(95, 166, 67, 13);
		frame.getContentPane().add(lblUserneame);
		
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setBounds(106, 195, 56, 13);
		frame.getContentPane().add(lblPassword);
		
		JButton btnWelcome = new JButton("WELCOME");
		btnWelcome.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		btnWelcome.setBounds(172, 232, 85, 21);
		frame.getContentPane().add(btnWelcome);
		
		JLabel lblWelcomeTouYour = new JLabel("Welcome to your");
		lblWelcomeTouYour.setForeground(Color.WHITE);
		lblWelcomeTouYour.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblWelcomeTouYour.setBounds(112, 125, 145, 19);
		frame.getContentPane().add(lblWelcomeTouYour);
		
		JLabel lblNewLabel = new JLabel("HALF");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(252, 125, 56, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("!");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setForeground(Color.WHITE);
		label.setBounds(307, 127, 20, 13);
		frame.getContentPane().add(label);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnWelcome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gui nc=new gui();
				
			}
		});
	}
}
