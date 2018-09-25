package swing;
import javax.swing.*;
import java.awt.FlowLayout;

public class windowInfo extends JFrame {
	
	public windowInfo(){
		setLayout(new FlowLayout());
		JLabel lb = new JLabel("first name");
		JTextField txtf = new JTextField();
		setLayout(new FlowLayout());
		JLabel lbf = new JLabel("last name");
		JTextField txtff = new JTextField();
		setLayout(new FlowLayout());
		JLabel lbff = new JLabel("first name");
		JTextField txtfff = new JTextField();
		add(lb);
		add(txtf);
		setLayout(new FlowLayout());
		add(lbf);
		add(txtff);
		add(lbff);
		add(txtff);
		pack();
		setVisible(true);
	}

}
