import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class note implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file, edit, help;
	JMenuItem cut, copy, paste, selectAll, save, open, nt, nw, sa, del;
	JTextArea ta;
	String strPath = "", strName = "";
	note(){
		f = new JFrame();
		//File
		nt = new JMenuItem("New Tab");
		nw = new JMenuItem("New Windows");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		sa = new JMenuItem("Save As");
		del = new JMenuItem("Delete");
		//Edit
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		open.addActionListener(this);
		selectAll.addActionListener(this);
		save.addActionListener(this);
		del.addActionListener(this);
		
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		file.add(nt);file.add(nw);file.add(open);file.add(save); 		file.add(sa);file.add(del);
		edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
		mb.add(file);mb.add(edit);mb.add(help);
		ta = new JTextArea();
		ta.setBounds(5, 5, 360, 320);
		f.add(mb);f.add(ta);
		f.setJMenuBar(mb);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)
			ta.cut();
		if(e.getSource()==paste)
			ta.paste();
		if(e.getSource()==copy)
			ta.copy();
		if(e.getSource()==open) {
			 try {
			      File myObj = new File("filename.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException o) {
			      System.out.println("An error occurred.");
			      o.printStackTrace();
			    }
			  }
		if(e.getSource()==selectAll)
			ta.selectAll();
		if(e.getSource()==save) {
			try {
			      File myObj = new File("filename.txt");
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException s) {
			      System.out.println("An error occurred.");
			      s.printStackTrace();
			    }
			  }
		if(e.getSource()==del) {
			File myObj = new File("filename.txt"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
		    } 
	}
public static void main(String[] args) {
		new note();
	}

}
