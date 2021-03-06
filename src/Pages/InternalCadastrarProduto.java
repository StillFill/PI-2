/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import connection.MockProduto;
import model.bean.Produto;

/**
 *
 * @author Ana Carolina
 */
public class InternalCadastrarProduto extends javax.swing.JInternalFrame {

    boolean editando = false;
    boolean clicked = false;

    /**
     * Creates new form InternalCadastrarProduto
     */
    public InternalCadastrarProduto() {
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

        painelCadastrarProduto = new javax.swing.JPanel();
        txtDescricaoProduto = new javax.swing.JTextField();
        lblDescricaoProduto = new javax.swing.JLabel();
        lblQuantProduto = new javax.swing.JLabel();
        spinnerQuantProduto = new javax.swing.JSpinner();
        txtPrecoProduto = new javax.swing.JTextField();
        lblPrecoProduto = new javax.swing.JLabel();
        lblTipoProduto = new javax.swing.JLabel();
        comboTipoProduto = new javax.swing.JComboBox<>();
        btnCadastrarProduto = new javax.swing.JButton();
        lblPrecoProduto1 = new javax.swing.JLabel();
        txtPedraProduto = new javax.swing.JTextField();
        lblTamanhoProduto = new javax.swing.JLabel();
        spinnerTamanhoProduto = new javax.swing.JSpinner();
        txtAlturaProduto = new javax.swing.JTextField();
        lblAlturaProduto = new javax.swing.JLabel();
        txtLarguraProduto = new javax.swing.JTextField();
        lblLarguraProduto = new javax.swing.JLabel();
        txtMaterialProduto = new javax.swing.JTextField();
        lblMaterualProduto = new javax.swing.JLabel();
        lblGeneroProduto = new javax.swing.JLabel();
        lblLarguraProduto1 = new javax.swing.JLabel();
        txtEspessuraProduto = new javax.swing.JTextField();
        comboCorPulseiraProduto = new javax.swing.JComboBox<>();
        lblPulseiraProduto = new javax.swing.JLabel();
        comboMostradorProduto = new javax.swing.JComboBox<>();
        lblMostradorProduto = new javax.swing.JLabel();
        lblReistenciaProduto = new javax.swing.JLabel();
        txtResistenciaProduto = new javax.swing.JTextField();
        lblGarantiaProduto = new javax.swing.JLabel();
        spinnerGarantiaProduto = new javax.swing.JSpinner();
        comboMovimentoProduto = new javax.swing.JComboBox<>();
        lblMovimentoPulseira = new javax.swing.JLabel();
        comboColecaoPrdouto = new javax.swing.JComboBox<>();
        lblColecaoProduto = new javax.swing.JLabel();
        comboGeneroProduto = new javax.swing.JComboBox<>();
        btnEditarProduto = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Novo Produto");

        painelCadastrarProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Produto"));

        txtDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProdutoActionPerformed(evt);
            }
        });

        lblDescricaoProduto.setText("Descrição:");

        lblQuantProduto.setText("Quantidade:");

        spinnerQuantProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblPrecoProduto.setText("Preço:");

        lblTipoProduto.setText("Tipo:");

        comboTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alianças", "Aneis", "Brincos", "Colares", "Pingentes", "Pulseiras", "Relogios" }));
        comboTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoProdutoActionPerformed(evt);
            }
        });

        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        lblPrecoProduto1.setText("Pedra:");

        lblTamanhoProduto.setText("Tamanho:");

        spinnerTamanhoProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblAlturaProduto.setText("Altura:");

        lblLarguraProduto.setText("Largura:");

        lblMaterualProduto.setText("Material:");

        lblGeneroProduto.setText("Gênero:");

        lblLarguraProduto1.setText("Espessura:");

        comboCorPulseiraProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Marrom", "Dourado", "Prata", "Azul", "Verde", "Vermelho" }));
        comboCorPulseiraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCorPulseiraProdutoActionPerformed(evt);
            }
        });

        lblPulseiraProduto.setText("Pulseira:");

        comboMostradorProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Marrom", "Dourado", "Prata", "Azul", "Verde", "Vermelho" }));
        comboMostradorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMostradorProdutoActionPerformed(evt);
            }
        });

        lblMostradorProduto.setText("Mostrador:");

        lblReistenciaProduto.setText("Resistência:");

        lblGarantiaProduto.setText("Garantia:");

        spinnerGarantiaProduto.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        comboMovimentoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Digital", "Analógico" }));
        comboMovimentoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMovimentoProdutoActionPerformed(evt);
            }
        });

        lblMovimentoPulseira.setText("Movimento:");

        comboColecaoPrdouto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Coleção 1", "Coleção 2", "Coleção 3", "Coleção 4", "Coleção 5" }));
        comboColecaoPrdouto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboColecaoPrdoutoActionPerformed(evt);
            }
        });

        lblColecaoProduto.setText("Coleção:");

        comboGeneroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Unissex" }));
        comboGeneroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroProdutoActionPerformed(evt);
            }
        });

        btnEditarProduto.setVisible(false);
        btnEditarProduto.setText("Editar");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        comboGeneroProduto.setEnabled(false);
        txtEspessuraProduto.setEnabled(false);
        comboCorPulseiraProduto.setEnabled(false);
        comboMostradorProduto.setEnabled(false);
        txtResistenciaProduto.setEnabled(false);
        spinnerGarantiaProduto.setEnabled(false);
        comboMovimentoProduto.setEnabled(false);

        javax.swing.GroupLayout painelCadastrarProdutoLayout = new javax.swing.GroupLayout(painelCadastrarProduto);
        painelCadastrarProduto.setLayout(painelCadastrarProdutoLayout);
        painelCadastrarProdutoLayout.setHorizontalGroup(
            painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarProdutoLayout.createSequentialGroup()
                                .addComponent(btnEditarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrarProduto))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarProdutoLayout.createSequentialGroup()
                                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastrarProdutoLayout.createSequentialGroup()
                                                .addComponent(lblAlturaProduto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtAlturaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastrarProdutoLayout.createSequentialGroup()
                                                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblGeneroProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastrarProdutoLayout.createSequentialGroup()
                                                        .addComponent(lblPrecoProduto)
                                                        .addGap(39, 39, 39)
                                                        .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                                .addComponent(lblLarguraProduto)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtLarguraProduto))
                                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(spinnerTamanhoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblTamanhoProduto)
                                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                                .addComponent(lblLarguraProduto1)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEspessuraProduto))))
                                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                                .addComponent(lblDescricaoProduto)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                                .addComponent(lblQuantProduto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spinnerQuantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(lblTipoProduto)
                                                .addGap(10, 10, 10)
                                                .addComponent(comboTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastrarProdutoLayout.createSequentialGroup()
                                                    .addComponent(lblReistenciaProduto)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtResistenciaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblGarantiaProduto)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(spinnerGarantiaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastrarProdutoLayout.createSequentialGroup()
                                                    .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(comboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                                            .addComponent(lblPulseiraProduto)
                                                            .addGap(22, 22, 22)
                                                            .addComponent(comboCorPulseiraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblMostradorProduto)
                                                        .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                                            .addGap(72, 72, 72)
                                                            .addComponent(comboMostradorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(1, 1, 1))
                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                .addComponent(lblMaterualProduto)
                                .addGap(28, 28, 28)
                                .addComponent(txtMaterialProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPrecoProduto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPedraProduto)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMovimentoPulseira)
                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(comboMovimentoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(lblColecaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(comboColecaoPrdouto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        painelCadastrarProdutoLayout.setVerticalGroup(
            painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerQuantProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantProduto)
                            .addComponent(lblTipoProduto))))
                .addGap(20, 20, 20)
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaterualProduto)
                        .addComponent(txtMaterialProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPedraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblPrecoProduto1)))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaProduto)
                    .addComponent(txtAlturaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLarguraProduto)
                    .addComponent(txtLarguraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTamanhoProduto)
                        .addComponent(spinnerTamanhoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPrecoProduto))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGeneroProduto)
                        .addComponent(lblLarguraProduto1)
                        .addComponent(txtEspessuraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboGeneroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulseiraProduto)
                    .addComponent(comboCorPulseiraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMostradorProduto)
                    .addComponent(comboMostradorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReistenciaProduto)
                            .addComponent(txtResistenciaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMovimentoPulseira)
                            .addComponent(comboMovimentoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColecaoProduto)
                            .addComponent(comboColecaoPrdouto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarProduto)
                            .addComponent(btnEditarProduto))
                        .addGap(19, 19, 19))
                    .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                        .addGroup(painelCadastrarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerGarantiaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadastrarProdutoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblGarantiaProduto)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(painelCadastrarProduto, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoProdutoActionPerformed
        if (comboTipoProduto.getSelectedItem() != "Relogios") {
            txtPedraProduto.setEnabled(true);
            txtAlturaProduto.setEnabled(true);
            txtLarguraProduto.setEnabled(true);
            spinnerTamanhoProduto.setEnabled(true);
            comboGeneroProduto.setEnabled(false);
            txtEspessuraProduto.setEnabled(false);
            comboCorPulseiraProduto.setEnabled(false);
            comboMostradorProduto.setEnabled(false);
            txtResistenciaProduto.setEnabled(false);
            spinnerGarantiaProduto.setEnabled(false);
            comboMovimentoProduto.setEnabled(false);
        } else {
            txtPedraProduto.setEnabled(false);
            txtAlturaProduto.setEnabled(false);
            txtLarguraProduto.setEnabled(false);
            spinnerTamanhoProduto.setEnabled(false);
            comboGeneroProduto.setEnabled(true);
            txtEspessuraProduto.setEnabled(true);
            comboCorPulseiraProduto.setEnabled(true);
            comboMostradorProduto.setEnabled(true);
            txtResistenciaProduto.setEnabled(true);
            spinnerGarantiaProduto.setEnabled(true);
            comboMovimentoProduto.setEnabled(true);
        }
    }//GEN-LAST:event_comboTipoProdutoActionPerformed

    private void txtDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoProdutoActionPerformed

    private void comboCorPulseiraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCorPulseiraProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCorPulseiraProdutoActionPerformed

    private void comboMostradorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMostradorProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMostradorProdutoActionPerformed

    private void comboMovimentoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMovimentoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMovimentoProdutoActionPerformed

    private void comboColecaoPrdoutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboColecaoPrdoutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboColecaoPrdoutoActionPerformed

    private void comboGeneroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGeneroProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        String description = txtDescricaoProduto.getText();
        int quantity = (Integer) spinnerQuantProduto.getValue();
        String type = (String) comboTipoProduto.getSelectedItem();
        String material = txtMaterialProduto.getText();
        String stone = txtPedraProduto.getText();
        double height = 0;
        double price = 0;
        int size = 0;
        int ensure = 0;
        double width = 0;
        if (txtAlturaProduto.getText() != null && !txtAlturaProduto.getText().trim().equals("")) {
            height = Double.parseDouble(txtAlturaProduto.getText());
        }
        if (txtPrecoProduto.getText() != null && !txtPrecoProduto.getText().trim().equals("")) {
            price = Double.parseDouble(txtPrecoProduto.getText());
        }
        if (spinnerTamanhoProduto.getValue() != null) {
            size = (Integer) spinnerTamanhoProduto.getValue();
        }
        if (spinnerGarantiaProduto.getValue() != null) {
            ensure = (Integer) spinnerGarantiaProduto.getValue();
        }
        if (txtLarguraProduto.getText() != null && !txtLarguraProduto.getText().trim().equals("")) {
            width = Double.parseDouble(txtLarguraProduto.getText());
        }
        String gender = (String) comboGeneroProduto.getSelectedItem();
        String thickness = txtEspessuraProduto.getText();
        String bracelet = (String) comboCorPulseiraProduto.getSelectedItem();
        String mostrador = (String) comboMostradorProduto.getSelectedItem();
        String resistance = txtResistenciaProduto.getText();

        String movement = (String) comboMovimentoProduto.getSelectedItem();
        String collection = (String) comboColecaoPrdouto.getSelectedItem();
        String id = "";
        MockProduto mock = new MockProduto();
        InternalFormConsultarProduto prod = new InternalFormConsultarProduto();
        if (clicked) {
            id = Integer.toString(prod.index);
            clicked = false;
        }
        Produto produto = new Produto(
                id,
                description,
                quantity,
                type,
                material,
                width,
                stone,
                height,
                price,
                size,
                gender,
                thickness,
                bracelet,
                mostrador,
                resistance,
                ensure,
                movement,
                collection
        );
        mock.inserir(produto);
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        if (!clicked) {
            txtDescricaoProduto.setEnabled(true);
            spinnerQuantProduto.setEnabled(true);
            comboTipoProduto.setEnabled(true);
            txtMaterialProduto.setEnabled(true);
            txtPedraProduto.setEnabled(true);
            txtPrecoProduto.setEnabled(true);
            spinnerTamanhoProduto.setEnabled(true);
            spinnerGarantiaProduto.setEnabled(true);
            txtLarguraProduto.setEnabled(true);
            comboGeneroProduto.setEnabled(true);
            txtEspessuraProduto.setEnabled(true);
            comboCorPulseiraProduto.setEnabled(true);
            comboMostradorProduto.setEnabled(true);
            txtResistenciaProduto.setEnabled(true);
            comboMovimentoProduto.setEnabled(true);
            comboColecaoPrdouto.setEnabled(true);
            txtAlturaProduto.setEnabled(true);
            btnEditarProduto.setVisible(false);
            btnCadastrarProduto.setText("Salvar");
            btnCadastrarProduto.setVisible(true);
            clicked = true;
        }
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCadastrarProduto;
    public javax.swing.JButton btnEditarProduto;
    public javax.swing.JComboBox<String> comboColecaoPrdouto;
    public javax.swing.JComboBox<String> comboCorPulseiraProduto;
    public javax.swing.JComboBox<String> comboGeneroProduto;
    public javax.swing.JComboBox<String> comboMostradorProduto;
    public javax.swing.JComboBox<String> comboMovimentoProduto;
    public javax.swing.JComboBox<String> comboTipoProduto;
    private javax.swing.JLabel lblAlturaProduto;
    private javax.swing.JLabel lblColecaoProduto;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblGarantiaProduto;
    private javax.swing.JLabel lblGeneroProduto;
    private javax.swing.JLabel lblLarguraProduto;
    private javax.swing.JLabel lblLarguraProduto1;
    private javax.swing.JLabel lblMaterualProduto;
    private javax.swing.JLabel lblMostradorProduto;
    private javax.swing.JLabel lblMovimentoPulseira;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblPrecoProduto1;
    private javax.swing.JLabel lblPulseiraProduto;
    private javax.swing.JLabel lblQuantProduto;
    private javax.swing.JLabel lblReistenciaProduto;
    private javax.swing.JLabel lblTamanhoProduto;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JPanel painelCadastrarProduto;
    public javax.swing.JSpinner spinnerGarantiaProduto;
    public javax.swing.JSpinner spinnerQuantProduto;
    public javax.swing.JSpinner spinnerTamanhoProduto;
    public javax.swing.JTextField txtAlturaProduto;
    public javax.swing.JTextField txtDescricaoProduto;
    public javax.swing.JTextField txtEspessuraProduto;
    public javax.swing.JTextField txtLarguraProduto;
    public javax.swing.JTextField txtMaterialProduto;
    public javax.swing.JTextField txtPedraProduto;
    public javax.swing.JTextField txtPrecoProduto;
    public javax.swing.JTextField txtResistenciaProduto;
    // End of variables declaration//GEN-END:variables
}
