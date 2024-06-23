import java.awt.event.*;
import javax.swing.*;

public class registerationForm implements ActionListener {
	
	JTextField nameText, addText, phonText, cPassText, usrText, passText;
	
	public void register() {
		JFrame fam = new JFrame("Registration Form");
		JButton register = new JButton("Register");
		register.setBounds(285, 290, 100, 20);
		
		//User Name
		JLabel username = new JLabel();
		username.setText("User Name :");
		username.setBounds(170, 35, 100, 40);
		
		//Name
		JLabel name = new JLabel();
		name.setText("Name :");
		name.setBounds(200, 65,100,40);
	
		//Address
		JLabel address = new JLabel();
		address.setText("Address :");
		address.setBounds(184, 95, 100, 40);
				
		//Gender
		JLabel gender = new JLabel();
		gender.setText("Gender :");
		gender.setBounds(192, 125, 100, 40);
		//RadioButton
		JRadioButton m = new JRadioButton("Male");
		m.setBounds(250,135,65,20);
		JRadioButton f = new JRadioButton("Female");
		f.setBounds(340,135,70,20);
		JRadioButton o = new JRadioButton("Other");
		o.setBounds(430,135,65,20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(m);bg.add(f);bg.add(o);
		
		//Phone
		JLabel phone = new JLabel();
		phone.setText("Contact :");
		phone.setBounds(185, 155, 100, 40);
				
		//Password
		JLabel password = new JLabel();
		password.setText("Password :");
		password.setBounds(172, 185, 100, 40);
				
		JLabel c_password = new JLabel();
		c_password.setText("Confirm Password :");
		c_password.setBounds(125, 215, 150, 40);
		
		//Name Text Field
		nameText = new JTextField(15);
		nameText.setBounds(250, 45,320,25);
		//User Name Text Field
		usrText = new JTextField(10);
		usrText.setBounds(250, 75,320,25);
		//Address Text Field
		addText = new JTextField(20);
		addText.setBounds(250, 105, 320, 25);
		//Phone Text Field
		phonText = new JTextField(10);
		phonText.setBounds(250, 165, 320, 25);
		//Password Text Field
		passText = new JPasswordField(20);
		passText.setBounds(250, 195, 320, 25);
		//Confirm Password Text Field
		cPassText = new JPasswordField(20);
		cPassText.setBounds(250, 225, 320, 25);
		
		//Add To frame
		 fam.add(name);fam.add(nameText);
		 fam.add(username);fam.add(usrText);
		 fam.add(gender);fam.add(m);fam.add(f);fam.add(o);
		 fam.add(address);fam.add(addText);
//		 fam.add(dob);fam.add(yr);fam.add(mt);fam.add(dt);
		 fam.add(phone);fam.add(phonText);
		 fam.add(password);fam.add(passText);
		 fam.add(c_password);fam.add(cPassText);
//		 fam.add(faculty);fam.add(c1);fam.add(c2);fam.add(c3);
		 fam.add(register);
		
		register.addActionListener(this);//onclick it will call action perform
		
		fam.setLayout(null);
		fam.setSize(700,500);
		fam.setVisible(true);
	}
	
	public static void main(String[] args) {
		registerationForm t = new registerationForm();
		t.register();
	}
	
@Override
public void actionPerformed(ActionEvent e) {
	String username = usrText.getText();
	System.out.println("Hello " +username);
}
}
