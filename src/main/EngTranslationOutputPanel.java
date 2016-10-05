package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Rob Shelly
 * Panel that displays the output of a
 * Niblonian to English translation.
 *
 */
@SuppressWarnings("serial")
public class EngTranslationOutputPanel extends JPanel {
	
	private NibTextPanel nibTextPanel;
	private JTextArea englishTranslation;

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public EngTranslationOutputPanel() {
		
		setLayout(new BorderLayout());
		setBackground(Color.BLACK);
		
		nibTextPanel = new NibTextPanel(); 
		add(nibTextPanel, BorderLayout.NORTH);
		nibTextPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
		
		JPanel translationPanel = new JPanel();
		translationPanel.setLayout(new BorderLayout());
		
		englishTranslation = new JTextArea("Translation");
		englishTranslation.setEditable(false);
		englishTranslation.setBackground(Color.BLACK);
		englishTranslation.setForeground(Color.WHITE);
		translationPanel.add(englishTranslation, BorderLayout.CENTER);
		
		JLabel fryImage = new JLabel(new ImageIcon("img/fry.png"));
		translationPanel.add(fryImage, BorderLayout.EAST);
		
		add(translationPanel, BorderLayout.SOUTH);
		
	}
	
	/**
	 * Sets the text in the English Translation field.
	 */
	public void setEnglishTranslation(String translation) {
		englishTranslation.setText(translation);
	}
	
	/**
	 * Adds a Nibblonian character to the Nibblonian
	 * text panel.
	 * 
	 * @param numericalValue The numerical value of the Nibblonian character.
	 * @throws IOException 
	 */
	public void addToNibTextPanel(int numericalValue) {
		nibTextPanel.addToNiblonianText(numericalValue);
	}

}
