package program.penjualan.handphone;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dodoedoo
 */
public class Model_penyimpanan {
    
    private DefaultTableModel tabel = new DefaultTableModel();
    public Model_penyimpanan(){
        
        getTabel().addColumn("No");
        getTabel().addColumn("Tipe Handphone");
        getTabel().addColumn("Harga Satuan");
       
    }
    
  
    public DefaultTableModel getTabel() {
        return tabel;
    }
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
 
    
     
}
