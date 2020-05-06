/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.StoragedDrugDAO;
import helper.DateHelper;
import helper.DialogHelper;
import helper.JdbcHelper;
import helper.ShareHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import model.StoragedDrug;

/**
 *
 * @author Admin
 */
public class StoreStatus extends javax.swing.JInternalFrame
{

    /** Creates new form DrugStatus */
    public StoreStatus()
    {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSale = new javax.swing.JTable();
        cbbSales = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();
        txtInvoices = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDebit = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCash = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDrug = new javax.swing.JTable();
        cbbDrug = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNoType = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoUnit = new javax.swing.JFormattedTextField();
        txtRevoke = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRevoke = new javax.swing.JButton();
        chkAll = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Pharma4U - Store Status");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane4.setBorder(null);

        tblSale.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblSale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblSale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Invoice ID", "Time", "Sales", "Cash", "Debit", "Discount", "Total bill", "Status"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblSale.setRowHeight(30);
        tblSale.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSale.getTableHeader().setReorderingAllowed(false);
        tblSale.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblSaleMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSale);

        cbbSales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today sales invoices", "Today revoke sales invoices" }));
        cbbSales.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbbSalesActionPerformed(evt);
            }
        });

        jLabel1.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("VND #,##0"))));

        txtInvoices.setEditable(false);
        txtInvoices.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setText("Total invoice");

        txtDebit.setEditable(false);
        txtDebit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("VND #,##0"))));

        jLabel7.setText("Total Debit");

        txtCash.setEditable(false);
        txtCash.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("VND #,##0"))));

        jLabel8.setText("Total Cash");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbbSales, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cbbSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drugs info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane3.setBorder(null);

        tblDrug.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblDrug.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Drug ID", "Drug Name", "Batch no", "Stored Quantity", "Unit", "Date import", "Date of manufactored", "Date of exp", "Status", "Select", "ID"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblDrug.setRowHeight(30);
        jScrollPane3.setViewportView(tblDrug);
        if (tblDrug.getColumnModel().getColumnCount() > 0)
        {
            tblDrug.getColumnModel().getColumn(0).setResizable(false);
            tblDrug.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblDrug.getColumnModel().getColumn(1).setResizable(false);
            tblDrug.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblDrug.getColumnModel().getColumn(3).setResizable(false);
            tblDrug.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblDrug.getColumnModel().getColumn(4).setResizable(false);
            tblDrug.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblDrug.getColumnModel().getColumn(9).setResizable(false);
            tblDrug.getColumnModel().getColumn(9).setPreferredWidth(30);
            tblDrug.getColumnModel().getColumn(10).setMinWidth(0);
            tblDrug.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblDrug.getColumnModel().getColumn(10).setMaxWidth(0);
        }

        cbbDrug.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All drugs", "Today expired drugs", "7 days expired drugs", "Today revoked drugs", "7 days revoked drugs" }));
        cbbDrug.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbbDrugActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount of type");

        txtNoType.setEditable(false);
        txtNoType.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel5.setText("Amount of unit");

        txtNoUnit.setEditable(false);
        txtNoUnit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtRevoke.setEditable(false);
        txtRevoke.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel6.setText("Total revoked drugs");

        btnRevoke.setText("Revoke drug");
        btnRevoke.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRevokeActionPerformed(evt);
            }
        });

        chkAll.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                chkAllStateChanged(evt);
            }
        });

        jLabel3.setText("Select all");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbbDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRevoke))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 331, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoType, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRevoke, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(chkAll)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRevoke))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtRevoke, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtNoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNoType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    StoragedDrugDAO dao = new StoragedDrugDAO();
    DefaultTableModel modelDrug, modelSales;

    private void cbbDrugActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbbDrugActionPerformed
    {//GEN-HEADEREND:event_cbbDrugActionPerformed
        switch (cbbDrug.getSelectedIndex())
        {
            case 0:
                getDrug(new Date(3000, 01, 01), false);
                break;
            case 1:
                getDrug(DateHelper.now(), false);
                break;
            case 2:
                getDrug(DateHelper.addDays(DateHelper.now(), 7), false);
                break;
            case 3:
                getDrug(DateHelper.now(), true);
                break;
            case 4:
                getDrug(DateHelper.addDays(DateHelper.now(), 7), true);
                break;
        }
    }//GEN-LAST:event_cbbDrugActionPerformed

    private void btnRevokeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRevokeActionPerformed
    {//GEN-HEADEREND:event_btnRevokeActionPerformed
        new ConfirmDeleteHelper(ShareHelper.frame, true).setVisible(true);
        if (ShareHelper.status != null)
        {
            revokeDrug();
        }
    }//GEN-LAST:event_btnRevokeActionPerformed

    private void cbbSalesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbbSalesActionPerformed
    {//GEN-HEADEREND:event_cbbSalesActionPerformed
        switch (cbbSales.getSelectedIndex())
        {
            case 0:
                getInvoices(false);
                break;
            case 1:
                getInvoices(true);
                break;

        }
    }//GEN-LAST:event_cbbSalesActionPerformed

    private void chkAllStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_chkAllStateChanged
    {//GEN-HEADEREND:event_chkAllStateChanged
        if (chkAll.isSelected())
        {
            for (int i = 0; i < modelDrug.getRowCount(); i++)
            {
                modelDrug.setValueAt(true, i, 9);
            }
        }
        else
        {
            for (int i = 0; i < modelDrug.getRowCount(); i++)
            {
                modelDrug.setValueAt(false, i, 9);
            }
        }
    }//GEN-LAST:event_chkAllStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameOpened
    {//GEN-HEADEREND:event_formInternalFrameOpened
        load();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblSaleMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblSaleMouseClicked
    {//GEN-HEADEREND:event_tblSaleMouseClicked
        if (evt.getClickCount() == 2)
        {
            JDesktopPane jp = this.getDesktopPane();
            if (jp.getAllFrames().length > 1)
            {
                jp.remove(1);
            }
            String InvoiceID = String.valueOf(tblSale.getValueAt(tblSale.getSelectedRow(), 0));
            SaleInvoiceJInternalFrame sales = new SaleInvoiceJInternalFrame(InvoiceID);
            jp.add(sales);
            sales.setVisible(true);
        }
    }//GEN-LAST:event_tblSaleMouseClicked

    void init()
    {
        setFrameIcon(ShareHelper.APP_ICON);
    }

    //Khởi tạo trạng thái ban đấu
    private void load()
    {
        modelDrug = (DefaultTableModel) tblDrug.getModel();
        modelSales = (DefaultTableModel) tblSale.getModel();
        cbbDrug.setSelectedIndex(0);
        cbbSales.setSelectedIndex(0);
    }

    //Phương thức tìm kiếm thuốc theo điều kiện
    public void getDrug(Date date, boolean exp)
    {
        String sql = "Select thuoc.mathuoc, tenthuoc, malohang, soluongton, donvitinh, ngaynhaphang, ngaysx, ngayhethan, idthuoc, thuoctrongkho.trangthaithuoc from THUOCTRONGKHO JOIN Thuoc on thuoc.mathuoc=thuoctrongkho.mathuoc WHERE MADAILY = '" + ShareHelper.Branch.getBranchID() + "' and ngayhethan between '" + DateHelper.toString(DateHelper.now()) + "' and '" + DateHelper.toString(date) + "'";

        if (exp)
        {
            sql += " and thuoctrongkho.trangthaithuoc is not null";
        }

        int total_unit = 0, total_type = 0, total_revoke = 0;
        Set type = new HashSet();
        modelDrug.setRowCount(0);

        try
        {
            ResultSet rs = null;
            try
            {
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next())
                {
                    Object[] row =
                    { 
                        rs.getString("MATHUOC"),
                        rs.getString("tenthuoc"),
                        rs.getString("MaLoHang"),
                        rs.getInt("soluongton"),
                        rs.getString("donvitinh"),
                        rs.getDate("ngaynhaphang"),
                        rs.getDate("ngaysx"),
                        rs.getDate("ngayhethan"),
                        rs.getString("trangthaithuoc"),
                        false,
                        rs.getString("IDthuoc")
                    };
                    modelDrug.addRow(row);

                    type.add(rs.getString("MATHUOC"));
                    total_unit += rs.getInt("soluongton");
                    if (rs.getString("trangthaithuoc") != null)
                    {
                        total_revoke += 1;
                    }
                }
            } finally
            {
                try
                {
                    rs.close();
                    rs.getStatement().close();
                    rs.getStatement().getConnection().close();
                }
                catch(Exception e)
                {
                    //
                }
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        txtNoType.setText(String.valueOf(type.size()));
        txtNoUnit.setText(String.valueOf(total_unit));
        txtRevoke.setText(String.valueOf(total_revoke));
    }

    //Hủy thuốc theo điều kiện
    void revokeDrug()
    {
        try
        {
            for (int i = 0; i < modelDrug.getRowCount(); i++)
            {
                if (!(Boolean) modelDrug.getValueAt(i, 9))
                {
                    continue;
                }
                StoragedDrug model = dao.findById(tblDrug.getValueAt(i, 10).toString());
                model.setStatus(ShareHelper.getStatus());
                ShareHelper.status = null;
                dao.update(model);
                DialogHelper.alert(this, "Revoke successfully");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            DialogHelper.alert(this, "Update failed!");
        }
        int a= cbbDrug.getSelectedIndex();
        load();
        cbbDrug.setSelectedIndex(a);
    }

    //Lấy thông tin hóa đơn theo điều kiện
    public void getInvoices(Boolean exp)
    {
        String sql = "Select H.MAHDBAN, NGAYBAN, MANV, GIAMGIA, TTTIENMAT, TTTHE, trangthaihdban, SUM (T.GiaBan*HCT.SOLUONG) as TONG from HOADONBANHANG as H JOIN HoaDonBanHangChiTiet as HCT on H.MaHDBan=HCT.MaHDBan JOIN ThuocTrongKho AS T ON T.IDThuoc=HCT.IDThuoc WHERE MADAILY = '" + ShareHelper.Branch.getBranchID() + "' and ngayban between '" + DateHelper.toString(null, "yyyy/MM/dd") + " 00:00:00' and '" + DateHelper.toString(null, "yyyy/MM/dd") + " 23:59:59'";

        if (exp)
        {
            sql += " and trangthaihdban is not null GROUP BY H.MAHDBAN, NGAYBAN, MANV, GIAMGIA, TTTIENMAT, TTTHE, trangthaihdban";
        }
        else
        {
            sql += "GROUP BY H.MAHDBAN, NGAYBAN, MANV, GIAMGIA, TTTIENMAT, TTTHE, trangthaihdban";
        }

        modelSales.setRowCount(0);
        int cash = 0, debit = 0;
        try
        {
            ResultSet rs = null;
            try
            {
                rs = JdbcHelper.executeQuery(sql);
                while (rs.next())
                {
                    int dc = rs.getInt("GIAMGIA");
                    int tong = rs.getInt("TONG") * (100 - dc) / 100;

                    Object[] row =
                    {
                        rs.getString("MAHDBAN"),
                        rs.getTime("NGAYBAN"),
                        rs.getString("MaNV"),
                        rs.getInt("TTTIENMAT"),
                        rs.getInt("TTTHE"),
                        dc,
                        tong,
                        rs.getString("trangthaihdban"),
                    };
                    cash += rs.getInt("TTTIENMAT");
                    debit += rs.getInt("TTTHE");
                    modelSales.addRow(row);
                }
            } finally
            {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        txtInvoices.setText(String.valueOf(modelSales.getRowCount()));
        txtDebit.setText(String.valueOf(debit));
        txtCash.setText(String.valueOf(cash));
        txtTotal.setText(String.valueOf(debit + cash));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRevoke;
    private javax.swing.JComboBox<String> cbbDrug;
    private javax.swing.JComboBox<String> cbbSales;
    private javax.swing.JCheckBox chkAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDrug;
    private javax.swing.JTable tblSale;
    private javax.swing.JFormattedTextField txtCash;
    private javax.swing.JFormattedTextField txtDebit;
    private javax.swing.JFormattedTextField txtInvoices;
    private javax.swing.JFormattedTextField txtNoType;
    private javax.swing.JFormattedTextField txtNoUnit;
    private javax.swing.JFormattedTextField txtRevoke;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
