/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;
import javax.swing.JOptionPane;
import locadora.Chamado;
import static telas.TelaCliente.cliente;
import static telas.TelaMotorista.motorista;
import static telas.TelaVeiculo.veiculo;
/**
 *
 * @author leorb
 */
public class TelaChamado extends javax.swing.JFrame {

    static Chamado chamado;
    /**
     * Creates new form TelaChamado
     */
    public TelaChamado() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlChamado = new javax.swing.JPanel();
        lblIdChamado = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        rbtCorrida = new javax.swing.JRadioButton();
        rbtViagem = new javax.swing.JRadioButton();
        lblOrigem = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblPartida = new javax.swing.JLabel();
        lblRetorno = new javax.swing.JLabel();
        lblKmInicial = new javax.swing.JLabel();
        lblKmFinal = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtIdChamado = new javax.swing.JTextField();
        ftxtData = new javax.swing.JFormattedTextField();
        txtOrigem = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtKmInicial = new javax.swing.JTextField();
        txtKmFinal = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtRetorno = new javax.swing.JFormattedTextField();
        txtPartida = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chamado");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/phoneSmall.png")).getImage());

        pnlChamado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Informações do chamado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 13))); // NOI18N

        lblIdChamado.setText("id do chamado:");

        lblData.setText("Data:");

        buttonGroup1.add(rbtCorrida);
        rbtCorrida.setSelected(true);
        rbtCorrida.setText("Corrida");
        rbtCorrida.setToolTipText("Tipo de chamado");
        rbtCorrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCorridaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtViagem);
        rbtViagem.setText("Viagem");
        rbtViagem.setToolTipText("Tipo de chamado");

        lblOrigem.setText("Origem:");

        lblDestino.setText("Destino:");

        lblPartida.setText("Partida:");

        lblRetorno.setText("Retorno");

        lblKmInicial.setText("km inicial:");

        lblKmFinal.setText("km final:");

        lblValor.setText("Valor:");

        txtIdChamado.setToolTipText("Insira o id do chamado");
        txtIdChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdChamadoActionPerformed(evt);
            }
        });

        try {
            ftxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData.setToolTipText("Insira a data ");

        txtOrigem.setToolTipText("Origem do chamado");

        txtDestino.setToolTipText("Destino do chamado");

        txtKmInicial.setToolTipText("Kilometragem inicial");
        txtKmInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKmInicialActionPerformed(evt);
            }
        });

        txtKmFinal.setToolTipText("Kilometragem final");

        txtValor.setToolTipText("Valor pago");

        try {
            txtRetorno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetornoActionPerformed(evt);
            }
        });

        try {
            txtPartida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlChamadoLayout = new javax.swing.GroupLayout(pnlChamado);
        pnlChamado.setLayout(pnlChamadoLayout);
        pnlChamadoLayout.setHorizontalGroup(
            pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChamadoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                        .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addComponent(rbtCorrida)
                                .addGap(43, 43, 43)
                                .addComponent(rbtViagem))
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addComponent(lblData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ftxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addComponent(lblIdChamado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChamadoLayout.createSequentialGroup()
                        .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlChamadoLayout.createSequentialGroup()
                                .addComponent(lblOrigem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOrigem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDestino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                                        .addComponent(lblKmInicial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtKmInicial))
                                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                                        .addComponent(lblValor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 50, Short.MAX_VALUE))
                                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                                        .addComponent(lblPartida)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPartida)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                                        .addComponent(lblKmFinal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtKmFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                                        .addComponent(lblRetorno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRetorno)))))
                        .addGap(17, 17, 17))))
        );
        pnlChamadoLayout.setVerticalGroup(
            pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChamadoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdChamado)
                    .addComponent(txtIdChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblData)
                    .addComponent(ftxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtCorrida)
                    .addComponent(rbtViagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigem)
                    .addComponent(lblDestino)
                    .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPartida)
                    .addComponent(lblRetorno)
                    .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKmInicial)
                    .addComponent(lblKmFinal)
                    .addComponent(txtKmInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKmFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Chamado");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdChamadoActionPerformed

    private void rbtCorridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCorridaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtCorridaActionPerformed

    private void txtKmInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKmInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKmInicialActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtIdChamado.getText().equals("") || ftxtData.getText().equals("") || txtOrigem.getText().equals("")
        || txtDestino.getText().equals("") || txtPartida.getText().equals("") || txtRetorno.getText().equals("")
        || txtKmInicial.getText().equals("") || txtKmFinal.getText().equals("") || txtValor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        else{ 
            int id = Integer.parseInt(txtIdChamado.getText());
            String data = ftxtData.getText();
            String tipo = "";
            String origem = txtOrigem.getText();
            String destino = txtDestino.getText();
            String hrPartida = txtPartida.getText(); 
            String hrChegada = txtRetorno.getText();
            double kmInicial = Double.parseDouble(txtKmInicial.getText());
            double kmFinal = Double.parseDouble(txtKmFinal.getText());
            double valor = Double.parseDouble(txtValor.getText());      
            if (rbtCorrida.isSelected()){
                tipo = "Corrida";
            }
            else if (rbtViagem.isSelected() ){
                tipo = "Viagem";
            }

            chamado = new Chamado(id, data, tipo, origem, destino, hrPartida, hrChegada, kmInicial, kmFinal, valor);
            chamado.setVeiculo(veiculo);
            chamado.setMotorista(motorista);
            chamado.setCliente(cliente);
//            JOptionPane.showMessageDialog(null, "Chamado registrado!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, chamado, "Saída", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetornoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaChamado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftxtData;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblIdChamado;
    private javax.swing.JLabel lblKmFinal;
    private javax.swing.JLabel lblKmInicial;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblPartida;
    private javax.swing.JLabel lblRetorno;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlChamado;
    private javax.swing.JRadioButton rbtCorrida;
    private javax.swing.JRadioButton rbtViagem;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIdChamado;
    private javax.swing.JTextField txtKmFinal;
    private javax.swing.JTextField txtKmInicial;
    private javax.swing.JTextField txtOrigem;
    private javax.swing.JFormattedTextField txtPartida;
    private javax.swing.JFormattedTextField txtRetorno;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}