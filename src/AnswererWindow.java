import javax.swing.JFrame;

public class AnswererWindow extends JFrame{
	
	private AskerWindow myAsker = null;
	
	public AnswererWindow(){
		initUI();
	}
	
	public void setMyAskerWindow(AskerWindow aw){
		myAsker = aw;
	}

	private void initUI(){
		setTitle("Subtle Waves - Answerer");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
