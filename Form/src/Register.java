import java.awt.event.*;
import javax.swing.*;

public class Register implements ActionListener {
	
	JTextField nameText, addText, phonText, cPassText, usrText, passText;
	
	public void register() {
		JFrame fam = new JFrame("Registration Form");
		JButton register = new JButton("Register");
		register.setBounds(284, 320, 100, 20);
		
		//User Name
		JLabel username = new JLabel();
		username.setText("User Name :");
		username.setBounds(170, 35, 100, 40);
		
		//Name
		JLabel name = new JLabel();
		name.setText("Name :");
		name.setBounds(200, 65,100,40);
		
		//Date of Birth
		JLabel dob = new JLabel();
		dob.setText("Date of Birth :");
		dob.setBounds(164, 95, 100, 40);
		String s1[] = {"Select date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
		JComboBox<String> dt = new JComboBox<String>(s1);
		dt.setBounds(480, 105, 90, 25);
		String s2[] = {"Select Month","January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
		JComboBox<String> mt = new JComboBox<String>(s2);
		mt.setBounds(360, 105, 110, 25);
		String s3[] = {"Select Year","1944","1945","1946","1947","1948","1949","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033"};
		JComboBox<String> yr = new JComboBox<String>(s3);
		yr.setBounds(250, 105, 100, 25);
				
		//Address
		JLabel address = new JLabel();
		address.setText("Address :");
		address.setBounds(184, 125, 100, 40);
				
		//Gender
		JLabel gender = new JLabel();
		gender.setText("Gender :");
		gender.setBounds(192, 155, 100, 40);
		//RadioButton
		JRadioButton m = new JRadioButton("Male");
		m.setBounds(250,165,65,20);
		JRadioButton f = new JRadioButton("Female");
		f.setBounds(340,165,70,20);
		JRadioButton o = new JRadioButton("Other");
		o.setBounds(430,165,65,20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(m);bg.add(f);bg.add(o);
		
		//Phone
		JLabel phone = new JLabel();
		phone.setText("Contact :");
		phone.setBounds(185, 185, 100, 40);
				
		//Password
		JLabel password = new JLabel();
		password.setText("Password :");
		password.setBounds(172, 215, 100, 40);
				
		JLabel c_password = new JLabel();
		c_password.setText("Confirm Password :");
		c_password.setBounds(125, 245, 150, 40);
		
		JLabel faculty = new JLabel();
		faculty.setText("Faculty :");
		faculty.setBounds(190, 275, 150, 40);
		//Check Box
		JCheckBox c1 = new JCheckBox();
		c1 = new JCheckBox("BCA");
		c1.setBounds(250,285,55,20);
		JCheckBox c2 = new JCheckBox();
		c2 = new JCheckBox("BSc.CSIT");
		c2.setBounds(310,285,90,20);
		JCheckBox c3 = new JCheckBox();
		c3 = new JCheckBox("BBM");
		c3.setBounds(400,285,100,20);
		
		//Name Text Field
		nameText = new JTextField(15);
		nameText.setBounds(250, 45,320,25);
		//User Name Text Field
		usrText = new JTextField(10);
		usrText.setBounds(250, 75,320,25);
		//Address Text Field
		addText = new JTextField(20);
		addText.setBounds(250, 135, 320, 25);
		//Phone Text Field
		phonText = new JTextField(10);
		phonText.setBounds(250, 195, 320, 25);
		//Password Text Field
		passText = new JPasswordField(20);
		passText.setBounds(250, 225, 320, 25);
		//Confirm Password Text Field
		cPassText = new JPasswordField(20);
		cPassText.setBounds(250, 255, 320, 25);
		
		//Add To frame
		 fam.add(name);fam.add(nameText);
		 fam.add(username);fam.add(usrText);
		 fam.add(gender);fam.add(m);fam.add(f);fam.add(o);
		 fam.add(address);fam.add(addText);
		 fam.add(dob);fam.add(yr);fam.add(mt);fam.add(dt);
		 fam.add(phone);fam.add(phonText);
		 fam.add(password);fam.add(passText);
		 fam.add(c_password);fam.add(cPassText);
		 fam.add(faculty);fam.add(c1);fam.add(c2);fam.add(c3);
		 fam.add(register);
		
		register.addActionListener(this);//onclick it will call action perform
		
		fam.setLayout(null);
		fam.setSize(700,500);
		fam.setVisible(true);
	}
	
	public static void main(String[] args) {
		Register t = new Register();
		t.register();
	}
	
@Override
public void actionPerformed(ActionEvent e) {
	String username = usrText.getText();
	System.out.println("Hello " +username);
}
}
