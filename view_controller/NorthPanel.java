package view_controller;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

@SuppressWarnings("serial")
public class NorthPanel extends JPanel {

	private ImageIcon icon,iconResize;
	private JLabel imgLabel;

	  public NorthPanel() {
	    super();
	    setBackground(Color.YELLOW);
		URL iconURL= getClass().getResource("/resource/miracle.png"); 
	    icon = new ImageIcon(iconURL);
	    loadImage(icon);
	  }

	  private void loadImage(ImageIcon icon ) {
		Image img=icon.getImage();
		Image imgResize	=img.getScaledInstance(400,100, Image.SCALE_SMOOTH);
		iconResize=new ImageIcon(imgResize);
	    imgLabel=new JLabel(iconResize);
	    imgLabel.setBackground(Color.BLUE);
	    this.add(imgLabel);
	  }	 
}
	
