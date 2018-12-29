package view_controller;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MiracleRoot extends JFrame {

	protected NorthPanel nPanel;
	protected WestPanel ePanel;
	protected CenterPanel cPanel;
    private  Container root;
    
    
	public  MiracleRoot()  {
		super("Miracle");
		createGui();
	}

	private void createGui() {
	    
	     root= this.getContentPane();
	     root.setLayout(new BorderLayout());
	     
	     nPanel=new NorthPanel();
	     root.add(nPanel,BorderLayout.NORTH);
	     
	     ePanel= new WestPanel();
	     root.add(ePanel, BorderLayout.WEST);
	     
	     cPanel = new CenterPanel();
	     root.add(cPanel,BorderLayout.CENTER);
	     
	     JPanel panel=new JPanel();
	     root.add(panel, BorderLayout.SOUTH);
	}	
}
