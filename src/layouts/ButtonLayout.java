package layouts;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ButtonLayout extends JButton{

	public ButtonLayout(String str) {
			setText(str);
	        setBounds(0, 1, 640, 49);
	        setBackground(Color.BLACK);
	        setForeground(Color.white);
	        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	        setFont(null);
	        setFocusPainted(false);
	   
	}

}
