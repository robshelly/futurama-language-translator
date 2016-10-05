package main;

import java.util.Objects;

import javax.swing.ImageIcon;

/**
 * @author Rob Shelly
 * 
 * Class for a characters in the Nibblonian Alphabet.
 * Contains the following:
 * An ImageIcon of the text representation of the character
 * for use when displaying strings of text in Nibblonian.
 * An ImageIcon of a larger image of the character
 * for use depicting a keypad for input of Nibblonian.
 * The numerical representation of the character use to
 * convert from English to Nibblonian and vice versa.
 * Space character can be given a numerical value of 26.
 *
 */
public class NibblonianCharacter {
	
	private ImageIcon text;
	private ImageIcon image;
	private int numericalValue;
	
	/**
	 * Constructor for Nibblonian Character.
	 * 
	 * @param text An image icon of the text representation of the character.
	 * @param image An image icon of a larger image of the character.
	 * @param numericalValue The numerical value of the character.
	 */
	public NibblonianCharacter(ImageIcon text, ImageIcon image, int numericalValue) {
		this.text = text;
		this.image = image;
		this.numericalValue = numericalValue;
	}
	
	/**
	 * Getter for the characters text image.
	 * 
	 * @return
	 */
	public ImageIcon getCharacter() {
		return text;
	}
	
	/**
	 * Getter for the characters image.
	 * 
	 * @return An image icon of the character.
	 */
	public ImageIcon getCharacterImage() {
		return image;
	}
	
	/**
	 * Getter for numerical value
	 * 
	 * @return The numerical value of the character.
	 */
	public int getNumericalValue() {
		return numericalValue;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (!(other instanceof NibblonianCharacter)) 
			return false;
		return (this.numericalValue == ((NibblonianCharacter) other).getNumericalValue());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this.getNumericalValue());
	}
	

}
