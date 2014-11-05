import javax.swing.ImageIcon;
import java.net.URL;

public class CrapsGUI extends javax.swing.JFrame {
    Craps game;
    boolean newgame;
    int money=100;
    public CrapsGUI() {
        initComponents();
        game = new Craps();
        txtgame.setEditable(false);
        newgame=true;
        txtgame.setText("Welcome to the game\n\nBasic Info\n------------------\nRoll a 7 or 11 on the first roll - You Win\nRoll a 2,3 or 10 on the first roll - You Lose\nGoodluck!");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnroll = new javax.swing.JButton();
        lbldie1 = new javax.swing.JLabel();
        lbldie2 = new javax.swing.JLabel();
        btnquit = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtgame = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnroll.setBackground(new java.awt.Color(204, 255, 204));
        btnroll.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        btnroll.setText("Roll Die");
        btnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrollActionPerformed(evt);
            }
        });

        lbldie1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbldie2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnquit.setBackground(new java.awt.Color(204, 255, 204));
        btnquit.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        btnquit.setText("Quit");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        lbltotal.setBackground(new java.awt.Color(204, 255, 204));
        lbltotal.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        lbltotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbltotal.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setText("Craps");

        lblmoney.setBackground(new java.awt.Color(255, 204, 204));
        lblmoney.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        lblmoney.setText("$100");
        lblmoney.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblmoney.setOpaque(true);

        txtgame.setColumns(20);
        txtgame.setRows(5);
        jScrollPane1.setViewportView(txtgame);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnquit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 32, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lbldie1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)))
                                .addComponent(lbldie2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnroll)
                        .addGap(18, 18, 18)
                        .addComponent(btnquit))
                    .addComponent(lbldie1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldie2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrollActionPerformed
        
        game.roll();
        
        lbldie1.setIcon(game.getDiePic(1));
        lbldie2.setIcon(game.getDiePic(2));
        
        if (newgame){
            txtgame.setText("New Game\n----\nYou rolled a: " + game.getTotal());
            newgame=false;
            money-=5;
            lblmoney.setText("$" + money);
        }
        else
            txtgame.setText("\n----\nYou rolled a: "+ game.getTotal());
            
        lbltotal.setText("" + game.getTotal());
        
        
        
        
        if (newgame){
            txtgame.setText("\nNew Game\n");
        }
    
        if (game.hasWon()){
            txtgame.append(" - You Won!"+"\n-----\n Click roll to start a new game");
                game = new Craps();
                newgame = true;
                money +=15;
                lblmoney.setText("$"+money);
        }
    
        else if (game.hasLost()){
            txtgame.append(" - You Lost"+"\n-----\n Click roll to start a new game");
                game = new Craps();
                newgame = true;
        }

        else
            txtgame.append("\nGame continues...\nRoll a " + game.getTotal() + " to win or a 7 to lose");
    
    }//GEN-LAST:event_btnrollActionPerformed
   
    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnquitActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldie1;
    private javax.swing.JLabel lbldie2;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextArea txtgame;
    // End of variables declaration//GEN-END:variables
}
