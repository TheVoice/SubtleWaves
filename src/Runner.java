import java.awt.EventQueue;

public class Runner {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
//				MainWindow mw = new MainWindow();
//				mw.setVisible(true);
				
				AskerWindow asw = new AskerWindow();
				
				AnswererWindow anw = new AnswererWindow();
				
				anw.setMyAskerWindow(asw);
				asw.setMyAnswererWindow(anw);
				
				anw.setVisible(true);
				asw.setVisible(true);
			}
		});
	}

}
