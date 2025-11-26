/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package syntrix.ui;

public class jpLogin extends javax.swing.JPanel {

    public jpLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpMainLogin = new javax.swing.JPanel();
        javax.swing.JLabel BrandName = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        imgBg2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMainLogin.setBackground(new java.awt.Color(255, 255, 255));

        BrandName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        BrandName.setForeground(new java.awt.Color(0, 153, 204));
        BrandName.setText("Syntra Bank");

        tfPassword.setText("Enter password...");
        tfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPasswordMouseClicked(evt);
            }
        });
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        tfUsername.setText("Enter username...");
        tfUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsernameMouseClicked(evt);
            }
        });
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(153, 255, 153));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");

        btnSignup.setBackground(new java.awt.Color(255, 204, 102));
        btnSignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");

        javax.swing.GroupLayout jpMainLoginLayout = new javax.swing.GroupLayout(jpMainLogin);
        jpMainLogin.setLayout(jpMainLoginLayout);
        jpMainLoginLayout.setHorizontalGroup(
            jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGroup(jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMainLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMainLoginLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jpMainLoginLayout.setVerticalGroup(
            jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnLogin)
                .addGap(30, 30, 30)
                .addComponent(btnSignup)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jpMainLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, -1, 430));

        imgBg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syntrix/images/bg-2.png"))); // NOI18N
        jPanel1.add(imgBg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsernameMouseClicked
        if (tfUsername.getText().equals("Enter username...")) {
            tfUsername.setText("");
        }
    }//GEN-LAST:event_tfUsernameMouseClicked

    private void tfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMouseClicked
        if (tfPassword.getText().equals("Enter password...")) {
            tfPassword.setText("");
        } 
    }//GEN-LAST:event_tfPasswordMouseClicked

    
//GETTER FOR StartUp.java
    public javax.swing.JButton getLoginButton() {
        return btnLogin;
    }    
    
    public String getUsername() {
        return tfUsername.getText();
    }
    
    public String getPassword() {
        return tfPassword.getText();
    }
    
    public javax.swing.JButton getSignupButton() {
        return btnSignup;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel imgBg2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpMainLogin;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
