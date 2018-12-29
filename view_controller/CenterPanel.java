package view_controller;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class CenterPanel extends JPanel {
  protected JTextArea area;
  protected JScrollPane scroll;
 
  
  public CenterPanel() {
	  super();
	  setBackground(Color.LIGHT_GRAY);
	  createPanel();
  }

  private void createPanel() {
	area=new JTextArea(25,25);
	area.setForeground(Color.WHITE);
	area.setFont(new Font("Arial Black", Font.PLAIN, 22));
	area.setBackground(Color.GRAY);
	area.setEditable(false);
	scroll=new JScrollPane(area);
	scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	add(scroll);
	JSeparator _sep=new JSeparator(SwingConstants.HORIZONTAL);
	add(_sep);
  }
  
}
