package test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class ResultSetTableModel1 extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
      Constructs the table model.
      @param aResultSet the result set to display.
	*/
	public ResultSetTableModel1(ResultSet aResultSet)
	{  
		rs = aResultSet;
		try
		{  
			rsmd = rs.getMetaData();
		}
		catch (SQLException e)
		{  
			e.printStackTrace();
		}
	}

	public String getColumnName(int c)
	{  
		try
		{  
			String temp = rsmd.getColumnName(c + 1);
			switch (temp){
			case "PatientId":
				temp = "Κωδικός";
				break;
			case "Pname":
				temp = "Όνομα";
				break;
			case "Psurname":
				temp = "Επώνυμο";
				break;
			case "Pbirth":
				temp = "Ημ.Γέννησης";
				break;
			case "Paddress":
				temp = "Διεύθυνση";
				break;
			case "Pphone":
				temp = "Σταθερό τηλ.";
				break;
			case "Pmobile":
				temp = "Κινητό τηλ.";
				break;
			case "Pamka":
				temp = "Α.Μ.Κ.Α.";
				break;
			case "UserRights":
				temp = "Δικαιώματα";
				break;
			case "UserName":
				temp = "Όνομα";
				break;
			case "UserSurname":
				temp = "Επώνυμο";
				break;
			case "UserNick":
				temp = "Όνομα χρήστη";
				break;
			case "UserPass":
				temp = "Κωδικός πρόσβασης";
				break;
			}
			return temp;
		}
		catch (SQLException e)
		{  
			e.printStackTrace();
			return "";
		}
	}

	public int getColumnCount()
	{  
		try
		{  
			switch (rsmd.getTableName(1)){
			case "patients":
				return rsmd.getColumnCount()-4;
			case "users":
				return rsmd.getColumnCount();
			}
			return rsmd.getColumnCount();
		}
		catch (SQLException e)
		{  
			e.printStackTrace();
			return 0;
		}
	}
	
	public Object getValueAt(int r, int c)
	{  
		try
		{  
			rs.absolute(r + 1);
			return rs.getObject(c + 1);
		}
		catch(SQLException e)
		{  
			e.printStackTrace();
			return null;
		}
	}

	public int getRowCount()
	{  
		try
		{  
			rs.last();
			return rs.getRow();
		}
		catch(SQLException e)
		{  
			e.printStackTrace();
			return 0;
		}
	}

	private ResultSet rs;
	private ResultSetMetaData rsmd;
}
