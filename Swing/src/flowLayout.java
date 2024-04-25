import java.awt.*;
import javax.swing.*;

public class flowLayout {

	public static void main(String[] args) {
		
		JFrame frm = new JFrame();
		JButton btn = new JButton("Save");
		JButton btn2 = new JButton("Play");
		JButton btn3 = new JButton("Cancel");
		
//		btn.setBounds(50, 50, 100, 50);//X-axis ,Y-axis, W, Height
//		btn2.setBounds(150,50, 100,50);
//		btn3.setBounds(50, 50, 100, 50);
//		btn4.setBounds(150, 50, 100, 50);
			
		frm.add(btn);
		frm.add(btn2);
		frm.add(btn3);
		
		btn.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		
		frm.setLayout(new FlowLayout());
		frm.setSize(500,500);
		frm.setVisible(true);

	}

}
