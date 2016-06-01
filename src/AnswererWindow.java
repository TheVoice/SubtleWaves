import javax.swing.JFrame;

public class AnswererWindow extends JFrame{
	
	public AnswererWindow(){
		initUI();
	}

	private void initUI(){
		setTitle("Subtle Waves - Answerer");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
