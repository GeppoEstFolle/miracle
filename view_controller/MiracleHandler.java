package view_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.RandomList;

public class MiracleHandler {
	protected MiracleRoot root;
	protected RandomList list;
	protected int columns;
	protected int iter;
	
	public MiracleHandler(MiracleRoot root) {
		this.root=root;
		attachEvents();
	}

	private void attachEvents() {
		root.ePanel.bQuit.addActionListener((e)->System.exit(0));
		root.ePanel.bGenerate.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				root.cPanel.area.setText("  ");
				list=new RandomList();
				columns = (int)root.ePanel.colBox.getSelectedItem();
				iter=(int) root.ePanel.iterBox.getSelectedItem();
				for(int i=0;i<columns;i++) {
					list.createListSequence(iter, 0, 90);
					String listString= list.getList().toString();
					root.cPanel.area.append("\n"+listString);
					list.clear();
				}
				
			}
		});
		
	}
	

}
