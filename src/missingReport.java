/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John Michael
 */
public class missingReport extends javax.swing.JFrame {

    /**
     * Creates new form missingReport
     */
    public missingReport() {
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

        menuButton = new javax.swing.JButton();
        missingTitleLabel = new javax.swing.JLabel();
        mapButton = new javax.swing.JButton();
        descText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        unitText = new javax.swing.JLabel();
        unitTextField = new javax.swing.JTextField();
        roomText = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        missingText = new javax.swing.JLabel();
        missingField = new javax.swing.JTextField();
        seenText = new javax.swing.JLabel();
        missingItemDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        missingTextArea = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        personalDescText = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        nameText = new javax.swing.JLabel();
        addressText = new javax.swing.JLabel();
        phoneText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuButton.setText("Main Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        missingTitleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        missingTitleLabel.setText("Missing Equipment Form");

        mapButton.setText("Map");
        mapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapButtonActionPerformed(evt);
            }
        });

        descText.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        descText.setText("(In the event of missing equipment throughout the hospital, please fill out this form accordingly)");

        unitText.setText("Unit:");

        unitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitTextFieldActionPerformed(evt);
            }
        });

        roomText.setText("Room Number:");

        missingText.setText("Name of missing item:");

        seenText.setText("Last Seen:");

        missingItemDesc.setText("Description of missing item:");

        missingTextArea.setColumns(20);
        missingTextArea.setLineWrap(true);
        missingTextArea.setRows(5);
        missingTextArea.setText("Basic description of missing item...\n");
        missingTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(missingTextArea);

        personalDescText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        personalDescText.setText("Fill out only if missing item is personal.");

        nameText.setText("Full Name:");

        addressText.setText("Address:");

        phoneText.setText("Phone Number:");

        emailText.setText("Email:");

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(descText))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(personalDescText)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menuButton)
                                .addGap(79, 79, 79)
                                .addComponent(missingTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(unitText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roomText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(missingText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(missingField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(seenText))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(missingItemDesc)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addressText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(phoneText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(missingTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mapButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitText)
                    .addComponent(unitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomText)
                    .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(missingText)
                    .addComponent(missingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(missingItemDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seenText)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(personalDescText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText)
                    .addComponent(phoneText)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressText)
                    .addComponent(emailText)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // Get user name
        String user = SecureRoundsUI.user;
        // If user is admin...
        if (user.contains("dbyland") ||
                user.contains("jcooper") ||
                user.contains("jmanno") ||
                user.contains("kvydra") ){
            this.setVisible(false); // hide report form
            new mainMenu().setVisible(true); // display admin menu
        }
        // Else, display menu for employees/users
        else{
            this.setVisible(false);
            new userMainMenu().setVisible(true);
        }
    }//GEN-LAST:event_menuButtonActionPerformed
    // Display map when clicked on.
    private void mapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapButtonActionPerformed
        
        new Map().setVisible(true);
    }//GEN-LAST:event_mapButtonActionPerformed

    private void unitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitTextFieldActionPerformed
        
    }//GEN-LAST:event_unitTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(missingReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(missingReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(missingReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(missingReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new missingReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressText;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel descText;
    private javax.swing.JLabel emailText;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton mapButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JTextField missingField;
    private javax.swing.JLabel missingItemDesc;
    private javax.swing.JLabel missingText;
    private javax.swing.JTextArea missingTextArea;
    private javax.swing.JLabel missingTitleLabel;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel personalDescText;
    private javax.swing.JLabel phoneText;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField roomField;
    private javax.swing.JLabel roomText;
    private javax.swing.JLabel seenText;
    private javax.swing.JLabel unitText;
    private javax.swing.JTextField unitTextField;
    // End of variables declaration//GEN-END:variables
}