package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class NibToEngPanel extends JPanel implements ActionListener {
	
	//private Translator translator;
	private ArrayList<NibblonianCharacter> nibblonian;
	private EngTranslationOutputPanel output;
	private NibKeyboard keyboard;
	

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public NibToEngPanel() {
		
//		translator = new Translator();
		nibblonian = new ArrayList<>();
		
		setLayout(new BorderLayout());
		
		output = new EngTranslationOutputPanel();
		output.setSize(300, 300);
		add(output, BorderLayout.EAST);
		
		keyboard = new NibKeyboard(this);
		add(keyboard, BorderLayout.WEST);

	}
	
	/**
	 * Translates the Nibblonian into English.
	 * Sets the output to display the translation.
	 */
	public void translate() {
		output.setEnglishTranslation(NibblonianTranslator.decrypt(nibblonian));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		nibblonian.add(NibblonianAlphabet.alphabet[Integer.parseInt(e.getActionCommand())]);
		output.addToNibTextPanel(Integer.parseInt(e.getActionCommand()));
	}
	
//	/**
//	 * Creates a JPanel containg a keyboard for
//	 * Nibblonian.
//	 * 
//	 * @return The JPanel
//	 * @throws IOException
//	 */
//	private JPanel createKeyboard() throws IOException {
//		JPanel keyboard = new JPanel();
//		
//		addButton(keyboard, "img/0.jpg", "0");
//		addButton(keyboard, "img/1.jpg", "1");	
//		addButton(keyboard, "img/2.jpg", "2");
//		addButton(keyboard, "img/3.jpg", "3");
//		addButton(keyboard, "img/4.jpg", "4");
//		
//		addButton(keyboard, "img/5.jpg", "5");
//		addButton(keyboard, "img/6.jpg", "6");
//		addButton(keyboard, "img/7.jpg", "7");
//		addButton(keyboard, "img/8.jpg", "8");
//		addButton(keyboard, "img/9.jpg", "9");
//		
//		addButton(keyboard, "img/10.jpg", "10");
//		addButton(keyboard, "img/11.jpg", "11");
//		addButton(keyboard, "img/12.jpg", "12");
//		addButton(keyboard, "img/13.jpg", "13");
//		addButton(keyboard, "img/14.jpg", "14");
//
//		addButton(keyboard, "img/15.jpg", "15");
//		addButton(keyboard, "img/16.jpg", "16");
//		addButton(keyboard, "img/17.jpg", "17");
//		addButton(keyboard, "img/18.jpg", "18");
//		addButton(keyboard, "img/19.jpg", "19");
//				
//		addButton(keyboard, "img/20.jpg", "20");
//		addButton(keyboard, "img/21.jpg", "21");
//		addButton(keyboard, "img/22.jpg", "22");
//		addButton(keyboard, "img/23.jpg", "23");
//		addButton(keyboard, "img/24.jpg", "24");
//
//		addButton(keyboard, "img/25.jpg", "25");
//		addButton(keyboard, "img/space.jpg", "26");
//		
//
//		keyboard.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
//		keyboard.setPreferredSize(new Dimension(250, 300));
//		return keyboard;
//	}
//	
//	private JPanel createOutputPanel() throws IOException {
//
//		JPanel output = new JPanel();
//		output.setLayout(new BorderLayout());
//		
//		NibTextPanel nibTextPanel = new NibTextPanel(); 
//		output.add(nibTextPanel, BorderLayout.NORTH);
//		
//		JTextField english = new JTextField("Translation");
//		output.add(english, BorderLayout.SOUTH);
//
//		return output;
//	}
//	
//	/**
//	 * Adds a button to a container.
//	 * @throws IOException 
//	 */
//	private void addButton(Container panel, String imgPath, String charNumValue) throws IOException
//	{
//		BufferedImage icon = ImageIO.read(new File(imgPath));
//		ImageIcon imgIcon = new ImageIcon(icon);
//		System.out.print(imgIcon.getIconWidth());
//		System.out.print(imgIcon.getIconHeight());
//		JButton button = new JButton(imgIcon);
//		button.setActionCommand(imgPath);
//		button.addActionListener(this);
////		button.setBorder(BorderFactory.createEmptyBorder());
//		button.setPreferredSize(new Dimension(50, 50));
//		panel.add(button);
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		translator.addToCiphertext(new Picture(new File(e.getActionCommand())));
//	}

}
