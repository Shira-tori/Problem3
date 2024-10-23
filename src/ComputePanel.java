import javax.swing.JPanel;
import java.awt.Color;

public class ComputePanel extends JPanel{
	public ComputePanel(int[] SCREEN){
		this.setBounds((SCREEN[0] - SCREEN[0]/3), 0,  (SCREEN[0]/3), SCREEN[1]);
		this.setBackground(new Color(147,148,165));
	}
}
