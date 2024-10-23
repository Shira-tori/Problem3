import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.util.LinkedList;

public class Problem3{


	private JFrame main = new JFrame("Problem3");
	private int SCREEN[] = {1000, 700};
	private LinkedList<Employee> employees = new LinkedList<Employee>();
	private TablePanel tablePanel = new TablePanel(SCREEN);
	private ComputePanel computePanel = new ComputePanel(SCREEN);


	public Problem3(){
		initializeFrame();
	}


	private void initializeFrame(){
		this.main.setSize(this.SCREEN[0], this.SCREEN[1]);
		this.main.setResizable(false);
		this.main.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		this.main.add(this.tablePanel);
		this.main.add(this.computePanel);

		this.main.setVisible(true);
	}


	public static void main(String[] args){
		Problem3 app = new Problem3();
	}
}
