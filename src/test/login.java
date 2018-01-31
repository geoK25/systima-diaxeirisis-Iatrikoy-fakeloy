package test;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.DropMode;

import java.awt.Window.Type;

import javax.swing.JPasswordField;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class login {
	
	String host = "jdbc:mysql://127.0.0.1:3306/mixaniki";
	String uName = "root";
	String uPass= "";//"test";
	private JFrame frame;
	private JLabel lblNewLabel;
	private JButton button;
	private JTextField textField;
	private JTextField textField_1;
	String testuser = "Όνομα Χρήστη";
	String testpass = "Κωδικός Πρόσβασης";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					login window = new login();
					window.frame.setVisible(true);
				}
			    catch (Exception e) {
			    	e.printStackTrace();
			    }
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		actions();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				button.requestFocusInWindow();
				frame.getRootPane().setDefaultButton(button);
			}
		});
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setResizable(false);
		frame.setBounds(100, 100, 537, 229);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Patient Management System");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("user-icon1.png"));
		lblNewLabel.setBounds(10, 11, 180, 180);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText(testuser);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.GRAY);
		textField.setColumns(10);
		textField.setBounds(241, 49, 220, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText(testpass);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(241, 91, 220, 20);
		frame.getContentPane().add(textField_1);
		
		button = new JButton("Σύνδεση");
		button.setBackground(new Color(135, 206, 250));
		button.setBounds(306, 132, 89, 23);
		frame.getContentPane().add(button);
		button.requestFocusInWindow();
	}
	
	private void actions() {
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (textField.getText().equals("Όνομα Χρήστη")){
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().isEmpty()){
					textField.setForeground(Color.GRAY);
					textField.setText("Όνομα Χρήστη");
				}
			}
		});
		
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_1.getText().equals("Κωδικός Πρόσβασης")){
					textField_1.setText("");
					textField_1.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField_1.getText().isEmpty()){
					textField_1.setForeground(Color.GRAY);
					textField_1.setText("Κωδικός Πρόσβασης");
				}
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Rights = 0;
		        String Name;
		        String Surname;
		        String Type = null;
		        String Title = null;
		        if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField.getText().equals("Όνομα Χρήστη") || textField_1.getText().equals("Κωδικός Πρόσβασης")){
			    	JOptionPane.showMessageDialog(frame, "Συμπληρώστε τα πεδία για να συνδεθείτε.","Αποτυχία Σύνδεσης",JOptionPane.ERROR_MESSAGE);
		        }
		        else{
					try
					{
			        	Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT * FROM users WHERE UserNick ='" + textField.getText() + "'";
						ResultSet rs = stmt.executeQuery(sql);
					    if (!rs.next()){
					    	JOptionPane.showMessageDialog(frame, "Λανθασμένο όνομα χρήστη.\nΑν δεν έχετε λογαριασμό ή αν ξεχάσατε τα στοιχεία\nσας απευθυνθείτε στον διαχειριστή του συστήματος.","Αποτυχία Σύνδεσης",JOptionPane.ERROR_MESSAGE);
					    }
					    else{
					    	Statement stmt1 = con.createStatement();
							sql = "SELECT * FROM users WHERE UserPass ='" + textField_1.getText() + "'";
							rs = stmt1.executeQuery(sql);
							if (!rs.next()){
						    	JOptionPane.showMessageDialog(frame, "Λανθασμένος κωδικός πρόσβασης.\nΑν δεν έχετε λογαριασμό ή αν ξεχάσατε τα στοιχεία\nσας απευθυνθείτε στον διαχειριστή του συστήματος.","Αποτυχία Σύνδεσης",JOptionPane.ERROR_MESSAGE);
						    }
							else{
								Statement stmt2 = con.createStatement();
								sql = "SELECT UserRights,Username,UserSurname FROM users WHERE UserNick ='" + textField.getText() + "' AND UserPass ='" + textField_1.getText() + "'";
							    rs = stmt2.executeQuery(sql);
							    if (!rs.next()){
							    	JOptionPane.showMessageDialog(frame, "Λανθασμένο όνομα χρήστη ή κωδικός πρόσβασης.\nΑν δεν έχετε λογαριασμό ή αν ξεχάσατε τα στοιχεία\nσας απευθυνθείτε στον διαχειριστή του συστήματος.","Αποτυχία Σύνδεσης",JOptionPane.ERROR_MESSAGE);
							    }
							    else{
								    do{
								    	Rights = rs.getInt(1);
								        Name = rs.getString(2);
								        Surname = rs.getString(3);
								    } while(rs.next());
								    switch (Rights){
								    case 1:
								    	Type = "name_55606972356244";
								    	Title = "Διαχειριστής - " + Surname + " " + Name;
								    	break;
								    case 2:
								    	Type = "name_53290284938659";
								    	Title = "Γραμματεία - " + Surname + " " + Name;
								    	break;
								    case 3:
								    	Type = "name_54708498895424";
								    	Title = "Γιατρός - " + Surname + " " + Name;
								    	break;
								    case 4:
								    	Type = "name_55226608996976";
								    	Title ="Νοσοκόμος - " + Surname + " " + Name;
								    	break;
								    }
								    test.Improved.main(Type,Title);
									frame.setVisible(false);
							    }
							    rs.close();
							    con.close();
							}
					    }
					}
					catch ( SQLException | ClassNotFoundException err ) 
					{
				    	JOptionPane.showMessageDialog(frame,"Ήταν αδύνατη η επικοινωνία με την Βάση Δεδομένων.\n\n" + "Σφάλμα: " + err.getMessage( ),"Αποτυχία Σύνδεσης",JOptionPane.ERROR_MESSAGE);
					}
		        }
			}
		});
	}
}
