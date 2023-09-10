package logic;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import layouts.*;
import java.util.Random;

public class ColorPaletteGenerator implements ActionListener{


    
    private JFrame frame;
    private JPanel P1,P2,P3;
    private JLabel L1,L2,L3;
    private Color C1,C2,C3 ;
    private JButton generate;
    private Dimension size = new Dimension(640,500);
    
    
    public ColorPaletteGenerator() {
        frame = new JFrame();
    	
	  
	    String htmlContent = "<html><b>G</b><br><b>E</b><br><b>N</b><br><b>E</b><br><b>R</b><br><b>A</b><br><b>T</b><br><b>E</b></html>";
	    
	    generate = new ButtonLayout(htmlContent);
	    generate.setFocusable(true);
	    generate.addActionListener(this);
        
        
      
        
        
        
        
	      P1 = new PanelLayout();
	      L1 = new LabelLayout(frame);
	      P1.add(L1);
	      
	      P2 = new PanelLayout();
	      L2 = new LabelLayout(frame);
	      P2.add(L2);
	      
	      P3 = new PanelLayout();
	      L3 = new LabelLayout(frame);
	      P3.add(L3);       
	        
	      frame.add(generate);  
	      frame.add(P1);
	      frame.add(P2);
	      frame.add(P3);
	      frame.setLayout(new GridLayout(1,3));

	      frame.setPreferredSize(size);
	      frame.setMinimumSize(size);
	      frame.setMaximumSize(size);
	        
	      frame.setTitle("Color Palette Generator");
	      frame.pack();
	      frame.setVisible(true);
	      frame.setLocationRelativeTo(null);
	      frame.setResizable(false);
	      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
    }
  
    
    public static String ColorGenerator (){
        String HexColor;
        
        Random hex = new Random();
            int num = 1;
            for (int i = 1; i <= 5; i++) {
                num = num*10 + hex.nextInt(6);
            }
            HexColor = "#" + num + "";
        
        return HexColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String s1 = ColorGenerator();
        String s2 = ColorGenerator();
        String s3 = ColorGenerator();
        
        
        
        C1 = Color.decode(s1);
        C2 = Color.decode(s2);
        C3 = Color.decode(s3);
   

        P1.setBackground(C1);
        L1.setText(s1);
        
        P2.setBackground(C2);
        L2.setText(s2);
        
        P3.setBackground(C3);
        L3.setText(s3);
    }

   
}

