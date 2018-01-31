package test;

import java.awt.event.*;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import static java.nio.file.StandardCopyOption.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Window.Type;

import javax.swing.JTable;

public class Improved extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane,ControlPanel,AdminPanel,SecretaryButtons,DoctorButtons,NurseButtons,ShowPanel,StartPanel,CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,panel,Adduser,Deleteuser,DbControl;
	private JTextField Pnametext,Psurnametext,Paddresstext,Pbirthtext,Pphonetext,Pmobiletext,Pamkatext,Pjobtext,Pforeastext,textField,textField_1,textField_2,textField_3,textField_4,textField_5;
	private JTextField textField_6,textField_7,textField_8,textField_9,textField_10,textField_11,textField_12,textField_13,textField_14,textField_15,textField_16,textField_17,textField_18,textField_19;
	private JTextField textField_20,textField_21,textField_22,textField_23,textField_24,textField_25,textField_26,textField_27,textField_28,Search1;
	private JButton AdminCreate,AdminShow,AdminEditF,AdminEditH,button,SecretaryCreate,SecretaryShow,SecretaryEditF,SecretaryEditH,btnNewButton,btnNewButton_1,button_8,button_9,button_10,btnNewButton_5,btnNewButton_6,button_12;
	private JButton DoctorShow,DoctorEditH,NurseShow,Saveandback,Saveandhistory,Nosaveandback,button_1,btnNewButton_2,btnNewButton_3,button_2,button_5,button_6,button_7,button_3,button_4,button_11,btnNewButton_7;
	private JLabel PatientTitle,PatientName,PatientSurname,PatientAddress,PatientBirth,Patientphone,PatientMobile,PatientAmka,lblNewLabel,lblEpagelma,lblForeas,PatientInfo,lblNewLabel_4,lblNewLabel_1,lblNewLabel_7;
	private JLabel label_1,label_2,label_3,label_4,label_5,label_6,label_7,label_8,label_9,label_10,label_11,label_12,label_13,lblEgrafaEksetaseon,lblNewLabel_5,lblIstoriko,lblApeikonistikesEksetaseis,lblNewLabel_8;
	private JLabel label_26,label_14,label_15,label_16,label_17,label_18,label_19,label_20,label_21,label_22,label_23,label_24,label_25,label_27,label_28,label,lblNewLabel_2,lblNewLabel_3,lblNewLabel_6;
	private JLabel label_29,label_30,label_31,label_32,label_33,label_34,label_35,lbl_1,lblNewLabel_10;
	private JCheckBox wedyeschk,wednochk,checkBox,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,checkBox_6,checkBox_7,checkBox_8,checkBox_9,chckbxNewCheckBox,chckbxNewCheckBox_1,chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3,checkBox_10,checkBox_11;
	private JScrollPane scrollPane,scrollPane_1,scrollPane_2,scrollPane_3,scrollPane_4,scrollPane_5,scrollPane_6,scrollPane_7,scrollPane_8,scrollPane_10,scrollPane_11;
	private JTextArea Pinfotext,textArea,textArea_1,textArea_2,textArea_3,textArea_4;
	private JList list,list_1,list_2,list_3;
	private JTable table,table_1,table_2,table_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup1 = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	CardLayout cards1 = new CardLayout(0,0);
	CardLayout cards2 = new CardLayout(0,0);
	DefaultListModel papers = new DefaultListModel();
	DefaultListModel papers1 = new DefaultListModel();
	DefaultListModel images = new DefaultListModel();
	DefaultListModel images1 = new DefaultListModel();
	String host = "jdbc:mysql://127.0.0.1:3306/mixaniki";
	String uName = "root";
	String uPass= "test";
	public int PatientId = 0;
	public static boolean a;

	/**
	 * Launch the application.
	 */
	//Improved frame = new Improved(Type, Title);
	public static void main(String Type, String Title) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final Improved frame = new Improved(Type, Title);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Improved(String Type, String Title) {
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
		addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	        	 Close();
	         }        
	      });
		
		ControlPanel = new JPanel();
		ControlPanel.setBounds(10, 11, 185, 396);
		contentPane.add(ControlPanel);
		ControlPanel.setLayout(cards1);
		
		AdminPanel = new JPanel();
		AdminPanel.setBackground(new Color(135, 206, 250));
		AdminPanel.setLayout(null);
		ControlPanel.add(AdminPanel, "name_55606972356244");
		
		AdminCreate = new JButton("Δημιουργία Φακέλου");
		AdminCreate.setBackground(new Color(135, 206, 250));
		AdminCreate.setToolTipText("Εισαγωγή στοιχείων ασθενή (δημογραφικά/κοινωνικοοικονομικά δεδομένα) στην Βάση Δεδομένων");
		AdminCreate.setBounds(10, 11, 165, 35);
		AdminPanel.add(AdminCreate);
		
		AdminShow = new JButton("Προβολή Φακέλου");
		AdminShow.setBackground(new Color(135, 206, 250));
		AdminShow.setToolTipText("Προβολή στοιχείων και ιστορικού ασθενή");
		AdminShow.setBounds(10, 57, 165, 35);
		AdminPanel.add(AdminShow);
		
		AdminEditF = new JButton("Επεξεργασία Φακέλου");
		AdminEditF.setBackground(new Color(135, 206, 250));
		AdminEditF.setToolTipText("Επεξεργασία δημογραφικών και κοινωνικοοικονομικών δεδομένων ιατρικού φακέλου");
		AdminEditF.setBounds(10, 103, 165, 35);
		AdminPanel.add(AdminEditF);
		
		AdminEditH = new JButton("Επεξεργασία ιστορικού");
		AdminEditH.setBackground(new Color(135, 206, 250));
		AdminEditH.setToolTipText("Επεξεργασία ιστορικού ενός ασθενή");
		AdminEditH.setBounds(10, 149, 165, 35);
		AdminPanel.add(AdminEditH);
		
		lblNewLabel = new JLabel("Λειτουργίες Διαχειριστή");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 195, 165, 50);
		AdminPanel.add(lblNewLabel);
		
		button = new JButton("Προσθήκη Χρήστη");
		button.setBackground(new Color(135, 206, 250));
		button.setToolTipText("");
		button.setBounds(10, 256, 165, 35);
		AdminPanel.add(button);
		
		button_8 = new JButton("Διαγραφή Χρήστη");
		button_8.setBackground(new Color(135, 206, 250));
		button_8.setToolTipText("");
		button_8.setBounds(10, 302, 165, 35);
		AdminPanel.add(button_8);
		
		button_12 = new JButton("Βάση δεδομένων...");
		button_12.setBackground(new Color(135, 206, 250));
		button_12.setToolTipText("");
		button_12.setBounds(10, 348, 165, 35);
		AdminPanel.add(button_12);
		
		SecretaryButtons = new JPanel();
		SecretaryButtons.setBackground(new Color(135, 206, 250));
		ControlPanel.add(SecretaryButtons, "name_53290284938659");
		SecretaryButtons.setLayout(null);
		
		SecretaryCreate = new JButton("Δημιουργία Φακέλου");
		SecretaryCreate.setBackground(new Color(135, 206, 250));
		SecretaryCreate.setToolTipText("Εισαγωγή στοιχείων ασθενή (δημογραφικά/κοινωνικοοικονομικά δεδομένα) στην Βάση Δεδομένων");
		SecretaryCreate.setBounds(10, 11, 165, 35);
		SecretaryButtons.add(SecretaryCreate);
		
		SecretaryShow = new JButton("Προβολή Φακέλου");
		SecretaryShow.setBackground(new Color(135, 206, 250));
		SecretaryShow.setToolTipText("Προβολή στοιχείων και ιστορικού ασθενή");
		SecretaryShow.setBounds(10, 57, 165, 35);
		SecretaryButtons.add(SecretaryShow);
		
		SecretaryEditF = new JButton("Επεξεργασία Φακέλου");
		SecretaryEditF.setBackground(new Color(135, 206, 250));
		SecretaryEditF.setToolTipText("Επεξεργασία δημογραφικών και κοινωνικοοικονομικών δεδομένων ιατρικού φακέλου");
		SecretaryEditF.setBounds(10, 103, 165, 35);
		SecretaryButtons.add(SecretaryEditF);
		
		SecretaryEditH = new JButton("Επεξεργασία ιστορικού");
		SecretaryEditH.setBackground(new Color(135, 206, 250));
		SecretaryEditH.setToolTipText("Επεξεργασία ιστορικού ενός ασθενή");
		SecretaryEditH.setBounds(10, 149, 165, 35);
		SecretaryButtons.add(SecretaryEditH);
		
		DoctorButtons = new JPanel();
		DoctorButtons.setBackground(new Color(135, 206, 250));
		DoctorButtons.setLayout(null);
		ControlPanel.add(DoctorButtons, "name_54708498895424");
		
		DoctorShow = new JButton("Προβολή Φακέλου");
		DoctorShow.setBackground(new Color(135, 206, 250));
		DoctorShow.setToolTipText("Προβολή στοιχείων και ιστορικού ασθενή");
		DoctorShow.setBounds(10, 11, 165, 35);
		DoctorButtons.add(DoctorShow);
		
		DoctorEditH = new JButton("Επεξεργασία ιστορικού");
		DoctorEditH.setBackground(new Color(135, 206, 250));
		DoctorEditH.setToolTipText("Επεξεργασία ιστορικού ενός ασθενή");
		DoctorEditH.setBounds(10, 57, 165, 35);
		DoctorButtons.add(DoctorEditH);
		
		NurseButtons = new JPanel();
		NurseButtons.setBackground(new Color(135, 206, 250));
		NurseButtons.setLayout(null);
		ControlPanel.add(NurseButtons, "name_55226608996976");
		
		NurseShow = new JButton("Προβολή Φακέλου");
		NurseShow.setBackground(new Color(135, 206, 250));
		NurseShow.setToolTipText("Προβολή στοιχείων και ιστορικού ασθενή");
		NurseShow.setBounds(10, 11, 165, 35);
		NurseButtons.add(NurseShow);
		
		ShowPanel = new JPanel();
		ShowPanel.setBounds(205, 11, 803, 708);
		contentPane.add(ShowPanel);
		ShowPanel.setLayout(cards2);
		
		StartPanel = new JPanel();
		StartPanel.setBackground(new Color(135, 206, 250));
		ShowPanel.add(StartPanel, "name_55894069410689");
		StartPanel.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("intro.png"));
		lblNewLabel_9.setBounds(16, 11, 770, 586);
		StartPanel.add(lblNewLabel_9);
		
		CreatePatientFolder = new JPanel();
		CreatePatientFolder.setBackground(new Color(135, 206, 250));
		ShowPanel.add(CreatePatientFolder, "name_3431036289407");
		CreatePatientFolder.setLayout(null);
		
		PatientTitle = new JLabel("Δημιουργία Ιατρικού φακέλου Ασθενούς");
		PatientTitle.setHorizontalAlignment(SwingConstants.CENTER);
		PatientTitle.setBounds(10, 11, 783, 39);
		CreatePatientFolder.add(PatientTitle);
		
		PatientName = new JLabel("Όνομα:");
		PatientName.setBounds(10, 74, 130, 25);
		CreatePatientFolder.add(PatientName);
		
		PatientSurname = new JLabel("Επώνυμο:");
		PatientSurname.setBounds(10, 110, 130, 25);
		CreatePatientFolder.add(PatientSurname);
		
		PatientAddress = new JLabel("Διεύθυνση:");
		PatientAddress.setBounds(10, 146, 130, 25);
		CreatePatientFolder.add(PatientAddress);
		
		PatientBirth = new JLabel("Ημερομηνία γέννησης:");
		PatientBirth.setBounds(10, 182, 130, 25);
		CreatePatientFolder.add(PatientBirth);
		
		Patientphone = new JLabel("Τηλέφωνο κατοικίας:");
		Patientphone.setBounds(10, 218, 130, 25);
		CreatePatientFolder.add(Patientphone);
		
		PatientMobile = new JLabel("Κινητό τηλέφωνο:");
		PatientMobile.setBounds(10, 254, 130, 25);
		CreatePatientFolder.add(PatientMobile);
		
		PatientAmka = new JLabel("Α.Μ.Κ.Α.:");
		PatientAmka.setBounds(10, 290, 130, 25);
		CreatePatientFolder.add(PatientAmka);
		
		Pnametext = new JTextField();
		Pnametext.setBounds(150, 76, 203, 20);
		Pnametext.setName("Όνομα");
		CreatePatientFolder.add(Pnametext);
		Pnametext.setColumns(10);
		
		Psurnametext = new JTextField();
		Psurnametext.setColumns(10);
		Psurnametext.setName("Επώνυμο");
		Psurnametext.setBounds(150, 112, 203, 20);
		CreatePatientFolder.add(Psurnametext);
		
		Paddresstext = new JTextField();
		Paddresstext.setColumns(10);
		Paddresstext.setBounds(150, 148, 203, 20);
		CreatePatientFolder.add(Paddresstext);
		
		Pbirthtext = new JTextField();
		Pbirthtext.setColumns(10);
		Pbirthtext.setBounds(150, 184, 203, 20);
		CreatePatientFolder.add(Pbirthtext);
		
		Pphonetext = new JTextField();
		Pphonetext.setColumns(10);
		Pphonetext.setBounds(150, 220, 203, 20);
		CreatePatientFolder.add(Pphonetext);
		
		Pmobiletext = new JTextField();
		Pmobiletext.setColumns(10);
		Pmobiletext.setBounds(150, 256, 203, 20);
		CreatePatientFolder.add(Pmobiletext);
		
		Pamkatext = new JTextField();
		Pamkatext.setColumns(10);
		Pamkatext.setName("Α.Μ.Κ.Α.");
		Pamkatext.setBounds(150, 292, 203, 20);
		CreatePatientFolder.add(Pamkatext);
		
		wedyeschk = new JCheckBox("Έγγαμος/Έγγαμη");
		wedyeschk.setBackground(new Color(135, 206, 250));
		buttonGroup.add(wedyeschk);
		wedyeschk.setBounds(10, 354, 124, 23);
		CreatePatientFolder.add(wedyeschk);
		
		wednochk = new JCheckBox("ʼγαμος/ʼγαμη");
		wednochk.setBackground(new Color(135, 206, 250));
		buttonGroup.add(wednochk);
		wednochk.setBounds(162, 354, 124, 23);
		CreatePatientFolder.add(wednochk);
		
		lblEpagelma = new JLabel("Επάγγελμα:");
		lblEpagelma.setBounds(10, 412, 130, 25);
		CreatePatientFolder.add(lblEpagelma);
		
		lblForeas = new JLabel("Φορέας απασχόλησης:");
		lblForeas.setBounds(10, 448, 130, 25);
		CreatePatientFolder.add(lblForeas);
		
		Pjobtext = new JTextField();
		Pjobtext.setColumns(10);
		Pjobtext.setBounds(150, 414, 203, 20);
		CreatePatientFolder.add(Pjobtext);
		
		Pforeastext = new JTextField();
		Pforeastext.setColumns(10);
		Pforeastext.setBounds(150, 450, 203, 20);
		CreatePatientFolder.add(Pforeastext);
		
		PatientInfo = new JLabel("Προσωπικές συνήθειες:");
		PatientInfo.setBounds(407, 74, 162, 25);
		CreatePatientFolder.add(PatientInfo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(407, 110, 343, 182);
		CreatePatientFolder.add(scrollPane);
		
		Pinfotext = new JTextArea();
		scrollPane.setViewportView(Pinfotext);
		
		Saveandback = new JButton("Αποθήκευση & επιστροφή στην αρχική");
		Saveandback.setBackground(new Color(135, 206, 250));
		Saveandback.setBounds(10, 674, 252, 23);
		CreatePatientFolder.add(Saveandback);
		
		Saveandhistory = new JButton("Αποθήκευση & επεξεργασία ιστορικού");
		Saveandhistory.setBackground(new Color(135, 206, 250));
		Saveandhistory.setBounds(272, 674, 259, 23);
		CreatePatientFolder.add(Saveandhistory);
		
		Nosaveandback = new JButton("Ακύρωση");
		Nosaveandback.setBackground(new Color(135, 206, 250));
		Nosaveandback.setBounds(541, 674, 252, 23);
		CreatePatientFolder.add(Nosaveandback);
		
		ShowPatientFolder = new JPanel();
		ShowPatientFolder.setBackground(new Color(135, 206, 250));
		ShowPanel.add(ShowPatientFolder, "name_26529029147808");
		ShowPatientFolder.setLayout(null);
		
		label_2 = new JLabel("Προβολή Ιατρικού Φακέλου Ασθενούς");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(10, 11, 783, 39);
		ShowPatientFolder.add(label_2);
		
		label_3 = new JLabel("Όνομα:");
		label_3.setBounds(10, 126, 130, 25);
		ShowPatientFolder.add(label_3);
		
		label_4 = new JLabel("Επώνυμο:");
		label_4.setBounds(10, 162, 130, 25);
		ShowPatientFolder.add(label_4);
		
		label_5 = new JLabel("Διεύθυνση:");
		label_5.setBounds(10, 198, 130, 25);
		ShowPatientFolder.add(label_5);
		
		label_6 = new JLabel("Ημερομηνία γέννησης:");
		label_6.setBounds(10, 234, 130, 25);
		ShowPatientFolder.add(label_6);
		
		label_7 = new JLabel("Τηλέφωνο κατοικίας:");
		label_7.setBounds(10, 270, 130, 25);
		ShowPatientFolder.add(label_7);
		
		label_8 = new JLabel("Κινητό τηλέφωνο:");
		label_8.setBounds(10, 306, 130, 25);
		ShowPatientFolder.add(label_8);
		
		label_9 = new JLabel("Α.Μ.Κ.Α.:");
		label_9.setBounds(10, 342, 130, 25);
		ShowPatientFolder.add(label_9);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(150, 128, 203, 20);
		ShowPatientFolder.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(150, 164, 203, 20);
		ShowPatientFolder.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(150, 200, 203, 20);
		ShowPatientFolder.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(150, 236, 203, 20);
		ShowPatientFolder.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(150, 272, 203, 20);
		ShowPatientFolder.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.WHITE);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(150, 308, 203, 20);
		ShowPatientFolder.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.WHITE);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(150, 344, 203, 20);
		ShowPatientFolder.add(textField_6);
		
		checkBox = new JCheckBox("Έγγαμος/Έγγαμη");
		checkBox.setBackground(new Color(135, 206, 250));
		checkBox.setForeground(Color.BLACK);
		checkBox.setEnabled(false);
		buttonGroup1.add(checkBox);
		checkBox.setBounds(10, 406, 124, 23);
		ShowPatientFolder.add(checkBox);
		
		checkBox_1 = new JCheckBox("ʼγαμος/ʼγαμη");
		checkBox_1.setBackground(new Color(135, 206, 250));
		checkBox_1.setForeground(Color.BLACK);
		checkBox_1.setEnabled(false);
		buttonGroup1.add(checkBox_1);
		checkBox_1.setBounds(162, 406, 124, 23);
		ShowPatientFolder.add(checkBox_1);
		
		label_10 = new JLabel("Επάγγελμα:");
		label_10.setBounds(10, 464, 130, 25);
		ShowPatientFolder.add(label_10);
		
		label_11 = new JLabel("Φορέας απασχόλησης:");
		label_11.setBounds(10, 500, 130, 25);
		ShowPatientFolder.add(label_11);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(150, 466, 203, 20);
		ShowPatientFolder.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.WHITE);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(150, 502, 203, 20);
		ShowPatientFolder.add(textField_8);
		
		label_12 = new JLabel("Προσωπικές συνήθειες:");
		label_12.setBounds(12, 536, 162, 25);
		ShowPatientFolder.add(label_12);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 572, 341, 94);
		ShowPatientFolder.add(scrollPane_3);
		
		textArea = new JTextArea();
		scrollPane_3.setViewportView(textArea);
		textArea.setEditable(false);
		
		button_1 = new JButton("Επιστροφή στην αρχική");
		button_1.setBackground(new Color(135, 206, 250));
		button_1.setBounds(541, 674, 252, 23);
		ShowPatientFolder.add(button_1);
		
		label_13 = new JLabel("Αναζήτηση Ασθενή:");
		label_13.setBounds(10, 61, 118, 25);
		ShowPatientFolder.add(label_13);
		
		textField_9 = new JTextField();
		textField_9.setText("* για όλες τις εγγραφές");
		textField_9.setForeground(Color.GRAY);
		textField_9.setColumns(10);
		textField_9.setBounds(138, 63, 124, 20);
		ShowPatientFolder.add(textField_9);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(376, 162, 417, 174);
		ShowPatientFolder.add(scrollPane_4);
		
		list = new JList(papers1);
		scrollPane_4.setViewportView(list);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(376, 406, 417, 174);
		ShowPatientFolder.add(scrollPane_5);
		
		list_3 = new JList(images1);
		scrollPane_5.setViewportView(list_3);
		
		lblEgrafaEksetaseon = new JLabel("Ιατρικές γνωματεύσεις");
		lblEgrafaEksetaseon.setBounds(376, 137, 169, 14);
		ShowPatientFolder.add(lblEgrafaEksetaseon);
		
		lblNewLabel_5 = new JLabel("απεικονιστικές εξετάσεις");
		lblNewLabel_5.setBounds(376, 381, 169, 14);
		ShowPatientFolder.add(lblNewLabel_5);
		
		lblIstoriko = new JLabel("Ιστορικό Ασθενή");
		lblIstoriko.setBounds(541, 114, 119, 14);
		ShowPatientFolder.add(lblIstoriko);
		
		btnNewButton_2 = new JButton("Προβολή εγγράφου");
		btnNewButton_2.setBackground(new Color(135, 206, 250));
		btnNewButton_2.setBounds(640, 343, 153, 23);
		ShowPatientFolder.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Προβολή εικόνας");
		btnNewButton_3.setBackground(new Color(135, 206, 250));
		btnNewButton_3.setBounds(640, 591, 153, 23);
		ShowPatientFolder.add(btnNewButton_3);
		
		chckbxNewCheckBox = new JCheckBox("Όνομα");
		chckbxNewCheckBox.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBounds(518, 62, 67, 23);
		ShowPatientFolder.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Επώνυμο");
		chckbxNewCheckBox_1.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBounds(587, 62, 82, 23);
		ShowPatientFolder.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("Α.Μ.Κ.Α.");
		chckbxNewCheckBox_2.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setBounds(671, 62, 73, 23);
		ShowPatientFolder.add(chckbxNewCheckBox_2);
		
		button_2 = new JButton("Αναζήτηση");
		button_2.setBackground(new Color(135, 206, 250));
		button_2.setBounds(272, 62, 109, 23);
		ShowPatientFolder.add(button_2);
		
		label_26 = new JLabel("Κριτήριο αναζήτησης:");
		label_26.setBounds(391, 66, 121, 14);
		ShowPatientFolder.add(label_26);
		
		EditPatientFolder = new JPanel();
		EditPatientFolder.setBackground(new Color(135, 206, 250));
		ShowPanel.add(EditPatientFolder, "name_44721350368598");
		EditPatientFolder.setLayout(null);
		
		label_14 = new JLabel("Όνομα:");
		label_14.setBounds(10, 126, 130, 25);
		EditPatientFolder.add(label_14);
		
		label_15 = new JLabel("Επώνυμο:");
		label_15.setBounds(10, 162, 130, 25);
		EditPatientFolder.add(label_15);
		
		label_16 = new JLabel("Διεύθυνση:");
		label_16.setBounds(10, 198, 130, 25);
		EditPatientFolder.add(label_16);
		
		label_17 = new JLabel("Ημερομηνία γέννησης:");
		label_17.setBounds(10, 234, 130, 25);
		EditPatientFolder.add(label_17);
		
		label_18 = new JLabel("Τηλέφωνο κατοικίας:");
		label_18.setBounds(10, 270, 130, 25);
		EditPatientFolder.add(label_18);
		
		label_19 = new JLabel("Κινητό τηλέφωνο:");
		label_19.setBounds(10, 306, 130, 25);
		EditPatientFolder.add(label_19);
		
		label_20 = new JLabel("Α.Μ.Κ.Α.:");
		label_20.setBounds(10, 342, 130, 25);
		EditPatientFolder.add(label_20);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setName("Όνομα");
		textField_10.setBounds(150, 128, 203, 20);
		EditPatientFolder.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setName("Επώνυμο");
		textField_11.setBounds(150, 164, 203, 20);
		EditPatientFolder.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(150, 200, 203, 20);
		EditPatientFolder.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(150, 236, 203, 20);
		EditPatientFolder.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(150, 272, 203, 20);
		EditPatientFolder.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(150, 308, 203, 20);
		EditPatientFolder.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setName("Α.Μ.Κ.Α.");
		textField_16.setBounds(150, 344, 203, 20);
		EditPatientFolder.add(textField_16);
		
		checkBox_2 = new JCheckBox("Έγγαμος/Έγγαμη");
		checkBox_2.setBackground(new Color(135, 206, 250));
		buttonGroup2.add(checkBox_2);
		checkBox_2.setBounds(10, 406, 124, 23);
		EditPatientFolder.add(checkBox_2);
		
		checkBox_3 = new JCheckBox("ʼγαμος/ʼγαμη");
		checkBox_3.setBackground(new Color(135, 206, 250));
		buttonGroup2.add(checkBox_3);
		checkBox_3.setBounds(162, 406, 124, 23);
		EditPatientFolder.add(checkBox_3);
		
		label_21 = new JLabel("Επάγγελμα:");
		label_21.setBounds(10, 464, 130, 25);
		EditPatientFolder.add(label_21);
		
		label_22 = new JLabel("Φορέας απασχόλησης:");
		label_22.setBounds(10, 500, 130, 25);
		EditPatientFolder.add(label_22);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(150, 466, 203, 20);
		EditPatientFolder.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(150, 502, 203, 20);
		EditPatientFolder.add(textField_18);
		
		label_23 = new JLabel("Προσωπικές συνήθειες:");
		label_23.setBounds(407, 126, 162, 25);
		EditPatientFolder.add(label_23);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(407, 162, 343, 182);
		EditPatientFolder.add(scrollPane_6);
		
		textArea_1 = new JTextArea();
		scrollPane_6.setViewportView(textArea_1);
		
		label_24 = new JLabel("Επεξεργασία Ιατρικού Φακέλου Ασθενούς");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setBounds(10, 11, 783, 39);
		EditPatientFolder.add(label_24);
		
		label_25 = new JLabel("Αναζήτηση Ασθενή:");
		label_25.setBounds(10, 61, 118, 25);
		EditPatientFolder.add(label_25);
		
		textField_19 = new JTextField();
		textField_19.setText("* για όλες τις εγγραφές");
		textField_19.setForeground(Color.GRAY);
		textField_19.setColumns(10);
		textField_19.setBounds(138, 63, 124, 20);
		EditPatientFolder.add(textField_19);
		
		checkBox_4 = new JCheckBox("Όνομα");
		checkBox_4.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(checkBox_4);
		checkBox_4.setBounds(518, 62, 67, 23);
		EditPatientFolder.add(checkBox_4);
		
		checkBox_5 = new JCheckBox("Επώνυμο");
		checkBox_5.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(checkBox_5);
		checkBox_5.setBounds(587, 62, 82, 23);
		EditPatientFolder.add(checkBox_5);
		
		checkBox_6 = new JCheckBox("Α.Μ.Κ.Α.");
		checkBox_6.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(checkBox_6);
		checkBox_6.setBounds(671, 62, 73, 23);
		EditPatientFolder.add(checkBox_6);
		
		button_5 = new JButton("Αναζήτηση");
		button_5.setBackground(new Color(135, 206, 250));
		button_5.setBounds(272, 62, 109, 23);
		EditPatientFolder.add(button_5);
		
		button_6 = new JButton("Ακύρωση");
		button_6.setBackground(new Color(135, 206, 250));
		button_6.setBounds(541, 674, 252, 23);
		EditPatientFolder.add(button_6);
		
		button_7 = new JButton("Αποθήκευση & επιστροφή στην αρχική");
		button_7.setBackground(new Color(135, 206, 250));
		button_7.setBounds(279, 674, 252, 23);
		EditPatientFolder.add(button_7);
		
		label_27 = new JLabel("Κριτήρια αναζήτησης:");
		label_27.setBounds(391, 66, 121, 14);
		EditPatientFolder.add(label_27);
		
		EditPatientHistory = new JPanel();
		EditPatientHistory.setBackground(new Color(135, 206, 250));
		ShowPanel.add(EditPatientHistory, "name_25973044171791");
		EditPatientHistory.setLayout(null);
		
		label = new JLabel("Επεξεργασία Ιστορικού ασθενούς");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 11, 783, 39);
		EditPatientHistory.add(label);
		
		lblNewLabel_2 = new JLabel("Αναζήτηση:");
		lblNewLabel_2.setBounds(10, 61, 73, 25);
		EditPatientHistory.add(lblNewLabel_2);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 203, 386, 275);
		EditPatientHistory.add(scrollPane_1);
		list_1 = new JList(papers);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(list_1);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(407, 203, 386, 275);
		EditPatientHistory.add(scrollPane_2);
		
		list_2 = new JList(images);
		list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_2.setViewportView(list_2);
		
		checkBox_7 = new JCheckBox("Όνομα");
		checkBox_7.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(checkBox_7);
		checkBox_7.setBounds(518, 62, 67, 23);
		EditPatientHistory.add(checkBox_7);
		
		checkBox_8 = new JCheckBox("Επώνυμο");
		checkBox_8.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(checkBox_8);
		checkBox_8.setBounds(587, 62, 82, 23);
		EditPatientHistory.add(checkBox_8);
		
		checkBox_9 = new JCheckBox("Α.Μ.Κ.Α.");
		checkBox_9.setBackground(new Color(135, 206, 250));
		buttonGroup_1.add(checkBox_9);
		checkBox_9.setBounds(671, 62, 73, 23);
		EditPatientHistory.add(checkBox_9);
		
		lblNewLabel_3 = new JLabel("<html>Σύρετε τα έγγραφα των εξετάσεων σε αυτήν την περιοχή<br>για να αποθηκευτούν στην βάση δεδομένων...</html>");
		lblNewLabel_3.setBackground(new Color(135, 206, 235));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 563, 386, 100);
		EditPatientHistory.add(lblNewLabel_3);
		TitledBorder b3 = BorderFactory.createTitledBorder("Ανέβασμα ιατρικών γνωματεύσεων");
		lblNewLabel_3.setBorder(b3);
		
		label_1 = new JLabel("<html>Σύρετε τις απεικονιστικές εξετάσεις σε αυτήν την<br> περιοχή για να αποθηκευτούν στην βάση δεδομένων...</html>");
		label_1.setBackground(new Color(135, 206, 235));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(407, 563, 386, 100);
		TitledBorder b1 = BorderFactory.createTitledBorder("Ανέβασμα απεικονιστικών εξετάσεων");
		label_1.setBorder(b1);
		EditPatientHistory.add(label_1);
		
		btnNewButton_1 = new JButton("Αναζήτηση");
		btnNewButton_1.setBackground(new Color(135, 206, 250));
		btnNewButton_1.setBounds(272, 62, 109, 23);
		EditPatientHistory.add(btnNewButton_1);
		
		btnNewButton = new JButton("Επεξεργασία επιλεγμένου εγγράφου");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(10, 489, 243, 23);
		EditPatientHistory.add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("Λίστα ιατρικών γνωματεύσεων");
		lblNewLabel_4.setBounds(10, 167, 194, 25);
		EditPatientHistory.add(lblNewLabel_4);
		
		lblApeikonistikesEksetaseis = new JLabel("Λίστα απεικονιστικών εξετάσεων");
		lblApeikonistikesEksetaseis.setBounds(407, 167, 222, 25);
		EditPatientHistory.add(lblApeikonistikesEksetaseis);
		
		button_3 = new JButton("Επεξεργασία επιλεγμένης εικόνας");
		button_3.setBackground(new Color(135, 206, 250));
		button_3.setBounds(407, 489, 232, 23);
		EditPatientHistory.add(button_3);
		
		button_4 = new JButton("Επιστροφή στην αρχική");
		button_4.setBackground(new Color(135, 206, 250));
		button_4.setBounds(541, 674, 252, 23);
		EditPatientHistory.add(button_4);
		
		label_28 = new JLabel("Κριτήρια αναζήτησης:");
		label_28.setBounds(391, 66, 121, 14);
		EditPatientHistory.add(label_28);
		
		lblNewLabel_1 = new JLabel("Όνομα");
		lblNewLabel_1.setBounds(80, 97, 46, 14);
		EditPatientHistory.add(lblNewLabel_1);
		
		lblNewLabel_6 = new JLabel("Επώνυμο");
		lblNewLabel_6.setBounds(190, 97, 60, 14);
		EditPatientHistory.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Α.Μ.Κ.Α.");
		lblNewLabel_7.setBounds(300, 97, 46, 14);
		EditPatientHistory.add(lblNewLabel_7);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setBounds(80, 122, 100, 20);
		EditPatientHistory.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setBounds(190, 122, 100, 20);
		EditPatientHistory.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setBounds(300, 122, 100, 20);
		EditPatientHistory.add(textField_22);
		textField_22.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Ασθενής:");
		lblNewLabel_8.setBounds(10, 125, 60, 14);
		EditPatientHistory.add(lblNewLabel_8);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(410, 122, 100, 20);
		EditPatientHistory.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(520, 122, 100, 20);
		EditPatientHistory.add(textField_28);
		
		label_34 = new JLabel("Διέυθυνση");
		label_34.setBounds(407, 97, 67, 14);
		EditPatientHistory.add(label_34);
		
		label_35 = new JLabel("Κινητό");
		label_35.setBounds(520, 97, 65, 14);
		EditPatientHistory.add(label_35);
		
		Search1 = new JTextField();
		Search1.setText("* για όλες τις εγγραφές");
		Search1.setForeground(Color.GRAY);
		Search1.setBounds(93, 63, 169, 20);
		EditPatientHistory.add(Search1);
		Search1.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(10, 418, 185, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		
		button_11 = new JButton("Έξοδος");
		button_11.setBackground(new Color(135, 206, 250));
		button_11.setBounds(10, 220, 165, 70);
		panel.add(button_11);
		button_11.setToolTipText("");
		
		Adduser = new JPanel();
		Adduser.setBackground(new Color(135, 206, 250));
		ShowPanel.add(Adduser, "name_44822540546873");
		Adduser.setLayout(null);
		
		label_29 = new JLabel("Προσθήκη Χρήστη");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setBounds(10, 11, 783, 39);
		Adduser.add(label_29);
		
		label_30 = new JLabel("Όνομα:");
		label_30.setBounds(10, 74, 130, 25);
		Adduser.add(label_30);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(150, 76, 203, 20);
		Adduser.add(textField_23);
		
		label_31 = new JLabel("Επώνυμο:");
		label_31.setBounds(10, 110, 130, 25);
		Adduser.add(label_31);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(150, 112, 203, 20);
		Adduser.add(textField_24);
		
		label_32 = new JLabel("Όνομα Χρήστη:");
		label_32.setToolTipText("Χρησιμοποιείται για την σύνδεση του χρήστη στην εφαρμογή");
		label_32.setBounds(10, 146, 130, 25);
		Adduser.add(label_32);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(150, 148, 203, 20);
		Adduser.add(textField_25);
		
		label_33 = new JLabel("Κωδικός Χρήστη:");
		label_33.setBounds(10, 182, 130, 25);
		Adduser.add(label_33);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(150, 184, 203, 20);
		Adduser.add(textField_26);

		chckbxNewCheckBox_3 = new JCheckBox("Γραμματεία");
		buttonGroup_2.add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.setBackground(new Color(135, 206, 250));
		chckbxNewCheckBox_3.setBounds(10, 232, 91, 23);
		Adduser.add(chckbxNewCheckBox_3);
		
		checkBox_10 = new JCheckBox("Γιατρός");
		buttonGroup_2.add(checkBox_10);
		checkBox_10.setBackground(new Color(135, 206, 250));
		checkBox_10.setBounds(103, 232, 75, 23);
		Adduser.add(checkBox_10);
		
		checkBox_11 = new JCheckBox("Νοσοκόμος");
		buttonGroup_2.add(checkBox_11);
		checkBox_11.setBackground(new Color(135, 206, 250));
		checkBox_11.setBounds(180, 232, 97, 23);
		Adduser.add(checkBox_11);
		
		button_9 = new JButton("Αποθήκευση");
		button_9.setBackground(new Color(135, 206, 250));
		button_9.setBounds(541, 674, 252, 23);
		Adduser.add(button_9);
		
		cards1.show(ControlPanel, Type);
		setTitle(Title);
		cards2.show(ShowPanel, "name_55894069410689");
		
		Deleteuser = new JPanel();
		Deleteuser.setBackground(new Color(135, 206, 250));
		ShowPanel.add(Deleteuser, "name_48215700504115");
		Deleteuser.setLayout(null);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 11, 783, 349);
		Deleteuser.add(scrollPane_7);
		
		//table = new JTable();
		//table.getTableHeader().setReorderingAllowed(false);
		//scrollPane_7.setViewportView(table);
		
		button_10 = new JButton("Διαγραφή");
		button_10.setBackground(new Color(135, 206, 250));
		button_10.setBounds(541, 674, 252, 23);
		Deleteuser.add(button_10);
		
		DbControl = new JPanel();
		DbControl.setBackground(new Color(135, 206, 250));
		ShowPanel.add(DbControl, "name_43686653046285");
		DbControl.setLayout(null);
		
		btnNewButton_5 = new JButton("Διαγραφή γνωματεύσεων");
		btnNewButton_5.setBackground(new Color(135, 206, 250));
		btnNewButton_5.setBounds(10, 674, 184, 23);
		DbControl.add(btnNewButton_5);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(10, 11, 783, 280);
		DbControl.add(scrollPane_8);
		
		textArea_2 = new JTextArea();
		scrollPane_8.setViewportView(textArea_2);
		
		scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(10, 383, 385, 280);
		DbControl.add(scrollPane_10);
		
		textArea_3 = new JTextArea();
		scrollPane_10.setViewportView(textArea_3);
		
		scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(408, 383, 385, 280);
		DbControl.add(scrollPane_11);
		
		textArea_4 = new JTextArea();
		scrollPane_11.setViewportView(textArea_4);
		
		btnNewButton_6 = new JButton("Διαγραφή εικόνων");
		btnNewButton_6.setBackground(new Color(135, 206, 250));
		btnNewButton_6.setBounds(646, 674, 147, 23);
		DbControl.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Διαγραφή ασθενών");
		btnNewButton_7.setBackground(new Color(135, 206, 250));
		btnNewButton_7.setBounds(646, 302, 147, 23);
		DbControl.add(btnNewButton_7);
    	getRootPane().setDefaultButton(button_11);
    	
    	lblNewLabel_10 = new JLabel("test");
    	lblNewLabel_10.setBounds(10, 11, 46, 14);
    	panel.add(lblNewLabel_10);
    	actions();
	}
	
	private void actions(){
		
		//admin delete user panel
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					Connection con = DriverManager.getConnection( host, uName, uPass );
					Statement stmt = con.createStatement();
					String sql = "SELECT * FROM users WHERE UserRights <> 1";
					ResultSet rs = stmt.executeQuery(sql);
					ResultSetTableModel1 model = new ResultSetTableModel1(rs);
					table = new JTable(model);
					table.getTableHeader().setReorderingAllowed(false);
					scrollPane_7.setViewportView(table);
					cards2.show(ShowPanel, "name_48215700504115");
				}
				catch ( SQLException err ) 
				{
					System.out.println( err.getMessage( ) );
			    }
			}
		});

		//admin delete patients
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows = table_1.getSelectedRows();
				int[] id = new int[rows.length];
                if (rows.length == 0){
        	    	JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε τουλάχιστον έναν ασθενή.","Σφάλμα",JOptionPane.ERROR_MESSAGE);
                }
                else{
					try {
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						Statement stmt1 = con.createStatement();
						for (int i=0;i<rows.length;i++){
	                		id[i] = (int) table_1.getValueAt(rows[i], 0);
	                		String sql = "DELETE FROM patients WHERE PatientId =" + id[i];
	                		stmt.executeUpdate(sql);
	                	}
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT * FROM patients";
						ResultSet rs = stmt.executeQuery(sql);
						ResultSetTableModel1 model = new ResultSetTableModel1(rs);
						table_1 = new JTable(model);
						table_1.getTableHeader().setReorderingAllowed(false);
						scrollPane_8.setViewportView(table_1);
						cards2.show(ShowPanel, "name_43686653046285");
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
				    }
                }
			}
		});

		//admin delete images
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows = table_3.getSelectedRows();
				int[] id = new int[rows.length];
                if (rows.length == 0){
        	    	JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε τουλάχιστον μία εικόνα.","Σφάλμα",JOptionPane.ERROR_MESSAGE);
                }
                else{
					try {
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						Statement stmt1 = con.createStatement();
						for (int i=0;i<rows.length;i++){
	                		id[i] = (int) table_3.getValueAt(rows[i], 0);
	                		String sql = "DELETE FROM patientimage WHERE PatientimageId =" + id[i];
	                		stmt.executeUpdate(sql);
	                	}
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT * FROM patientimage";
						ResultSet rs = stmt.executeQuery(sql);
						ResultSetTableModel1 model = new ResultSetTableModel1(rs);
						table_3 = new JTable(model);
						table_3.getTableHeader().setReorderingAllowed(false);
						scrollPane_11.setViewportView(table_3);
						cards2.show(ShowPanel, "name_43686653046285");
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
				    }
                }
			}
		});
		
		//admin delete papers
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows = table_2.getSelectedRows();
				int[] id = new int[rows.length];
                if (rows.length == 0){
        	    	JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε τουλάχιστον ένα έγγραφο.","Σφάλμα",JOptionPane.ERROR_MESSAGE);
                }
                else{
					try {
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						Statement stmt1 = con.createStatement();
						for (int i=0;i<rows.length;i++){
	                		id[i] = (int) table_2.getValueAt(rows[i], 0);
	                		String sql = "DELETE FROM patientpaper WHERE PatientpaperId =" + id[i];
	                		stmt.executeUpdate(sql);
	                	}
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT * FROM patientpaper";
						ResultSet rs = stmt.executeQuery(sql);
						ResultSetTableModel1 model = new ResultSetTableModel1(rs);
						table_2 = new JTable(model);
						table_2.getTableHeader().setReorderingAllowed(false);
						scrollPane_10.setViewportView(table_2);
						cards2.show(ShowPanel, "name_43686653046285");
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
				    }
                }
			}
		});
		
		//admin db panel
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					Connection con = DriverManager.getConnection( host, uName, uPass );
					Statement stmt = con.createStatement(),stmt1 = con.createStatement(),stmt2 = con.createStatement();
					String sql = "SELECT * FROM patients";
					String sql1 = "SELECT * FROM patientpaper";
					String sql2 = "SELECT * FROM patientimage";
					ResultSet rs = stmt.executeQuery(sql);
					ResultSetTableModel1 model = new ResultSetTableModel1(rs);
					table_1 = new JTable(model);
					table_1.getTableHeader().setReorderingAllowed(false);
					scrollPane_8.setViewportView(table_1); //megalo
					rs = stmt1.executeQuery(sql1);
					model = new ResultSetTableModel1(rs);
					table_2 = new JTable(model);
					table_2.getTableHeader().setReorderingAllowed(false);
					scrollPane_10.setViewportView(table_2); //mikro
					rs = stmt2.executeQuery(sql2);
					model = new ResultSetTableModel1(rs);
					table_3 = new JTable(model);
					table_3.getTableHeader().setReorderingAllowed(false);
					scrollPane_11.setViewportView(table_3); //mikro
					cards2.show(ShowPanel, "name_43686653046285");
				}
				catch ( SQLException err ) 
				{
					System.out.println( err.getMessage( ) );
			    }
			}
		});
		
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] rows = table.getSelectedRows();
				int[] id = new int[rows.length];
                if (rows.length == 0){
        	    	JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε τουλάχιστον έναν χρήστη.","Σφάλμα",JOptionPane.ERROR_MESSAGE);
                }
                else{
					try {
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						Statement stmt1 = con.createStatement();
						//final DefaultTableModel model = new DefaultTableModel();
						for (int i=0;i<rows.length;i++){
	                		id[i] = (int) table.getValueAt(rows[i], 0);
	                		String sql = "DELETE FROM users WHERE UserId =" + id[i];
	                		stmt.executeUpdate(sql);
	                	}
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT * FROM users WHERE UserRights <> 1";
						ResultSet rs = stmt.executeQuery(sql);
						ResultSetTableModel1 model = new ResultSetTableModel1(rs);
						table = new JTable(model);
						table.getTableHeader().setReorderingAllowed(false);
						scrollPane_7.setViewportView(table);
						cards2.show(ShowPanel, "name_48215700504115");
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
				    }
                }
			}
		});
		
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int privil;
				if (chckbxNewCheckBox_3.isSelected()){
					privil = 2;
				}
				else if (checkBox_10.isSelected()){
					privil = 3;	
				}
				else{
					privil = 4;
				}
				try
				{
					Connection con = DriverManager.getConnection( host, uName, uPass );
					Statement stmt = con.createStatement();
					String sql = "INSERT INTO users (UserRights,UserName,UserSurname,UserNick,UserPass) VALUES (" + privil
							+ ",'" + textField_23.getText() + "','" + textField_24.getText() + "','" + textField_25.getText() + "','" + textField_26.getText() + "')";	
				    stmt.executeUpdate(sql);
				    con.close();
				}
				catch ( SQLException err ) 
				{
					System.out.println( err.getMessage( ) );
				}
				JOptionPane.showMessageDialog(Adduser, "Η εγγραφή του χρήστη " + textField_23.getText() + " " + textField_24.getText() + " ολοκληρώθηκε επιτυχώς" ,"Εγγραφή ολοκληρώθηκε",JOptionPane.INFORMATION_MESSAGE);
				cards2.show(ShowPanel, "name_55894069410689");
				Clear clc = new Clear(new JPanel[]{Adduser},new ButtonGroup[]{buttonGroup_2},new JTextArea[]{},new DefaultListModel[]{});
				clc.ClearTab();
			}
		});
		
		Saveandback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int wedding;
				if (wedyeschk.isSelected()){
					wedding = 1;
				}
				else{
					wedding = 0;	
				}
				Check chk = new Check(new JTextField[]{Pnametext,Psurnametext,Pamkatext},CreatePatientFolder);
				if (chk.check()){
					try
					{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "INSERT INTO patients (Pname,Psurname,Paddress,Pbirth,Pphone,Pmobile,Pamka,Pjob,Pforeas,Pinfo,Pwedding)"
								+ "VALUES ('" + Pnametext.getText() + "','" + Psurnametext.getText() + "','" + Paddresstext.getText() + "','" + Pbirthtext.getText() + "','"
								+ Pphonetext.getText() + "','" + Pmobiletext.getText() + "','" + Pamkatext.getText() + "','" + Pjobtext.getText() + "','" + Pforeastext.getText() + "','"
								+ Pinfotext.getText() + "'," + wedding + ")";
					    stmt.executeUpdate(sql);
					    con.close();
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
					}
			    	File f=new File("Βάση Δεδομένων\\" + Pnametext.getText() + " " + Psurnametext.getText() + "-" + Pamkatext.getText() +"\\images");
			    	f.mkdirs();
			    	f=new File("Βάση Δεδομένων\\" + Pnametext.getText() + " " + Psurnametext.getText() + "-" + Pamkatext.getText() + "\\papers");
			    	f.mkdirs();
					cards2.show(ShowPanel, "name_55894069410689");
					Clear clc = new Clear(new JPanel[]{CreatePatientFolder},new ButtonGroup[]{buttonGroup},new JTextArea[]{Pinfotext},new DefaultListModel[]{});
					clc.ClearTab();
				}
			}
		});
		
		Saveandhistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int wedding;
				if (wedyeschk.isSelected()){
					wedding = 1;
				}
				else{
					wedding = 0;	
				}
				Check chk = new Check(new JTextField[]{Pnametext,Psurnametext,Pamkatext},CreatePatientFolder);
				if (chk.check()){
					try
					{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "INSERT INTO patients (Pname,Psurname,Paddress,Pbirth,Pphone,Pmobile,Pamka,Pjob,Pforeas,Pinfo,Pwedding)"
								+ "VALUES ('" + Pnametext.getText() + "','" + Psurnametext.getText() + "','" + Paddresstext.getText() + "','" + Pbirthtext.getText() + "','"
								+ Pphonetext.getText() + "','" + Pmobiletext.getText() + "','" + Pamkatext.getText() + "','" + Pjobtext.getText() + "','" + Pforeastext.getText() + "','"
								+ Pinfotext.getText() + "'," + wedding + ")";
					    stmt.executeUpdate(sql);
					    con.close();
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
					}
			    	File f=new File("Βάση Δεδομένων\\" + Pnametext.getText() + " " + Psurnametext.getText() + "-" + Pamkatext.getText() + "\\images");
			    	f.mkdirs();
			    	f=new File("Βάση Δεδομένων\\" + Pnametext.getText() + " " + Psurnametext.getText() + "-" + Pamkatext.getText() + "\\papers");
			    	f.mkdirs();
			    	cards2.show(ShowPanel, "name_25973044171791");
			    	Search1.setText(Pnametext.getText());
			    	textField_20.setText(Pnametext.getText());
			    	textField_21.setText(Psurnametext.getText());
			    	textField_22.setText(Pamkatext.getText());
			    	checkBox_7.setSelected(true);
			    	search result = new search(Pnametext.getText(),Psurnametext.getText(),Pamkatext.getText());
					ResultSet rs = result.Simplesearch();
					try
					{
					    if (!rs.next()){
					    }
					    else{
						    do{
								PatientId = rs.getInt("PatientId");
						    } while(rs.next());
					    }
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
					}
					Clear clc = new Clear(new JPanel[]{CreatePatientFolder},new ButtonGroup[]{buttonGroup},new JTextArea[]{Pinfotext},new DefaultListModel[]{});
					clc.ClearTab();
				}
			}
		});
		
		Nosaveandback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_55894069410689");
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder},new ButtonGroup[]{buttonGroup},new JTextArea[]{Pinfotext},new DefaultListModel[]{});
				clc.ClearTab();
			}
		});
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_55894069410689");
		    	Clear clc = new Clear(new JPanel[]{ShowPatientFolder},new ButtonGroup[]{buttonGroup1,buttonGroup_1},new JTextArea[]{textArea},new DefaultListModel[]{papers1,images1});
				clc.ClearTab();
			}
		});
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s = (String) list.getSelectedValue();
				String path = null;
				if (s == null){
					JOptionPane.showMessageDialog(ShowPatientFolder, "Παρακαλώ επιλέξτε κάποιο έγγραφο από την παραπάνω\nλίστα για να το προβάλετε.","Προβολή αρχείου",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					try
					{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT PatientpaperPath FROM patientpaper WHERE PatientpaperName ='" + s + "'";
					    ResultSet rs = stmt.executeQuery(sql);
					    if (!rs.next()){
					    	//tha prepei na exo lousei kati poli gia na min iparxei
					    }
					    else{
						    do{
								path = rs.getString(1);
						    } while(rs.next());
					    }
					    rs.close();
					    con.close();
					} 
					catch (Exception ex) 
					{
						ex.printStackTrace();
					}
					JFrame frame1 = new JFrame();
					frame1.setVisible(true);
					frame1.setBounds(100, 100, 512, 384);
					frame1.setTitle(s);
					
					JScrollPane scrollPane_4 = new JScrollPane();
					frame1.getContentPane().add(scrollPane_4);
					
					JTextArea textArea = new JTextArea();
					scrollPane_4.setViewportView(textArea);
					textArea.setEditable(false);
	                try
	                {
	                    FileReader reader = new FileReader( path );
	                    BufferedReader br = new BufferedReader(reader);
	                    textArea.read( br, null );
	                    br.close();
	                    textArea.requestFocus();
	                }
	                catch(Exception e2) 
	                { 
	                	System.out.println(e2); 
	                }
				}
			}
		});
		
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s = (String) list_3.getSelectedValue();
				String path = null;
				if (s == null){
					JOptionPane.showMessageDialog(ShowPatientFolder, "Παρακαλώ επιλέξτε κάποια εικόνα από την παραπάνω\nλίστα για να την προβάλετε.","Προβολή εικόνας",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					try
					{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT PatientimagePath FROM patientimage WHERE PatientimageName ='" + s + "'";
					    ResultSet rs = stmt.executeQuery(sql);
					    if (!rs.next()){
					    	//tha prepei na exo lousei kati poli gia na min iparxei
					    }
					    else{
						    do{
								path = rs.getString(1);
						    } while(rs.next());
					    }
					    rs.close();
					    con.close();
					} 
					catch (Exception ex) 
					{
						ex.printStackTrace();
					}
					JFrame frame1 = new JFrame();
					frame1.setVisible(true);
					frame1.setBounds(100, 100, 512, 384);
					frame1.setTitle(s);
					
					JScrollPane scrollPane = new JScrollPane();
					frame1.getContentPane().add(scrollPane);
					
					ImageIcon image = new ImageIcon(path);
					JLabel label = new JLabel(image);
					frame1.getContentPane().add(label);
					scrollPane.setViewportView(label);
			        frame1.getContentPane().add(scrollPane);
				}
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				papers1.removeAllElements();
				images1.removeAllElements();
				String temp;
				String temp1;
				search result = new search(textField_9.getText(),chckbxNewCheckBox.isSelected(),chckbxNewCheckBox_1.isSelected(),chckbxNewCheckBox_2.isSelected(),contentPane);
				ResultSet rs = result.Combosearch();
				if (rs == null){
					return;
				}
			    try {
					if (!rs.next()){
						JOptionPane.showMessageDialog(ShowPatientFolder, "Δεν βρέθηκε ασθενής με τα συγκεκριμένα στοιχεία.\nΠαρακαλώ ξαναπροσπαθείστε.","Αναζήτηση ολοκληρώθηκε",JOptionPane.ERROR_MESSAGE);
					}
					else{
					    do{
					    	PatientId = rs.getInt(1);
					    	textField.setText(rs.getString(2));
					    	textField_1.setText(rs.getString(3));
					    	textField_2.setText(rs.getString(4));
					    	textField_3.setText(rs.getString(5));
					    	textField_4.setText(rs.getString(6));
					    	textField_5.setText(rs.getString(7));
					    	textField_6.setText(rs.getString(8));
					    	textField_7.setText(rs.getString(9));
					    	textField_8.setText(rs.getString(10));
					    	textArea.setText(rs.getString(11));
					    	int i = rs.getInt(12);
					    	if (i==0){
					    		checkBox_1.setSelected(true);
					    	}
					    	else{
					    		checkBox.setSelected(true);
					    	}
					    	
					    } while(rs.next());
					}
				    rs.close();
				    rs = result.searchpaper(PatientId);
				    if (!rs.next()){
				    }
				    else{
					    do{
					    	temp = (rs.getString(1));
					    	papers1.addElement(temp);
					    } while(rs.next());
				    }
				    rs.close();
				    rs = result.searchimage(PatientId);
				    if (!rs.next()){
				    }
				    else{
					    do{
					    	temp1 = (rs.getString(1));
					    	images1.addElement(temp1);
					    } while(rs.next());
				    }
				    rs.close();
				}
			    catch (HeadlessException | SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				search result = new search(textField_19.getText(),checkBox_4.isSelected(),checkBox_5.isSelected(),checkBox_6.isSelected(),contentPane);
				ResultSet rs = result.Combosearch();
				if (rs == null){
					return;
				}
				try
				{
				    if (!rs.next()){
				    	JOptionPane.showMessageDialog(EditPatientFolder, "Δεν βρέθηκε ασθενής με τα συγκεκριμένα στοιχεία.\nΠαρακαλώ ξαναπροσπαθείστε.","Αναζήτηση ολοκληρώθηκε",JOptionPane.ERROR_MESSAGE);
				    }
				    else{
					    do{
					    	PatientId = rs.getInt(1);
					    	textField_10.setText(rs.getString(2));
					    	textField_11.setText(rs.getString(3));
					    	textField_12.setText(rs.getString(4));
					    	textField_13.setText(rs.getString(5));
					    	textField_14.setText(rs.getString(6));
					    	textField_15.setText(rs.getString(7));
					    	textField_16.setText(rs.getString(8));
					    	textField_17.setText(rs.getString(9));
					    	textField_18.setText(rs.getString(10));
					    	textArea_1.setText(rs.getString(11));
					    	int i = rs.getInt(12);
					    	if (i==0){
					    		checkBox_3.setSelected(true);
					    	}
					    	else{
					    		checkBox_2.setSelected(true);
					    	}
					    	
					    } while(rs.next());
				    }
				    rs.close();
				}
				catch ( SQLException err ) 
				{
					System.out.println( err.getMessage( ) );
				}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				papers.removeAllElements();
				images.removeAllElements();
				String temp,temp1;
				search result = new search(Search1.getText(),checkBox_7.isSelected(),checkBox_8.isSelected(),checkBox_9.isSelected(),contentPane);
				ResultSet rs = result.Combosearch();
				if (rs == null){
					return;
				}
				try
				{
				    if (!rs.next()){
				    	JOptionPane.showMessageDialog(EditPatientHistory, "Δεν βρέθηκε ασθενής με τα συγκεκριμένα στοιχεία.\nΠαρακαλώ ξαναπροσπαθείστε.","Αναζήτηση ολοκληρώθηκε",JOptionPane.ERROR_MESSAGE);
				    }
				    else{
					    do{
							PatientId = rs.getInt(1);
					    	textField_20.setText(rs.getString(2));
					    	textField_21.setText(rs.getString(3));
					    	textField_22.setText(rs.getString(8));
					    	textField_27.setText(rs.getString(4));
					    	textField_28.setText(rs.getString(7));
					    } while(rs.next());
				    }
				    rs.close();
				    rs = result.searchpaper(PatientId);
				    if (!rs.next()){
				    }
				    else{
					    do{
					    	temp = (rs.getString(1));
					    	papers.addElement(temp);
					    } while(rs.next());
				    }
				    rs.close();
				    rs = result.searchimage(PatientId);
				    if (!rs.next()){
				    }
				    else{
					    do{
					    	temp1 = (rs.getString(1));
					    	images.addElement(temp1);
					    } while(rs.next());
				    }
				    rs.close();
				}
				catch ( SQLException err ) 
				{
					System.out.println( err.getMessage( ) );
				}
				
			}
		});
		
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards2.show(ShowPanel, "name_55894069410689");
				Clear clc = new Clear(new JPanel[]{EditPatientFolder},new ButtonGroup[]{buttonGroup2},new JTextArea[]{textArea_1},new DefaultListModel[]{});
				clc.ClearTab();
			}
		});
		
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int wedding;
				String temp = null,temp1 = null,temp2 = null;
				if (checkBox_2.isSelected()){
					wedding = 1;
				}
				else{
					wedding = 0;	
				}
				Check chk = new Check(new JTextField[]{textField_10,textField_11,textField_16},EditPatientFolder);
				if (chk.check()){
					try
					{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						Statement stmt1 = con.createStatement();
						String sql = "SELECT Pname,Psurname,Pamka FROM patients WHERE PatientId =" + PatientId;
					    ResultSet rs = stmt.executeQuery(sql);
					    if (!rs.next()){
					    	//logika iparxei
					    }
					    else{
						    do{
						    	temp = rs.getString(1);
						    	temp1 = rs.getString(2);
						    	temp2 = rs.getString(3);
						    } while(rs.next());
					    }
						String sql1 = "UPDATE patients SET Pname= '" + textField_10.getText() + "',Psurname='" + textField_11.getText() + "',Paddress='" + textField_12.getText() + "',Pbirth='"
								+ textField_13.getText() + "',Pphone='" + textField_14.getText() + "',Pmobile='" + textField_15.getText() + "',Pamka='" + textField_16.getText() + "',Pjob='"
								+ textField_17.getText() + "',Pforeas='" + textField_18.getText() + "',Pinfo='" + textArea_1.getText() + "',Pwedding=" + wedding + " WHERE "
								+ "PatientId =" + PatientId;
					    stmt1.executeUpdate(sql1);
					    rs.close();
					    con.close();
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
					}
			    	File f=new File("Βάση Δεδομένων\\" + temp + " " + temp1 + "-" + temp2);
			    	File f1=new File("Βάση Δεδομένων\\" + textField_10.getText() + " " + textField_11.getText() + "-" + textField_16.getText());
			    	f.renameTo(f1);
					cards2.show(ShowPanel, "name_55894069410689");
					Clear clc = new Clear(new JPanel[]{EditPatientFolder},new ButtonGroup[]{buttonGroup2,buttonGroup_1},new JTextArea[]{textArea_1},new DefaultListModel[]{});
					clc.ClearTab();
				}
			}
		});
		
		lblNewLabel_3.setDropTarget(new DropTarget(){
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public synchronized void drop(DropTargetDropEvent evt) {
	            try {
					Connection con = DriverManager.getConnection( host, uName, uPass );
					PreparedStatement stmt = null;
					Statement stmt1 = con.createStatement();
	                evt.acceptDrop(DnDConstants.ACTION_COPY);
	                List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData( DataFlavor.javaFileListFlavor);
	                String temp1 = "";
	                for (File file : droppedFiles) {
	                	if (!file.getName().toLowerCase().endsWith(".txt")){
	                		temp1 += file.getName() + "\n";
	                	}
	                	else{
	                		File f = new File("Βάση Δεδομένων\\" + textField_20.getText() + " " + textField_21.getText() + "-" + textField_22.getText() + "\\papers\\" + file.getName());
		                	Files.copy(file.toPath(), f.toPath(), REPLACE_EXISTING);
							String sql = "SELECT * FROM patientpaper WHERE PatientpaperName = '" + file.getName() + "' and PatientId =" + PatientId;
						    ResultSet rs = stmt1.executeQuery(sql);
						    if (!rs.next()){
								String sql1 = "INSERT INTO patientpaper (PatientpaperName,PatientpaperPath,PatientId) VALUES (?,?,?)";
							      stmt = con.prepareStatement(sql1);
							      stmt.setString(1, file.getName());
							      stmt.setString(2, f.toString());
							      stmt.setInt(3, PatientId);
							      stmt.executeUpdate();
						    }
						    else{
						    	//iparxei idi to arxeio
						    }
						    rs.close();
	                	}	
	                }
	                papers.removeAllElements();
				    String sql = "SELECT PatientpaperName,PatientpaperPath FROM patientpaper WHERE PatientId = " + PatientId;
				    ResultSet rs1 = stmt1.executeQuery(sql);
				    String temp;
				    if (!rs1.next()){
				    }
				    else{
					    do{
					    	temp = (rs1.getString(1));
					    	papers.addElement(temp);
					    } while(rs1.next());
				    }
				    rs1.close();
				    con.close();
				    if (!temp1.isEmpty()){
						JOptionPane.showMessageDialog(EditPatientHistory, "Η εφαρμογή υποστηρίζει έγγραφα με επέκταση \".txt\".\nΑποτυχία αποθήκευσης των παρακάτω αρχείων:\n\n" + temp1,"Αποτυχία Αποθήκευσης Εγγράφων",JOptionPane.ERROR_MESSAGE);
				    }
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }			
		});
		
		label_1.setDropTarget(new DropTarget(){
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public synchronized void drop(DropTargetDropEvent evt) {
	            try {
					Connection con = DriverManager.getConnection( host, uName, uPass );
					PreparedStatement stmt = null;
					Statement stmt1 = con.createStatement();
	                evt.acceptDrop(DnDConstants.ACTION_COPY);
	                List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData( DataFlavor.javaFileListFlavor);
	                String temp1 = "";
	                for (File file : droppedFiles) {
	                	if ((!file.getName().toLowerCase().endsWith(".png")) && (!file.getName().toLowerCase().endsWith(".jpeg")) && (!file.getName().toLowerCase().endsWith(".jpg"))){
	                		temp1 += file.getName() + "\n";
	                	}
	                	else{
		                	File f = new File("Βάση Δεδομένων\\" + textField_20.getText() + " " + textField_21.getText() + "-" + textField_22.getText() + "\\images\\" + file.getName());
		                	Files.copy(file.toPath(), f.toPath(), REPLACE_EXISTING);
							String sql = "SELECT * FROM patientimage WHERE PatientimageName = '" + file.getName() + "' and PatientId =" + PatientId;
						    ResultSet rs = stmt1.executeQuery(sql);
						    if (!rs.next()){
								String sql1 = "INSERT INTO patientimage (PatientimageName,PatientimagePath,PatientId) VALUES (?,?,?)";
							      stmt = con.prepareStatement(sql1);
							      stmt.setString(1, file.getName());
							      stmt.setString(2, f.toString());
							      stmt.setInt(3, PatientId);
							      stmt.executeUpdate();
						    }
						    else{
						    	//iparxei idi to arxeio
						    }
						    rs.close();
	                	}
	                }
	                images.removeAllElements();
				    String sql = "SELECT PatientimageName,PatientimagePath FROM patientimage WHERE PatientId = " + PatientId;
				    ResultSet rs1 = stmt1.executeQuery(sql);
				    String temp;
				    if (!rs1.next()){
				    }
				    else{
					    do{
					    	temp = (rs1.getString(1));
					    	images.addElement(temp);
					    } while(rs1.next());
				    }
				    rs1.close();
				    con.close();
				    if (!temp1.isEmpty()){
						JOptionPane.showMessageDialog(EditPatientHistory, "Η εφαρμογή υποστηρίζει εικόνες με επέκταση \".png\", \".jpeg\".\nΑποτυχία αποθήκευσης των παρακάτω αρχείων:\n\n" + temp1,"Αποτυχία Αποθήκευσης Εικόνων",JOptionPane.ERROR_MESSAGE);
				    }
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }			
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s = (String) list_1.getSelectedValue();
				String path = null;
				if (s==null){
					JOptionPane.showMessageDialog(EditPatientHistory, "Παρακαλώ επιλέξτε κάποιο έγγραφο από την παραπάνω\nλίστα για να το επεξεργαστείτε.","Επεξεργασία αρχείου",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					try
					{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT PatientpaperPath FROM patientpaper WHERE PatientpaperName ='" + s + "'";
					    ResultSet rs = stmt.executeQuery(sql);
					    if (!rs.next()){
					    	//tha prepei na exo lousei kati poli gia na min iparxei
					    }
					    else{
						    do{
								path = rs.getString(1);
						    } while(rs.next());
					    }
					    File fi = new File(path);
					    rs.close();
					    con.close();
					    try {
							Desktop.getDesktop().edit(fi);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
					}
				}
			}
		});
		
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s = (String) list_2.getSelectedValue();
				String path = null;
				if (s==null){
					JOptionPane.showMessageDialog(EditPatientHistory, "Παρακαλώ επιλέξτε κάποια εικόνα από την παραπάνω\nλίστα για να την επεξεργαστείτε.","Επεξεργασία εικόνας",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					try
					{
						Connection con = DriverManager.getConnection( host, uName, uPass );
						Statement stmt = con.createStatement();
						String sql = "SELECT PatientimagePath FROM patientimage WHERE PatientimageName ='" + s + "'";
					    ResultSet rs = stmt.executeQuery(sql);
					    if (!rs.next()){
					    	//tha prepei na exo lousei kati poli gia na min iparxei
					    }
					    else{
						    do{
								path = rs.getString(1);
						    } while(rs.next());
					    }
					    File fi = new File(path);
					    rs.close();
					    con.close();
					    try {
							Desktop.getDesktop().edit(fi);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					catch ( SQLException err ) 
					{
						System.out.println( err.getMessage( ) );
					}
				}
			}
		});
		
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_55894069410689");
		    	Clear clc = new Clear(new JPanel[]{EditPatientHistory},new ButtonGroup[]{buttonGroup_1},new JTextArea[]{},new DefaultListModel[]{papers,images});
				clc.ClearTab();
			}
		});
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Close();
			}
		});
		
		SecretaryCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards2.show(ShowPanel, "name_3431036289407");
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
			}
		});
		SecretaryShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_26529029147808");
				getRootPane().setDefaultButton(button_2);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
			}
		});
		SecretaryEditH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_25973044171791");
				getRootPane().setDefaultButton(btnNewButton_1);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
				Search1.setText("* για όλες τις εγγραφές");
			}
		});
		SecretaryEditF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_44721350368598");
				getRootPane().setDefaultButton(button_5);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
			}
		});
		DoctorShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_26529029147808");
				getRootPane().setDefaultButton(button_2);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
			}
		});
		DoctorEditH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_25973044171791");
				getRootPane().setDefaultButton(btnNewButton_1);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
			}
		});
		NurseShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards2.show(ShowPanel, "name_26529029147808");
				getRootPane().setDefaultButton(button_2);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
			}
		});
		AdminCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getRootPane().setDefaultButton(button_2);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
				cards2.show(ShowPanel, "name_3431036289407");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Infotext clc = new Infotext();
				//clc.text("createpatient");
				lblNewLabel_10.setText(clc.text("createpatient"));
			}
		});
		AdminShow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getRootPane().setDefaultButton(button_2);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
				textField_9.setText("* για όλες τις εγγραφές");
				textField_9.setForeground(Color.GRAY);
				cards2.show(ShowPanel, "name_26529029147808");
			}
		});
		AdminEditH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getRootPane().setDefaultButton(btnNewButton_1);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
				Search1.setForeground(Color.GRAY);
				Search1.setText("* για όλες τις εγγραφές");
				cards2.show(ShowPanel, "name_25973044171791");
			}
		});
		AdminEditF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getRootPane().setDefaultButton(button_5);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
				textField_19.setText("* για όλες τις εγγραφές");
				textField_19.setForeground(Color.GRAY);
				cards2.show(ShowPanel, "name_44721350368598");
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cards2.show(ShowPanel, "name_44822540546873");
				getRootPane().setDefaultButton(button_5);
				Clear clc = new Clear(new JPanel[]{CreatePatientFolder,ShowPatientFolder,EditPatientFolder,EditPatientHistory,Adduser},new ButtonGroup[]{buttonGroup_1,buttonGroup,buttonGroup1,buttonGroup2},new JTextArea[]{Pinfotext,textArea,textArea_1},new DefaultListModel[]{papers,images,papers1,images1});
				clc.ClearTab();
			}
		});
		
		Search1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (Search1.getText().equals("* για όλες τις εγγραφές")){
					Search1.setText("");
					Search1.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (Search1.getText().isEmpty()){
					Search1.setForeground(Color.GRAY);
					Search1.setText("* για όλες τις εγγραφές");
				}
			}
		});
		
		textField_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_9.getText().equals("* για όλες τις εγγραφές")){
					textField_9.setText("");
					textField_9.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField_9.getText().isEmpty()){
					textField_9.setForeground(Color.GRAY);
					textField_9.setText("* για όλες τις εγγραφές");
				}
			}
		});
		
		textField_19.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_19.getText().equals("* για όλες τις εγγραφές")){
					textField_19.setText("");
					textField_19.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField_19.getText().isEmpty()){
					textField_19.setForeground(Color.GRAY);
					textField_19.setText("* για όλες τις εγγραφές");
				}
			}
		});
	}
	
	private void Close() {
	    int reply = JOptionPane.showConfirmDialog(contentPane, "Είστε σίγουροι ότι θέλετε να αποσυνδεθείτε?", "Patient Management System", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
        	System.exit(0);
        }
        else{
        	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
	}
}
