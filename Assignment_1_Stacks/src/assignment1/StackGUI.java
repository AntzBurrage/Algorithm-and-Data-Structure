package assignment1;

import javax.swing.JOptionPane;


public class StackGUI extends javax.swing.JFrame
{

    private final Stack stack;

    public StackGUI()
    {
        initComponents();

        this.stack = new Stack();

    }

    private void display(String x)
    {
        System.out.println(x);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        CheckButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        TopButton = new javax.swing.JButton();
        ClearStackButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        StackSizeButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STACK CREATOR");

        CheckButton.setText("CHECK");
        CheckButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CheckButtonActionPerformed(evt);
            }
        });

        InsertButton.setText("INSERT");
        InsertButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                InsertButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("REMOVE");
        RemoveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RemoveButtonActionPerformed(evt);
            }
        });

        TopButton.setText("TOP");
        TopButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TopButtonActionPerformed(evt);
            }
        });

        ClearStackButton.setText("CLEAR");
        ClearStackButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ClearStackButtonActionPerformed(evt);
            }
        });

        SearchButton.setText("SEARCH");
        SearchButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchButtonActionPerformed(evt);
            }
        });

        StackSizeButton.setText("SIZE");
        StackSizeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                StackSizeButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ExitButtonActionPerformed(evt);
            }
        });

        PrintButton.setText("PRINT");
        PrintButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PrintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(ClearStackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(StackSizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckButton)
                    .addComponent(InsertButton)
                    .addComponent(RemoveButton)
                    .addComponent(TopButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearStackButton)
                    .addComponent(StackSizeButton)
                    .addComponent(SearchButton)
                    .addComponent(PrintButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CheckButtonActionPerformed
    {//GEN-HEADEREND:event_CheckButtonActionPerformed
        if (stack.isEmpty())
        {
            this.display("Stack is Empty" + "\n");
        } else
        {
            this.display("There are " + this.stack.size() + " Nodes in the Stack" + "\n");
        }
    }//GEN-LAST:event_CheckButtonActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_InsertButtonActionPerformed
    {//GEN-HEADEREND:event_InsertButtonActionPerformed

        Student student1 = new Student();

        student1.name = JOptionPane.showInputDialog("Enter First Name");
        student1.surname = JOptionPane.showInputDialog("Enter Surname");
        student1.age = JOptionPane.showInputDialog("Enter Age");
        student1.StudID = JOptionPane.showInputDialog("Enter ID");
        student1.res1 = JOptionPane.showInputDialog("Enter Web Dev Result");
        student1.res2 = JOptionPane.showInputDialog("Enter Java Result");
        student1.res3 = JOptionPane.showInputDialog("Enter PHP Result");
        student1.res4 = JOptionPane.showInputDialog("Enter Engineering Result");
        student1.res5 = JOptionPane.showInputDialog("Enter Product Result");
        student1.res6 = JOptionPane.showInputDialog("Enter SQL Result");

        this.stack.push(student1);

        this.display("Pushed Data: " + "\n"
                + "First Name: " + student1.name + "\n"
                + "Surname: " + student1.surname + "\n"
                + "Age: " + student1.age + "\n"
                + "Student Number: " + student1.StudID + "\n"
                + "Web Dev Results: " + student1.res1 + "\n"
                + "Java Results: " + student1.res2 + "\n"
                + "PHP Results: " + student1.res3 + "\n"
                + "Engineering Results: " + student1.res4 + "\n"
                + "Product Results: " + student1.res5 + "\n"
                + "SQL Results: " + student1.res6 + "\n");

    }//GEN-LAST:event_InsertButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RemoveButtonActionPerformed
    {//GEN-HEADEREND:event_RemoveButtonActionPerformed
        if (stack.isEmpty())
        {
            this.display("Stack is Empty: Cannot Pop Data" + "\n");
        } else
        {
            this.stack.pop();
            this.display("Last Stacked Data has been Popped" + "\n");
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void TopButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TopButtonActionPerformed
    {//GEN-HEADEREND:event_TopButtonActionPerformed
        if (stack.isEmpty())
        {
            this.display("Stack is Empty: No Results to Print" + "\n");
        } else
        {
            Student element = this.stack.preview();
            this.display("Top of Stack Results: ID = " + element.StudID + " The Name is " + element.name + " " + element.surname + "\n");
        }
    }//GEN-LAST:event_TopButtonActionPerformed

    private void ClearStackButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ClearStackButtonActionPerformed
    {//GEN-HEADEREND:event_ClearStackButtonActionPerformed
        if (stack.isEmpty())
        {
            this.display("Stack is Already Empty: Clear Unsuccessful" + "\n");
        } else
        {
            this.stack.clear();
            this.display("Stack is Now Empty" + "\n");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ClearStackButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchButtonActionPerformed
    {//GEN-HEADEREND:event_SearchButtonActionPerformed
        String entry = JOptionPane.showInputDialog("Enter Surname to be Found");
        if (stack.isEmpty())
        {
            this.display("Stack is Empty: Cannot Print Data" + "\n");
        } else
        {
           Student student = this.stack.search(entry);
	   
	   if (student != null) 
	   { 
	        System.out.print("The Surname Entered " + entry + " Was Found \n" 
		+ "First Name: " + student.name + "\n"
                + "Surname: " + student.surname + "\n"
                + "Age: " + student.age + "\n"
                + "Student Number: " + student.StudID + "\n"
                + "Web Dev Results: " + student.res1 + "\n"
                + "Java Results: " + student.res2 + "\n"
                + "PHP Results: " + student.res3 + "\n"
                + "Engineering Results: " + student.res4 + "\n"
                + "Product Results: " + student.res5 + "\n"
                + "SQL Results: " + student.res6 + "\n\n");
	   } else { 
	   System.out.print("This Surname " + entry + " Was Not Found. \n");
	   }    
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void StackSizeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_StackSizeButtonActionPerformed
    {//GEN-HEADEREND:event_StackSizeButtonActionPerformed
        if (stack.isEmpty())
        {
            this.display("Stack is Empty" + "\n");
        } else
        {
            int total = this.stack.size();
            this.display("Stack Size: " + total + "\n");
        }
    }//GEN-LAST:event_StackSizeButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExitButtonActionPerformed
    {//GEN-HEADEREND:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PrintButtonActionPerformed
    {//GEN-HEADEREND:event_PrintButtonActionPerformed
        if (stack.isEmpty())
        {
            this.display("Stack is Empty: Cannot Print Data" + "\n");
        } else
        {
           this.stack.print();
        }
    }//GEN-LAST:event_PrintButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StackGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckButton;
    private javax.swing.JButton ClearStackButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton PrintButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton StackSizeButton;
    private javax.swing.JButton TopButton;
    // End of variables declaration//GEN-END:variables

    private void display(Student print)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
