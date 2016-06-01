import javax.swing.JFrame;

public class AskerWindow extends JFrame{
	
	public AskerWindow(){
		initUI();
	}

	private void initUI(){
		setTitle("Subtle Waves - Questioning");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
