import java.awt.*;
import javax.swing.*;
public class test {

	public static void main(String[] args) {
		
		JFrame frm = new JFrame();
		JButton btn = new JButton("<<");
		JButton btn2 = new JButton(">>");
		JButton btn3 = new JButton("Save");
		JButton btn4 = new JButton("Cancel");
		JButton btn5 = new JButton("Play");
//		btn.setBounds(50, 50, 100, 50);//X-axis ,Y-axis, W, Height
//		btn2.setBounds(150,50, 100,50);
//		btn3.setBounds(50, 50, 100, 50);
//		btn4.setBounds(150, 50, 100, 50);
		
		
		frm.add(btn,BorderLayout.WEST);
		frm.add(btn2,BorderLayout.EAST);
		frm.add(btn3,BorderLayout.NORTH);
		frm.add(btn4,BorderLayout.SOUTH);
		frm.add(btn5,BorderLayout.CENTER);
		
		frm.setSize(500,500);
		btn.setBackground(Color.WHITE);
		btn2.setBackground(Color.WHITE);
		frm.setVisible(true);
	}

}
