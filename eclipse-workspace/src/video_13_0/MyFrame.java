package video_13_0;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class MyFrame extends JFrame implements TableModelListener{

	MyTableModel myTableModel;
	JTable myTable;
	
	public MyFrame(String winTitle){
		super(winTitle);
		
	}
	
	myTableModel = new MyTableModel();
	
	
	
	@Override
	public void tableChanged(TableModelEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

	class MyTableModel extends AbstractTableModel {

		
		 // The data for JTable should be here
		
		
		
		List<Order> myData = new ArrayList<Order>();
		
		
		
		
		
		
		
		
		
		
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object getValueAt(int arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		
		
		
	}
	
	
	
}
