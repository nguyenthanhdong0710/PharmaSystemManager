
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rondw
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setSize(1000, 700);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtablesc123 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        rdoTien = new javax.swing.JRadioButton();
        rdoThe = new javax.swing.JRadioButton();
        cbx1 = new javax.swing.JComboBox<>();
        btnPrint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jsfQuantity = new com.toedter.components.JSpinField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dong", "1999", "Nam", "DZ"},
                {"Quan", "1991", "KXD", "(n)"},
                {"Long", "1992", "KXD", "(y)"}
            },
            new String [] {
                "1", "2", "3", "4"
            }
        ));
        jtablesc123.setViewportView(tblGridView);

        getContentPane().add(jtablesc123);
        jtablesc123.setBounds(70, 310, 720, 210);
        getContentPane().add(txt1);
        txt1.setBounds(210, 90, 160, 24);
        getContentPane().add(txt2);
        txt2.setBounds(210, 130, 160, 24);
        getContentPane().add(txt3);
        txt3.setBounds(210, 170, 160, 24);

        buttonGroup1.add(rdoTien);
        rdoTien.setSelected(true);
        rdoTien.setText("Tiền");
        getContentPane().add(rdoTien);
        rdoTien.setBounds(420, 210, 56, 28);

        buttonGroup1.add(rdoThe);
        rdoThe.setText("Thẻ");
        getContentPane().add(rdoThe);
        rdoThe.setBounds(560, 210, 53, 28);

        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dong DZ", "Quan XZ", "Long XZ", "Dai XZ", "Hiep XZ" }));
        getContentPane().add(cbx1);
        cbx1.setBounds(420, 140, 270, 26);

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint);
        btnPrint.setBounds(400, 570, 57, 32);

        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 90, 11, 16);

        jLabel2.setText("Thanh Tien");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 180, 80, 16);

        jLabel3.setText("Ten");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 140, 21, 16);

        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 220, 90, 16);
        getContentPane().add(jsfQuantity);
        jsfQuantity.setBounds(210, 210, 160, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

        // TODO add your handling code here:
        try {
            JasperDesign jasdi = JRXmlLoader.load("E:\\OneDrive - Nguyen Sieu School\\Documents\\GitHub\\PharmaSystemManager\\PharmaSystemManager\\test\\testBill.jrxml");
//            String sql = "SELECT `bill_no`, `item_name`, `quantity`, `price` FROM `item` WHERE bill_no='" + txtbillnumber.getText() + "'";
//            JRDesignQuery newQuery = new JRDesignQuery();
//            newQuery.setText(sql);
//
//            jasdi.setQuery(newQuery);
            /////////////
            HashMap<String, Object> para = new HashMap<>();
            para.put("1", txt1.getText());
            para.put("2", txt2.getText());
            para.put("3", txt3.getText());
            para.put("4", String.valueOf(jsfQuantity.getValue()));
            para.put("5", cbx1.getSelectedItem().toString());
            if (rdoTien.isSelected()) {
                para.put("6", "Tiền");
            } else {
                para.put("6", "Thẻ");
            }
            DefaultTableModel tableModel=(DefaultTableModel)tblGridView.getModel();
            JasperReport js = JasperCompileManager.compileReport(jasdi);
            JasperPrint jp = JasperFillManager.fillReport(js, para,  new JRTableModelDataSource(tableModel));
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e);
        }
        

    }//GEN-LAST:event_btnPrintActionPerformed

//    String fileName = "C:\\Documents and Settings\\abhijit\\JasperSimpleReport.jasper";
//    String outFileNamePDF = "c:\\JasperSimpleReport.pdf";
//    HashMap hm = new HashMap();
//
//    public void generateReport() throws ClassNotFoundException, InstantiationException, IllegalAccessException, JRException {
//        try {
//
//            System.out.println("Filling report...");
//            hm.put("", "Hello Report");
//            //JasperReport manager=JasperManager.compileReport(fileName);
//            JasperPrint print = JasperFillManager.fillReportToFile(fileName, outFileNamePDF, hm);
//            JRExporter exporter = new net.sf.jasperreports.engine.export.JRPdfExporter();
//            //parameter used for the destined file.
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,
//                    outFileNamePDF);
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
//            //export to .pdf
//            exporter.exportReport();
//            System.out.println("Created file: " + outFileNamePDF);
//            System.out.println("Done!");
//
//        } catch (JRException e) {
//            e.printStackTrace();
//        }
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.toedter.components.JSpinField jsfQuantity;
    private javax.swing.JScrollPane jtablesc123;
    private javax.swing.JRadioButton rdoThe;
    private javax.swing.JRadioButton rdoTien;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
