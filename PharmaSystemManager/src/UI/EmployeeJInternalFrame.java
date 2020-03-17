/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.BranchDAO;
import DAO.EmployeeDAO;
import helper.DateHelper;
import helper.DialogHelper;
import helper.ShareHelper;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Branch;
import model.Employee;

/**
 *
 * @author Long
 */
public class EmployeeJInternalFrame extends javax.swing.JInternalFrame {

    int index = 0; // vị trí của nhân viên đang hiển thị trên form
    EmployeeDAO dao = new EmployeeDAO();
    BranchDAO branchDAO = new BranchDAO();

    /**
     * Creates new form NhanVienJInternalFrame
     */
    public EmployeeJInternalFrame(JFrame frame) {
        ShareHelper.frame = frame;
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        pnlEdit = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rdoBoss = new javax.swing.JRadioButton();
        rdoManager = new javax.swing.JRadioButton();
        rdoPharmacist = new javax.swing.JRadioButton();
        lblRole = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDateOfBirth = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JFormattedTextField();
        lblDateStartWork = new javax.swing.JLabel();
        txtDateOfWork = new javax.swing.JFormattedTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblDaiLy = new javax.swing.JLabel();
        cboDaiLy = new javax.swing.JComboBox();

        jTextField1.setText("jTextField1");

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jScrollPane2.setBorder(null);

        tblGridView.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Password", "Role", "Full Name", "Date of birth", "Date start", "Phone", "Email", "Address", "Status", "Store ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridView.setRowHeight(30);
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGridView);

        pnlEdit.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnInsert.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        pnlEdit.add(btnInsert);

        btnUpdate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlEdit.add(btnUpdate);

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlEdit.add(btnDelete);

        btnNew.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        pnlEdit.add(btnNew);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel4.add(btnFirst);

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prev.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrev);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel4.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel4.add(btnLast);

        jPanel3.setLayout(new java.awt.GridLayout(9, 1, 10, 10));

        lblID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblID.setText("Employee ID");
        jPanel3.add(lblID);

        txtID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel3.add(txtID);

        lblFullName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblFullName.setText("Full Name");
        jPanel3.add(lblFullName);

        txtFullName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel3.add(txtFullName);

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPassword.setText("Password");
        jPanel3.add(lblPassword);

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel3.add(txtPassword);

        lblConfirmPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblConfirmPassword.setText("Confirm Password");
        jPanel3.add(lblConfirmPassword);

        txtConfirmPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel3.add(txtConfirmPassword);

        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 10, 10));

        buttonGroup1.add(rdoBoss);
        rdoBoss.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdoBoss.setSelected(true);
        rdoBoss.setText("Boss");
        jPanel2.add(rdoBoss);

        buttonGroup1.add(rdoManager);
        rdoManager.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdoManager.setText("Manager");
        jPanel2.add(rdoManager);

        buttonGroup1.add(rdoPharmacist);
        rdoPharmacist.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdoPharmacist.setText("Pharmacist");
        jPanel2.add(rdoPharmacist);

        lblRole.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRole.setText("Role");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);

        jPanel1.setLayout(new java.awt.GridLayout(10, 1, 10, 10));

        lblDateOfBirth.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDateOfBirth.setText("Date of birth");
        jPanel1.add(lblDateOfBirth);

        txtDateOfBirth.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        txtDateOfBirth.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtDateOfBirth);

        lblDateStartWork.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDateStartWork.setText("Start date of work");
        jPanel1.add(lblDateStartWork);

        txtDateOfWork.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        txtDateOfWork.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtDateOfWork);

        lblAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAddress.setText("Address");
        jPanel1.add(lblAddress);

        txtAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtAddress);

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmail.setText("Email");
        jPanel1.add(lblEmail);

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtEmail);

        lblPhone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPhone.setText("Phone");
        jPanel1.add(lblPhone);

        txtPhone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(txtPhone);

        lblDaiLy.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDaiLy.setText("Đại lý");

        cboDaiLy.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboDaiLy.setMinimumSize(new java.awt.Dimension(43, 30));
        cboDaiLy.setPreferredSize(new java.awt.Dimension(40, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lblDaiLy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDaiLy, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDaiLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDaiLy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.fillToCombobox();
        this.load();
        this.clear();
        this.setStatus(true);
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblGridView.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
            }
        }
    }//GEN-LAST:event_tblGridViewMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        scroll();
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        scroll();
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        scroll();
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index = tblGridView.getRowCount() - 1;
        scroll();
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboDaiLy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDaiLy;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDateStartWork;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRole;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JRadioButton rdoBoss;
    private javax.swing.JRadioButton rdoManager;
    private javax.swing.JRadioButton rdoPharmacist;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JFormattedTextField txtDateOfBirth;
    private javax.swing.JFormattedTextField txtDateOfWork;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

    void init() {
        setFrameIcon(ShareHelper.APP_ICON);
    }

    public void scroll() {
        tblGridView.setRowSelectionInterval(index, index);
        Rectangle cellRect = tblGridView.getCellRect(index, 0, false);
        tblGridView.scrollRectToVisible(cellRect);
    }

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        String vaiTro = "";
        try {
            List<Employee> list = null;
            if (ShareHelper.USER.getStoreID() == null || ShareHelper.USER.getStoreID().length() == 0) {
                list = dao.select();
            } else {
                list = dao.findByBranch(ShareHelper.USER.getStoreID());
            }
            for (Employee nv : list) {
                if (nv.isRole() && (nv.getStoreID() == null || nv.getStoreID().length() == 0)) {
                    vaiTro = "Boss";
                } else if (nv.isRole() && (nv.getStoreID().length() > 0)) {
                    vaiTro = "Manager";
                } else {
                    vaiTro = "Pharmacist";
                }
                Object[] row = {
                    nv.getEmployeeID(),
                    nv.getPassword(),
                    vaiTro,
                    nv.getName(),
                    nv.getDateOfBirth(),
                    nv.getStartDate(),
                    nv.getPhone(),
                    nv.getEmail(),
                    nv.getAddress(),
                    nv.getStatus(),
                    nv.getStoreID()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void edit() {
        try {
            String manv = (String) tblGridView.getValueAt(this.index, 0);
            Employee model = dao.findById(manv);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void clear() {
        this.setModel(new Employee());
        this.setStatus(true);
    }

    void setModel(Employee model) {
        txtID.setText(model.getEmployeeID());
        txtPassword.setText(model.getPassword());
        txtConfirmPassword.setText(model.getPassword());
        txtFullName.setText(model.getName());
        txtDateOfBirth.setText(DateHelper.toString(model.getDateOfBirth()));
        txtDateOfWork.setText(DateHelper.toString(model.getStartDate()));
        txtPhone.setText(model.getPhone());
        txtEmail.setText(model.getEmail());
        txtAddress.setText(model.getAddress());
        if (model.isRole() && (model.getStoreID() == null || model.getStoreID().length() == 0)) {
            rdoBoss.setSelected(true);
        } else if (model.isRole() && model.getStoreID().length() > 0) {
            rdoManager.setSelected(true);
        } else {
            rdoPharmacist.setSelected(true);
        }
    }

    Employee getModel() {
        Employee model = new Employee();
        model.setEmployeeID(txtID.getText());
        model.setPassword(new String(txtPassword.getPassword()));
        if (rdoBoss.isSelected() || rdoManager.isSelected()) {
            model.setRole(true);
        } else {
            model.setRole(false);
        }
        model.setName(txtFullName.getText());
        model.setDateOfBirth(DateHelper.toDate(txtDateOfBirth.getText()));
        model.setStartDate(DateHelper.toDate(txtDateOfWork.getText()));
        model.setPhone(txtPhone.getText());
        model.setEmail(txtEmail.getText());
        model.setAddress(txtAddress.getText());
        if (rdoBoss.isSelected()) {
            model.setStoreID(null);
        } else {
            model.setStoreID(((Branch) cboDaiLy.getSelectedItem()).getBranchID());
        }
        return model;
    }

    void setStatus(boolean insertable) {
        txtID.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tblGridView.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
    }

    void fillToCombobox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboDaiLy.getModel();
        model.removeAllElements();
        try {
            List<Branch> list = branchDAO.select();
            for (Branch branch : list) {
                model.addElement(branch);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        Employee model = getModel();

        String confirm = new String(txtConfirmPassword.getPassword());
        if (confirm.equals(model.getPassword())) {
            try {
                dao.insert(model);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
        } else {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
            txtConfirmPassword.requestFocus();
        }
    }

    void update() {
        Employee model = getModel();

        String confirm = new String(txtConfirmPassword.getPassword());
        if (!confirm.equals(model.getPassword())) {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
            txtConfirmPassword.requestFocus();
        } else {
            try {
                dao.update(model);
                this.load();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void delete() {
        new ConfirmDeleteHelper(ShareHelper.frame, true).setVisible(true);
        if (ShareHelper.status != null) {
            Employee model = dao.findById(txtID.getText());
            model.setStatus(ShareHelper.status);
            try {
                dao.updateStatus(model);
                this.load();
                DialogHelper.alert(this, "Update successfull");
            } catch (Exception e) {
                DialogHelper.alert(this, "Update failed");
            }
        }
    }
}
