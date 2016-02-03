package calc;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;

public class GUI {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(new AluminiumLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		MyJButton button = new MyJButton("OK");
		MyJPanel panel = new MyJPanel("Panel", 300, 200, button);
		MyJFrame frame = new MyJFrame("CalcParody", 600, 400, panel);
		
	}

}
