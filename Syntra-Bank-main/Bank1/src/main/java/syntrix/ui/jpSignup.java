/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package syntrix.ui;

//START OF IMPORT
import javax.swing.JOptionPane;
//END OF IMPORT

public class jpSignup extends javax.swing.JPanel {

    public jpSignup() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpMainLogin = new javax.swing.JPanel();
        javax.swing.JLabel BrandName = new javax.swing.JLabel();
        tfMobileNumber = new javax.swing.JTextField();
        tfFirstname = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        tfLastname = new javax.swing.JTextField();
        tfEmailAddress = new javax.swing.JTextField();
        cbGender = new javax.swing.JComboBox<>();
        tfPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        imgBg2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMainLogin.setBackground(new java.awt.Color(255, 255, 255));

        BrandName.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        BrandName.setForeground(new java.awt.Color(0, 153, 204));
        BrandName.setText("Syntra Bank");

        tfMobileNumber.setText("Enter mobile number...");
        tfMobileNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfMobileNumberMouseClicked(evt);
            }
        });
        tfMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMobileNumberActionPerformed(evt);
            }
        });

        tfFirstname.setText("Enter firstname...");
        tfFirstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfFirstnameMouseClicked(evt);
            }
        });
        tfFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFirstnameActionPerformed(evt);
            }
        });

        btnSignup.setBackground(new java.awt.Color(255, 204, 102));
        btnSignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");

        tfLastname.setText("Enter lastname...");
        tfLastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfLastnameMouseClicked(evt);
            }
        });
        tfLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastnameActionPerformed(evt);
            }
        });

        tfEmailAddress.setText("Enter email address...");
        tfEmailAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfEmailAddressMouseClicked(evt);
            }
        });
        tfEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailAddressActionPerformed(evt);
            }
        });

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Attack Helicopter" }));

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

        javax.swing.GroupLayout jpMainLoginLayout = new javax.swing.GroupLayout(jpMainLogin);
        jpMainLogin.setLayout(jpMainLoginLayout);
        jpMainLoginLayout.setHorizontalGroup(
            jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(jpMainLoginLayout.createSequentialGroup()
                        .addComponent(tfFirstname)
                        .addGap(18, 18, 18)
                        .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfMobileNumber)
                    .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainLoginLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMainLoginLayout.setVerticalGroup(
            jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BrandName)
                .addGap(40, 40, 40)
                .addGroup(jpMainLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tfMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jpMainLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 185, 500, 490));

        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\timot\\OneDrive\\Documents\\NetBeansProjects\\Bank1\\src\\main\\java\\syntrix\\images\\back-arrow.png")); // NOI18N
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        imgBg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\timot\\OneDrive\\Documents\\NetBeansProjects\\Bank1\\src\\main\\java\\syntrix\\images\\bg-2.png")); // NOI18N
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

    private void tfFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFirstnameActionPerformed

    private void tfMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMobileNumberActionPerformed

    private void tfFirstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfFirstnameMouseClicked
        if (tfFirstname.getText().equals("Enter username...")) {
            tfFirstname.setText("");
        }
    }//GEN-LAST:event_tfFirstnameMouseClicked

    private void tfMobileNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMobileNumberMouseClicked
        if (tfMobileNumber.getText().equals("Enter password...")) {
            tfMobileNumber.setText("");
        } 
    }//GEN-LAST:event_tfMobileNumberMouseClicked

    private void tfLastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfLastnameMouseClicked
        if (tfLastname.getText().equals("Enter password...")) {
            tfLastname.setText("");
        } 
    }//GEN-LAST:event_tfLastnameMouseClicked

    private void tfLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastnameActionPerformed

    private void tfEmailAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfEmailAddressMouseClicked
        if (tfEmailAddress.getText().equals("Enter password...")) {
            tfEmailAddress.setText("");
        } 
    }//GEN-LAST:event_tfEmailAddressMouseClicked

    private void tfEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailAddressActionPerformed

    private void tfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMouseClicked
        if (tfPassword.getText().equals("Enter password...")) {
            tfPassword.setText("");
        } 
    }//GEN-LAST:event_tfPasswordMouseClicked

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    
//GETTER FOR StartUp.java
    public javax.swing.JButton getSignupButton() {
        return btnSignup;
    }    
    
    public String getFirstname() {
        return tfFirstname.getText().trim();
    }

    public String getLastname() {
        // Check for null or empty string before returning
        String lastName = tfLastname.getText();
        return (lastName == null) ? "" : lastName.trim();
    }    
    
    public String getUsername() {
        
        String lastName = tfLastname.getText();
        String validLastname = (lastName == null) ? "" : lastName.trim();
        
        return tfFirstname.getText().concat(" " + validLastname);
    }
    
    public String getPassword() {
        return tfPassword.getText().trim();
    }
    
    public javax.swing.JButton getBackButton() {
        return btnBack;
    }
    
    public boolean isInputValid() {
        
        if (getUsername().isBlank() || getPassword().isBlank() || getMobileNumber().isBlank() || getEmailAddress().isBlank()) {
                return false;
        }
        
        String nameRegex = "^[a-zA-Z]+$";
        
        if (!getFirstname().matches(nameRegex)) {
                JOptionPane.showMessageDialog(this, "First Name must only contain letters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        if (!getLastname().isBlank() && !getLastname().matches(nameRegex)) {
            JOptionPane.showMessageDialog(this, "Last Name must only contain letters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!getMobileNumber().matches("^09[0-9]{6,10}$")) {
            JOptionPane.showMessageDialog(this, "Mobile Number must start with 09 and be between 8 and 12 digits long.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!getEmailAddress().matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }   
        
        return true;
    }
    
    public String getEmail() {
        return tfEmailAddress.getText().trim();
    }
    
    public String getMobileNumber() {
        // Assuming you have a tfMobileNumber text field
        return tfMobileNumber.getText().trim();
    }

    public String getEmailAddress() {
        // Assuming you have a tfEmailAddress text field
        return tfEmailAddress.getText().trim();
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel imgBg2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpMainLogin;
    private javax.swing.JTextField tfEmailAddress;
    private javax.swing.JTextField tfFirstname;
    private javax.swing.JTextField tfLastname;
    private javax.swing.JTextField tfMobileNumber;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}
