package main;

import java.util.ArrayList;

public class NibblonianTranslator {
	
	/* The key is an ArrayList containing the English alphabet. Each letter is
	 * stored at the index corresponding to it's numerical value used for
	 * encryption/decryption. i.e. a = 0, b = 1, c = 2, ... , z = 25. Space
	 * character is at index 26.
	*/ 
	 @SuppressWarnings("serial")
	private static ArrayList<Character> key = new ArrayList<Character> () {
			{
				 add('a');
				 add('b');
				 add('c');
				 add('d');
				 add('e');
				 add('f');
				 add('g');
				 add('h');
				 add('i');
				 add('j');
				 add('k');
				 add('l');
				 add('m');
				 add('n');
				 add('o');
				 add('p');
				 add('q');
				 add('r');
				 add('s');
				 add('t');
				 add('u');
				 add('v');
				 add('w');
				 add('x');
				 add('y');
				 add('z');
				 add(' ');
			 }
	 };
	 
	 /**
		 * Translates English into Nibblonian.
		 * 
		 * @return The encrypted text in the form an ArrayList of
		 * images of Nibblonian characters.
		 */
		public static ArrayList<NibblonianCharacter> encrypt(String plaintext) {
			ArrayList<NibblonianCharacter> encryptedText = new ArrayList<>();

			plaintext.trim();
			plaintext.toLowerCase();

			// First character is simple substitution
//			encryptedText.add(alienAlphabet.get(key.indexOf(plaintext.charAt(0))));
			encryptedText.add(NibblonianAlphabet.alphabet[key.indexOf(plaintext.charAt(0))]);

			// Subsequent characters use autokey encryption
			for (int i = 1; i < plaintext.length(); i++) {

				// Add spaces directly
				// Do not use encryption operation
//				if (Character.isWhitespace(plaintext.charAt(i))) {
//					encryptedText.add(alienAlphabet.get(26));
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
//						a = alienAlphabet.indexOf(encryptedText.get(j));
						a = encryptedText.get(j).getNumericalValue();
						j--;
					} while (a == 26);

					// b = numerical value of current Nibblonian character
					int b = x + a;
					if (b >= 26)
						b -= 26;
//					encryptedText.add(alienAlphabet.get(b));
					encryptedText.add(NibblonianAlphabet.alphabet[b]);
				}
			}
			return encryptedText;
		}
		
		/**
		 * Translates Nibblonian to English.
		 * 
		 * @return A String container the English translation.
		 */
		public static String decrypt(ArrayList<NibblonianCharacter> ciphertext) {

			String decryptedText = "";

			if (ciphertext.size() > 0) {

				// First letter of plain text
				// Simple substitution
//				decryptedText += key.get(alienAlphabet.indexOf(ciphertext.get(0)));
				decryptedText += key.get(ciphertext.get(0).getNumericalValue());

				// Subsequent letters
				// Follow decryption method
				for (int i = 1; i < ciphertext.size(); i++) {

					// Space character is translated directly
					// Not using decryption operation
//					if (alienAlphabet.indexOf(ciphertext.get(i)) == 26) {
					if (ciphertext.get(i).getNumericalValue() == 26) {
						decryptedText += key.get(26);
					} else {

						// a = numerical value of current character
//						int a = alienAlphabet.indexOf(ciphertext.get(i));
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
//							b = alienAlphabet.indexOf(ciphertext.get(j - 1));
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
	 
	 
}
