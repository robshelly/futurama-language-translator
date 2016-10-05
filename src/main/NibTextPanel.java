package main;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.princeton.cs.introcs.StdOut;

/**
 * @author Rob Shelly
 * 
 *  Panel to display characters of the Niblonian language.
 *
 */
@SuppressWarnings("serial")
public class NibTextPanel extends JPanel {
		
	private JLabel[][] labelHolder;
	private int rows;
	private int cols;
	private int currentCharRow;
	private int currentCharCol;

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public NibTextPanel() {
		
		currentCharRow = 0;
		currentCharCol = 0;
		
		rows = 5;
		cols = 15;
		labelHolder = new JLabel[rows][cols];
		
		setLayout(new GridLayout(rows, cols));
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				labelHolder[r][c] = new JLabel();
				labelHolder[r][c].setSize(20, 20);
				labelHolder[r][c].setIcon(NibblonianAlphabet.alphabet[26].getCharacter());
				add(labelHolder[r][c]);
			}
		}
	}
	
	
	/**
	 * Sets the text in the display.
	 * 
	 * @param nibblonian An ArrayList of Nibblonian characters.
	 */
	public void setNibblonianText(ArrayList<NibblonianCharacter> nibblonian) {
		
		for (NibblonianCharacter character: nibblonian) {
			addToNiblonianText(character.getNumericalValue());
		}
	}
	
	/**
	 * Adds a Nibblonian character to text display panel.
	 * 
	 * @param numericalValue The numerical value of the Nibblonian Character.
	 */
	public void addToNiblonianText(int numericalValue) {
		
		// If not at end of row
		// just add character
		if (currentCharCol < cols) {
			insertNibblonianChar(numericalValue);
			
		// If at end of row and last character was space
		// Move to next row and add character.
		} else if (  ((ImageIcon) labelHolder[currentCharRow][currentCharCol - 1].
				getIcon()).getDescription().equals("space")) {
			
			currentCharRow++;
			currentCharCol = 0;

			insertNibblonianChar(numericalValue);
			
		// If at the end of row and next character is space
	  // Move to next row but don't insert space character
		} else if (numericalValue == 26 ){
			currentCharRow++;
			currentCharCol = 0;
			
			
		// Else must implement word wrap
		} else {
			
			//TODO Not working
			StdOut.println("Word wrap!");
			
		// Backtrack through characters until start of word
			int wordStartCol = 15;
			while ( !(((ImageIcon) labelHolder[currentCharRow][wordStartCol - 1].
				getIcon()).getDescription().equals("space"))) {
				
				wordStartCol--;
			}
			
			StdOut.println("Word Starts at:\t" + wordStartCol);
			
			// Move all characters from end of line to next line
			
			currentCharCol = 0;
			currentCharRow++;
			while (wordStartCol < 15) {
				labelHolder[currentCharRow][currentCharCol].setIcon(
						labelHolder[currentCharRow - 1][wordStartCol].getIcon());
				
				labelHolder[currentCharRow - 1][wordStartCol].setIcon(
						NibblonianAlphabet.alphabet[26].getCharacter());
				
				wordStartCol++;
				currentCharCol++;
			}
			
			// Insert latest typed character.
			insertNibblonianChar(numericalValue);
			
		}		
	}
	
//	/**
//	 * Returns an image icon.
//	 * 
//	 * @param imageName The name of the image to be returned as ImageIcon.
//	 * @return An ImageIcon of the specified image.
//	 * @throws IOException
//	 */
//	private Icon getImageIcon(String imageKey) throws IOException {
//		
//		if (imageKey.equals(space))
//			return new ImageIcon(imageKey, "space");
//		else
//			return new ImageIcon(imageKey);
//	}
	
	/**
	 * Adds a Nibblonian character to the text display.
	 * 
	 * @param numericalValue The numerical value of the Nibblonian Character.
	 */
	private void insertNibblonianChar(int numericalValue) {
//		labelHolder[currentCharRow][currentCharCol].setIcon(
//				getImageIcon("img/" + imageKey + "small.jpg"));
		labelHolder[currentCharRow][currentCharCol].setIcon(
				NibblonianAlphabet.alphabet[numericalValue].getCharacter());
		currentCharCol++;
	}

}
