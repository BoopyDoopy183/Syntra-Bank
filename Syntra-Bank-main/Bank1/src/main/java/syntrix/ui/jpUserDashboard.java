
package syntrix.ui;

public class jpUserDashboard extends javax.swing.JPanel {

    public jpUserDashboard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMainLogin = new javax.swing.JPanel();
        javax.swing.JLabel BrandName = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        tfUsername1 = new javax.swing.JTextField();

        jpMainLogin.setBackground(new java.awt.Color(255, 255, 255));

        BrandName.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BrandName.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        BrandName.setText("SyntrixBanks");

        tfUsername.setText("Enter Password...");
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(153, 255, 153));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");

        tfUsername1.setText("Enter username...");
        tfUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsername1ActionPerformed(evt);
            }
        });
        tfUsername1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfUsername1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jpMainLoginLayout = new javax.swing.GroupLayout(jpMainLogin);
        jpMainLogin.setLayout(jpMainLoginLayout);
        jpMainLoginLayout.setHorizontalGroup(
            jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLoginLayout.createSequentialGroup()
                        .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLoginLayout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jpMainLoginLayout.setVerticalGroup(
            jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(tfUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 797, Short.MAX_VALUE)
                .addComponent(jpMainLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMainLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsername1ActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void tfUsername1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsername1KeyPressed
        if (tfUsername.getText().equals("Enter username...")) {
            tfUsername.setText("");
        }
    }//GEN-LAST:event_tfUsername1KeyPressed

    
    
    private javax.swing.JButton getLoginButton() {
        return btnLogin;
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jpMainLogin;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField tfUsername1;
    // End of variables declaration//GEN-END:variables
}
