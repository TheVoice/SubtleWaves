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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.GridBagLayout;

public class AnswererWindow extends JFrame{

	private AskerWindow myAsker = null;
	private JTextField displayQuestion;
	private JLabel picLabel;
	
	private final AnswererWindow aw = this;

	public AnswererWindow(){
		initUI();
	}

	public void setMyAskerWindow(AskerWindow aw){
		myAsker = aw;
	}

	private String IMG_PATH = "src/resources/moon2.jpg";


	private void initUI(){
		setLayout(new GridLayout(2,2));
		setTitle("Subtle Waves - Answering");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			BufferedImage img = ImageIO.read(new File(IMG_PATH));
			// ImageIcon show_image = new ImageIcon(img);
			picLabel = new JLabel(new ImageIcon(img));
			add(picLabel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		displayQuestion = new JTextField();
		//displayQuestion.setText();
		displayQuestion.setEditable(false);
		displayQuestion.setSize(new Dimension(5, 10));
		add(displayQuestion);
		add(new JPanel());
		
		JPanel changePanel = new JPanel();
		add(changePanel);
		JButton changeButton = new JButton("Change picture");
		changeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				ImagesChoiceWindow im = new ImagesChoiceWindow(aw);
				im.setVisible(true);
			}
		});
		changePanel.add(changeButton);

		JPanel answererPanel = new JPanel();
		add(answererPanel);
		//wywolac metode answer String
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
	
	public void changeTo(String filepath){
		BufferedImage img;
		try {
			img = ImageIO.read(new File(filepath));
			picLabel.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
