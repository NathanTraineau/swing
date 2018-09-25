package swing;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.FlowLayout;;

public class ButtonFrame extends JFrame {
	
	public ButtonFrame (int j) {
		setLayout(new FlowLayout());
		for(int i=j;i>0;i--) {
		JButton bouton = new JButton("Button n° "+ i);
		add(bouton);
		}
		pack();
		setVisible(true);
	}
	
	

	
	
}


