package calculatorProject;
import javax.swing.JOptionPane;

public class calc {
	public static void main(String[] args) {
		String[] opCodes = { "Multiplication", "Division", "Addition", "Subtratcion", "Square Root" };
		System.out.println("This is my calculator console");
		JOptionPane .showMessageDialog(null, "message", "title", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "message2", "title" , JOptionPane.INFORMATION_MESSAGE );
	}
}
