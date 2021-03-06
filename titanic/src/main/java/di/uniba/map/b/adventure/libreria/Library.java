/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di.uniba.map.b.adventure.libreria;

import javax.swing.JOptionPane;

/**
 *
 * @author pt96t
 */
@SuppressWarnings("serial")
public class Library extends javax.swing.JFrame {
        
    /**
	 * 
	 */
	private boolean firstBookPushed = false;
    private boolean secondBookPushed = false;
    private boolean thirdBookPushed = false;
    private boolean fourthBookPushed = false;

    private boolean unlocked = false;

    private boolean Running = true;
    /**
     * Creates new form library
     */
    public Library() {
        initComponents();
    }

    private void setNotRunning() {
    	Running = false;
    }
    
    public boolean isRunning() {
    	return Running;
    }
    public boolean isUnlocked() {
    	return unlocked;
    }
    
    private void setUnlocked() {
    	unlocked = true;
    }
    private void reset() {

    firstBookPushed = false;
    secondBookPushed = false;
    thirdBookPushed = false;
    fourthBookPushed = false;
    
    
    JOptionPane.showMessageDialog(null, "I libri sono tornati al loro posto, forse hai sbagliato qualcosa");       
    }
    
    private boolean isFirstPushed() {
        return firstBookPushed;
    }
    
    private boolean isSecondPushed() {
        return secondBookPushed;
    }
    
    private boolean isThirdPushed() {
        return thirdBookPushed;
    }
    
    private boolean isFourthPushed() {
        return fourthBookPushed;
    }
    
    private void setFirstPushed(boolean pushed) {
        firstBookPushed = pushed;
    }
    
    private void setSecondPushed(boolean pushed) {
        secondBookPushed = pushed;
    }
    
    private void setThirdPushed(boolean pushed) {
        thirdBookPushed = pushed;
    }
    
    private void setFourthPushed(boolean pushed) {
        fourthBookPushed = pushed;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();

        jButton6.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton6.setText("20 mila leghe sotto il mare");
        jButton6.setToolTipText("");
        jButton6.setBorder(new javax.swing.border.MatteBorder(null));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton6.setVerifyInputWhenFocusTarget(false);
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titanic: The Lost Treasure");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(191, 90, 31));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setForeground(java.awt.Color.black);
        setName("libreria"); // NOI18N
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book test 2mlsim.png")); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(141, 81, 36));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(137, 85, 30)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book  cdgedf.png")); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book ipl.png")); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton3.setVerifyInputWhenFocusTarget(false);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random8.png")); // NOI18N
        jButton4.setToolTipText("");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButton4.setBorderPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random2.png")); // NOI18N
        jButton5.setToolTipText("");
        jButton5.setBorder(new javax.swing.border.MatteBorder(null));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton5.setVerifyInputWhenFocusTarget(false);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random3.png")); // NOI18N
        jButton7.setToolTipText("");
        jButton7.setBorder(new javax.swing.border.MatteBorder(null));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton7.setVerifyInputWhenFocusTarget(false);
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book Random9.png")); // NOI18N
        jButton8.setToolTipText("");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButton8.setBorderPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton8.setVerifyInputWhenFocusTarget(false);
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random.png")); // NOI18N
        jButton9.setToolTipText("");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton9.setVerifyInputWhenFocusTarget(false);
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random5.png")); // NOI18N
        jButton10.setToolTipText("");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton10.setVerifyInputWhenFocusTarget(false);
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 102, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random6.png")); // NOI18N
        jButton11.setToolTipText("");
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButton11.setBorderPainted(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton11.setVerifyInputWhenFocusTarget(false);
        jButton11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random7.png")); // NOI18N
        jButton12.setToolTipText("");
        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton12.setVerifyInputWhenFocusTarget(false);
        jButton12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random1.png")); // NOI18N
        jButton13.setToolTipText("");
        jButton13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton13.setVerifyInputWhenFocusTarget(false);
        jButton13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book lplpao.png")); // NOI18N
        jButton14.setToolTipText("");
        jButton14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton14.setVerifyInputWhenFocusTarget(false);
        jButton14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book Random10.png")); // NOI18N
        jButton15.setToolTipText("");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton15.setVerifyInputWhenFocusTarget(false);
        jButton15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random.png")); // NOI18N
        jButton16.setToolTipText("");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton16.setVerifyInputWhenFocusTarget(false);
        jButton16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book Random12.png")); // NOI18N
        jButton17.setToolTipText("");
        jButton17.setBorder(new javax.swing.border.MatteBorder(null));
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton17.setVerifyInputWhenFocusTarget(false);
        jButton17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book Random13.png")); // NOI18N
        jButton18.setToolTipText("");
        jButton18.setBorder(new javax.swing.border.MatteBorder(null));
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton18.setVerifyInputWhenFocusTarget(false);
        jButton18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(".\\media\\books\\Book random14.png")); // NOI18N
        jButton19.setToolTipText("");
        jButton19.setBorder(new javax.swing.border.MatteBorder(null));
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton19.setVerifyInputWhenFocusTarget(false);
        jButton19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleDescription("libro");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
if (!isFirstPushed()){
	
    setFirstPushed(true);
    
    JOptionPane.showMessageDialog(null, "Il libro e' rimasto bloccato");       


} else {

	reset();
}
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
reset();
    }                                        

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
reset();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
reset();
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
reset();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
reset();
    }                                        

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
reset();    }                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if (isFirstPushed()) {
        	
            if (!isSecondPushed()) {
            
            	setSecondPushed(true);
            
                JOptionPane.showMessageDialog(null, "Il libro e' rimasto bloccato");       

            	
            } else {
        		reset();
        	}
        } else {
    		reset();
    	}
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if (isFirstPushed()) {
        	
            if (isSecondPushed()) {
            
            	if(!isThirdPushed()) {
                
            		setThirdPushed(true);
            
            	    JOptionPane.showMessageDialog(null, "Il libro e' rimasto bloccato");       
            	
            	} else {
            		reset();
            	} 
                } else {
            		reset();
            	}
    } else {
		reset();
	}
        
    }                                 

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        if (isFirstPushed()) {
  
        	if (isSecondPushed()) {
            
        		if(isThirdPushed()) {
                
        			if(!isFourthPushed()) {
                    
        				setFourthPushed(true);
                       
        			    JOptionPane.showMessageDialog(null, "Il libro e' rimasto bloccato");  

                        setUnlocked();                       
                               			    
                        this.setVisible(false);
                        
                        setNotRunning();
                        
                   } else {
               		reset();
               	}
                    
                } else {
            		reset();
            	}
        } else {
    		reset();
    	}
    } else {
		reset();
	}
        
    }                                         

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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
