import javax.swing.JOptionPane;

public class Birthday {
public static void main(String[] args) {
	String birthday=JOptionPane.showInputDialog("What is your birthday?");
	if(birthday.equals("August 13th")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}else {
	JOptionPane.showMessageDialog(null, "Have a very happy un-birthday");
}
	}
}

