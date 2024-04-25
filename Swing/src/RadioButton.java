import javax.swing.*;
import java.awt.event.*;
public class RadioButton extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton rb1, rb2;
	JButton b;
	JCheckBox one, two, three;
	
	
	RadioButton(){
		rb1 = new JRadioButton("Male");
		rb1.setBounds(100,100,100,30);
		rb2 = new JRadioButton("Female");
		rb2.setBounds(100,150,100,30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b = new JButton("Click");
				
		one = new JCheckBox("BCA");
		two = new JCheckBox("BSc.CSIT");
		three = new JCheckBox("BBM");
		
		one.setBounds(46,78,89,30);
		two.setBounds(344,67,89,30);
		three.setBounds(78,89,89,30);
		
		b.setBounds(100,200,80,30);
		b.addActionListener(this);
		add(rb1);add(rb2);add(b); add(one);add(two);add(three);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are Male.");
		}
		if(rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are Female.");
		}
	}
		public static void main(String[] args) {
			new RadioButton();
	}
	}

