package assignment2;

import javax.swing.JOptionPane;

public class QueueGUI extends javax.swing.JFrame
{

    private final Queue queue;

    public QueueGUI()
    {
        initComponents();
        this.queue = new Queue();
    }

    private void display(String x)
    {
        System.out.println(x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        sizeButton = new javax.swing.JButton();
        frontButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        emptyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUEUE CALCULATOR");

        insertButton.setText("INSERT");
        insertButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                insertButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("REMOVE");
        deleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteButtonActionPerformed(evt);
            }
        });

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchButtonActionPerformed(evt);
            }
        });

        sizeButton.setText("SIZE");
        sizeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sizeButtonActionPerformed(evt);
            }
        });

        frontButton.setText("FRONT");
        frontButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frontButtonActionPerformed(evt);
            }
        });

        closeButton.setText("CLOSE");
        closeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                closeButtonActionPerformed(evt);
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

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });

        emptyButton.setText("EMPTY");
        emptyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                emptyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frontButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emptyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeButton)
                    .addComponent(searchButton)
                    .addComponent(deleteButton)
                    .addComponent(insertButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emptyButton)
                    .addComponent(backButton)
                    .addComponent(frontButton)
                    .addComponent(printButton))
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteButtonActionPerformed
    {//GEN-HEADEREND:event_deleteButtonActionPerformed
        if (queue.isEmpty())
        {
            this.display("Nothing in Queue" + "\n");
        } else
        {
            this.queue.remove();
            this.display("Front of Queue Has Been Removed" + "\n");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_searchButtonActionPerformed
    {//GEN-HEADEREND:event_searchButtonActionPerformed
        String entry = JOptionPane.showInputDialog("Enter Surname of Employee");
        if (queue.isEmpty())
        {
            this.display("Queue is Empty: Cannot Print Data" + "\n");
        } else
        {
            Employee employee1 = this.queue.search(entry);

            if (employee1 != null)
            {
                System.out.print("The Surname Entered " + entry + " Was Found \n"
                        + "Student Number: " + employee1.employeenum + "\n"
                        + "Surname: " + employee1.surname + "\n"
                        + "First Name: " + employee1.firstname + "\n"
                        + "Age: " + employee1.age + "\n"
                );
            } else
            {
                System.out.print("This Surname " + entry + " Was Not Found. \n");
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void sizeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sizeButtonActionPerformed
    {//GEN-HEADEREND:event_sizeButtonActionPerformed
        if (queue.isEmpty())
        {
            this.display("Queue is Empty" + "\n");
        } else
        {
            int total = this.queue.size();
            this.display("Queue Size: " + total + "\n");
        }
    }//GEN-LAST:event_sizeButtonActionPerformed

    private void frontButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frontButtonActionPerformed
    {//GEN-HEADEREND:event_frontButtonActionPerformed
        if (queue.isEmpty())
        {
            this.display("Queue is Empty: No Results to Print" + "\n");
        } else
        {
            Employee element = this.queue.getTop();
            this.display("Front of Queue Results: Employee Number: " + element.employeenum + " - Name: " + element.surname + ", " + element.firstname + "\n");
        }
    }//GEN-LAST:event_frontButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeButtonActionPerformed
    {//GEN-HEADEREND:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_insertButtonActionPerformed
    {//GEN-HEADEREND:event_insertButtonActionPerformed
        Employee employee1 = new Employee();

        employee1.employeenum = JOptionPane.showInputDialog("Enter Employee Number");
        employee1.surname = JOptionPane.showInputDialog("Enter Surname");
        employee1.firstname = JOptionPane.showInputDialog("Enter First Name");
        employee1.age = JOptionPane.showInputDialog("Enter Age");

        this.queue.append(employee1);

        this.display("New Data In Queue: " + "\n"
                + "Employee Number: " + employee1.employeenum + "\n"
                + "First Name: " + employee1.firstname + "\n"
                + "Surname: " + employee1.surname + "\n"
                + "Age: " + employee1.age + "\n");
    }//GEN-LAST:event_insertButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_printButtonActionPerformed
    {//GEN-HEADEREND:event_printButtonActionPerformed
        if (queue.isEmpty())
        {
            this.display("Queue is Empty: Cannot Print Data" + "\n");
        } else
        {
            this.queue.print();
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        if (queue.isEmpty())
        {
            this.display("Nothing in Queue" + "\n");
        } else
        {
            Employee element = this.queue.getTail();
            this.display("Front of Queue Results: Employee Number: " + element.employeenum + " - Name: " + element.surname + ", " + element.firstname + "\n");
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void emptyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_emptyButtonActionPerformed
    {//GEN-HEADEREND:event_emptyButtonActionPerformed
        if (queue.isEmpty())
        {
            this.display("Queue is Already Empty: Clear Unsuccessful" + "\n");
        } else
        {
            this.queue.clear();
            this.display("Queue is Now Empty" + "\n");
        }
    }//GEN-LAST:event_emptyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new QueueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton emptyButton;
    private javax.swing.JButton frontButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sizeButton;
    // End of variables declaration//GEN-END:variables
}
