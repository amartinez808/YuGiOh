package eg.edu.guc.yugioh.gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BackHandButton extends JButton {
	static ImageIcon water = new ImageIcon("Back card.png");
	
	public BackHandButton(){
		super(water);
		this.setPreferredSize(new Dimension(64,93));
	}
}
