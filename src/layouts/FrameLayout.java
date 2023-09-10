package layouts;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FrameLayout extends JFrame{
	
	private Dimension size = new Dimension(640,500);
	
	public FrameLayout() {
		
			
			
		 	setLayout(new GridLayout(1,3));

	        setPreferredSize(size);
	        setMinimumSize(size);
	        setMaximumSize(size);
	        
	        setTitle("Color Palette Generator");
	        pack();
	        setVisible(true);
	        setLocationRelativeTo(null);
	        setResizable(false);
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
