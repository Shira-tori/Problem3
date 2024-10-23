import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Color;

public class TablePanel extends JPanel{
	public TablePanel(int[] SCREEN){
		this.setBounds(0, 0, (SCREEN[0] - SCREEN[0]/3), SCREEN[1]);
		this.setBackground(new Color(228,229,241));
	}
}
