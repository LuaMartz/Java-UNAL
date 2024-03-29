/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triki_Panel;

import java.awt.Color;
import javax.swing.*;

public class Vista extends javax.swing.JFrame {

    //Atributos
        String turno = "X";
        JLabel arreglo_labels[]= new JLabel[9];
        int valoresWin[][]={
            /*  c0 c1 c2
            f0 | 0 1 2 |
            f1 | 3 4 5 |
            f2 | 6 7 8 |
            */ 
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {0,3,6},
            {1,4,7},
            {2,5,8},
            {0,4,8},
            {2,4,6}
            };
        
        //Constructor
        public Vista() {
            initComponents();
            this.setTitle("Triki Grupo 18");
            arreglo_labels[0]=_1_1;
            arreglo_labels[1]=_1_2;
            arreglo_labels[2]=_1_3;
            arreglo_labels[3]=_2_1;
            arreglo_labels[4]=_2_2;
            arreglo_labels[5]=_2_3;
            arreglo_labels[6]=_3_1;
            arreglo_labels[7]=_3_2;
            arreglo_labels[8]=_3_3;
            jLGanador.setVisible(true);
            jLGanador.setText("Ganador jugador" + turno);
            //arreglo_labels[valoresWin[i][0]].setBackround(Color.ORANGE);
        }
        
        public void presionar(int casilla){
            if (jLGanador.getText().equals("")) {
                if (arreglo_labels[casilla].getText().equals("")) {
                    arreglo_labels[casilla].setText(turno);
                    ganador();
                    empate();
                    cambiarTurno();
                }else{
                    JOptionPane.showMessageDialog(null,"Este campo esta ocupa, \n seleccione otro","Alerta",WIDTH);
                }
            }else {
                JOptionPane.showMessageDialog(null,"Fin del juego","Advertencia",HEIGHT);
            }
        }
        
        public void ganador(){
            for (int i = 0; i < valoresWin.length; i++) {
                if (arreglo_labels[valoresWin[i][0]].getText().equals(turno)&& 
                arreglo_labels[valoresWin[i][1]].getText().equals(turno)&& 
                arreglo_labels[valoresWin[i][2]].getText().equals(turno)){
                    jLGanador.setVisible(true);
                    jLGanador.setText("GANADOR JUGADOR"+turno);
                    if (turno.equals("O")) {
                        arreglo_labels[valoresWin[i][0]].setBackground(Color.WHITE);
                        arreglo_labels[valoresWin[i][1]].setBackground(Color.WHITE);
                        arreglo_labels[valoresWin[i][2]].setBackground(Color.WHITE);
                    }else{
                        arreglo_labels[valoresWin[i][0]].setBackground(Color.WHITE);
                        arreglo_labels[valoresWin[i][0]].setBackground(Color.WHITE);
                        arreglo_labels[valoresWin[i][0]].setBackground(Color.WHITE);
                }
                    }
            }
        }
        
        public void cambiarTurno(){
            if (turno.equals("X")) {
                turno="O";
            }else{
                turno="X";
            }
        }
        
        public void empate(){
            int contador = 0;
            for (JLabel i: arreglo_labels) {
                if (!i.getText().equals("")) {
                    contador++;
                }
            }
            if (contador==arreglo_labels.length && jLGanador.getText().equals("")) {
                jLGanador.setVisible(true);
                jLGanador.setText("Empate");
            }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        trikiF = new javax.swing.JPanel();
        _1_1 = new javax.swing.JLabel();
        _1_2 = new javax.swing.JLabel();
        _1_3 = new javax.swing.JLabel();
        _2_1 = new javax.swing.JLabel();
        _2_2 = new javax.swing.JLabel();
        _2_3 = new javax.swing.JLabel();
        _3_1 = new javax.swing.JLabel();
        _3_2 = new javax.swing.JLabel();
        _3_3 = new javax.swing.JLabel();
        boton = new javax.swing.JToggleButton();
        jLGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        trikiF.setBackground(new java.awt.Color(51, 0, 51));

        _1_1.setBackground(new java.awt.Color(255, 153, 153));
        _1_1.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _1_1.setOpaque(true);
        _1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _1_1MousePressed(evt);
            }
        });

        _1_2.setBackground(new java.awt.Color(255, 153, 153));
        _1_2.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _1_2.setOpaque(true);
        _1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _1_2MousePressed(evt);
            }
        });

        _1_3.setBackground(new java.awt.Color(255, 153, 153));
        _1_3.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _1_3.setOpaque(true);
        _1_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _1_3MousePressed(evt);
            }
        });

        _2_1.setBackground(new java.awt.Color(255, 153, 153));
        _2_1.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _2_1.setOpaque(true);
        _2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _2_1MousePressed(evt);
            }
        });

        _2_2.setBackground(new java.awt.Color(255, 153, 153));
        _2_2.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _2_2.setOpaque(true);
        _2_2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                _2_2PropertyChange(evt);
            }
        });

        _2_3.setBackground(new java.awt.Color(255, 153, 153));
        _2_3.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _2_3.setOpaque(true);
        _2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _2_3MousePressed(evt);
            }
        });

        _3_1.setBackground(new java.awt.Color(255, 153, 153));
        _3_1.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _3_1.setOpaque(true);
        _3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _3_1MousePressed(evt);
            }
        });

        _3_2.setBackground(new java.awt.Color(255, 153, 153));
        _3_2.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _3_2.setOpaque(true);
        _3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _3_2MousePressed(evt);
            }
        });

        _3_3.setBackground(new java.awt.Color(255, 153, 153));
        _3_3.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        _3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _3_3.setOpaque(true);
        _3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _3_3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout trikiFLayout = new javax.swing.GroupLayout(trikiF);
        trikiF.setLayout(trikiFLayout);
        trikiFLayout.setHorizontalGroup(
            trikiFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trikiFLayout.createSequentialGroup()
                .addGroup(trikiFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trikiFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trikiFLayout.createSequentialGroup()
                        .addComponent(_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(trikiFLayout.createSequentialGroup()
                        .addComponent(_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(trikiFLayout.createSequentialGroup()
                        .addComponent(_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        trikiFLayout.setVerticalGroup(
            trikiFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trikiFLayout.createSequentialGroup()
                .addGroup(trikiFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trikiFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(trikiFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        boton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        boton.setText("Volver a jugar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLGanador.setBackground(new java.awt.Color(255, 255, 255));
        jLGanador.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLGanador.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 255), new java.awt.Color(255, 153, 255), new java.awt.Color(204, 153, 255))));
        jLGanador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLGanador.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(boton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trikiF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trikiF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton)
                .addContainerGap())
        );

        jLGanador.getAccessibleContext().setAccessibleName("jLGanador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _1_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__1_1MousePressed
        presionar(1);
    }//GEN-LAST:event__1_1MousePressed

    private void _1_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__1_2MousePressed
        presionar(2);
    }//GEN-LAST:event__1_2MousePressed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        for (int i = 0; i < arreglo_labels.length; i++) {
            arreglo_labels[i].setText("");
            arreglo_labels[i].setBackground(Color.getHSBColor(255, 153, 153));
        }
        
        jLGanador.setText("");
        jLGanador.setVisible(false);
        turno="X";
    }//GEN-LAST:event_botonActionPerformed

    private void _1_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__1_3MousePressed
        presionar(3);
    }//GEN-LAST:event__1_3MousePressed

    private void _2_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__2_1MousePressed
        presionar(4);
    }//GEN-LAST:event__2_1MousePressed

    private void _2_2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event__2_2PropertyChange
        presionar(5);
    }//GEN-LAST:event__2_2PropertyChange

    private void _2_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__2_3MousePressed
        presionar(6);
    }//GEN-LAST:event__2_3MousePressed

    private void _3_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__3_1MousePressed
        presionar(7);
    }//GEN-LAST:event__3_1MousePressed

    private void _3_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__3_2MousePressed
        presionar(8);
    }//GEN-LAST:event__3_2MousePressed

    private void _3_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__3_3MousePressed
        presionar(9);
    }//GEN-LAST:event__3_3MousePressed

    
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _1_1;
    private javax.swing.JLabel _1_2;
    private javax.swing.JLabel _1_3;
    private javax.swing.JLabel _2_1;
    private javax.swing.JLabel _2_2;
    private javax.swing.JLabel _2_3;
    private javax.swing.JLabel _3_1;
    private javax.swing.JLabel _3_2;
    private javax.swing.JLabel _3_3;
    private javax.swing.JToggleButton boton;
    private javax.swing.JLabel jLGanador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel trikiF;
    // End of variables declaration//GEN-END:variables
}
