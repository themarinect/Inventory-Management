/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import entity.BillDetail;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Bach Ngoc  Toan
 */
public class BillDetails extends AbstractTableModel {
private ArrayList<entity.BillDetail> details;
    private final String columnsName[] = {"ItemID", "Price", "Quantity","Total"};
    private final Class columnsClass[] = {String.class, Float.class, Integer.class,Float.class};

    public BillDetails(ArrayList<BillDetail> details) {
        this.details = details;
    }

    public int getRowCount() {
        return details.toArray().length;
    }

    public int getColumnCount() {
        return columnsName.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0:
                return details.get(rowIndex).getItemID();

            case 1:
               return details.get(rowIndex).getPrice();

            case 2:
                return details.get(rowIndex).getQuantity();
             case 3:
                 return details.get(rowIndex).getPrice()*details.get(rowIndex).getQuantity();
            default:
                return null;

        }
    }
    @Override
    public String getColumnName(int iCol) {
        return columnsName[iCol];
    }

    @Override
    public Class getColumnClass(int iCol) {
        return columnsClass[iCol];
    }

}
