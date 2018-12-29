import javax.swing.JFrame;

import view_controller.MiracleHandler;
import view_controller.MiracleRoot;

public class MiracleMain {
    protected static MiracleRoot root;
	protected static MiracleHandler mList;

	public static void main(String[] args) {
	  root = new MiracleRoot();
	  mList = new MiracleHandler(root);
	  root.setSize(800,600);
	  root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  root.setLocationRelativeTo(null);
	  root.setUndecorated(true);
	  root.setVisible(true);
	  
	}


}
