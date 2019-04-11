package GUI;

import bl.Konto;

public class KontoGUI extends javax.swing.JFrame {
    private Konto account;

    public KontoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMenue = new javax.swing.JPopupMenu();
        miAddUser = new javax.swing.JMenuItem();
        miAccountTest = new javax.swing.JMenuItem();
        addAccount = new javax.swing.JPopupMenu();
        miAddAccount = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOut = new javax.swing.JTextArea();
        lbAccount = new javax.swing.JLabel();

        miAddUser.setText("add user");
        miAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUserActionPerformed(evt);
            }
        });
        listMenue.add(miAddUser);

        miAccountTest.setText("perform account test");
        miAccountTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAccountTestActionPerformed(evt);
            }
        });
        listMenue.add(miAccountTest);

        miAddAccount.setText("create account");
        miAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddAccountActionPerformed(evt);
            }
        });
        addAccount.add(miAddAccount);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konto-Verwaltung");

        list.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));
        list.setComponentPopupMenu(listMenue);
        jScrollPane1.setViewportView(list);

        taOut.setColumns(20);
        taOut.setRows(5);
        taOut.setBorder(javax.swing.BorderFactory.createTitledBorder("Log-output"));
        taOut.setComponentPopupMenu(addAccount);
        jScrollPane2.setViewportView(taOut);

        lbAccount.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));
        lbAccount.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAddUserActionPerformed

    private void miAccountTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAccountTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAccountTestActionPerformed

    private void miAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddAccountActionPerformed
        account = new Konto(100);
    }//GEN-LAST:event_miAddAccountActionPerformed

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
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KontoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KontoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu addAccount;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JList<String> list;
    private javax.swing.JPopupMenu listMenue;
    private javax.swing.JMenuItem miAccountTest;
    private javax.swing.JMenuItem miAddAccount;
    private javax.swing.JMenuItem miAddUser;
    private javax.swing.JTextArea taOut;
    // End of variables declaration//GEN-END:variables
}
