
package syntrix.ui;

//START OF IMPORTS
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import syntrix.logic.AuthManager;
import java.awt.Color;
//END OF IMPORTS

public class jpAdminDashboard extends javax.swing.JPanel {

    private AuthManager authManager = new AuthManager();
    
    public jpAdminDashboard() {
        initComponents();
        
        //This is to set opacity for the containers. For design purposes.
        jpUserApplicationContainer.setBackground(new Color(221,221,221, 90));
        jpRecentTransactionsContainer.setBackground(new Color(221,221,221,90));
        jpAuditReportsContainer.setBackground(new Color(221,221,221,90));
        jpSystemNotifContainer.setBackground(new Color(221,221,221,90));
        
        loadApplicationsTable();
    }
    
    public void loadApplicationsTable() {
        DefaultTableModel model = (DefaultTableModel) tblUserApplication.getModel();
        model.setRowCount(0);
        
        ArrayList<String[]> applications = authManager.getPendingApplications();
        
        for (String[] app : applications) {
            if (app.length >= 3) {
                model.addRow(new Object[] {app[0], app[1], "Pending"});
            }
        }
        
        txtUserApplicationNumber.setText(String.valueOf(applications.size()));
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackgroundContainer = new javax.swing.JPanel();
        jpNavbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAdminDashboard = new javax.swing.JButton();
        btnAdminTransactions = new javax.swing.JButton();
        btnAccManagement = new javax.swing.JButton();
        btnAudits_Reports = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jpUserApplicationContainer = new javax.swing.JPanel();
        javax.swing.JLabel txtUserApplication = new javax.swing.JLabel();
        javax.swing.JLabel txtUserApplication1 = new javax.swing.JLabel();
        txtUserApplicationNumber = new javax.swing.JLabel();
        javax.swing.JLabel txtUserApplication2 = new javax.swing.JLabel();
        jpRecentTransactionsContainer = new javax.swing.JPanel();
        javax.swing.JLabel txtRecent1 = new javax.swing.JLabel();
        javax.swing.JLabel txtTransactions1 = new javax.swing.JLabel();
        txtUserApplicationNumber1 = new javax.swing.JLabel();
        javax.swing.JLabel txtUserApplication3 = new javax.swing.JLabel();
        jpAuditReportsContainer = new javax.swing.JPanel();
        javax.swing.JLabel txtRecent2 = new javax.swing.JLabel();
        txtUserApplicationNumber2 = new javax.swing.JLabel();
        javax.swing.JLabel txtUserApplication4 = new javax.swing.JLabel();
        javax.swing.JLabel txtTransactions3 = new javax.swing.JLabel();
        jpSystemNotifContainer = new javax.swing.JPanel();
        javax.swing.JLabel txtRecent3 = new javax.swing.JLabel();
        javax.swing.JLabel txtTransactions2 = new javax.swing.JLabel();
        txtUserApplicationNumber3 = new javax.swing.JLabel();
        javax.swing.JLabel txtUserApplication5 = new javax.swing.JLabel();
        javax.swing.JPanel jpUserApplicationFuncContainer = new javax.swing.JPanel();
        javax.swing.JLabel txtUserApplication6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserApplication = new javax.swing.JTable();
        btnAcceptUser = new javax.swing.JButton();
        btnRejectUser = new javax.swing.JButton();
        javax.swing.JPanel jpRecentFunctionsFuncContainer = new javax.swing.JPanel();
        javax.swing.JLabel txtUserApplication7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecentAplication1 = new javax.swing.JTable();
        imgBg = new javax.swing.JLabel();

        jpBackgroundContainer.setBackground(new java.awt.Color(255, 255, 255));
        jpBackgroundContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpNavbar.setBackground(new java.awt.Color(3, 45, 53));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN");

        btnAdminDashboard.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnAdminDashboard.setText("Dashboard");
        btnAdminDashboard.setToolTipText("");
        btnAdminDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminDashboardActionPerformed(evt);
            }
        });

        btnAdminTransactions.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnAdminTransactions.setText("Transactions");
        btnAdminTransactions.setToolTipText("");
        btnAdminTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminTransactionsActionPerformed(evt);
            }
        });

        btnAccManagement.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnAccManagement.setText("Manage Accounts");
        btnAccManagement.setToolTipText("");
        btnAccManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccManagementActionPerformed(evt);
            }
        });

        btnAudits_Reports.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnAudits_Reports.setText("Audits & Reports");
        btnAudits_Reports.setToolTipText("");
        btnAudits_Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudits_ReportsActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpNavbarLayout = new javax.swing.GroupLayout(jpNavbar);
        jpNavbar.setLayout(jpNavbarLayout);
        jpNavbarLayout.setHorizontalGroup(
            jpNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNavbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
            .addGroup(jpNavbarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAudits_Reports, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAccManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdminTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdminDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpNavbarLayout.setVerticalGroup(
            jpNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNavbarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(btnAdminDashboard)
                .addGap(30, 30, 30)
                .addComponent(btnAccManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAdminTransactions)
                .addGap(30, 30, 30)
                .addComponent(btnAudits_Reports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(25, 25, 25))
        );

        jpBackgroundContainer.add(jpNavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 740));

        jpUserApplicationContainer.setBackground(new java.awt.Color(221, 221, 221));

        txtUserApplication.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplication.setText("Application");

        txtUserApplication1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplication1.setText("New User");

        txtUserApplicationNumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplicationNumber.setText("0");

        txtUserApplication2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserApplication2.setText("Pending");

        javax.swing.GroupLayout jpUserApplicationContainerLayout = new javax.swing.GroupLayout(jpUserApplicationContainer);
        jpUserApplicationContainer.setLayout(jpUserApplicationContainerLayout);
        jpUserApplicationContainerLayout.setHorizontalGroup(
            jpUserApplicationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserApplicationContainerLayout.createSequentialGroup()
                .addGroup(jpUserApplicationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpUserApplicationContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUserApplication1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUserApplicationContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUserApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpUserApplicationContainerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtUserApplicationNumber)
                        .addGap(28, 28, 28)
                        .addComponent(txtUserApplication2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpUserApplicationContainerLayout.setVerticalGroup(
            jpUserApplicationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserApplicationContainerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtUserApplication1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserApplication)
                .addGap(18, 18, 18)
                .addGroup(jpUserApplicationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserApplicationNumber)
                    .addComponent(txtUserApplication2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpBackgroundContainer.add(jpUserApplicationContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, 150));

        jpRecentTransactionsContainer.setBackground(new java.awt.Color(221, 221, 221));

        txtRecent1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtRecent1.setText("Recent");

        txtTransactions1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTransactions1.setText("Transactions");

        txtUserApplicationNumber1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplicationNumber1.setText("0");

        txtUserApplication3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserApplication3.setText("Today");

        javax.swing.GroupLayout jpRecentTransactionsContainerLayout = new javax.swing.GroupLayout(jpRecentTransactionsContainer);
        jpRecentTransactionsContainer.setLayout(jpRecentTransactionsContainerLayout);
        jpRecentTransactionsContainerLayout.setHorizontalGroup(
            jpRecentTransactionsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecentTransactionsContainerLayout.createSequentialGroup()
                .addGroup(jpRecentTransactionsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRecentTransactionsContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpRecentTransactionsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTransactions1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRecent1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpRecentTransactionsContainerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtUserApplicationNumber1)
                        .addGap(28, 28, 28)
                        .addComponent(txtUserApplication3)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpRecentTransactionsContainerLayout.setVerticalGroup(
            jpRecentTransactionsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecentTransactionsContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtRecent1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTransactions1)
                .addGap(18, 18, 18)
                .addGroup(jpRecentTransactionsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserApplicationNumber1)
                    .addComponent(txtUserApplication3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpBackgroundContainer.add(jpRecentTransactionsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 150));

        jpAuditReportsContainer.setBackground(new java.awt.Color(221, 221, 221));

        txtRecent2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtRecent2.setText("Audit");

        txtUserApplicationNumber2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplicationNumber2.setText("0");

        txtUserApplication4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserApplication4.setText("Alerts");

        txtTransactions3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTransactions3.setText("Reports");

        javax.swing.GroupLayout jpAuditReportsContainerLayout = new javax.swing.GroupLayout(jpAuditReportsContainer);
        jpAuditReportsContainer.setLayout(jpAuditReportsContainerLayout);
        jpAuditReportsContainerLayout.setHorizontalGroup(
            jpAuditReportsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAuditReportsContainerLayout.createSequentialGroup()
                .addGroup(jpAuditReportsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAuditReportsContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtRecent2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAuditReportsContainerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtUserApplicationNumber2)
                        .addGap(28, 28, 28)
                        .addComponent(txtUserApplication4))
                    .addGroup(jpAuditReportsContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTransactions3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpAuditReportsContainerLayout.setVerticalGroup(
            jpAuditReportsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAuditReportsContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtRecent2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTransactions3)
                .addGap(18, 18, 18)
                .addGroup(jpAuditReportsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserApplicationNumber2)
                    .addComponent(txtUserApplication4))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpBackgroundContainer.add(jpAuditReportsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, 150));

        jpSystemNotifContainer.setBackground(new java.awt.Color(221, 221, 221));

        txtRecent3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtRecent3.setText("System");

        txtTransactions2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTransactions2.setText("Notifications");

        txtUserApplicationNumber3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplicationNumber3.setText("0");

        txtUserApplication5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserApplication5.setText("New");

        javax.swing.GroupLayout jpSystemNotifContainerLayout = new javax.swing.GroupLayout(jpSystemNotifContainer);
        jpSystemNotifContainer.setLayout(jpSystemNotifContainerLayout);
        jpSystemNotifContainerLayout.setHorizontalGroup(
            jpSystemNotifContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSystemNotifContainerLayout.createSequentialGroup()
                .addGroup(jpSystemNotifContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSystemNotifContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpSystemNotifContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTransactions2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRecent3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpSystemNotifContainerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtUserApplicationNumber3)
                        .addGap(28, 28, 28)
                        .addComponent(txtUserApplication5)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpSystemNotifContainerLayout.setVerticalGroup(
            jpSystemNotifContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSystemNotifContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtRecent3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTransactions2)
                .addGap(18, 18, 18)
                .addGroup(jpSystemNotifContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserApplicationNumber3)
                    .addComponent(txtUserApplication5))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpBackgroundContainer.add(jpSystemNotifContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, -1, -1));

        jpUserApplicationFuncContainer.setBackground(new java.awt.Color(221, 221, 221));

        txtUserApplication6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplication6.setText("New User Application");

        tblUserApplication.setBackground(new java.awt.Color(221, 221, 221));
        tblUserApplication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email", "Status"
            }
        ));
        tblUserApplication.setSelectionBackground(new java.awt.Color(221, 221, 221));
        jScrollPane1.setViewportView(tblUserApplication);

        btnAcceptUser.setText("Accept");
        btnAcceptUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptUserActionPerformed(evt);
            }
        });

        btnRejectUser.setText("Reject");
        btnRejectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpUserApplicationFuncContainerLayout = new javax.swing.GroupLayout(jpUserApplicationFuncContainer);
        jpUserApplicationFuncContainer.setLayout(jpUserApplicationFuncContainerLayout);
        jpUserApplicationFuncContainerLayout.setHorizontalGroup(
            jpUserApplicationFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUserApplicationFuncContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpUserApplicationFuncContainerLayout.createSequentialGroup()
                .addGap(20, 216, Short.MAX_VALUE)
                .addComponent(btnAcceptUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRejectUser)
                .addGap(14, 14, 14))
            .addGroup(jpUserApplicationFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpUserApplicationFuncContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtUserApplication6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jpUserApplicationFuncContainerLayout.setVerticalGroup(
            jpUserApplicationFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserApplicationFuncContainerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpUserApplicationFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAcceptUser, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnRejectUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpUserApplicationFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpUserApplicationFuncContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtUserApplication6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(391, Short.MAX_VALUE)))
        );

        jpBackgroundContainer.add(jpUserApplicationFuncContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 380, 420));

        jpRecentFunctionsFuncContainer.setBackground(new java.awt.Color(221, 221, 221));

        txtUserApplication7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUserApplication7.setText("Recent Transactions");

        tblRecentAplication1.setBackground(new java.awt.Color(221, 221, 221));
        tblRecentAplication1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email", "Status"
            }
        ));
        tblRecentAplication1.setSelectionBackground(new java.awt.Color(221, 221, 221));
        jScrollPane2.setViewportView(tblRecentAplication1);

        javax.swing.GroupLayout jpRecentFunctionsFuncContainerLayout = new javax.swing.GroupLayout(jpRecentFunctionsFuncContainer);
        jpRecentFunctionsFuncContainer.setLayout(jpRecentFunctionsFuncContainerLayout);
        jpRecentFunctionsFuncContainerLayout.setHorizontalGroup(
            jpRecentFunctionsFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRecentFunctionsFuncContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpRecentFunctionsFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpRecentFunctionsFuncContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtUserApplication7, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jpRecentFunctionsFuncContainerLayout.setVerticalGroup(
            jpRecentFunctionsFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecentFunctionsFuncContainerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpRecentFunctionsFuncContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpRecentFunctionsFuncContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtUserApplication7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(388, Short.MAX_VALUE)))
        );

        jpBackgroundContainer.add(jpRecentFunctionsFuncContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 410, 420));

        imgBg.setToolTipText("");
        jpBackgroundContainer.add(imgBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackgroundContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackgroundContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminDashboardActionPerformed

    private void btnAdminTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminTransactionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminTransactionsActionPerformed

    private void btnAccManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccManagementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccManagementActionPerformed

    private void btnAudits_ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudits_ReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAudits_ReportsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAcceptUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptUserActionPerformed
        int selectedRow = tblUserApplication.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to accept.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblUserApplication.getModel();
        String username = model.getValueAt(selectedRow, 0).toString();
        
        ArrayList<String[]> allApps = authManager.getPendingApplications();
        String[] targetApp = null;
        for(String[] app : allApps) {
            if(app[0].equals(username)) targetApp = app;
        }
        
        if (targetApp != null) {
            String email = targetApp[1];
            String role = targetApp[2];
            String password = targetApp[3];
            
            boolean success = authManager.approveUser(username, password,email, role);
            
            if (success) {
                JOptionPane.showMessageDialog(this, "User Approved!");
                loadApplicationsTable();
            } else {
                JOptionPane.showMessageDialog(this, "Error approving user.");
            }
        }
    }//GEN-LAST:event_btnAcceptUserActionPerformed

    private void btnRejectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectUserActionPerformed
        int selectedRow = tblUserApplication.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to accept.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblUserApplication.getModel();
        String username = model.getValueAt(selectedRow, 0).toString();
        
        boolean success = authManager.deleteApplication(username);
        
        if (success) {
            JOptionPane.showMessageDialog(this, "User Rejected/Deleted");
            loadApplicationsTable();
        } else {
            JOptionPane.showMessageDialog(this, "Error deleting application");
        }
    }//GEN-LAST:event_btnRejectUserActionPerformed

//GETTER AND SETTERS
    public javax.swing.JButton getLogoutButton() {
        return btnLogout;
    }    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccManagement;
    private javax.swing.JButton btnAcceptUser;
    private javax.swing.JButton btnAdminDashboard;
    private javax.swing.JButton btnAdminTransactions;
    private javax.swing.JButton btnAudits_Reports;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRejectUser;
    private javax.swing.JLabel imgBg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpAuditReportsContainer;
    private javax.swing.JPanel jpBackgroundContainer;
    private javax.swing.JPanel jpNavbar;
    private javax.swing.JPanel jpRecentTransactionsContainer;
    private javax.swing.JPanel jpSystemNotifContainer;
    private javax.swing.JPanel jpUserApplicationContainer;
    private javax.swing.JTable tblRecentAplication1;
    private javax.swing.JTable tblUserApplication;
    private javax.swing.JLabel txtUserApplicationNumber;
    private javax.swing.JLabel txtUserApplicationNumber1;
    private javax.swing.JLabel txtUserApplicationNumber2;
    private javax.swing.JLabel txtUserApplicationNumber3;
    // End of variables declaration//GEN-END:variables
}
