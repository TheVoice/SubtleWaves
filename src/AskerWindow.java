import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AskerWindow extends JFrame{
	
	private AnswererWindow myAnswerer = null;
	private JTextField field2;
	private int questionsCount = 0;
	
	private final AskerWindow aw = this;
	
	public AskerWindow(){
		initUI();
	}
	
	public void setMyAnswererWindow(AnswererWindow aw){
		myAnswerer = aw;
	}
	
	public void answer(String answer){
		field2.setText(answer);
	}
	
	public void sendGuess(String img){
		myAnswerer.guess(img);
	}
	

	private void initUI(){
		setLayout(new GridLayout(2,3));
		
		JPanel mainPanel = new JPanel();
		//mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
		mainPanel.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Question "+(questionsCount+1)+":");
		add(label1);
		
		JTextField field1 = new JTextField();
		add(field1);
		
		JButton button1 = new JButton("Ask");
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				String question = field1.getText();
				myAnswerer.ask(question);
				label1.setText("Question "+(++questionsCount+1)+":");
			}
		});
		add(button1);
		
		JLabel label2 = new JLabel("Answer:");
		add(label2);
		
		field2 = new JTextField();
		field2.setEditable(false);
		add(field2);
		
		JButton button2 = new JButton("List images");
		button2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				ImagesWindow im = new ImagesWindow(aw);
				im.setVisible(true);
			}
		});
		add(button2);
		
		setTitle("Subtle Waves - Questioning");
		pack();
		setSize(800,this.getHeight());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
