import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AskerWindow extends JFrame{
	
	private AnswererWindow myAnswerer = null;
	
	public AskerWindow(){
		initUI();
	}
	
	public void setMyAnswerer(AnswererWindow aw){
		myAnswerer = aw;
	}

	private void initUI(){
		Container pane = getContentPane();
		
		JPanel mainPanel = new JPanel();
		//mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
		mainPanel.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Test");
		mainPanel.add(label1);
		
		JTextField field1 = new JTextField();
		mainPanel.add(field1);
		
		pane.add(mainPanel);
		
		setTitle("Subtle Waves - Questioning");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
