/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.testeenube.VIEW;

import com.mycompany.testeenube.DAO.FilmesDAO;
import com.mycompany.testeenube.MODEL.Filmes;
import javax.swing.JOptionPane;

/**
 *
 * @author Compaq
 */
public class Cadastrar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastrar
     */
    public Cadastrar() {
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

        jPanel1 = new javax.swing.JPanel();
        cmbGenero = new javax.swing.JComboBox<>();
        jlbFilme = new javax.swing.JLabel();
        jlbValor = new javax.swing.JLabel();
        jlbGenero = new javax.swing.JLabel();
        txtFilme = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopose = new javax.swing.JTextArea();
        jlbSinopose = new javax.swing.JLabel();
        jlbClassificacao = new javax.swing.JLabel();
        cmbClassificação = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CADASTRO DO FILME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "ACAO", "COMEDIA", "DOCUMENTARIO", "DRAMA", "ROMANCE", "TERROR", " " }));
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });

        jlbFilme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbFilme.setText("Filme:");

        jlbValor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbValor.setText("Valor:");

        jlbGenero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbGenero.setText("Genero:");

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtSinopose.setColumns(20);
        txtSinopose.setRows(5);
        jScrollPane1.setViewportView(txtSinopose);

        jlbSinopose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbSinopose.setText("SINOPOSE:");

        jlbClassificacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbClassificacao.setText("Classificação:");

        cmbClassificação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIVRE", "10 ANOS", "12 ANOS", "16 ANOS", "18 ANOS" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlbFilme)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlbValor)
                                        .addComponent(jlbGenero))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbGenero, 0, 135, Short.MAX_VALUE)
                                        .addComponent(txtValor))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbClassificacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbClassificação, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbSinopose)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFilme)
                    .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbSinopose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbGenero)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbClassificacao)
                            .addComponent(cmbClassificação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addComponent(btnCadastrar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

       // Criando variaveis 
        String Filme = txtFilme.getText();
        String Genero = cmbGenero.getSelectedItem().toString();
        String Classificacao = cmbClassificação.getSelectedItem().toString();
        String Valor = txtValor.getText();
        String Sinope = txtSinopose.getText();
        
        Filmes classeCadastrar = new Filmes();
        
        classeCadastrar.setFilme(Filme);
        classeCadastrar.setClassificacao(Classificacao);
        classeCadastrar.setGenero(Genero);
        classeCadastrar.setValor(Valor);
        classeCadastrar.setSinopose(Sinope);
        
       
          
        if (FilmesDAO.salvar(Filme, Genero, Classificacao, Valor, Sinope)) {
                JOptionPane.showMessageDialog(this, "Cadastro realizada!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Cadastrar, Tentar novamente!");
            }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGeneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cmbClassificação;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbClassificacao;
    private javax.swing.JLabel jlbFilme;
    private javax.swing.JLabel jlbGenero;
    private javax.swing.JLabel jlbSinopose;
    private javax.swing.JLabel jlbValor;
    private javax.swing.JTextField txtFilme;
    private javax.swing.JTextArea txtSinopose;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}