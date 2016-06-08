import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Dimension;

public class AnswererWindow extends JFrame{

	private AskerWindow myAsker = null;
	private JTextField displayQuestion;

	public AnswererWindow(){
		initUI();
	}

	public void setMyAskerWindow(AskerWindow aw){
		myAsker = aw;
	}

	private String IMG_PATH = "src/resources/moon2.jpg";

	// public void ask(String ask) {
	//
	// }

	private void initUI(){
		setLayout(new GridLayout(2,1));
		setTitle("Subtle Waves - Answerer");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			BufferedImage img = ImageIO.read(new File(IMG_PATH));
			// ImageIcon show_image = new ImageIcon(img);
			JLabel picLabel = new JLabel(new ImageIcon(img));
						add(picLabel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		displayQuestion = new JTextField();
		displayQuestion.setText("Hello");
		displayQuestion.setEditable(false);
		displayQuestion.setSize(new Dimension(5, 10));
		add(displayQuestion);
		add(new JPanel());

		JPanel answererPanel = new JPanel();
		add(answererPanel);
		//wywolac metode answear String
		//metoda ask u siebie (Ma wyswietlic pytanie)
		JButton yesButton = new JButton("YES");
		yesButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				myAsker.answer("YES");
			}
		});
		answererPanel.add(yesButton);
		JButton noButton = new JButton("NO");
		noButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				myAsker.answer("NO");
			}
		});
		answererPanel.add(noButton);

		pack();
	}

	public void ask(String question) {
		displayQuestion.setText(question);
	}

	public void guess(String img) {
		JOptionPane.showMessageDialog(this, img);
	}
}
