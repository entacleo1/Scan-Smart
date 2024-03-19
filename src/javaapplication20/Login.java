package javaapplication20;

import java.awt.Color;
import admin.*;
import config.dbconnector;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
  public static boolean loginAcc(String user, String pass){
        dbconnector connector = new dbconnector();
        try{
            String query = "SELECT * FROM tbl_profile  WHERE u_username = '" + user+ "' AND u_password = '" + pass + "'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
        }

    }
    String user = "admin";
    String pass = "1234";
   
    Color txt = new Color(153,153,153);
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblexit = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        lbllogin = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        lbluspic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmdlogin = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        lblattend = new javax.swing.JLabel();
        lblsms = new javax.swing.JLabel();
        lblsms1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblexit.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        lblexit.setText("[Exit]");
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
        });
        jPanel1.add(lblexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 50, -1));

        lbltitle.setBackground(new java.awt.Color(0, 0, 0));
        lbltitle.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        lbltitle.setText("SMART SCAN");
        jPanel1.add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 236, -1));

        lbllogin.setBackground(new java.awt.Color(0, 0, 0));
        lbllogin.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lbllogin.setText("Admin LogIn");

        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        lbluspic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/username.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/pass.png"))); // NOI18N

        cmdlogin.setBackground(new java.awt.Color(255, 255, 255));
        cmdlogin.setText("LOGIN");
        cmdlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdloginMouseClicked(evt);
            }
        });

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        lblattend.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        lblattend.setText("[Attendance]");
        lblattend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblattendMouseClicked(evt);
            }
        });

        lblsms.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        lblsms.setText("[SMS Settings]");

        lblsms1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        lblsms1.setText("[ADD]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbllogin)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblattend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblsms))
                            .addComponent(cmdlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbluspic)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtuser)
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblsms1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbllogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbluspic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblattend)
                    .addComponent(lblsms))
                .addGap(18, 18, 18)
                .addComponent(lblsms1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdloginMouseClicked
         if(loginAcc(txtuser.getText(),txtpass.getText())){
           Dash op = new Dash();
         
            JOptionPane.showMessageDialog(null,"Loged In");
            op.setVisible(true);
            this.dispose();
             
    }else{
           JOptionPane.showMessageDialog(null,"Invalid");
       }
    }//GEN-LAST:event_cmdloginMouseClicked

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          if(loginAcc(txtuser.getText(),txtpass.getText())){
           Dash op = new Dash();
         
            JOptionPane.showMessageDialog(null,"Loged In");
            op.setVisible(true);
            this.dispose();
             
    }else{
           JOptionPane.showMessageDialog(null,"Invalid");
       }
        }
    }//GEN-LAST:event_txtpassKeyPressed

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
       int l = JOptionPane.showConfirmDialog(null,"You Sure You want to Exit the System?","Select",JOptionPane.YES_NO_OPTION);
       if(l == 0){
           System.exit(0);
       }
    }//GEN-LAST:event_lblexitMouseClicked

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(user.equals(txtuser.getText()) && pass.equals(txtpass.getText())){
                Dash op = new Dash();
                
                JOptionPane.showMessageDialog(null,"Loged In");
                op.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Invalid");
            }
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void lblattendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblattendMouseClicked
        REPORT op = new REPORT();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblattendMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblattend;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblsms;
    private javax.swing.JLabel lblsms1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbluspic;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
