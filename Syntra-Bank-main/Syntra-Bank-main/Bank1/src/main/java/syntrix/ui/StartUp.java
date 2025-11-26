//FOR THE LOVE OF GOD, PLEASE DON'T DELETE THIS OF ALL THINGS.

package syntrix.ui;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import syntrix.logic.AuthManager;
import syntrix.logic.AuthManager.UserRole;



public class StartUp extends javax.swing.JFrame {
    
    //Declaring 'cardLayout' for more seamless switching of panels.
    private CardLayout cardLayout;
    private final String LOGIN_CARD = "LoginCard";
    private final String SIGNUP_CARD = "SignupCard";
    private final String USER_CARD = "UserCard";
    private final String ADMIN_CARD = "Admincard";
    
    private final AuthManager authManager = new AuthManager();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StartUp.class.getName());
    
    public StartUp() {
        initComponents();
        setupCardLayout();
        
    }
    
    private void setupCardLayout() {
        cardLayout = (CardLayout) jpMain.getLayout();
        jpLogin loginPanel = new jpLogin();
        jpSignup signupPanel = new jpSignup();
        jpUserDashboard userDashboardPanel = new jpUserDashboard();
        jpAdminDashboard adminDashboardPanel = new jpAdminDashboard();
        
        jpMain.add(loginPanel, LOGIN_CARD);
        jpMain.add(userDashboardPanel, USER_CARD);
        jpMain.add(adminDashboardPanel, ADMIN_CARD);
        jpMain.add(signupPanel, SIGNUP_CARD);       
        
        JButton loginButton = loginPanel.getLoginButton();
        
        //---LOGIN PAGE ROUTING---
        loginButton.addActionListener(e -> {
            //Gets input from the Login UI Panel
            String username = loginPanel.getUsername(); 
            String password = loginPanel.getPassword();
            
            UserRole role = authManager.authenticate(username,password);
                        
            switch(role) {
                case UserRole.ADMIN:
                    cardLayout.show(jpMain, ADMIN_CARD);                
                    logger.info("Admin login successful. Switching to Admin Dashboard.");    
                    break;
                case UserRole.STANDARD_USER:
                    cardLayout.show(jpMain, USER_CARD);                
                    logger.info("User login successful.");   
                    break;
                default: 
                    javax.swing.JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password",
                        "Login Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                    logger.warning("Login failed for: " + username);                          
            }
        });
        
        loginPanel.getSignupButton().addActionListener(e -> {
            cardLayout.show(jpMain, SIGNUP_CARD);
            logger.info("Switching to Signup View");
        });
        cardLayout.show(jpMain, LOGIN_CARD);
        
        
        //---SIGNUP PAGE ROUTING---        
        signupPanel.getBackButton().addActionListener(e -> {
            cardLayout.show(jpMain, LOGIN_CARD);
        });
        
        JButton btnProcessSignup = signupPanel.getSignupButton();
       
        btnProcessSignup.addActionListener(e -> {
            if(!signupPanel.isInputValid()) {
                JOptionPane.showMessageDialog(this, "Please fill in app required fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String newUsername = signupPanel.getUsername();
            String newPassword = signupPanel.getPassword();   
            String newEmail = signupPanel.getEmail();
            String defaultRole = "STANDARD_USER";
            
            boolean isRegistered = authManager.registerUser(newUsername, newPassword, newEmail, defaultRole);
            boolean isValid = true;
            
            if(isRegistered) {
                JOptionPane.showMessageDialog(this, "Application submitted successfully! Your Account is pending admin approval.", "Application Pending", JOptionPane.INFORMATION_MESSAGE);
                
                cardLayout.show(jpMain, LOGIN_CARD);
                logger.info("New user application submitted: " + newUsername);
            } else {
                JOptionPane.showMessageDialog(this, "Username already exists or System Error", "Registration Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        
        adminDashboardPanel.getLogoutButton().addActionListener(e -> {
            cardLayout.show(jpMain, LOGIN_CARD);
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMain.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new StartUp().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpMain;
    // End of variables declaration//GEN-END:variables
}
