/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bun_client.view;

import bun_client.controler.CallCenterControler;
import bun_client.controler.ItemControler;
import bun_client.jasper.main.StartUp;
import bun_client.observerImpl.CustomerObserverImpl;
import bun_common.dto.ItemDto;
import bun_common.dto.OrdersDto;
import bun_common.observer.CustomerObserver;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Stop;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kavindu
 */
public class ChefForm extends javax.swing.JFrame {

    private CustomerObserver customerObserver;
    private String oid = "";
    private long end;
    private long start;

    private String name = "";
    private String deleverId = "";
    private String endTime = "";
    private String startTime = "";

    /**
     * Creates new form ChefForm
     */
    public ChefForm(String name) {
        initComponents();
        setLocationRelativeTo(null);
        getCount();
        this.name = name;
        jLabel10.setText(" " + name);
        try {
            customerObserver = new CustomerObserverImpl(this);
            CallCenterControler.customerObs(customerObserver);
        } catch (RemoteException ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * s
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        oidTxt = new javax.swing.JTextField();
        cidTxt = new javax.swing.JTextField();
        qtyTxt = new javax.swing.JTextField();
        itemIdTxt = new javax.swing.JTextField();
        typeTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jTextField5.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer ID", "Quantity", "Item Code", "Type"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 55, 769, 371));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("    View All Orders");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 104, 39));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bun_client/assest/RGB Circle 2_30px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 50, -1));

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("     Take a Order");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 471, 99, 39));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel10.setBackground(new java.awt.Color(255, 51, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("   LogOut ! ");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("   This Is The Chef Form");
        jLabel3.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText(" ");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(636, 636, 636)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 769, -1));

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBox1.setText("Delever Order");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 478, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("   Delever Now");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 471, 84, 33));

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("      Get Current Order to Delever Now ");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 471, 274, 39));

        oidTxt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        oidTxt.setBorder(null);
        jPanel1.add(oidTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 432, 149, 27));

        cidTxt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cidTxt.setBorder(null);
        jPanel1.add(cidTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 432, 149, 27));

        qtyTxt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        qtyTxt.setBorder(null);
        qtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTxtActionPerformed(evt);
            }
        });
        jPanel1.add(qtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 432, 149, 27));

        itemIdTxt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        itemIdTxt.setBorder(null);
        jPanel1.add(itemIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 432, 149, 27));

        typeTxt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        typeTxt.setBorder(null);
        jPanel1.add(typeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 432, 149, 27));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bun_client/assest/hd-achtergrond-rood-witte-abstracte-achtergrond-hd-wallpaper-1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 426, 780, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            List<OrdersDto> list = CallCenterControler.viewOrders();

            for (OrdersDto ordersDto : list) {

                Object[] row = {ordersDto.getOid(), ordersDto.getCid(), ordersDto.getQty(), ordersDto.getItemCode(), ordersDto.getType()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        DateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        Date date = new Date();
        startTime = dateFormat.format(date);
        
        start=System.currentTimeMillis();
        jLabel6.setText("Count");

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            OrdersDto Dto = CallCenterControler.takeOrders();

            if (Dto == null) {
                JOptionPane.showMessageDialog(null, "The All Orders Deleverd", "", JOptionPane.WARNING_MESSAGE);
            } else {
                Dto.setType("Preparing");
                Dto.setStartTime("" + startTime);
                Dto.setChefName(name);
                boolean b = CallCenterControler.addOrder(Dto);
                
                oidTxt.setText(Dto.getOid());
                cidTxt.setText(Dto.getCid());
                qtyTxt.setText("" + Dto.getQty());
                itemIdTxt.setText(Dto.getItemCode());
                typeTxt.setText(Dto.getType());
                typeTxt.setForeground(Color.RED);
                deleverId = Dto.getOid();
                if (b) {
                    JOptionPane.showMessageDialog(null, "A New Order" + Dto.getOid() + " is Taking....... ");
                    getCount();
                    List<OrdersDto> list = CallCenterControler.viewOrders();
                    dtm.setRowCount(0);
                    for (OrdersDto ordersDto : list) {

                        Object[] roww = {ordersDto.getOid(), ordersDto.getCid(), ordersDto.getQty(), ordersDto.getItemCode(), ordersDto.getType()};
                        dtm.addRow(roww);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "A New Order is taken failed !", "", JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        //dtm.setRowCount(0);
        int x = jTable1.getSelectedRow();
        String id = "";
        String newType = "Deleverd";
        try {
            
            id = (String) dtm.getValueAt(x, 0);
            OrdersDto ordersDto = CallCenterControler.searchOrder(id);
           // System.out.println("uusahhbuasbcascasc  " + ordersDto.getOid());
            if (ordersDto != null) {
                ordersDto.setType(newType);
                boolean b = CallCenterControler.updateOrder(ordersDto);
               // boolean bb=CallCenterControler.updateTemp(ordersDto);
                if (b) {
                    JOptionPane.showMessageDialog(null, "The Order Id : " + ordersDto.getOid() + " is Devered Success");

                    List<OrdersDto> list = CallCenterControler.viewOrders();
                            dtm.setRowCount(0);
                    for (OrdersDto Dto : list) {

                        Object[] row = {Dto.getOid(), Dto.getCid(), Dto.getQty(), Dto.getItemCode(), Dto.getType()};
                        dtm.addRow(row);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The Order Id : " + ordersDto.getOid() + " is Delevering Failed !", "", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        DateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        Date date = new Date();
        endTime = dateFormat.format(date);
        
        
        end=System.currentTimeMillis();
        NumberFormat numberFormat=new DecimalFormat("#0.00000");
        jLabel6.setText(numberFormat.format((end-start)/1000d));
        
            end=0;
            start=0;
            
        String newType = "Deleverd";
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        String oid = oidTxt.getText();

        if (!oid.equals("")) {
            try {
                OrdersDto ordersDto = CallCenterControler.searchOrder(oid);

                if (ordersDto != null) {
                    ordersDto.setType(newType);
                    ordersDto.setEndTime("" + endTime);
                    ordersDto.setCount(jLabel6.getText()+"s"); 
                    boolean b = CallCenterControler.updateOrder(ordersDto);
                   // boolean bb=CallCenterControler.updateTemp(ordersDto);
                    if (b) {
                        
                        JOptionPane.showMessageDialog(null, "The Order Id : " + ordersDto.getOid() + " is Devered Success");
                        oidTxt.setText("");
                        cidTxt.setText("");
                        qtyTxt.setText("");
                        itemIdTxt.setText("");
                        typeTxt.setText("");
                        jLabel6.setText("Count");

                        List<OrdersDto> list = CallCenterControler.viewOrders();

                        for (OrdersDto Dto : list) {

                            Object[] row = {Dto.getOid(), Dto.getCid(), Dto.getQty(), Dto.getItemCode(), Dto.getType()};
                            dtm.addRow(row);
                        }

                        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/bun_client/jasper/report/Leaf_Red.jasper"));
                        HashMap<String, Object> parHashMap = new HashMap<>();
                        parHashMap.put("oid", ordersDto.getOid());
                        parHashMap.put("unitPrice", 1000);
                        parHashMap.put("qty", ordersDto.getQty());
                        parHashMap.put("custName", ordersDto.getName());
                        parHashMap.put("custTel", ordersDto.getTel());
                        parHashMap.put("startTime", ordersDto.getStartTime());
                        parHashMap.put("endTime", ordersDto.getEndTime());
                        parHashMap.put("cheId", ordersDto.getChefName());
                        parHashMap.put("count", ordersDto.getCount());

                        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parHashMap, new JREmptyDataSource());
                        JasperViewer jasperViewer = new JasperViewer(jasperPrint);
                        java.awt.Container container = jasperViewer.getContentPane();

                        JDialog jDialog = new JDialog(this, true);
                        jDialog.setContentPane(container);
                        jDialog.setSize(jasperViewer.getSize());
                        jDialog.setLocationRelativeTo(null);
                        jDialog.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "The Order Id : " + ordersDto.getOid() + " is Delevering Failed !", "", JOptionPane.WARNING_MESSAGE);
                    }
                }

            } catch (Exception ex) {
                Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Take a new Order !", "", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.GREEN);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        Color color = new Color(128, 128, 128);
        jLabel10.setBackground(color);
        jLabel10.setText("LogOut!");
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        Color color = new Color(255, 51, 0);
        jLabel10.setBackground(color);
        jLabel10.setText(" " + name);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

//        int x=jTable1.getSelectedRow();
//        String oid=""+jTable1.getValueAt(x,0);
//        
//        try {
//            OrdersDto ordersDto=CallCenterControler.searchOrder(oid);
//            
//            if(!this.oid.equalsIgnoreCase(oid)){
//                CallCenterControler.release(this.oid);
//                this.oid=oid;
//            }
//            if (ordersDto != null) {
//                boolean isReserved = CallCenterControler.reserve(oid);
//                if (isReserved) {
//                     
//                     
//                    
//                } else {
//                    JOptionPane.showMessageDialog(this, "Reserved");
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "No Customer found");
//            }
//            
//        } catch (Exception ex) {
//            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void qtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTxtActionPerformed

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
            java.util.logging.Logger.getLogger(ChefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChefForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChefForm("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cidTxt;
    private javax.swing.JTextField itemIdTxt;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField oidTxt;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables

    public void setMessage(String message) {

        JOptionPane.showMessageDialog(this, message);
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            List<OrdersDto> list = CallCenterControler.viewOrders();

            for (OrdersDto ordersDto : list) {

                Object[] row = {ordersDto.getOid(), ordersDto.getCid(), ordersDto.getQty(), ordersDto.getItemCode(), ordersDto.getType()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void getCount(){
       int x;
        try {
            x = CallCenterControler.getCount();
            jLabel8.setText(""+x);
        } catch (Exception ex) {
            Logger.getLogger(ChefForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
