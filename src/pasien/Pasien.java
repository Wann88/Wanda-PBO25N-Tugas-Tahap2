/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasien;
import config.configDB;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Pasien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        configDB objekku = new configDB();
//        if (objekku.duplicateKey("dokter", "id_dokter", "1")){
//            JOptionPane.showMessageDialog(null, "Maaf Kode DVD sudah ada");
//        }else{
//            JOptionPane.showMessageDialog(null, "Kode DVD Belum Ada");
//        }

        new gui.mainFrame().setVisible(true);
        
    }
    
}
