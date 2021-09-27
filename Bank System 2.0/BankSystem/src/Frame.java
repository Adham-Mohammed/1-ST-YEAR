import javax.swing.JFrame;
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent;

public class Frame extends JFrame {

	public Frame(String frameName) {
		super(frameName);

		addWindowListener(new WindowAdapter() {
			 
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		setVisible(true);
		setDefaultCloseOperation(Frame.DO_NOTHING_ON_CLOSE);
	}

}