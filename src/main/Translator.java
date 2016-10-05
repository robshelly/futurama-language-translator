package main;

import java.util.ArrayList;

public class Translator {

	// TODO Add spaces to sentences
	// Is this not done?

//	private String plaintext = "";
//	private ArrayList<Picture> ciphertext = new ArrayList<>();;
//	private ArrayList<NibblonianCharacter> ciphertext = new ArrayList<>();
//	private ArrayList<Picture> alienAlphabet = new ArrayList<>();
	private ArrayList<Character> key = new ArrayList<>();

	public static void main(String[] args) {
		Translator t = new Translator();
		
		
//		t.aVenusianCorporation();
//		StdOut.println(t.decrypt());
		
//		t.plaintext = "a venusian corporation";
//		t.ciphertext = t.encrypt();
//		for (Picture pic : t.ciphertext) {
//			if (t.alienAlphabet.indexOf(pic) == 26) {
//				StdOut.println();
//			} else {
//				StdOut.println(t.alienAlphabet.indexOf(pic));
//			}
//		}
	}

	/**
	 * Constructor for Translator
	 */
	public Translator() {
//		populateAlienAlphabet();
		populateKey();
	}

//	/**
//	 * Getter for the plaintext;
//	 * 
//	 * @return The plaintext.
//	 */
//	public String getPlaintext() {
//		return plaintext;
//	}
//	
//	/**
//	 * Setter for the plaintext.
//	 *  
//	 * @param plaintext The text to set as plaintext.
//	 */
//	public void setPlaintext(String plaintext) {
//		this.plaintext = plaintext;
//	}
//
//	/**
//	 * Getter for the ciphertext.
//	 * 
//	 * @return The ciphertext text in the form an ArrayList of
//	 * images of Nibblonian characters.
//	 */
//	public ArrayList<NibblonianCharacter> getCiphertext() {
//		return ciphertext;
//	}
//	
//	/**
//	 * Setter for the ciphertext.
//	 * 
//	 * @param ciphertext An ArrayList of Pictures of Nibblonian
//	 * characters to be set as the ciphertext.
//	 */
//	public void setCiphertext(ArrayList<NibblonianCharacter> ciphertext) {
//		this.ciphertext = ciphertext;
//	}
//	
//	/**
//	 * Adds a character to the ciphertext.
//	 * 
//	 * @param nibblonianCharacter An Picture of the character to add.
//	 */
//	public void addToCiphertext(NibblonianCharacter niblonianCharacter) {
//		ciphertext.add(niblonianCharacter);
//	}
	
	/**
	 * Translates English into alien language.
	 * 
	 * @return The encrypted text in the form an ArrayList of
	 * images of Nibblonian characters.
	 */
	private ArrayList<NibblonianCharacter> encrypt(String plaintext) {
		ArrayList<NibblonianCharacter> encryptedText = new ArrayList<>();

		plaintext.trim();
		plaintext.toLowerCase();

		// First character is simple substitution
//		encryptedText.add(alienAlphabet.get(key.indexOf(plaintext.charAt(0))));
		encryptedText.add(NibblonianAlphabet.alphabet[key.indexOf(plaintext.charAt(0))]);

		// Subsequent characters use autokey encryption
		for (int i = 1; i < plaintext.length(); i++) {

			// Add spaces directly
			// Do not use encryption operation
//			if (Character.isWhitespace(plaintext.charAt(i))) {
//				encryptedText.add(alienAlphabet.get(26));
			if (Character.isWhitespace(plaintext.charAt(i))) {
				encryptedText.add(NibblonianAlphabet.alphabet[26]);
			} else {

				// x = numerical value of current English character
				int x = key.indexOf(plaintext.charAt(i));

				// a = numerical value of previous Nibblonian character
				int a;

				// Use loop to account for user inserting more than one space
				int j = i - 1;
				do {
//					a = alienAlphabet.indexOf(encryptedText.get(j));
					a = encryptedText.get(j).getNumericalValue();
					j--;
				} while (a == 26);

				// b = numerical value of current Nibblonian character
				int b = x + a;
				if (b >= 26)
					b -= 26;
//				encryptedText.add(alienAlphabet.get(b));
				encryptedText.add(NibblonianAlphabet.alphabet[b]);
			}
		}
		return encryptedText;
	}

	/**
	 * Translates the alien language to English
	 * 
	 * @return The decrypted alien language
	 */
	public String decrypt(ArrayList<NibblonianCharacter> ciphertext) {

		String decryptedText = "";

		if (ciphertext.size() > 0) {

			// First letter of plain text
			// Simple substitution
//			decryptedText += key.get(alienAlphabet.indexOf(ciphertext.get(0)));
			decryptedText += key.get(ciphertext.get(0).getNumericalValue());

			// Subsequent letters
			// Follow decryption method
			for (int i = 1; i < ciphertext.size(); i++) {

				// Space character is translated directly
				// Not using decryption operation
//				if (alienAlphabet.indexOf(ciphertext.get(i)) == 26) {
				if (ciphertext.get(i).getNumericalValue() == 26) {
					decryptedText += key.get(26);
				} else {

					// a = numerical value of current character
//					int a = alienAlphabet.indexOf(ciphertext.get(i));
					int a = ciphertext.get(i).getNumericalValue();
					// b = numerical value of previous character
					int b;

					// Ignore spaces when getting value of b
					// i.e. use character preceding space to decrypt
					// character succeeding space.
					// Use loop to account for user incorrectly
					// entering multiple spaces
					int j = i;
					do {
//						b = alienAlphabet.indexOf(ciphertext.get(j - 1));
						b = ciphertext.get(j - 1).getNumericalValue();
						j--;
					} while (b == 26);

					// n = english alphabet numerical value of current character
					int n = a - b;
					if (n < 0)
						n += 26;
					if (n == 26)
						n = 0;
					decryptedText += key.get(n);
				}
			}
			return decryptedText;
		} else {
			return "";
		}
	}

	/**
	 * Populates an ArrayList containing an image of each symbol in the alien
	 * language. Each symbol is stored at the index corresponding to it's
	 * numerical value used for encryption/decryption
	 * Space character is at index 26.
	 */
//	private void populateAlienAlphabet() {
//		alienAlphabet.add(new Picture("img/0.jpg"));
//		alienAlphabet.add(new Picture("img/1.jpg"));
//		alienAlphabet.add(new Picture("img/2.jpg"));
//		alienAlphabet.add(new Picture("img/3.jpg"));
//		alienAlphabet.add(new Picture("img/4.jpg"));
//		alienAlphabet.add(new Picture("img/5.jpg"));
//		alienAlphabet.add(new Picture("img/6.jpg"));
//		alienAlphabet.add(new Picture("img/7.jpg"));
//		alienAlphabet.add(new Picture("img/8.jpg"));
//		alienAlphabet.add(new Picture("img/9.jpg"));
//		alienAlphabet.add(new Picture("img/10.jpg"));
//		alienAlphabet.add(new Picture("img/11.jpg"));
//		alienAlphabet.add(new Picture("img/12.jpg"));
//		alienAlphabet.add(new Picture("img/13.jpg"));
//		alienAlphabet.add(new Picture("img/14.jpg"));
//		alienAlphabet.add(new Picture("img/15.jpg"));
//		alienAlphabet.add(new Picture("img/16.jpg"));
//		alienAlphabet.add(new Picture("img/17.jpg"));
//		alienAlphabet.add(new Picture("img/18.jpg"));
//		alienAlphabet.add(new Picture("img/19.jpg"));
//		alienAlphabet.add(new Picture("img/20.jpg"));
//		alienAlphabet.add(new Picture("img/21.jpg"));
//		alienAlphabet.add(new Picture("img/22.jpg"));
//		alienAlphabet.add(new Picture("img/23.jpg"));
//		alienAlphabet.add(new Picture("img/24.jpg"));
//		alienAlphabet.add(new Picture("img/25.jpg"));
//		alienAlphabet.add(new Picture("img/space.jpg"));
//	}

	/**
	 * Populates an ArrayList containing the English alphabet. Each letter is
	 * stored at the index corresponding to it's numerical value used for
	 * encryption/decryption. i.e. a = 0, b = 1, c = 2, ... , z = 25. Space
	 * character is at index 26.
	 */
	private void populateKey() {
		key.add('a');
		key.add('b');
		key.add('c');
		key.add('d');
		key.add('e');
		key.add('f');
		key.add('g');
		key.add('h');
		key.add('i');
		key.add('j');
		key.add('k');
		key.add('l');
		key.add('m');
		key.add('n');
		key.add('o');
		key.add('p');
		key.add('q');
		key.add('r');
		key.add('s');
		key.add('t');
		key.add('u');
		key.add('v');
		key.add('w');
		key.add('x');
		key.add('y');
		key.add('z');
		key.add(' ');
	}

	/**
	 * Inserts "A Venusian Corporation" in Nibblonian into the ciphertext field.
	 */
	public void aVenusianCorporation() {
		
//		ciphertext.add(NibblonianAlphabet.alphabet[0]);
//		
//		ciphertext.add(NibblonianAlphabet.alphabet[26]);
//		
//		ciphertext.add(NibblonianAlphabet.alphabet[21]);
//		ciphertext.add(NibblonianAlphabet.alphabet[25]);
//		ciphertext.add(NibblonianAlphabet.alphabet[12]);
//		ciphertext.add(NibblonianAlphabet.alphabet[6]);
//		ciphertext.add(NibblonianAlphabet.alphabet[24]);
//		ciphertext.add(NibblonianAlphabet.alphabet[6]);
//		ciphertext.add(NibblonianAlphabet.alphabet[6]);
//		ciphertext.add(NibblonianAlphabet.alphabet[19]);
//
//		ciphertext.add(NibblonianAlphabet.alphabet[26]);
//		
//		ciphertext.add(NibblonianAlphabet.alphabet[21]);
//		ciphertext.add(NibblonianAlphabet.alphabet[9]);
//		ciphertext.add(NibblonianAlphabet.alphabet[0]);
//		ciphertext.add(NibblonianAlphabet.alphabet[15]);
//		ciphertext.add(NibblonianAlphabet.alphabet[3]);
//		ciphertext.add(NibblonianAlphabet.alphabet[20]);
//		ciphertext.add(NibblonianAlphabet.alphabet[20]);
//		ciphertext.add(NibblonianAlphabet.alphabet[13]);
//		ciphertext.add(NibblonianAlphabet.alphabet[21]);
//		ciphertext.add(NibblonianAlphabet.alphabet[9]);
//		ciphertext.add(NibblonianAlphabet.alphabet[22]);
		
		
//		ciphertext.add(new ImageIcon("img/0.jpg", "0"));
//
//		ciphertext.add(new ImageIcon("img/space.jpg", "space"));
//
//		ciphertext.add(new ImageIcon("img/21.jpg", "21"));
//		ciphertext.add(new ImageIcon("img/25.jpg", "25"));
//		ciphertext.add(new ImageIcon("img/12.jpg", "12"));
//		ciphertext.add(new ImageIcon("img/6.jpg", "6"));
//		ciphertext.add(new ImageIcon("img/24.jpg", "24"));
//		ciphertext.add(new ImageIcon("img/6.jpg", "6"));
//		ciphertext.add(new ImageIcon("img/6.jpg", "6"));
//		ciphertext.add(new ImageIcon("img/19.jpg", "19"));
//
//		ciphertext.add(new ImageIcon("img/space.jpg", "space"));
//
//		ciphertext.add(new ImageIcon("img/21.jpg", "21"));
//		ciphertext.add(new ImageIcon("img/9.jpg", "9"));
//		ciphertext.add(new ImageIcon("img/0.jpg", "0"));
//		ciphertext.add(new ImageIcon("img/15.jpg", "15"));
//		ciphertext.add(new ImageIcon("img/3.jpg", "3"));
//		ciphertext.add(new ImageIcon("img/20.jpg", "20"));
//		ciphertext.add(new ImageIcon("img/20.jpg", "20"));
//		ciphertext.add(new ImageIcon("img/13.jpg", "13"));
//		ciphertext.add(new ImageIcon("img/21.jpg", "21"));
//		ciphertext.add(new ImageIcon("img/9.jpg", "9"));
//		ciphertext.add(new ImageIcon("img/22.jpg", "22"));
		
		
//		ciphertext.add(NibblonianAlphabet.getCharacter(0));
//		
//		ciphertext.add(NibblonianAlphabet.getCharacter(26));
//		
//		ciphertext.add(NibblonianAlphabet.getCharacter(21));
//		ciphertext.add(NibblonianAlphabet.getCharacter(25));
//		ciphertext.add(NibblonianAlphabet.getCharacter(12));
//		ciphertext.add(NibblonianAlphabet.getCharacter(6));
//		ciphertext.add(NibblonianAlphabet.getCharacter(24));
//		ciphertext.add(NibblonianAlphabet.getCharacter(6));
//		ciphertext.add(NibblonianAlphabet.getCharacter(6));
//		ciphertext.add(NibblonianAlphabet.getCharacter(19));
//
//		ciphertext.add(NibblonianAlphabet.getCharacter(26));
//
//		ciphertext.add(NibblonianAlphabet.getCharacter(21));
//		ciphertext.add(NibblonianAlphabet.getCharacter(9));
//		ciphertext.add(NibblonianAlphabet.getCharacter(0));
//		ciphertext.add(NibblonianAlphabet.getCharacter(15));
//		ciphertext.add(NibblonianAlphabet.getCharacter(3));
//		ciphertext.add(NibblonianAlphabet.getCharacter(20));
//		ciphertext.add(NibblonianAlphabet.getCharacter(20));
//		ciphertext.add(NibblonianAlphabet.getCharacter(13));
//		ciphertext.add(NibblonianAlphabet.getCharacter(21));
//		ciphertext.add(NibblonianAlphabet.getCharacter(9));
//		ciphertext.add(NibblonianAlphabet.getCharacter(22));
		
	}

//	/**
//	 * Inserts "Codebreakers Chat Room" in Nibblonian into the ciphertext field.
//	 */
//	public void codebreakersChatRoom() {
//		ciphertext.add(new Picture("img/2.jpg"));
//		ciphertext.add(new Picture("img/16.jpg"));
//		ciphertext.add(new Picture("img/19.jpg"));
//		ciphertext.add(new Picture("img/23.jpg"));
//		ciphertext.add(new Picture("img/24.jpg"));
//		ciphertext.add(new Picture("img/15.jpg"));
//		ciphertext.add(new Picture("img/19.jpg"));
//		ciphertext.add(new Picture("img/19.jpg"));
//		ciphertext.add(new Picture("img/3.jpg"));
//		ciphertext.add(new Picture("img/7.jpg"));
//		ciphertext.add(new Picture("img/24.jpg"));
//		ciphertext.add(new Picture("img/16.jpg"));
//
//		ciphertext.add(new Picture("img/space.jpg"));
//
//		ciphertext.add(new Picture("img/18.jpg"));
//		ciphertext.add(new Picture("img/25.jpg"));
//		ciphertext.add(new Picture("img/25.jpg"));
//		ciphertext.add(new Picture("img/18.jpg"));
//
//		ciphertext.add(new Picture("img/space.jpg"));
//
//		ciphertext.add(new Picture("img/9.jpg"));
//		ciphertext.add(new Picture("img/23.jpg"));
//		ciphertext.add(new Picture("img/11.jpg"));
//		ciphertext.add(new Picture("img/23.jpg"));
//	}
//
//	/**
//	 * Translating Incorrectly
//	 */
//	public void yummyTummy() {
//		ciphertext.add(new Picture("img/24.jpg"));
//		ciphertext.add(new Picture("img/18.jpg"));
//		ciphertext.add(new Picture("img/4.jpg"));
//		ciphertext.add(new Picture("img/16.jpg"));
//		ciphertext.add(new Picture("img/14.jpg"));
//
//		ciphertext.add(new Picture("img/space.jpg"));
//
//		ciphertext.add(new Picture("img/19.jpg"));
//		ciphertext.add(new Picture("img/13.jpg"));
//		ciphertext.add(new Picture("img/25.jpg"));
//		ciphertext.add(new Picture("img/11.jpg"));
//		ciphertext.add(new Picture("img/9.jpg"));
//	}
//
//	/**
//	 * Iron Cook
//	 */
//	public void ironCook() {
//
//		ciphertext.add(new Picture("img/8.jpg"));
//		ciphertext.add(new Picture("img/25.jpg"));
//		ciphertext.add(new Picture("img/13.jpg"));
//		ciphertext.add(new Picture("img/0.jpg"));
//
//		ciphertext.add(new Picture("img/space.jpg"));
//
//		ciphertext.add(new Picture("img/2.jpg"));
//		ciphertext.add(new Picture("img/16.jpg"));
//		ciphertext.add(new Picture("img/4.jpg"));
//		ciphertext.add(new Picture("img/14.jpg"));
//	}

}
