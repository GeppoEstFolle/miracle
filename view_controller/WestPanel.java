package view_controller;




import java.net.URL;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolTip;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;


@SuppressWarnings("serial")
public class WestPanel extends Box {
	protected JComboBox<?> colBox; //how many columns do you want!
	protected JComboBox<?> iterBox;//how many numbers do you want!
	protected JButton bGenerate;
	protected JButton bQuit;
    
    
	
    public WestPanel() {
    	super(BoxLayout.Y_AXIS);
    	setBackground(Color.LIGHT_GRAY);
		Box.createVerticalBox();
	    createPanel();
    }

    private void createPanel() {
     createComboPanel();
     createButtonPanel();
    }

	private void createButtonPanel() {
	    add(makeButtonGenerate());
	    add(new JSeparator(SwingConstants.HORIZONTAL));
	    add(makeButtonQuit());
	    add(new JSeparator(SwingConstants.HORIZONTAL));
		
	}

	private JPanel makeButtonQuit() {
		URL icon2URL= getClass().getResource("/resource/BallQ.png"); 
	    ImageIcon icon2 = new ImageIcon(icon2URL);
	    bQuit=new JButton(icon2);
	    bQuit.setAlignmentX(CENTER_ALIGNMENT);
	    JPanel quitPanel=new JPanel();
	    quitPanel.add(bQuit);
	    return quitPanel;
		
	}

	private JPanel makeButtonGenerate() {
		URL iconURL= getClass().getResource("/resource/BallG.png"); 
	    ImageIcon icon = new ImageIcon(iconURL);
		bGenerate =new JButton(icon);
		bGenerate.setAlignmentX(CENTER_ALIGNMENT);
		JPanel generatePanel = new JPanel();
		generatePanel.add(bGenerate);
		return generatePanel;
		
	}

	private void createComboPanel() {
		add(new JSeparator(SwingConstants.HORIZONTAL));
		add(makeColPanel());
		add(new JSeparator(SwingConstants.HORIZONTAL));
		add(makeIterPanel());
		add(new JSeparator(SwingConstants.HORIZONTAL));
	}
	
	

	

	private JPanel makeIterPanel() {
	 final Integer [] iterValue= {1,2,3,4,5,6,7,8,9,10}; 
		 iterBox=new JComboBox<Integer>(iterValue);
		 iterBox.setSelectedItem(6);
		 JPanel iterPanel=new JPanel();
		 iterPanel.add(makeIterLabel());
		 iterPanel.add(iterBox);
		 return iterPanel;
		
	}
	
	 private JLabel makeIterLabel() {
		 JLabel iterLabel=new JLabel("Number");
		 iterLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		 JToolTip numberTip=new JToolTip();
		 iterLabel.setToolTipText("How many numbers do you want!");
		 numberTip.setComponent(iterLabel);
		 return iterLabel;
	}

	private JPanel makeColPanel() {
	final Integer [] colValue= {1,2,3,4,5,6,7,8};	
		colBox=new JComboBox<Integer>(colValue);
		JPanel colPanel=new JPanel();
		colPanel.add(makeColLabel());
	    colPanel.add(colBox);
	    return colPanel;	
	}
	
	private JLabel makeColLabel() {
		JLabel colLabel=new JLabel("Columns");
		colLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		JToolTip coloumnsTip=new JToolTip();
		colLabel.setToolTipText("How many columns do you want!");
		coloumnsTip.setComponent(colLabel);
		return colLabel;
	}
}
