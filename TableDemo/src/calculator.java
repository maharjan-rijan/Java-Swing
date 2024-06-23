import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class calculator implements ActionListener{
	
	public static void main(String[] args) {
		JFrame frm = new JFrame("Calculator");
		JTextField result = new JTextField(20);
		result.setBounds(200, 45,215,50);
		JButton ac = new JButton("AC");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton dec = new JButton(".");
		JButton div = new JButton("/");
		JButton per = new JButton("%");
		JButton as = new JButton("+/-");
		JButton mul = new JButton("x");
		JButton sub = new JButton("-");
		JButton add = new JButton("+");
		JButton equel = new JButton("=");
		
		ac.setBounds(200, 100, 50, 40);
		ac.setBackground(Color.gray);
		as.setBounds(255, 100, 50, 40);
		as.setBackground(Color.gray);
		per.setBounds(310, 100, 50, 40);
		per.setBackground(Color.gray);
		div.setBounds(365, 100, 50, 40);
		div.setBackground(Color.orange);
		
		b7.setBounds(200, 145, 50, 40);
		b8.setBounds(255, 145, 50, 40);
		b9.setBounds(310, 145, 50, 40);
		mul.setBounds(365, 145, 50, 40);
		mul.setBackground(Color.orange);
		
		b4.setBounds(200, 190, 50, 40);
		b5.setBounds(255, 190, 50, 40);
		b6.setBounds(310, 190, 50, 40);
		sub.setBounds(365, 190, 50, 40);
		sub.setBackground(Color.orange);
		
		b1.setBounds(200, 235, 50, 40);
		b2.setBounds(255, 235, 50, 40);
		b3.setBounds(310, 235, 50, 40);
		add.setBounds(365, 235, 50, 40);
		add.setBackground(Color.orange);
		
		
		b0.setBounds(200, 280, 105, 40);
		dec.setBounds(310, 280, 50, 40);
		equel.setBounds(365, 280, 50, 40);
		equel.setBackground(Color.orange);
		
		frm.add(result);
		frm.add(ac);frm.add(div);frm.add(per);frm.add(as);
		frm.add(b7);frm.add(b8);frm.add(b9);frm.add(mul);
		frm.add(b4); frm.add(b5);frm.add(b6);frm.add(sub);
		frm.add(b3);frm.add(b2);frm.add(b1);frm.add(add);
		frm.add(b0);frm.add(dec);frm.add(equel);
		frm.setSize(500, 600);
		frm.setLayout(null);
		frm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
