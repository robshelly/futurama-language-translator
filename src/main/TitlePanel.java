package main;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TitlePanel extends JPanel {
	
	@SuppressWarnings("unused")
	private Interface parent;

	/**
	 * Create the panel.
	 */
	public TitlePanel(Interface parent) {
		this.parent = parent;
		setBackground(Color.BLACK);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnEnglishToNibblonian = new JButton("English to Nibblonian");
		btnEnglishToNibblonian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				parent.showEngToNibPanel();
			}
		});
		add(btnEnglishToNibblonian);
		
		JButton btnNibblonianToEnglish = new JButton("Nibblonian To English");
		btnNibblonianToEnglish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				parent.showNibToEngPanel();
			}
		});
		add(btnNibblonianToEnglish);

	}

}