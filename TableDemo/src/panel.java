import java.awt.*;

import javax.swing.*;

public class panel {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Panel");
		JPanel	panel = new JPanel();
		panel.setBounds(100, 100, 200, 400);
		panel.setBackground(Color.cyan);
		JButton b1 = new JButton("Save");
//		b1.setBounds(10, 20, 80, 40);
		b1.setBackground(Color.GREEN);
		JButton b2 = new JButton("Cancel");
//		b2.setBounds(50, 50, 80, 40);
		b2.setBackground(Color.red);
		
		panel.add(b1);panel.add(b2);
		f.add(panel);
		f.setSize(400, 700);
		f.setLayout(null);
		f.setVisible(true);
	}

}
