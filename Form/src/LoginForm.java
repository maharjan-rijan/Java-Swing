import java.awt.event.*;
import javax.swing.*;

public class LoginForm implements ActionListener {
	
	JTextField usrText, passText, resultText;
	
	public void login() {
		JFrame fam = new JFrame("Login Form");
		JButton btn = new JButton("Login");
		btn.setBounds(150, 108, 75, 25);

		JButton btn2 = new JButton("Register");
		btn2.setBounds(250, 108, 100, 25);
		
		//User Name
		JLabel username = new JLabel();
		username.setText("User Name :");
		username.setBounds(70, 40, 100, 40);
		
		//Password
		JLabel password = new JLabel();
		password.setText("Password :");
		password.setBounds(74, 70, 100, 40);
		
		JLabel result = new JLabel();
		result.setText("Password :");
		result.setBounds(74, 100, 100, 40);
		
		//User Name Text Field
		 usrText = new JTextField(10);
		 usrText.setBounds(150, 48, 200, 25);
		 
		 //Password Text Field
		 passText = new JTextField(20);
		 passText.setBounds(150, 78, 200, 25);
		 
		 		
		//Add To frame
		fam.add(username);fam.add(usrText);
		fam.add(password);fam.add(passText);
		
		fam.add(btn);fam.add(btn2);
		
		btn.addActionListener(this);//onclick it will call action perform
		btn2.addActionListener(this);
		fam.setLayout(null);
		fam.setSize(500,500);
		fam.setVisible(true);
	}
	
	public static void main(String[] args) {
		LoginForm t = new LoginForm();
		t.login();
	}
	
@Override
public void actionPerformed(ActionEvent e) {
//	if(e.getSource()==btn2) {
//		Register t = new Register();
//		t.Register();
//	}
	String username = usrText.getText();
	System.out.println("Hello " +username);
}
}
