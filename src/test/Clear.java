package test;

import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Clear {
	private JPanel[] jpanel;
	private ButtonGroup[] buttongroup;
	private JTextArea[] jtextarea;
	private DefaultListModel[] defaultlistmodel;

	public Clear(JPanel[] panel,ButtonGroup[] group,JTextArea[] area,DefaultListModel[] model){
		jpanel = panel;
		buttongroup = group;
		jtextarea = area;
		defaultlistmodel = model;
	}
	

	public void ClearTab(){
		for (JPanel panel : jpanel) {
			Component[] components = panel.getComponents();
			for (Component C : components)
			{    
			    if (C instanceof JTextField){
	
			        ((JTextComponent) C).setText("");
			    }
			}
		}
		
		for (ButtonGroup group : buttongroup) {
		    group.clearSelection();
		}
		
		for (JTextArea text : jtextarea) {
		    text.setText("");
		}
		
		for (DefaultListModel model : defaultlistmodel) {
			model.removeAllElements();
		}
	}
}
