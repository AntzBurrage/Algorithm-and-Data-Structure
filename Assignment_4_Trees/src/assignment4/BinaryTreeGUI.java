package assignment4;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class BinaryTreeGUI extends javax.swing.JFrame
{

    public BinaryTreeGUI()
    {
        this.initComponents();

        this.tree = new Tree();

    }

//Populate Tree With Random Numbers
    private void populateTree(int total)
    {
        int max = 100;
        int min = 1;
        int count = -1;

        while (count < total)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            this.tree.insertNode(randomNum);
            count++;
        }
    }

//Print Tree
    private void PrintTree()
    {
        this.PrintConsole(this.tree.Print());
    }

    public void PrintConsole(String text)
    {
        this.output.insert(text + "\n", 0);
    }

    final public Tree tree;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        exitButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        insertButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        emptyButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        populateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BINARY SEARCH TREE APP");

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitButtonActionPerformed(evt);
            }
        });

        printButton.setText("PRINT");
        printButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                printButtonActionPerformed(evt);
            }
        });

        insertButton.setText("INSERT");
        insertButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                insertButtonActionPerformed(evt);
            }
        });

        clearButton.setText("CLEAR CONSOLE");
        clearButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clearButtonActionPerformed(evt);
            }
        });

        emptyButton.setText("EMPTY TREE");
        emptyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                emptyButtonActionPerformed(evt);
            }
        });

        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        populateButton.setText("POPULATE TREE");
        populateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                populateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(clearButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(printButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(emptyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(populateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton)
                    .addComponent(insertButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(emptyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(populateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitButtonActionPerformed
    {//GEN-HEADEREND:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_printButtonActionPerformed
    {//GEN-HEADEREND:event_printButtonActionPerformed
        output.setText("");
        this.PrintTree();
    }//GEN-LAST:event_printButtonActionPerformed

    private void emptyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_emptyButtonActionPerformed
    {//GEN-HEADEREND:event_emptyButtonActionPerformed
        this.tree.emptyTree();
    }//GEN-LAST:event_emptyButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clearButtonActionPerformed
    {//GEN-HEADEREND:event_clearButtonActionPerformed
        output.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void populateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_populateButtonActionPerformed
    {//GEN-HEADEREND:event_populateButtonActionPerformed
        output.setText("");

        this.tree.emptyTree();

        String x = JOptionPane.showInputDialog("Enter Total of Tree Nodes");
        int number = Integer.parseInt(x);

        this.populateTree(number);

        output.setText("Tree Has Been Populated");
    }//GEN-LAST:event_populateButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_insertButtonActionPerformed
    {//GEN-HEADEREND:event_insertButtonActionPerformed
        String x = JOptionPane.showInputDialog("Enter Number");
        int number = Integer.parseInt(x);

        this.tree.insertNode(number);

        output.setText("Node " + number + " Has Been Populated");
    }//GEN-LAST:event_insertButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(BinaryTreeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(BinaryTreeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(BinaryTreeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(BinaryTreeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new BinaryTreeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton emptyButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea output;
    private javax.swing.JButton populateButton;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables
}
