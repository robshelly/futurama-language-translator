package main;

import javax.swing.ImageIcon;

public final class NibblonianAlphabet {
//
//	public static NibblonianCharacter space = new NibblonianCharacter(
//			new ImageIcon("img/spacesmall.jpg", "space"), new ImageIcon("img/space.jpg"), 26);

	public static NibblonianCharacter[] alphabet = new NibblonianCharacter[] {
			new NibblonianCharacter(new ImageIcon("img/0small.jpg"), new ImageIcon("img/0key.jpg"), 0),
			new NibblonianCharacter(new ImageIcon("img/1small.jpg"), new ImageIcon("img/1key.jpg"), 1),
			new NibblonianCharacter(new ImageIcon("img/2small.jpg"), new ImageIcon("img/2key.jpg"), 2),
			new NibblonianCharacter(new ImageIcon("img/3small.jpg"), new ImageIcon("img/3key.jpg"), 3),
			new NibblonianCharacter(new ImageIcon("img/4small.jpg"), new ImageIcon("img/4key.jpg"), 4),
			new NibblonianCharacter(new ImageIcon("img/5small.jpg"), new ImageIcon("img/5key.jpg"), 5),
			new NibblonianCharacter(new ImageIcon("img/6small.jpg"), new ImageIcon("img/6key.jpg"), 6),
			new NibblonianCharacter(new ImageIcon("img/7small.jpg"), new ImageIcon("img/7key.jpg"), 7),
			new NibblonianCharacter(new ImageIcon("img/8small.jpg"), new ImageIcon("img/8key.jpg"), 8),
			new NibblonianCharacter(new ImageIcon("img/9small.jpg"), new ImageIcon("img/9key.jpg"), 9),
			new NibblonianCharacter(new ImageIcon("img/10small.jpg"), new ImageIcon("img/10key.jpg"), 10),
			new NibblonianCharacter(new ImageIcon("img/11small.jpg"), new ImageIcon("img/11key.jpg"), 11),
			new NibblonianCharacter(new ImageIcon("img/12small.jpg"), new ImageIcon("img/12key.jpg"), 12),
			new NibblonianCharacter(new ImageIcon("img/13small.jpg"), new ImageIcon("img/13key.jpg"), 13),
			new NibblonianCharacter(new ImageIcon("img/14small.jpg"), new ImageIcon("img/14key.jpg"), 14),
			new NibblonianCharacter(new ImageIcon("img/15small.jpg"), new ImageIcon("img/15key.jpg"), 15),
			new NibblonianCharacter(new ImageIcon("img/16small.jpg"), new ImageIcon("img/16key.jpg"), 16),
			new NibblonianCharacter(new ImageIcon("img/17small.jpg"), new ImageIcon("img/17key.jpg"), 17),
			new NibblonianCharacter(new ImageIcon("img/18small.jpg"), new ImageIcon("img/18key.jpg"), 18),
			new NibblonianCharacter(new ImageIcon("img/19small.jpg"), new ImageIcon("img/19key.jpg"), 19),
			new NibblonianCharacter(new ImageIcon("img/20small.jpg"), new ImageIcon("img/20key.jpg"), 20),
			new NibblonianCharacter(new ImageIcon("img/21small.jpg"), new ImageIcon("img/21key.jpg"), 21),
			new NibblonianCharacter(new ImageIcon("img/22small.jpg"), new ImageIcon("img/22key.jpg"), 22),
			new NibblonianCharacter(new ImageIcon("img/23small.jpg"), new ImageIcon("img/23key.jpg"), 23),
			new NibblonianCharacter(new ImageIcon("img/24small.jpg"), new ImageIcon("img/24key.jpg"), 24),
			new NibblonianCharacter(new ImageIcon("img/25small.jpg"), new ImageIcon("img/25key.jpg"), 25),
			new NibblonianCharacter(new ImageIcon("img/spacesmall.jpg", "space"), new ImageIcon("img/spacekey.jpg"), 26), };

	// private static ArrayList<ImageIcon> alphabetCharactersText;
	// private static ArrayList<ImageIcon> alphabetCharactersImage;
	//
	// public static ImageIcon[] characters = new ImageIcon[] {
	// new ImageIcon("img/0small.jpg", "0"),
	// new ImageIcon("img/1small.jpg", "1"),
	// new ImageIcon("img/2small.jpg", "2"),
	// new ImageIcon("img/3small.jpg", "3"),
	// new ImageIcon("img/4small.jpg", "4"),
	// new ImageIcon("img/5small.jpg", "5"),
	// new ImageIcon("img/6small.jpg", "6"),
	// new ImageIcon("img/7small.jpg", "7"),
	// new ImageIcon("img/8small.jpg", "8"),
	// new ImageIcon("img/9small.jpg", "9"),
	// new ImageIcon("img/10small.jpg", "10"),
	// new ImageIcon("img/11small.jpg", "11"),
	// new ImageIcon("img/12small.jpg", "12"),
	// new ImageIcon("img/13small.jpg", "13"),
	// new ImageIcon("img/14small.jpg", "14"),
	// new ImageIcon("img/15small.jpg", "15"),
	// new ImageIcon("img/16small.jpg", "16"),
	// new ImageIcon("img/17small.jpg", "17"),
	// new ImageIcon("img/18small.jpg", "18"),
	// new ImageIcon("img/19small.jpg", "19"),
	// new ImageIcon("img/20small.jpg", "20"),
	// new ImageIcon("img/21small.jpg", "21"),
	// new ImageIcon("img/22small.jpg", "22"),
	// new ImageIcon("img/23small.jpg", "23"),
	// new ImageIcon("img/24small.jpg", "24"),
	// new ImageIcon("img/25small.jpg", "25"),
	// new ImageIcon("img/spacesmall.jpg", "space")
	// };
	//
	// public static ImageIcon[] images = new ImageIcon[] {
	// new ImageIcon("img/0small.jpg", "0"),
	// new ImageIcon("img/1small.jpg", "1"),
	// new ImageIcon("img/2small.jpg", "2"),
	// new ImageIcon("img/3small.jpg", "3"),
	// new ImageIcon("img/4small.jpg", "4"),
	// new ImageIcon("img/5small.jpg", "5"),
	// new ImageIcon("img/6small.jpg", "6"),
	// new ImageIcon("img/7small.jpg", "7"),
	// new ImageIcon("img/8small.jpg", "8"),
	// new ImageIcon("img/9small.jpg", "9"),
	// new ImageIcon("img/10small.jpg", "10"),
	// new ImageIcon("img/11small.jpg", "11"),
	// new ImageIcon("img/12small.jpg", "12"),
	// new ImageIcon("img/13small.jpg", "13"),
	// new ImageIcon("img/14small.jpg", "14"),
	// new ImageIcon("img/15small.jpg", "15"),
	// new ImageIcon("img/16small.jpg", "16"),
	// new ImageIcon("img/17small.jpg", "17"),
	// new ImageIcon("img/18small.jpg", "18"),
	// new ImageIcon("img/19small.jpg", "19"),
	// new ImageIcon("img/20small.jpg", "20"),
	// new ImageIcon("img/21small.jpg", "21"),
	// new ImageIcon("img/22small.jpg", "22"),
	// new ImageIcon("img/23small.jpg", "23"),
	// new ImageIcon("img/24small.jpg", "24"),
	// new ImageIcon("img/25small.jpg", "25"),
	// new ImageIcon("img/spacesmall.jpg", "space")
	// };
	//
	// private NibblonianAlphabet() {
	//
	// alphabetCharactersText = new ArrayList<>();
	// alphabetCharactersText.add(new ImageIcon("img/0small.jpg", "0"));
	// alphabetCharactersText.add(new ImageIcon("img/1small.jpg", "1"));
	// alphabetCharactersText.add(new ImageIcon("img/2small.jpg", "2"));
	// alphabetCharactersText.add(new ImageIcon("img/3small.jpg", "3"));
	// alphabetCharactersText.add(new ImageIcon("img/4small.jpg", "4"));
	// alphabetCharactersText.add(new ImageIcon("img/5small.jpg", "5"));
	// alphabetCharactersText.add(new ImageIcon("img/6small.jpg", "6"));
	// alphabetCharactersText.add(new ImageIcon("img/7small.jpg", "7"));
	// alphabetCharactersText.add(new ImageIcon("img/8small.jpg", "8"));
	// alphabetCharactersText.add(new ImageIcon("img/9small.jpg", "9"));
	// alphabetCharactersText.add(new ImageIcon("img/10small.jpg", "10"));
	// alphabetCharactersText.add(new ImageIcon("img/11small.jpg", "11"));
	// alphabetCharactersText.add(new ImageIcon("img/12small.jpg", "12"));
	// alphabetCharactersText.add(new ImageIcon("img/13small.jpg", "13"));
	// alphabetCharactersText.add(new ImageIcon("img/14small.jpg", "14"));
	// alphabetCharactersText.add(new ImageIcon("img/15small.jpg", "15"));
	// alphabetCharactersText.add(new ImageIcon("img/16small.jpg", "16"));
	// alphabetCharactersText.add(new ImageIcon("img/17small.jpg", "17"));
	// alphabetCharactersText.add(new ImageIcon("img/18small.jpg", "18"));
	// alphabetCharactersText.add(new ImageIcon("img/19small.jpg", "19"));
	// alphabetCharactersText.add(new ImageIcon("img/20small.jpg", "20"));
	// alphabetCharactersText.add(new ImageIcon("img/21small.jpg", "21"));
	// alphabetCharactersText.add(new ImageIcon("img/22small.jpg", "22"));
	// alphabetCharactersText.add(new ImageIcon("img/23small.jpg", "23"));
	// alphabetCharactersText.add(new ImageIcon("img/24small.jpg", "24"));
	// alphabetCharactersText.add(new ImageIcon("img/25small.jpg", "25"));
	// alphabetCharactersText.add(new ImageIcon("img/spacesmall.jpg", "space"));
	//
	// alphabetCharactersImage = new ArrayList<>();
	//
	// alphabetCharactersImage.add(new ImageIcon("img/0.jpg", "0"));
	// alphabetCharactersImage.add(new ImageIcon("img/1.jpg", "1"));
	// alphabetCharactersImage.add(new ImageIcon("img/2.jpg", "2"));
	// alphabetCharactersImage.add(new ImageIcon("img/3.jpg", "3"));
	// alphabetCharactersImage.add(new ImageIcon("img/4.jpg", "4"));
	// alphabetCharactersImage.add(new ImageIcon("img/5.jpg", "5"));
	// alphabetCharactersImage.add(new ImageIcon("img/6.jpg", "6"));
	// alphabetCharactersImage.add(new ImageIcon("img/7.jpg", "7"));
	// alphabetCharactersImage.add(new ImageIcon("img/8.jpg", "8"));
	// alphabetCharactersImage.add(new ImageIcon("img/9.jpg", "9"));
	// alphabetCharactersImage.add(new ImageIcon("img/10.jpg", "10"));
	// alphabetCharactersImage.add(new ImageIcon("img/11.jpg", "11"));
	// alphabetCharactersImage.add(new ImageIcon("img/12.jpg", "12"));
	// alphabetCharactersImage.add(new ImageIcon("img/13.jpg", "13"));
	// alphabetCharactersImage.add(new ImageIcon("img/14.jpg", "14"));
	// alphabetCharactersImage.add(new ImageIcon("img/15.jpg", "15"));
	// alphabetCharactersImage.add(new ImageIcon("img/16.jpg", "16"));
	// alphabetCharactersImage.add(new ImageIcon("img/17.jpg", "17"));
	// alphabetCharactersImage.add(new ImageIcon("img/18.jpg", "18"));
	// alphabetCharactersImage.add(new ImageIcon("img/19.jpg", "19"));
	// alphabetCharactersImage.add(new ImageIcon("img/20.jpg", "20"));
	// alphabetCharactersImage.add(new ImageIcon("img/21.jpg", "21"));
	// alphabetCharactersImage.add(new ImageIcon("img/22.jpg", "22"));
	// alphabetCharactersImage.add(new ImageIcon("img/23.jpg", "23"));
	// alphabetCharactersImage.add(new ImageIcon("img/24.jpg", "24"));
	// alphabetCharactersImage.add(new ImageIcon("img/25.jpg", "25"));
	// alphabetCharactersImage.add(new ImageIcon("img/space.jpg", "space"));
	// }

	// /**
	// * Returns the text image of a Nibblonian Character
	// *
	// * @param index The index of the character to return.
	// * @return An icon of the requested character.
	// */
	// public static ImageIcon getCharacter(int index) {
	// return alphabetCharactersText.get(index);
	// }
	//
	//
	// public static int indexOf(ImageIcon searchCharacter) {
	// for (ImageIcon character: alphabetCharactersText) {
	// if (character.getDescription()==(searchCharacter.getDescription()));
	// return indexOf(character);
	// }
	// return -1;
	// }

}
