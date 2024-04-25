
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class search implements ActionListener{
	JFrame frame, frame1;
	JTextField textbox;
	JLabel label;
	JButton button;
	JPanel panel;
	static JTable table;
	
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/java";
	String userName = "root";
	String password = "";
	String[] columnNames = {"id", "name", "address","contact"};

	search()
	{
		frame = new JFrame("Database Search Result");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		textbox = new JTextField();
		textbox.setBounds(120,30,150,20); 
		label = new JLabel("Enter your roll no");
		label.setBounds(10, 30, 100, 20);
		button = new JButton("search");
		button.setBounds(120,130,150,20);
		button.addActionListener(this);

		frame.add(textbox);
		frame.add(label);
		frame.add(button);
		frame.setVisible(true);
		frame.setSize(500, 400);		
	}	
	
	public void actionPerformed(ActionEvent ae)
	{
		button = (JButton)ae.getSource();
			showTableData();			
	}	
	
	public void showTableData()
	{
		
		frame1 = new JFrame("Database Search");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(new BorderLayout());		

		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);

		table = new JTable();
		table.setModel(model);		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
				
		String textvalue = textbox.getText();
		int id;
		String name= "";
		String address = "";
		String contact = "";
		try
		{				
			Connection con = DriverManager.getConnection(url, userName, password);
			String sql = "select * from employee where name = '"+textvalue+"'";
			PreparedStatement ps = con.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        int i =0;
			if(rs.next())
	        {
				id = rs.getInt("id");
				name = rs.getString("name");
				address = rs.getString("address");	
				contact = rs.getString("contact");
				model.addRow(new Object[]{id, name, address, contact});
				i++;				
	        }
			if(i <1)
			{
				JOptionPane.showMessageDialog(null, "No Record Found","Error",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
					JOptionPane.ERROR_MESSAGE);
		}
		frame1.add(scroll);
		frame1.setVisible(true);
		frame1.setSize(400,300);
	}
	
}
