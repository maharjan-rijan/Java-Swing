import java.awt.*;
import javax.swing.*;

public class gridLayout {

	public static void main(String[] args) {
		//Creating Buttons
		JFrame frm = new JFrame();
		JButton btn = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");

		//Add Button in Frame	
		frm.add(btn);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btn7);
		frm.add(btn8);
		frm.add(btn9);

		btn.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		
		frm.setLayout(new GridLayout(3, 3));
		frm.setSize(500,500);
		frm.setVisible(true);

	}

}
