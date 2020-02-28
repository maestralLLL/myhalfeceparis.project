package com.myhalf;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ChangetheProfil{

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	/**
	 * Create the application.
	 */
	public ChangetheProfil() {
		initialize();
	}

	/**
	 * Initializne the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblProfil = new JLabel("Profil");
		lblProfil.setBounds(190, 49, 84, 42);
		lblProfil.setForeground(Color.WHITE);
		lblProfil.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 26));
		frame.getContentPane().add(lblProfil);
		
		textField = new JTextField();
		textField.setBounds(99, 116, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(299, 116, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(299, 145, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(38, 119, 51, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("First name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(238, 119, 51, 13);
		frame.getContentPane().add(lblName);
		
		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setForeground(Color.WHITE);
		lblNickname.setBounds(243, 148, 46, 13);
		frame.getContentPane().add(lblNickname);
		
		textField_3 = new JTextField();
		textField_3.setBounds(299, 174, 96, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(99, 145, 96, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(99, 174, 96, 19);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Workspace");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(38, 177, 51, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("City\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(272, 177, 17, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(99, 203, 96, 19);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(299, 203, 96, 19);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setForeground(Color.WHITE);
		lblNumber.setBackground(Color.WHITE);
		lblNumber.setBounds(48, 148, 46, 13);
		frame.getContentPane().add(lblNumber);
		
		JLabel lblBirthsDate = new JLabel("Birth's date");
		lblBirthsDate.setForeground(Color.WHITE);
		lblBirthsDate.setBounds(38, 206, 62, 13);
		frame.getContentPane().add(lblBirthsDate);
		
		JLabel lblNewLabel_3 = new JLabel("Info...");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(261, 206, 28, 13);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
