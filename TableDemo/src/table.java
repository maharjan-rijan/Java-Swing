import javax.swing.*;

public class table {
	JFrame f;
	JTable jt;
	table(){
		f = new JFrame("Personal Records");
		String data[][] = {{"101", "Rijan Maharjan", "Rs. 50,900"},
		{"102", "Sunaina Maharjan", "Rs. 10,900"},
		{"103", "Suhana Maharjan", "Rs.1,000"}};
		String column[] = {"ID", "Name","Salary"};
		jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp = new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 200);
		f.setVisible(true);
		}
	
	public static void main(String[] args) {
		new search();
	}
}
