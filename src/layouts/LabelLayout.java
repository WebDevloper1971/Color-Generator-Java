package layouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelLayout extends JLabel{

	public LabelLayout(JFrame frame){
		
		setForeground(Color.WHITE);
		addMouseListener(new MouseAdapter() {
	        	
	                @Override
	                public void mouseClicked(MouseEvent e) {
	                    String text = getText();
	                    
	                    Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	                    StringSelection  textSelected = new StringSelection(text);
	                    
	                    clip.setContents(textSelected, textSelected);
	                    
	                    JLabel msg = new JLabel("<html><center>Code Copied</center></html>");
	                    msg.setBounds(20, 10, 100, 30);
	                    
	                    JDialog copyMessage = new JDialog();
	                    copyMessage.setSize(new Dimension(100,100));
	                    copyMessage.setLocationRelativeTo(frame);
	                    copyMessage.setLayout(null);
	                    copyMessage.add(msg);
	                    copyMessage.setModal(true);
	                    copyMessage.setVisible(true);
	                    
	                }

	            });
	}

}


