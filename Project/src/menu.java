import javax.swing.*;

public class menu {

	JMenu menu, subMenu;
	JMenuItem i1, i2, i3, s1, s2, s3, s4;
	menu(){
		JFrame f = new JFrame("Swing Menu");
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("Item 1");
		i2 = new JMenuItem("Item 2");
		i3 = new JMenuItem("Item 3");
		
		s1 = new JMenuItem("Sub s1");
		s2 = new JMenuItem("Sub s2");
		s3 = new JMenuItem("Sub s3");
		s4 = new JMenuItem("Sub s4");
		subMenu.add(s1);subMenu.add(s2);subMenu.add(s3);subMenu.add(s4);
		menu.add(i1);menu.add(i2); menu.add(i3);
		
		menu.add(subMenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new menu();
	}

}