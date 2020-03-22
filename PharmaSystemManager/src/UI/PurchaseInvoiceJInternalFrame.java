/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.DrugInfomationDAO;
import DAO.SupplierDAO;
import helper.DateHelper;
import helper.DialogHelper;
import helper.ShareHelper;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.DrugInfomation;
import model.Supplier;

/**
 *
 * @author rondw
 */
public class PurchaseInvoiceJInternalFrame extends javax.swing.JInternalFrame {

    int index = 0;
    DrugInfomationDAO dao = new DrugInfomationDAO();
    SupplierDAO supDao = new SupplierDAO();
    List<DrugInfomation> list = new ArrayList<>();

    /**
     * Creates new form PurchaseInvoiceJInternalFrame
     */
    public PurchaseInvoiceJInternalFrame() {
        initComponents();
    }

    public PurchaseInvoiceJInternalFrame(JFrame frame) {
        initComponents();
        ShareHelper.frame = frame;
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInvoice = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        chkSelectAll = new javax.swing.JCheckBox();
        lblSelectAll = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnFindHistory = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListDrugs = new javax.swing.JList();
        pnlInfo = new javax.swing.JLayeredPane();
        lblDrugInfo = new javax.swing.JLabel();
        txtDrugInfo = new javax.swing.JTextField();
        lblDrugName = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        sfQuantity = new com.toedter.components.JSpinField();
        lblPurchasePrice = new javax.swing.JLabel();
        txtPurchasePrice = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        txtDrugID = new javax.swing.JTextField();
        lblDrugID = new javax.swing.JLabel();
        btnAddToInvoice = new javax.swing.JButton();
        txtSalePrice = new javax.swing.JTextField();
        lblSalePrice = new javax.swing.JLabel();
        lblBatchNo = new javax.swing.JLabel();
        txtBatchNo = new javax.swing.JTextField();
        cboSupplier = new javax.swing.JComboBox();
        lblExpirationDate = new javax.swing.JLabel();
        lblManufactureDate = new javax.swing.JLabel();
        txtExpirationDate = new javax.swing.JFormattedTextField();
        txtManufactureDate = new javax.swing.JFormattedTextField();

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

        pnlInvoice.setBorder(javax.swing.BorderFactory.createTitledBorder("Medicine infomation"));

        tblGridView.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Drug ID", "Drug name", "Quantity", "Price", "Amount", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridView.setRowHeight(25);
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridView);

        jPanel7.setLayout(new java.awt.GridLayout(1, 5, 10, 10));

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL AMOUNT");

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        chkSelectAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkSelectAllMouseClicked(evt);
            }
        });

        lblSelectAll.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSelectAll.setText("Select all");

        javax.swing.GroupLayout pnlInvoiceLayout = new javax.swing.GroupLayout(pnlInvoice);
        pnlInvoice.setLayout(pnlInvoiceLayout);
        pnlInvoiceLayout.setHorizontalGroup(
            pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvoiceLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInvoiceLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlInvoiceLayout.createSequentialGroup()
                        .addGroup(pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInvoiceLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(lblTotal)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(lblSelectAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkSelectAll)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        pnlInvoiceLayout.setVerticalGroup(
            pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvoiceLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInvoiceLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(pnlInvoiceLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTotal)
                                .addComponent(lblSelectAll))
                            .addComponent(chkSelectAll))
                        .addGap(19, 19, 19))))
        );

        jPanel8.setLayout(new java.awt.GridLayout(1, 5, 10, 10));

        btnFindHistory.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFindHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        btnFindHistory.setText("Find history");
        btnFindHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindHistoryActionPerformed(evt);
            }
        });
        jPanel8.add(btnFindHistory);

        btnClear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancle.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel8.add(btnClear);

        btnCheckIn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_invoice.png"))); // NOI18N
        btnCheckIn.setText("Check in");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });
        jPanel8.add(btnCheckIn);

        btnPrint.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print.png"))); // NOI18N
        btnPrint.setText("Print");
        jPanel8.add(btnPrint);

        ListDrugs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListDrugsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ListDrugs);

        pnlInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDrugInfo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblDrugInfo.setForeground(new java.awt.Color(51, 51, 51));
        lblDrugInfo.setText("Drug Info");

        txtDrugInfo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblDrugName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblDrugName.setForeground(new java.awt.Color(51, 51, 51));
        lblDrugName.setText("Drug name");

        txtDrugName.setEditable(false);
        txtDrugName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(51, 51, 51));
        lblQuantity.setText("Quantity");

        lblPurchasePrice.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblPurchasePrice.setForeground(new java.awt.Color(51, 51, 51));
        lblPurchasePrice.setText("Purchase Price");

        txtPurchasePrice.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        lblSupplier.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(51, 51, 51));
        lblSupplier.setText("Supplier");

        txtDrugID.setEditable(false);
        txtDrugID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblDrugID.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblDrugID.setForeground(new java.awt.Color(51, 51, 51));
        lblDrugID.setText("Drug ID");

        btnAddToInvoice.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAddToInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_cart.png"))); // NOI18N
        btnAddToInvoice.setText("Add to invoice");
        btnAddToInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToInvoiceActionPerformed(evt);
            }
        });

        txtSalePrice.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblSalePrice.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblSalePrice.setForeground(new java.awt.Color(51, 51, 51));
        lblSalePrice.setText("Sale Price");

        lblBatchNo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblBatchNo.setForeground(new java.awt.Color(51, 51, 51));
        lblBatchNo.setText("Batch no");

        txtBatchNo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBatchNo.setForeground(new java.awt.Color(0, 0, 204));

        lblExpirationDate.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblExpirationDate.setForeground(new java.awt.Color(51, 51, 51));
        lblExpirationDate.setText("EXP");

        lblManufactureDate.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblManufactureDate.setForeground(new java.awt.Color(51, 51, 51));
        lblManufactureDate.setText("MFG");

        txtExpirationDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

        txtManufactureDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDrugID, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(txtBatchNo))
                            .addComponent(lblBatchNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addComponent(lblSupplier)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDrugName)))
                    .addComponent(lblDrugInfo)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(txtDrugInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFind))
                    .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlInfoLayout.createSequentialGroup()
                            .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblQuantity)
                                .addComponent(sfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btnAddToInvoice))
                        .addGroup(pnlInfoLayout.createSequentialGroup()
                            .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtManufactureDate)
                                .addGroup(pnlInfoLayout.createSequentialGroup()
                                    .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPurchasePrice)
                                        .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblManufactureDate))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtExpirationDate)
                                .addComponent(lblSalePrice)
                                .addComponent(lblExpirationDate)
                                .addComponent(txtSalePrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblDrugID)
                        .addGap(55, 55, 55)
                        .addComponent(lblDrugName)))
                .addGap(43, 43, 43))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblDrugInfo)
                .addGap(0, 0, 0)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtDrugInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrugID)
                    .addComponent(lblDrugName))
                .addGap(0, 0, 0)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDrugID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBatchNo)
                    .addComponent(lblSupplier))
                .addGap(0, 0, 0)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalePrice)
                            .addComponent(lblPurchasePrice))
                        .addGap(0, 0, 0)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExpirationDate)
                            .addComponent(lblManufactureDate))
                        .addGap(0, 0, 0)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtManufactureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQuantity)
                        .addGap(0, 0, 0)
                        .addComponent(sfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddToInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInfo.setLayer(lblDrugInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtDrugInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblDrugName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtDrugName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(sfQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblPurchasePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtPurchasePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(btnFind, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblSupplier, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtDrugID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblDrugID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(btnAddToInvoice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtSalePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblSalePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblBatchNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtBatchNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(cboSupplier, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblExpirationDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(lblManufactureDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtExpirationDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlInfo.setLayer(txtManufactureDate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(pnlInfo))
                .addGap(22, 22, 22)
                .addComponent(pnlInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindHistoryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFindHistoryActionPerformed
    {//GEN-HEADEREND:event_btnFindHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindHistoryActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tblGridView.getRowCount(); i++) {
            Boolean check = (Boolean) tblGridView.getValueAt(i, 5);
            list.get(i).setDelete(check);
        }
        for (Iterator<DrugInfomation> iter = list.iterator(); iter.hasNext();) {
            DrugInfomation model = iter.next();
            if (model.isDelete()) {
                iter.remove();
            }
        }
        this.addToCart();
    }//GEN-LAST:event_btnClearActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        this.fillToCombobox();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
        new CheckIn(ShareHelper.frame, true, Double.parseDouble(txtTotalAmount.getText())).setVisible(true);
        if (ShareHelper.paymentConfimation) {
            this.insert();
        }
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void ListDrugsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListDrugsMouseClicked
        // TODO add your handling code here:
        this.setModel();
    }//GEN-LAST:event_ListDrugsMouseClicked

    private void chkSelectAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkSelectAllMouseClicked
        // TODO add your handling code here:
        this.selectAllItems(chkSelectAll.isSelected());
    }//GEN-LAST:event_chkSelectAllMouseClicked

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        this.index = tblGridView.rowAtPoint(evt.getPoint());
        if (this.index >= 0) {
            this.setModelFromList(this.getModelFromList());
        }
    }//GEN-LAST:event_tblGridViewMouseClicked

    private void btnAddToInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToInvoiceActionPerformed
        // TODO add your handling code here:
        this.list.add(this.getModel());
        this.addToCart();
        this.clear();
    }//GEN-LAST:event_btnAddToInvoiceActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String drugName = txtDrugInfo.getText().trim();
        this.fillToList(drugName);
    }//GEN-LAST:event_btnFindActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListDrugs;
    private javax.swing.JButton btnAddToInvoice;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFindHistory;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox cboSupplier;
    private javax.swing.JCheckBox chkSelectAll;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBatchNo;
    private javax.swing.JLabel lblDrugID;
    private javax.swing.JLabel lblDrugInfo;
    private javax.swing.JLabel lblDrugName;
    private javax.swing.JLabel lblExpirationDate;
    private javax.swing.JLabel lblManufactureDate;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSalePrice;
    private javax.swing.JLabel lblSelectAll;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLayeredPane pnlInfo;
    private javax.swing.JPanel pnlInvoice;
    private com.toedter.components.JSpinField sfQuantity;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtDrugID;
    private javax.swing.JTextField txtDrugInfo;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JFormattedTextField txtExpirationDate;
    private javax.swing.JFormattedTextField txtManufactureDate;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtSalePrice;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables

    void init() {
        setFrameIcon(ShareHelper.APP_ICON);
    }

    void fillToList(String DrugName) {
        ListDrugs.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel) ListDrugs.getModel();
        model.removeAllElements();
        try {
            List<DrugInfomation> list = dao.findByID(DrugName);
            for (DrugInfomation drug : list) {
                model.addElement(drug);
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
    }

    void fillToCombobox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSupplier.getModel();
        model.removeAllElements();
        try {
            List<Supplier> list = supDao.select();
            for (Supplier sup : list) {
                model.addElement(sup);
            }
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Database access error!");
        }
    }

    void setModel() {
        DrugInfomation drug = (DrugInfomation) ListDrugs.getSelectedValue();
        txtDrugInfo.setText(drug.getDrugName());
        txtDrugID.setText(drug.getDrugID());
        txtDrugName.setText(drug.getDrugName());
    }

    DrugInfomation getModel() {
        DrugInfomation model = new DrugInfomation();
        model.setDrugID(txtDrugID.getText());
        model.setDrugName(txtDrugName.getText());
        model.setBatchNo(txtBatchNo.getText());
        model.setQuantity(sfQuantity.getValue());
        model.setPurchasePrice(Double.parseDouble(txtPurchasePrice.getText()));
        model.setSalePrice(Double.parseDouble(txtSalePrice.getText()));
        model.setImportDate(new Date());
        model.setManufactureDate(DateHelper.toDate(txtManufactureDate.getText()));
        model.setExpirationDate(DateHelper.toDate(txtExpirationDate.getText()));
        model.setSupplierID(((Supplier) cboSupplier.getSelectedItem()).getID());
        return model;
    }

    void addToCart() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        for (DrugInfomation drug : list) {
            double amount = drug.getQuantity() * drug.getPurchasePrice();
            Object[] row = {
                drug.getDrugID(),
                drug.getDrugName(),
                drug.getQuantity(),
                drug.getPurchasePrice(),
                amount,
                drug.isDelete()
            };
            model.addRow(row);
        }
        double total = 0;
        for (int i = 0; i < tblGridView.getRowCount(); i++) {
            total += (Double) tblGridView.getValueAt(i, 4);
        }
        txtTotalAmount.setText(String.valueOf(total));
    }

    void selectAllItems(boolean selectAll) {
        for (int i = 0; i < tblGridView.getRowCount(); i++) {
            tblGridView.setValueAt(selectAll, i, 5);
        }
    }

    void clear() {
        txtDrugInfo.setText("");
        txtDrugID.setText("");
        txtDrugName.setText("");
        sfQuantity.setValue(0);
        txtPurchasePrice.setText("");
        txtSalePrice.setText("");
        txtExpirationDate.setText("");
        txtManufactureDate.setText("");
    }

    DrugInfomation getModelFromList() {
        DrugInfomation model = new DrugInfomation();
        model.setDrugID((String) tblGridView.getValueAt(index, 0));
        for (int i = 0; i < list.size(); i++) {
            if (model.getDrugID().equals(list.get(i).getDrugID())) {
                model = list.get(i);
                break;
            }
        }
        return model;
    }

    void setModelFromList(DrugInfomation model) {
        txtDrugInfo.setText(model.getDrugName());
        txtDrugID.setText(model.getDrugID());
        txtDrugName.setText(model.getDrugName());
        txtBatchNo.setText(model.getBatchNo());
        cboSupplier.setSelectedItem(supDao.findById(model.getSupplierID()));
        sfQuantity.setValue(model.getQuantity());
        txtPurchasePrice.setText(String.valueOf(model.getPurchasePrice()));
        txtSalePrice.setText(String.valueOf(model.getSalePrice()));
        txtExpirationDate.setText(DateHelper.toString(model.getExpirationDate(), "MM/dd/yyyy"));
        txtManufactureDate.setText(DateHelper.toString(model.getManufactureDate(), "MM/dd/yyyy"));
    }

    void insert() {

    }
}
