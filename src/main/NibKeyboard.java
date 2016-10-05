package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Rob Shelly
 * 
 * Panel that acts as a keyboard for typing
 * Niblonian characters.
 *
 */
@SuppressWarnings("serial")
public class NibKeyboard extends JPanel {
	
	private ActionListener actionListener;
	

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public NibKeyboard(ActionListener actionListener) {
		
		this.actionListener = actionListener;
		setBackground(Color.BLACK);
		
		addButton(this, NibblonianAlphabet.alphabet[0].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[0].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[1].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[1].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[2].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[2].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[3].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[3].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[4].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[4].getNumericalValue()));
		
		addButton(this, NibblonianAlphabet.alphabet[5].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[5].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[6].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[6].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[7].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[7].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[8].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[8].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[9].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[9].getNumericalValue()));
		
		addButton(this, NibblonianAlphabet.alphabet[10].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[10].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[11].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[11].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[12].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[12].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[13].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[13].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[14].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[14].getNumericalValue()));
		
		addButton(this, NibblonianAlphabet.alphabet[15].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[15].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[16].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[16].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[17].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[17].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[18].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[18].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[19].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[19].getNumericalValue()));
		
		addButton(this, NibblonianAlphabet.alphabet[20].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[20].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[21].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[21].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[22].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[22].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[23].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[23].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[24].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[24].getNumericalValue()));
		
		addButton(this, NibblonianAlphabet.alphabet[25].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[25].getNumericalValue()));
		addButton(this, NibblonianAlphabet.alphabet[26].getCharacterImage(), Integer.toString(NibblonianAlphabet.alphabet[26].getNumericalValue()));

		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setPreferredSize(new Dimension(300, 360));

	}
	
	/**
	 * Adds a button to a container.
	 * @throws IOException 
	 */
	private void addButton(Container panel, ImageIcon image, String actionCommand)
	{
		JButton button = new JButton(image);
		button.setActionCommand(actionCommand);
		button.addActionListener(actionListener);
		button.setBorder(BorderFactory.createEmptyBorder());
//		button.setPreferredSize(new Dimension(60, 0));
		panel.add(button);

	}
}
