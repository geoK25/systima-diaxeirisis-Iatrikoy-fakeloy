package test;

import java.awt.Container;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;


public class search {
	
	String searchstring;
	String name;
	String surname;
	String amka;
	boolean chk_1;
	boolean chk_2;
	boolean chk_3;
	boolean stop = false;
	String host = "jdbc:mysql://127.0.0.1:3306/mixaniki";
	String uName = "root";
	String uPass= "test";
	int id = 0,i;
	JPanel position;

	public search(String text,boolean chk1,boolean chk2,boolean chk3,JPanel pos){
		searchstring = text;
		chk_1 = chk1;
		chk_2 = chk2;
		chk_3 = chk3;
		position = pos;
	}
	
	public search(String text_1,String text_2,String text_3){
		name=text_1;
		surname=text_2;
		amka=text_3;
	}
	
	public ResultSet Combosearch()
    {
		String sql,sql1;
		if (searchstring.equals("*")){
			sql = "SELECT * FROM patients";
			sql1 = "SELECT COUNT(*) FROM patients";
		}
		else{
			if ((searchstring.isEmpty() || searchstring.equals("* για όλες τις εγγραφές")) && (chk_1 == false && chk_2 == false && chk_3 == false)){
		    	JOptionPane.showMessageDialog(position, "Παρακαλώ επιλέξτε κριτήριο αναζήτητης και\nπληκτρολογήστε μία τιμή στην φόρμα αναζήτησης.","Σφάλμα αναζήτησης",JOptionPane.ERROR_MESSAGE);
		    	return null;
			}
		    else if (!searchstring.isEmpty() && (chk_1 == false && chk_2 == false && chk_3 == false)){
		    	JOptionPane.showMessageDialog(position, "Παρακαλώ επιλέξτε κριτήριο αναζήτητης.","Σφάλμα αναζήτησης",JOptionPane.ERROR_MESSAGE);
		    	return null;
		    }
		    else if (searchstring.isEmpty() && (chk_1 == true || chk_2 == true || chk_3 == true)){
		    	JOptionPane.showMessageDialog(position, "Πληκτρολογήστε μία τιμή στην φόρμα αναζήτησης.","Σφάλμα αναζήτησης",JOptionPane.ERROR_MESSAGE);
		    	return null;
			}
			if (chk_1 == true){
				sql = "SELECT * FROM patients WHERE Pname LIKE '" + searchstring + "%'";
				sql1 = "SELECT COUNT(*) FROM patients WHERE Pname LIKE '" + searchstring + "%'";
			}
			else if (chk_2 == true){
				sql = "SELECT * FROM patients WHERE Psurname LIKE '" + searchstring + "%'";
				sql1 = "SELECT COUNT(*) FROM patients WHERE Psurname LIKE '" + searchstring + "%'";
			}
			else{
				sql = "SELECT * FROM patients WHERE Pamka LIKE '" + searchstring + "%'";
				sql1 = "SELECT COUNT(*) FROM patients WHERE Pamka LIKE '" + searchstring + "%'";
			}
		}
		try
		{
			Connection con = DriverManager.getConnection( host, uName, uPass );
			Statement stmt2 = con.createStatement();
			Statement stmt = con.createStatement();
			Statement stmt1 = con.createStatement();
			ResultSet count = stmt2.executeQuery(sql1);
			ResultSet rs = null,rs1 = null;
			int pl = 0;
			if (!count.next()){
		    }
		    else{
		    	do{
					pl = count.getInt(1);
			    } while(count.next());
		    }
			count.close();
			if (pl>1){
				//stmt = con.createStatement();
			    rs = stmt.executeQuery(sql);
			    ResultSetTableModel1 model = new ResultSetTableModel1(rs);
			   
			    JTable dTable = new JTable(model);	  
			    JFrame frame1 = new JFrame();
			    
				JDialog dialog = new JDialog(frame1,"Πολλαπλά αποτελέσματα",true);
				//dialog.getContentPane().add(scrollPane);
				dialog.setBounds(100, 100, 806, 371);
				//dialog.setVisible(true);
				dialog.getContentPane().setLayout(null);
				dialog.addWindowListener(new WindowAdapter() {
			         public void windowClosing(WindowEvent windowEvent){
			        	 stop = true;
			        	 dialog.setVisible(false);
			         }        
			      });
				dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				dialog.setResizable(false);
				dialog.setLocationRelativeTo(position);
				ListSelectionModel selectionModel = dTable.getSelectionModel();
		        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		        dTable.getTableHeader().setReorderingAllowed(false);
				
				JScrollPane scrollPane = new JScrollPane(dTable);
				scrollPane.setBounds(10, 10, 781, 294);
				dialog.getContentPane().add(scrollPane);
				
				JButton btn = new JButton("Επιλογή");
				dialog.getContentPane().add(btn);
				btn.setBounds(298, 309, 100, 25);
				
				JButton btn_1 = new JButton("ʼκυρο");
				dialog.getContentPane().add(btn_1);
				btn_1.setBounds(408, 309, 100, 25);
				
				btn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
				        i = dTable.getSelectedRow();
		                if (i == -1){
		        	    	JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε έναν ασθενή.","Σφάλμα",JOptionPane.ERROR_MESSAGE);
		                }
		                else{
		                	id = (int) dTable.getValueAt(i, 0);
		                	dialog.setVisible(false);
		                }
					}
				});
				
				btn_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						stop = true;
						dialog.setVisible(false);
					}
				});
				dialog.setVisible(true);
				
				if (stop){
					return null;
				}
				sql = "SELECT * FROM patients WHERE PatientId =" + id;
				rs1 = stmt1.executeQuery(sql);
				rs.close();
			}
			else{
				rs1 = stmt1.executeQuery(sql);
			}
		    return rs1;
		}
		catch ( SQLException err ) 
		{
			System.out.println( err.getMessage( ) );
			return null;
	    }
    }
    
    public ResultSet Simplesearch()
    {
		try
		{
			Connection con = DriverManager.getConnection( host, uName, uPass );
			Statement stmt = con.createStatement();
			String sql = "SELECT PatientId FROM patients WHERE Pname ='" + name + "' AND Psurname ='" + surname + "' AND Pamka ='" + amka + "'";
		    ResultSet rs = stmt.executeQuery(sql);
		    return rs;
		}
		catch ( SQLException err ) 
		{
			System.out.println( err.getMessage( ) );
			return null;
	    }
    }
    
    public ResultSet searchpaper(int pId){
    	String sql;
		try
		{
			Connection con = DriverManager.getConnection( host, uName, uPass );
			Statement stmt = con.createStatement();
		    sql = "SELECT PatientpaperName FROM patientpaper WHERE PatientId = " + pId;
		    ResultSet rs = stmt.executeQuery(sql);
		    return rs;
		}
		catch ( SQLException err ) 
		{
			System.out.println( err.getMessage( ) );
			return null;
		}
    }
    
    public ResultSet searchimage(int pId){
		String sql;
    	try
		{
			Connection con = DriverManager.getConnection( host, uName, uPass );
			Statement stmt = con.createStatement();
			sql = "SELECT PatientimageName FROM patientimage WHERE PatientId = " + pId;
		    ResultSet rs = stmt.executeQuery(sql);
		    return rs;
		}
		catch ( SQLException err ) 
		{
			System.out.println( err.getMessage( ) );
			return null;
		}
    }
    
    
}
