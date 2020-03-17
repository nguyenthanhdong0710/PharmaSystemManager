/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.BranchDAO;
import DAO.EmployeeDAO;
import helper.DialogHelper;
import helper.ShareHelper;
import helper.UtilitiesHelper;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.Branch;
import model.Employee;

/**
 *
 * @author Admin
 */
public class LoginJDialog11111 extends javax.swing.JDialog
{

    /** Creates new form LoginJDialog */
    public LoginJDialog11111(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        init();
    }

    /** This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        cbbBranch = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 530));
        getContentPane().setLayout(null);

        cbbBranch.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cbbBranch);
        cbbBranch.setBounds(540, 330, 210, 30);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtID);
        txtID.setBounds(540, 210, 210, 30);

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtPass);
        txtPass.setBounds(540, 270, 210, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Exit");
        jButton2.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(650, 400, 90, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Login");
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 400, 90, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login_logo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 30, 150, 150);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Branch");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(710, 310, 35, 15);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(700, 190, 50, 15);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 250, 50, 15);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login_background.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 822, 503);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    void init(){
        setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoginJDialog11111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginJDialog11111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginJDialog11111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginJDialog11111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                LoginJDialog11111 dialog = new LoginJDialog11111(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    EmployeeDAO ed= new EmployeeDAO();
    
    void login()
    {
        if(UtilitiesHelper.checkNull(txtID, "Tên đăng nhập không để trống"))
        {
            return;
        }
        String ID= txtID.getText();
        String pass= new String(txtPass.getPassword());
        try
        {
            Employee em= new Employee();
            if(em!=null)
            {
                String pass2= em.getPassword();
                if(pass.equals(pass2))
                {
                    ShareHelper.USER=em;
                    DialogHelper.alert(this, "Login successful!");
                    ShareHelper.Branch= cbbBranch.getModel();
                }
                else
                    DialogHelper.alert(this, "Wrong password!");
            }
            else
                DialogHelper.alert(this, "ID not found!");
        } catch (Exception e)
        {
            DialogHelper.alert(this, "Database access error!");
            e.printStackTrace();
        }
    }
    
    BranchDAO bd= new BranchDAO();
    
    void fillCombobox()
    {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbBranch.getModel();
        model.removeAllElements();
        try
        {
            List<Branch> list= bd.select();
            for (Branch br:list)
            {
               model.addElement(br);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbBranch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
