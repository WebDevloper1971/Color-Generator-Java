package layouts;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelLayout extends JPanel{

	public PanelLayout() {
		setBackground(Color.white);
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createLineBorder(Color.white));
	}

}
