import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame{

	public MainWindow(){
		initUI();
	}
	
	private void initUI(){
		
		JButton answererButton = new JButton("Player - A");
		answererButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				dispose();
				AnswererWindow qw = new AnswererWindow();
				qw.setVisible(true);
			}
		});
		
		JButton askerButton = new JButton("Player - Q");
		askerButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				dispose();
				AskerWindow aw = new AskerWindow();
				aw.setVisible(true);
			}
		});
		
		Container pane = getContentPane();
		
		JPanel panel1 = new JPanel();
		panel1.add(answererButton);
		panel1.add(askerButton);
		pane.add(panel1);
		
		setTitle("Subtle Waves");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
