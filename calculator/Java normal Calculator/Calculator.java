
public class Calculator extends javax.swing.JFrame {
    double num1,num2,res;
    String task,to;
    int i=0;
   
    public Calculator() {
        initComponents();
        screen.setEditable(false);
        screen1.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        screen = new javax.swing.JTextField();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a0 = new javax.swing.JButton();
        a_div = new javax.swing.JButton();
        a_mul = new javax.swing.JButton();
        a_sub = new javax.swing.JButton();
        a_sum = new javax.swing.JButton();
        a_equal = new javax.swing.JButton();
        a_flote = new javax.swing.JButton();
        a_sum_minus = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        screen1 = new javax.swing.JTextField();
        square = new javax.swing.JButton();
        QUBE = new javax.swing.JButton();
        sgrt = new javax.swing.JButton();
        opp = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a1.setText("1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setText("2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });

        a3.setText("3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.setText("4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a5.setText("5");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setText("6");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a7.setText("7");
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        a8.setText("8");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a9.setText("9");
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a0.setText("0");
        a0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a0ActionPerformed(evt);
            }
        });

        a_div.setText("/");
        a_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_divActionPerformed(evt);
            }
        });

        a_mul.setText("*");
        a_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_mulActionPerformed(evt);
            }
        });

        a_sub.setText("-");
        a_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_subActionPerformed(evt);
            }
        });

        a_sum.setText("+");
        a_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_sumActionPerformed(evt);
            }
        });

        a_equal.setText("=");
        a_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_equalActionPerformed(evt);
            }
        });

        a_flote.setText(".");
        a_flote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_floteActionPerformed(evt);
            }
        });

        a_sum_minus.setText("+/ -");
        a_sum_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_sum_minusActionPerformed(evt);
            }
        });

        mod.setText("%");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        ac.setText("AC");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        square.setText("X^2");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        QUBE.setText("QUBE");
        QUBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUBEActionPerformed(evt);
            }
        });

        sgrt.setText("SQRT");
        sgrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgrtActionPerformed(evt);
            }
        });

        opp.setText("1/X");
        opp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oppActionPerformed(evt);
            }
        });

        back.setText("B.SPACE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a_sum_minus, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(square))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(a6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(a0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(4, 4, 4)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(a_flote, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(a_equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(a_mul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(a_div, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(a_sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(a_sum)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(QUBE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sgrt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(221, 221, 221))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_div)
                    .addComponent(mod)
                    .addComponent(ac)
                    .addComponent(square))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_mul)
                    .addComponent(a9)
                    .addComponent(a8)
                    .addComponent(a7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a4)
                    .addComponent(a5)
                    .addComponent(a6)
                    .addComponent(a_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3)
                    .addComponent(a2)
                    .addComponent(a1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_sum_minus)
                    .addComponent(a0)
                    .addComponent(a_equal)
                    .addComponent(a_flote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sgrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opp)
                    .addComponent(QUBE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        String number1= screen.getText() + a1.getText();
        screen.setText(number1);
     
        
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
       String number3= screen.getText() + a3.getText();
        screen.setText(number3);
     
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        String number4= screen.getText() + a4.getText();
        screen.setText(number4);
     
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
         String number5= screen.getText() + a5.getText();
        screen.setText(number5);
     
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
       String number6= screen.getText() + a6.getText();
       screen.setText(number6);
     
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        String number7= screen.getText() + a7.getText();
        screen.setText(number7);
     
    }//GEN-LAST:event_a7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        String number8= screen.getText() + a8.getText();
        screen.setText(number8);
     
    }//GEN-LAST:event_a8ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        String number9= screen.getText() + a9.getText();
        screen.setText(number9);
     
    }//GEN-LAST:event_a9ActionPerformed

    private void a0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a0ActionPerformed
    String number0= screen.getText() + a0.getText();
        screen.setText(number0);
     
    }//GEN-LAST:event_a0ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        String number2= screen.getText() + a2.getText();
        screen.setText(number2);
      
    }//GEN-LAST:event_a2ActionPerformed

    private void a_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_sumActionPerformed
          String number0= screen.getText();
         screen1.setText(number0);
         
        num1=Double.parseDouble(screen.getText());
        screen.setText("");
        task="+";
        i=0;
    }//GEN-LAST:event_a_sumActionPerformed

    private void a_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_subActionPerformed
          String number0= screen.getText();
         screen1.setText(number0);
         
        num1=Double.parseDouble(screen.getText());
        screen.setText("");
        task="-";
        i=0;
    }//GEN-LAST:event_a_subActionPerformed

    private void a_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_divActionPerformed
          String number0= screen.getText();
         screen1.setText(number0);
         
        num1=Double.parseDouble(screen.getText());
        screen.setText("");
        task="/";
        i=0;
    }//GEN-LAST:event_a_divActionPerformed

    private void a_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_mulActionPerformed
         String number0= screen.getText();
         screen1.setText(number0);
         
        num1=Double.parseDouble(screen.getText());
        screen.setText("");
        task="*";
        i=0;
        
    }//GEN-LAST:event_a_mulActionPerformed

    private void a_floteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_floteActionPerformed
        
         if(i==0)
         {
        String number10=screen.getText()+a_flote.getText();
        screen.setText(number10);
        i++;
         }
         else
             return;
        
        
        
    }//GEN-LAST:event_a_floteActionPerformed

    private void a_sum_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_sum_minusActionPerformed
         String number0= screen.getText();
         screen1.setText(number0);
         
        double minus=Double.parseDouble(String.valueOf(screen.getText()));
       minus*=(-1);
       screen.setText(String.valueOf(minus));
    }//GEN-LAST:event_a_sum_minusActionPerformed

    private void a_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_equalActionPerformed
        String ans;
        num2=Double.parseDouble(screen.getText());
        String b;
        b=screen1.getText()+task+screen.getText();
        screen1.setText(b);
        if(task=="+")
                {
                res=num1+num2;
                ans=String.format("%.2f", res);
                screen.setText(ans);
               
              
                }
        else if(task=="-")
                {
                res=num1-num2;
                ans=String.format("%.2f", res);
                screen.setText(ans);
                }
          else if(task=="*")
                {
               
                res=num1*num2;
                ans=String.format("%.2f", res);
                screen.setText(ans);
                
        
                }
          else if(task=="/")
                {
                res=num1/num2;
                ans=String.format("%.2f", res);
                screen.setText(ans);
                }
       
         else if(task=="%")
                {
                res=num1%num2;
                ans=String.format("%.2f", res);
                screen.setText(ans);
                }
        
        
        
        
        
    }//GEN-LAST:event_a_equalActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
         String number0= screen.getText();
         screen1.setText(number0);
         
        num1=Double.parseDouble(screen.getText());
        screen.setText("");
        task="%";
    }//GEN-LAST:event_modActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        i=0;
        screen.setText(""); 
        screen1.setText("");
    }//GEN-LAST:event_acActionPerformed

    private void screenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_screenActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
          String number0= screen.getText();
         screen1.setText(number0+" square");
         String res;
         num1=Double.parseDouble(screen.getText());
         double x=num1*num1;
         res=String.valueOf(x);
         screen.setText(res);
        
    }//GEN-LAST:event_squareActionPerformed

    private void QUBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUBEActionPerformed
         String number0= screen.getText();
         screen1.setText(number0+" qube");
         String res;
         num1=Double.parseDouble(screen.getText());
         double x=num1*num1*num1;
         res=String.valueOf(x);
         screen.setText(res);
    }//GEN-LAST:event_QUBEActionPerformed

    private void sgrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgrtActionPerformed
        
         String number0= screen.getText();
         screen1.setText(number0+" sqrt");
         String res;
         num1=Double.parseDouble(screen.getText());
         double x=Math.sqrt(num1);
         res=String.valueOf(x);
         screen.setText(res);
    }//GEN-LAST:event_sgrtActionPerformed

    private void oppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oppActionPerformed
        String number0= screen.getText();
         screen1.setText(number0+" inverse 1");
         String res;
         num1=Double.parseDouble(screen.getText());
         double x=1/num1;
         res=String.valueOf(x);
         screen.setText(res);
    }//GEN-LAST:event_oppActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        String back=null;
        if(screen.getText().length()>0)
        {
            StringBuilder st=new StringBuilder(screen.getText());
            st.deleteCharAt(screen.getText().length()-1);
            back=st.toString();
            screen.setText(back);
        }
    }//GEN-LAST:event_backActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QUBE;
    private javax.swing.JButton a0;
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JButton a_div;
    private javax.swing.JButton a_equal;
    private javax.swing.JButton a_flote;
    private javax.swing.JButton a_mul;
    private javax.swing.JButton a_sub;
    private javax.swing.JButton a_sum;
    private javax.swing.JButton a_sum_minus;
    private javax.swing.JButton ac;
    private javax.swing.JButton back;
    private javax.swing.JButton mod;
    private javax.swing.JButton opp;
    private javax.swing.JTextField screen;
    private javax.swing.JTextField screen1;
    private javax.swing.JButton sgrt;
    private javax.swing.JButton square;
    // End of variables declaration//GEN-END:variables
}
