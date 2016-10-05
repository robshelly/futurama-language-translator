package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JPanel inputPanel;

	// Used to indicate the current mode the translator is in
	// True for English to Nibblonian, false for Nibblonian to English
	private static boolean engToNib;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
		engToNib = true;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel titlePanel = new TitlePanel(this);
		frame.getContentPane().add(titlePanel, BorderLayout.NORTH);
		
		JButton btnTranslate = new JButton("Translate");
		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				translate();
			}
		});
		titlePanel.add(btnTranslate);		
	}
	
	public void showEngToNibPanel() {
		if (inputPanel != null)
			frame.remove(inputPanel);
		engToNib = true;
		inputPanel = new EngToNibPanel();
		inputPanel.validate();
		inputPanel.repaint();
		frame.getContentPane().add(inputPanel, BorderLayout.SOUTH);
		frame.validate();
		frame.repaint();
		frame.pack();
	}
	
	public void showNibToEngPanel() {
		if (inputPanel != null)
			frame.remove(inputPanel);
		engToNib = false;
		inputPanel = new NibToEngPanel();
		inputPanel.validate();
		inputPanel.repaint();
		frame.getContentPane().add(inputPanel, BorderLayout.SOUTH);
		frame.validate();
		frame.repaint();
		frame.pack();
	}
	
	private void translate() {
		if (engToNib) ((EngToNibPanel) inputPanel).translate();
		else ((NibToEngPanel) inputPanel).translate();
	}
	
	

}
