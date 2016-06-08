import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagesWindow extends JFrame{

	private AskerWindow myAsker; 
	public static final String RESOURCES_PATH = "src/resources/";
	public ImagesWindow(AskerWindow asker){
		myAsker = asker;
		initUI();
	}

	private void initUI() {
		setLayout(new GridLayout(3,4));
		
		try {
			BufferedImage pic1 = ImageIO.read(new File(RESOURCES_PATH+"cat2.jpg"));
			JLabel picLabel1 = new JLabel(new ImageIcon(pic1));
			picLabel1.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("CAT");
				}
			});
			add(picLabel1);
			
			BufferedImage pic2 = ImageIO.read(new File(RESOURCES_PATH+"basketball2.jpg"));
			JLabel picLabel2 = new JLabel(new ImageIcon(pic2));
			picLabel2.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("BASKETBALL");
				}
			});
			add(picLabel2);
			
			BufferedImage pic3 = ImageIO.read(new File(RESOURCES_PATH+"butterfly2.jpg"));
			JLabel picLabel3 = new JLabel(new ImageIcon(pic3));
			picLabel3.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("BUTTERFLY");
				}
			});
			add(picLabel3);
			
			BufferedImage pic4 = ImageIO.read(new File(RESOURCES_PATH+"cake2.jpg"));
			JLabel picLabel4 = new JLabel(new ImageIcon(pic4));
			picLabel4.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("CAKE");
				}
			});
			add(picLabel4);
			
			BufferedImage pic5 = ImageIO.read(new File(RESOURCES_PATH+"detective2.jpg"));
			JLabel picLabel5 = new JLabel(new ImageIcon(pic5));
			picLabel5.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("DETECTIVE");
				}
			});
			add(picLabel5);
			
			BufferedImage pic6 = ImageIO.read(new File(RESOURCES_PATH+"frog2.jpg"));
			JLabel picLabel6 = new JLabel(new ImageIcon(pic6));
			picLabel6.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("FROG");
				}
			});
			add(picLabel6);
			
			BufferedImage pic7 = ImageIO.read(new File(RESOURCES_PATH+"ladybug2.jpg"));
			JLabel picLabel7 = new JLabel(new ImageIcon(pic7));
			picLabel7.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("LADYBUG");
				}
			});
			add(picLabel7);
			
			BufferedImage pic8 = ImageIO.read(new File(RESOURCES_PATH+"moon2.jpg"));
			JLabel picLabel8 = new JLabel(new ImageIcon(pic8));
			picLabel8.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("MOON");
				}
			});
			add(picLabel8);
			
			BufferedImage pic9 = ImageIO.read(new File(RESOURCES_PATH+"panda2.jpg"));
			JLabel picLabel9 = new JLabel(new ImageIcon(pic9));
			picLabel9.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("PANDA");
				}
			});
			add(picLabel9);
			
			BufferedImage pic10 = ImageIO.read(new File(RESOURCES_PATH+"pineapple2.jpg"));
			JLabel picLabel10 = new JLabel(new ImageIcon(pic10));
			picLabel10.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("PINEAPPLE");
				}
			});
			add(picLabel10);
			
			BufferedImage pic11 = ImageIO.read(new File(RESOURCES_PATH+"snowman2.jpg"));
			JLabel picLabel11 = new JLabel(new ImageIcon(pic11));
			picLabel11.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("SNOWMAN");
				}
			});
			add(picLabel11);
			
			BufferedImage pic12 = ImageIO.read(new File(RESOURCES_PATH+"strawberry2.jpg"));
			JLabel picLabel12 = new JLabel(new ImageIcon(pic12));
			picLabel12.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					myAsker.sendGuess("STRAWBERRY");
				}
			});
			add(picLabel12);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setTitle("Images");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
}
