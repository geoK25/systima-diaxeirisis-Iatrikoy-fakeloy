package test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Check {
	JTextField[] text;
	JPanel panel;
	String temp ="",temp1 ="";
	String host = "jdbc:mysql://127.0.0.1:3306/mixaniki";
	String uName = "root";
	String uPass= "test";

	public Check(JTextField[] txt, JPanel pan){
		text = txt;
		panel = pan;
	}
	
	public boolean check(){
		for (JTextField field : text){
			if (field.getText().isEmpty()){
				temp += field.getName() + " ";
			}
			if (field.getName() == "Α.Μ.Κ.Α." && !field.getText().isEmpty()){
				if (amka(field)){
					temp1 += "Ο συγκεκριμένος Α.Μ.Κ.Α. είναι καταχωρημένος σε άλλον ασθενή.\nΠαρακαλώ ελέγξτε για τυπογραφικά λάθη.";
				}
			}
		}
		if (temp.isEmpty() && temp1.isEmpty()){
			return true; //ola koble
		}
		else if (temp1.isEmpty() && !temp.isEmpty()){
	    	JOptionPane.showMessageDialog(panel, "Τα πεδία " + temp + "είναι υποχρεωτικά.","Σφάλμα",JOptionPane.ERROR_MESSAGE);
	    	return false;
		}
		else if (!temp1.isEmpty() && temp.isEmpty()){
	    	JOptionPane.showMessageDialog(panel,temp1,"Σφάλμα",JOptionPane.ERROR_MESSAGE);
	    	return false;
		}
		else{
			JOptionPane.showMessageDialog(panel, "Τα πεδία " + temp + "είναι υποχρεωτικά.\n" + temp1,"Σφάλμα",JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}


	private boolean amka(JTextField chk){
		try
		{
			Connection con = DriverManager.getConnection( host, uName, uPass );
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM patients WHERE Pamka ='" + chk.getText() + "'";
		    ResultSet rs = stmt.executeQuery(sql);
		    if (!rs.next()){
		    	return false; //den iparxei o amka
		    }
		    else{
		    	return true; //iparxei
		    }
		}
		catch ( SQLException err ) 
		{
			System.out.println( err.getMessage( ) );
			return false;
	    }
	}
}

/* mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
        	 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.exit(0);
         }        
      }); */
//todo list