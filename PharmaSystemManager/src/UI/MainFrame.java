/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import helper.DialogHelper;
import helper.ShareHelper;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

/**
 *
 * @author rondw
 */
public class MainFrame extends javax.swing.JFrame
{

    EmployeeJInternalFrame employeeJInternalFrame;

    /**
     * Creates new form MainFrame
     */
    public MainFrame()
    {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        pnlStatus = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblPharName = new javax.swing.JLabel();
        lblBranchName = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        Image img = new ImageIcon("src\\icon\\logo_background.png").getImage();
        desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img, this.getWidth()/2 - img.getWidth(null)/2, (this.getHeight() - 20)/2 - (img.getHeight(null) - 20)/2, null);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharma4U");
        setAutoRequestFocus(false);

        pnlStatus.setPreferredSize(new java.awt.Dimension(211, 24));
        pnlStatus.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        pnlStatus.add(jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        pnlStatus.add(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        pnlStatus.add(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        pnlStatus.add(jPanel1);

        lblPharName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblPharName.setText("pharmacist's name");
        pnlStatus.add(lblPharName);

        lblBranchName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblBranchName.setText("Branch's position");
        pnlStatus.add(lblBranchName);

        lblTime.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 51, 51));
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        lblTime.setText("hh:mm:ss");
        pnlStatus.add(lblTime);

        getContentPane().add(pnlStatus, java.awt.BorderLayout.PAGE_END);

        pnlMenu.setBackground(new java.awt.Color(190, 232, 239));
        pnlMenu.setPreferredSize(new java.awt.Dimension(150, 551));
        pnlMenu.setLayout(new java.awt.GridLayout(9, 1));

        jButton1.setBackground(new java.awt.Color(255, 227, 249));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/purchase_invoice.png"))); // NOI18N
        jButton1.setText("Purchase Invoices");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 227, 249));
        jButton2.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sale_invoice.png"))); // NOI18N
        jButton2.setText("Sale Invoices");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 227, 249));
        jButton3.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/supplier.png"))); // NOI18N
        jButton3.setText("Suppliers Manager");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 227, 249));
        jButton4.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/drug_information.png"))); // NOI18N
        jButton4.setText("<html><p style=\"text-align: center\">Drugs Infomation <br>  Manager</p></html>");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 227, 249));
        jButton5.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/drug_status.png"))); // NOI18N
        jButton5.setText("<html><p style=\"text-align: center\">Drugs Status <br>  Manager</p></html>");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 227, 249));
        jButton6.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employee.png"))); // NOI18N
        jButton6.setText("Employee Manager");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnlMenu.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 227, 249));
        jButton7.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/store.png"))); // NOI18N
        jButton7.setText("Branch Manager");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 227, 249));
        jButton8.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        jButton8.setText("Report");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlMenu.add(jButton8);

        btnLogout.setBackground(new java.awt.Color(255, 227, 249));
        btnLogout.setFont(new java.awt.Font("Dialog", 3, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(51, 51, 51));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setHideActionText(true);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pnlMenu.add(btnLogout);

        getContentPane().add(pnlMenu, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1046, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        jMenu1.setText("   File   ");

        jMenuItem2.setText("Logout");
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Change password");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("   Invoices   ");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("   Manager   ");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("   statistical   ");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.openEmployee();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
        for (JInternalFrame c : desktop.getAllFrames())
        {
            c.dispose();
        }
        ShareHelper.logoff();
        new LoginJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    //--------------------------------------------------------------------//
    //--------------------------------------------------------------------//
    //----------------------------FUNCTION--------------------------------//
    //--------------------------------------------------------------------//
    //--------------------------------------------------------------------//
    void init()
    {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        setIconImage(ShareHelper.APP_ICON.getImage());
        this.setVisible(true);
        
        this.login();
        
        //Status panel
        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblTime.setText(sdf.format(new Date()));
            }
        }).start();
        lblPharName.setText(ShareHelper.USER.getName());
        lblBranchName.setText(ShareHelper.getUserPosition());
    }

    void login()
    {
        new LoginJDialog(this, true).setVisible(true);
    }

    void openEmployee()
    {
        if (!ShareHelper.USER.isRole())
        {
            DialogHelper.alert(this, "You can't access here");
            return;
        }
        for (JInternalFrame fr : desktop.getAllFrames())
        {
            fr.dispose();
        }
        employeeJInternalFrame = new EmployeeJInternalFrame(this);
        desktop.add(employeeJInternalFrame);
        employeeJInternalFrame.setLocation(this.getWidth() / 2 - employeeJInternalFrame.getWidth() / 2, desktop.getHeight() / 2 - employeeJInternalFrame.getHeight() / 2);
        employeeJInternalFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
                ShareHelper.frame = frame;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBranchName;
    private javax.swing.JLabel lblPharName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlStatus;
    // End of variables declaration//GEN-END:variables

}
