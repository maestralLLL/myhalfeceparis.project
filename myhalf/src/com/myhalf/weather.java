package com.myhalf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class weather {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weather window = new weather();
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
	public weather() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 436, 263);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWeather = new JLabel("Weather");
		lblWeather.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 26));
		lblWeather.setForeground(Color.WHITE);
		lblWeather.setBounds(161, 27, 106, 42);
		panel.add(lblWeather);
		
		JLabel lblNewLabel = new JLabel("Paris");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 159, 35, 13);
		panel.add(lblNewLabel);
		
		JLabel lblLondon = new JLabel("London");
		lblLondon.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblLondon.setForeground(Color.WHITE);
		lblLondon.setBounds(10, 198, 63, 13);
		panel.add(lblLondon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(73, 146, 46, 42);
		panel.add(panel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(73, 198, 46, 42);
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(149, 201, -20, 10);
		panel.add(panel_6);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		lblMonday.setForeground(Color.WHITE);
		lblMonday.setBounds(73, 120, 46, 13);
		panel.add(lblMonday);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(139, 146, 46, 42);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(205, 146, 46, 42);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(275, 146, 46, 42);
		panel.add(panel_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(139, 198, 46, 42);
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(205, 198, 46, 42);
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(275, 198, 46, 42);
		panel.add(panel_9);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setForeground(Color.WHITE);
		lblTuesday.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		lblTuesday.setBounds(139, 120, 46, 13);
		panel.add(lblTuesday);
		
		JLabel lblWensday = new JLabel("Wednesday");
		lblWensday.setForeground(Color.WHITE);
		lblWensday.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		lblWensday.setBounds(195, 120, 62, 13);
		panel.add(lblWensday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setForeground(Color.WHITE);
		lblThursday.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		lblThursday.setBounds(275, 120, 46, 13);
		panel.add(lblThursday);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(341, 146, 46, 42);
		panel.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(341, 198, 46, 42);
		panel.add(panel_11);
		
		JLabel lblFriday = new JLabel("Friday\r\n");
		lblFriday.setForeground(Color.WHITE);
		lblFriday.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		lblFriday.setBounds(341, 120, 35, 13);
		panel.add(lblFriday);
	}
}
