
package interfaces;

/**
 *
 * @author Henrik & Jakob
 */
public class GUI extends javax.swing.JFrame 
{

    String fileName = "Filename.txt";
    WordPairControlInterface trans;
    /**
     * Creates new form GUITest
     */
    
    public GUI() 
    {
        trans = new Translator();
        trans.load(fileName);     
        setResizable( false ); 
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPasswordField1 = new javax.swing.JPasswordField();
        titleName = new javax.swing.JLabel();
        answerTextField = new javax.swing.JTextField();
        newWpButton = new javax.swing.JButton();
        lookUpWpButton = new javax.swing.JButton();
        nextQuestionButton = new javax.swing.JButton();
        guessAnswerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        questionTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 0));
        setResizable(false);

        titleName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleName.setText("Language Trainer");
        titleName.setToolTipText("This is the title");
        titleName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        titleName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        answerTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTextFieldActionPerformed(evt);
            }
        });

        newWpButton.setText("New");
        newWpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWpButtonActionPerformed(evt);
            }
        });

        lookUpWpButton.setText("Look Up");
        lookUpWpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookUpWpButtonActionPerformed(evt);
            }
        });

        nextQuestionButton.setText("Next");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        guessAnswerButton.setText("Guess");
        guessAnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessAnswerButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Question:");

        jLabel3.setText("Answer:");

        questionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        questionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextFieldActionPerformed(evt);
            }
        });

        outputArea.setColumns(20);
        outputArea.setRows(5);
        outputArea.setFocusable(false);
        jScrollPane1.setViewportView(outputArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newWpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lookUpWpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(questionTextField)
                            .addComponent(answerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guessAnswerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextQuestionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleName)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(questionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(guessAnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newWpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lookUpWpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionButtonActionPerformed
        
        String text = trans.getRandomQuestion();
        int loopCount=0; // loopCount is added to prevent showing the same question twice.
        while(text.equalsIgnoreCase(questionTextField.getText()) && loopCount < 1000)
        {
            loopCount++;
            text = trans.getRandomQuestion();
        }
        if(loopCount == 1000)
        {
             outputArea.setText("Only one word pair at this difficulty.");
        }
        questionTextField.setText( text );
       
        
        
        
    }//GEN-LAST:event_nextQuestionButtonActionPerformed

    private void lookUpWpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookUpWpButtonActionPerformed
        // Here we find the answer to the question from questionTextField.
        String text = trans.lookup(questionTextField.getText());
        answerTextField.setText( text );
    }//GEN-LAST:event_lookUpWpButtonActionPerformed

    private void answerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTextFieldActionPerformed
      
    }//GEN-LAST:event_answerTextFieldActionPerformed

    private void questionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextFieldActionPerformed
   
    }//GEN-LAST:event_questionTextFieldActionPerformed

    private void guessAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessAnswerButtonActionPerformed
  
        if( checkTextFields() )  
        {
            if( trans.lookup(questionTextField.getText()) != null )
            {    
                if(trans.checkGuess(questionTextField.getText(),answerTextField.getText()))
                {
                    outputArea.setText("You are completely correct!");
                }
                else
                {
                    outputArea.setText("You are incorrect...");
                }
            }
            else
            {
                outputArea.setText("Word pair does not exist in the program.");
            }
        }
    }//GEN-LAST:event_guessAnswerButtonActionPerformed

    private void newWpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWpButtonActionPerformed
  
        if( checkTextFields() )
        {         
            String text = trans.lookup(questionTextField.getText());
            if( text == null)
            {

                        trans.clear();
                         trans.add( questionTextField.getText(), answerTextField.getText() );
                         
                         trans.save(fileName);
                         trans.load(fileName);
                         outputArea.setText("New wordpair added and saved.");
   

            }
            else  outputArea.setText("Wordpair already exists.");
        }

    }//GEN-LAST:event_newWpButtonActionPerformed

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
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() 
        {
            public void run() 
            {
                new GUI().setVisible(true);
            }
        }
        );
        
    }
    
    /**
     * This methods makes sure that we have text in both the question and answer text fields.
     * It is used whenever either of those two fields are required.
     * @return 
     */
    public boolean checkTextFields()
    {
        
           if( !questionTextField.getText().isEmpty() )
           {
               if( !answerTextField.getText().isEmpty() )
               {
                   return true;
               }
               else 
               {
                   outputArea.setText("Missing text in answer field.");
                   return false;
               }
           }
           else 
           {
            outputArea.setText("Missing text in question field.");
            return false;
           }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTextField;
    private javax.swing.JButton guessAnswerButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lookUpWpButton;
    private javax.swing.JButton newWpButton;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JTextField questionTextField;
    private javax.swing.JLabel titleName;
    // End of variables declaration//GEN-END:variables
}
