package main;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.BorderLayout;
import edu.princeton.cs.introcs.StdOut;

@SuppressWarnings("serial")
public class EngToNibPanel extends JPanel {
	
	private JTextArea english;
	private NibTextPanel nibblonian;

	/**
	 * Create the panel.
	 */
	public EngToNibPanel() {
		
		setLayout(new BorderLayout());
		setBackground(Color.BLACK);
		
		english = new JTextArea();
		english.setText("Enter English");
		add(english, BorderLayout.NORTH);
		english.setColumns(10);
		
//		JLabel nibblerImage = new JLabel(new ImageIcon("img/nibbler.png"));
//		add(nibblerImage, BorderLayout.WEST);
		
		
		nibblonian = new NibTextPanel();
		add(nibblonian, BorderLayout.EAST);

	}
	
	
	
	/**
	 * Translates the English into Nibblonian.
	 * Sets the display to the translation.
	 */
	public void translate() {
		StdOut.println(NibblonianTranslator.encrypt(english.getText()).size());
		nibblonian.setNibblonianText(NibblonianTranslator.encrypt(english.getText()));
//		nibblonian.setNibblonianText(
//				new ArrayList<NibblonianCharacter>() {{add(NibblonianAlphabet.alphabet[0]);}});
	}

}
