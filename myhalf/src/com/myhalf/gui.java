package com.myhalf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui
{
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
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
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 780, 456);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnDressing = new JButton("DRESSING");
		btnDressing.setForeground(SystemColor.controlDkShadow);
		btnDressing.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnDressing.setBounds(327, 311, 439, 32);
		panel.add(btnDressing);
		
		JButton btnTendances = new JButton("TENDANCES");
		btnTendances.setForeground(SystemColor.controlDkShadow);
		btnTendances.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnTendances.setBounds(327, 362, 439, 32);
		panel.add(btnTendances);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(0, 0, 159, 419);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Username\r\n");
		lblName.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 19));
		lblName.setForeground(SystemColor.textHighlightText);
		lblName.setBounds(38, 127, 87, 17);
		panel_1.add(lblName);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(38, 355, 85, 21);
		panel_1.add(btnSettings);
		
		JLabel lblPhoto = new JLabel("Profil's");
		lblPhoto.setBounds(50, 66, 56, 17);
		panel_1.add(lblPhoto);
		
		JLabel lblNewLabel = new JLabel("picture");
		lblNewLabel.setBounds(50, 81, 46, 13);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.PINK);
		panel_2.setBackground(SystemColor.desktop);
		panel_2.setBounds(159, 0, 607, 419);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMyHalf = new JLabel("HALF");
		lblMyHalf.setBounds(241, 66, 165, 62);
		panel_2.add(lblMyHalf);
		lblMyHalf.setForeground(Color.WHITE);
		lblMyHalf.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 51));
		
		JButton btnCalendrier = new JButton("CALENDRIER");
		btnCalendrier.setForeground(SystemColor.controlDkShadow);
		btnCalendrier.setBounds(169, 259, 438, 32);
		panel_2.add(btnCalendrier);
		btnCalendrier.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		
		JButton btnProfil = new JButton("PROFIL");
		btnProfil.setForeground(SystemColor.controlDkShadow);
		btnProfil.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnProfil.setBounds(169, 203, 438, 32);
		panel_2.add(btnProfil);
		
		btnProfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					ChangetheProfil wind = new ChangetheProfil();
					wind.frame.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		
		JButton btnMeteo = new JButton("METEO");
		btnMeteo.setBackground(Color.RED);
		btnMeteo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					weather wind = new weather();
					wind.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnMeteo.setForeground(SystemColor.controlDkShadow);
		btnMeteo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnMeteo.setBounds(169, 150, 438, 32);
		panel_2.add(btnMeteo);
		
	}
}
