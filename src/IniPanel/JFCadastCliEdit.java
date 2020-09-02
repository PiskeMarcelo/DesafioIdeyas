/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IniPanel;
import java.sql.*;
import IniPanel.MyConnect.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Haunter
 */
public class JFCadastCliEdit extends javax.swing.JFrame {

    Connection conexao = null;
PreparedStatement pst = null; 
ResultSet rs = null;
    
    /**
     * Creates new form NewJFrame
     */
    public JFCadastCliEdit() {
        initComponents();
        conexao = MyConnect.conector();
    }
 private void PesquisarCliente(){
           String sql ="Select * from service where Cliente like ?";
           try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,TxtCliente.getText() + "%");
               
               rs=pst.executeQuery();
               
               DadosServi.setModel(DbUtils.resultSetToTableModel(rs));
                       
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
           }
       }
 private void PesquisarNavi(){
           String sql ="Select * from service where Navio like ?";
           try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,TxtNavio.getText() + "%");
               
               rs=pst.executeQuery();
               
               DadosServi.setModel(DbUtils.resultSetToTableModel(rs));
                       
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
           }
       }
 private void PesquisarUsin(){
           String sql ="Select * from service where Usina like ?";
           try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,TxtUsina.getText() + "%");
               
               rs=pst.executeQuery();
               
               DadosServi.setModel(DbUtils.resultSetToTableModel(rs));
                       
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
           }
       }
 private void PesquisarEmb(){
           String sql ="Select * from service where Embarque like ?";
           try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,TxtEmbarque.getText() + "%");
               
               rs=pst.executeQuery();
               
               DadosServi.setModel(DbUtils.resultSetToTableModel(rs));
                       
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
           }
       }
 private void PesquisarDes(){
           String sql ="Select * from service where Desembarque like ?";
           try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,TxtDesembarque.getText() + "%");
               
               rs=pst.executeQuery();
               
               DadosServi.setModel(DbUtils.resultSetToTableModel(rs));
                       
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
           }
       }
 private void PesquisarQuant(){
           String sql ="Select * from service where Quantidade like ?";
           try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,TxtQuantidade.getText() + "%");
               
               rs=pst.executeQuery();
               
               DadosServi.setModel(DbUtils.resultSetToTableModel(rs));
                       
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
           }
       }
 private void PesquisarData(){
           String sql ="Select * from service where Data like ?";
           try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,TxtData.getText() + "%");
               
               rs=pst.executeQuery();
               
               DadosServi.setModel(DbUtils.resultSetToTableModel(rs));
                       
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
           }
       }
 
    /**
     *
     */
    private void adicionar(){
     String sql ="update service set serviço=?, Cliente=?, Navio=?, Usina=?, Embarque=?, Desembarque=?, Data=?, Quantidade=? where NOrden=?";
        
        try {
            pst=conexao.prepareStatement(sql);
            pst.setString(1,CombServi.getSelectedItem().toString());
            pst.setString(2,TxtCliente.getText());
            pst.setString(3,TxtNavio.getText());
            pst.setString(4,TxtUsina.getText());
            pst.setString(5,TxtEmbarque.getText());
            pst.setString(6,TxtDesembarque.getText());
            pst.setString(7,TxtData.getText());
            pst.setString(8,TxtQuantidade.getText());
            pst.setString(9,TxtOrdem.getText());
            
            if (TxtCliente.getText().isEmpty() || TxtNavio.getText().isEmpty() || TxtUsina.getText().isEmpty() || TxtEmbarque.getText().isEmpty() || TxtDesembarque.getText().isEmpty()
                    || TxtData.getText().isEmpty() || TxtQuantidade.getText().isEmpty() || TxtOrdem.getText().isEmpty())  {
             JOptionPane.showMessageDialog(null, "Preencha todos os campos");   
            }else{
                int adicionado = pst.executeUpdate();
            if (adicionado >0){
                JOptionPane.showMessageDialog(null, "Atualização realizada");
                TxtCliente.setText(null);   
                TxtNavio.setText(null);   
                TxtUsina.setText(null);   
                TxtEmbarque.setText(null);   
                TxtDesembarque.setText(null);   
                TxtData.setText(null);   
                TxtQuantidade.setText(null);   
                TxtOrdem.setText(null);   
                  
            }
                
            }      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtQuantidade = new javax.swing.JTextField();
        TxtData = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtUsina = new javax.swing.JTextField();
        TxtNavio = new javax.swing.JTextField();
        TxtCliente = new javax.swing.JTextField();
        TxtEmbarque = new javax.swing.JTextField();
        TxtDesembarque = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        DadosServi = new javax.swing.JTable();
        CombServi = new javax.swing.JComboBox<>();
        TxtOrdem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setText("Usina");

        jButton2.setText("cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Serviço");

        jLabel10.setText("Navio");

        TxtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDataActionPerformed(evt);
            }
        });

        jLabel11.setText("Quantidade");

        jLabel2.setText("Data");

        jLabel4.setText("Porto de embarque");

        jLabel5.setText("Porto de Destino");

        jLabel7.setText("Cliente");

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TxtUsina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtUsinaKeyReleased(evt);
            }
        });

        TxtNavio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNavioKeyReleased(evt);
            }
        });

        TxtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtClienteKeyReleased(evt);
            }
        });

        DadosServi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        DadosServi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadosServiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DadosServi);

        CombServi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cabotagem", "Granito", "Gusa", "Siderurgico" }));
        CombServi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombServiActionPerformed(evt);
            }
        });

        jLabel3.setText("Nº Ordem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 511, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(TxtCliente)
                            .addComponent(TxtData)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(TxtUsina)
                            .addComponent(jLabel1)
                            .addComponent(CombServi, 0, 159, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(TxtNavio, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtOrdem)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNavio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CombServi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDesembarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUsina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  setVisible(false);
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtClienteKeyReleased
     PesquisarCliente();   // TODO add your handling code here:
    }//GEN-LAST:event_TxtClienteKeyReleased

    private void TxtUsinaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsinaKeyReleased
PesquisarUsin();        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsinaKeyReleased

    private void TxtNavioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNavioKeyReleased
PesquisarNavi();        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNavioKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      adicionar();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CombServiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombServiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombServiActionPerformed

    private void DadosServiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadosServiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DadosServiMouseClicked

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
            java.util.logging.Logger.getLogger(JFCadastCliEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastCliEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastCliEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastCliEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastCliEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombServi;
    private javax.swing.JTable DadosServi;
    private javax.swing.JTextField TxtCliente;
    private javax.swing.JTextField TxtData;
    private javax.swing.JTextField TxtDesembarque;
    private javax.swing.JTextField TxtEmbarque;
    private javax.swing.JTextField TxtNavio;
    private javax.swing.JTextField TxtOrdem;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JTextField TxtUsina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void and(boolean empty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
