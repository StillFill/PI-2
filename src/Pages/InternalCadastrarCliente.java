/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import connection.MockCliente;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.bean.Cliente;

/**
 *
 * @author Ana Carolina
 */
public class InternalCadastrarCliente extends javax.swing.JInternalFrame {

    boolean clicked = false;

    /**
     * Creates new form InternalCliente
     */
    public InternalCadastrarCliente() {
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

        painelDadosCliente = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblNascCliente = new javax.swing.JLabel();
        txtNascimentoCliente = new javax.swing.JFormattedTextField();
        lblTelCliente = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JFormattedTextField();
        txtEmailCliente = new javax.swing.JTextField();
        lblEmailCliente = new javax.swing.JLabel();
        lblTipoCliente = new javax.swing.JLabel();
        comboTipoCliente = new javax.swing.JComboBox<>();
        lblSexoCliente = new javax.swing.JLabel();
        comboSexoCliente = new javax.swing.JComboBox<>();
        painelPessoaFisicaCliente = new javax.swing.JPanel();
        txtCPFCliente = new javax.swing.JFormattedTextField();
        lblCPFCliente = new javax.swing.JLabel();
        lblRazaoSocialCliente = new javax.swing.JLabel();
        txtRazaoSocialCliente = new javax.swing.JTextField();
        painelEnderecoCli = new javax.swing.JPanel();
        lblCEPCliente = new javax.swing.JLabel();
        txtCEPCliente = new javax.swing.JFormattedTextField();
        lblEnderecoCliente = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtNumeroCliente = new javax.swing.JTextField();
        lblNumeroCliente = new javax.swing.JLabel();
        lblBairroCliente = new javax.swing.JLabel();
        txtBairroCliente = new javax.swing.JTextField();
        lblCidadeCliente = new javax.swing.JLabel();
        lblComplementoCliente = new javax.swing.JLabel();
        txtComplementoCliente = new javax.swing.JTextField();
        txtCidadeCliente = new javax.swing.JTextField();
        lblEstadoCliente = new javax.swing.JLabel();
        comboEstadoCliente = new javax.swing.JComboBox<>();
        btnCadastrarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        painelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblNomeCliente.setText("Nome:");

        lblNascCliente.setText("Data de Nascimento:");

        try {
            txtNascimentoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTelCliente.setText("Telefone");

        try {
            txtTelCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailClienteActionPerformed(evt);
            }
        });

        lblEmailCliente.setText("E-mail:");

        lblTipoCliente.setText("Tipo");

        comboTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Jurídica" }));
        comboTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoClienteActionPerformed(evt);
            }
        });

        lblSexoCliente.setText("Sexo:");

        comboSexoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        javax.swing.GroupLayout painelDadosClienteLayout = new javax.swing.GroupLayout(painelDadosCliente);
        painelDadosCliente.setLayout(painelDadosClienteLayout);
        painelDadosClienteLayout.setHorizontalGroup(
            painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosClienteLayout.createSequentialGroup()
                        .addComponent(lblNomeCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeCliente))
                    .addGroup(painelDadosClienteLayout.createSequentialGroup()
                        .addComponent(lblNascCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTelCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosClienteLayout.createSequentialGroup()
                        .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailCliente)
                            .addComponent(lblTipoCliente))
                        .addGap(24, 24, 24)
                        .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                                .addComponent(comboTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240)
                                .addComponent(lblSexoCliente)
                                .addGap(18, 18, 18)
                                .addComponent(comboSexoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmailCliente))))
                .addContainerGap())
        );
        painelDadosClienteLayout.setVerticalGroup(
            painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNascCliente)
                    .addComponent(txtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelCliente)
                    .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailCliente)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCliente)
                    .addComponent(comboTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexoCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPessoaFisicaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa Física"));

        try {
            txtCPFCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFClienteActionPerformed(evt);
            }
        });

        lblCPFCliente.setText("CPF");

        javax.swing.GroupLayout painelPessoaFisicaClienteLayout = new javax.swing.GroupLayout(painelPessoaFisicaCliente);
        painelPessoaFisicaCliente.setLayout(painelPessoaFisicaClienteLayout);
        painelPessoaFisicaClienteLayout.setHorizontalGroup(
            painelPessoaFisicaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaFisicaClienteLayout.createSequentialGroup()
                .addGroup(painelPessoaFisicaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPessoaFisicaClienteLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblCPFCliente)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPessoaFisicaClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRazaoSocialCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(painelPessoaFisicaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRazaoSocialCliente)
                    .addComponent(txtCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPessoaFisicaClienteLayout.setVerticalGroup(
            painelPessoaFisicaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPessoaFisicaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPessoaFisicaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPFCliente))
                .addGap(18, 18, 18)
                .addGroup(painelPessoaFisicaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazaoSocialCliente)
                    .addComponent(txtRazaoSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        painelEnderecoCli.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        lblCEPCliente.setText("CEP:");

        try {
            txtCEPCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEnderecoCliente.setText("Endereço:");

        txtNumeroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroClienteActionPerformed(evt);
            }
        });

        lblNumeroCliente.setText("Nº");

        lblBairroCliente.setText("Bairro:");

        lblCidadeCliente.setText("Cidade:");

        lblComplementoCliente.setText("Complemento:");

        lblEstadoCliente.setText("Estado:");

        comboEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout painelEnderecoCliLayout = new javax.swing.GroupLayout(painelEnderecoCli);
        painelEnderecoCli.setLayout(painelEnderecoCliLayout);
        painelEnderecoCliLayout.setHorizontalGroup(
            painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnderecoCliente)
                    .addComponent(lblCEPCliente)
                    .addComponent(lblNumeroCliente)
                    .addComponent(lblBairroCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEnderecoCliLayout.createSequentialGroup()
                        .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblComplementoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelEnderecoCliLayout.createSequentialGroup()
                        .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCidadeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEstadoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        painelEnderecoCliLayout.setVerticalGroup(
            painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoCliLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEPCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnderecoCliente)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCliente)
                    .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplementoCliente)
                    .addComponent(txtComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBairroCliente)
                    .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelEnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstadoCliente)
                            .addComponent(comboEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCidadeCliente))
                        .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setVisible(false);
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelEnderecoCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelPessoaFisicaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelPessoaFisicaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEnderecoCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente)
                    .addComponent(btnEditarCliente))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailClienteActionPerformed

    private void comboTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoClienteActionPerformed
        if (comboTipoCliente.getSelectedItem() == "Física") {
            painelPessoaFisicaCliente.setVisible(true);
            //  painelPessoaJuridicaCliente.setVisible(false);
        } else {
            try {
                MaskFormatter mascaraCNPJ = new MaskFormatter("###.###.###/####-##");

                painelPessoaFisicaCliente.setBorder(BorderFactory.createTitledBorder("Pessoa Jurídica"));
                lblCPFCliente.setText("CNPJ");
                txtCPFCliente.setFormatterFactory(new DefaultFormatterFactory(mascaraCNPJ));
                lblRazaoSocialCliente.setText("Razão Social:");
                txtRazaoSocialCliente.setVisible(true);
            } catch (ParseException e) {
                System.out.println("ENTROU NO ERRO DA MASCARA");
            }
        }
    }//GEN-LAST:event_comboTipoClienteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (comboTipoCliente.getSelectedItem() == "Física") {
            painelPessoaFisicaCliente.setVisible(true);
            //     painelPessoaJuridicaCliente.setVisible(false);
            txtRazaoSocialCliente.setVisible(false);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFClienteActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        String name = txtNomeCliente.getText();
        String birthday = txtNascimentoCliente.getText();
        String phoneNumber = txtTelCliente.getText();
        String email = txtEmailCliente.getText();
        String type = (String) comboTipoCliente.getSelectedItem();
        String gender = (String) comboSexoCliente.getSelectedItem();
        String documentNumber = "";
        if (type.equals("Física")) {
            documentNumber = txtCPFCliente.getText();
        } else {
            //documentNumber = txtCNPJCliente.getText();
        }
        String razaoSocial = txtRazaoSocialCliente.getText();
        String cep = txtCEPCliente.getText();
        String adress = txtEnderecoCliente.getText();
        String neighborHood = txtBairroCliente.getText();
        String adressNumber = txtNumeroCliente.getText();
        String city = txtCidadeCliente.getText();
        String complement = txtComplementoCliente.getText();
        String state = (String) comboEstadoCliente.getSelectedItem();
        MockCliente mock = new MockCliente();
        String id = "";
        if(clicked){
            id = mock.acharId(documentNumber);
            clicked = false;
        }
        mock.inserir(new Cliente(
                id,
                name,
                birthday,
                phoneNumber,
                email,
                type,
                gender,
                documentNumber,
                razaoSocial,
                cep,
                adress,
                adressNumber,
                neighborHood,
                city,
                complement,
                state
        ));
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void txtNumeroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroClienteActionPerformed

    }//GEN-LAST:event_txtNumeroClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if (!clicked) {
            txtNomeCliente.setEnabled(true);
            txtNascimentoCliente.setEnabled(true);
            txtTelCliente.setEnabled(true);
            txtEmailCliente.setEnabled(true);
            comboTipoCliente.setEnabled(true);
            comboSexoCliente.setEnabled(true);
            txtCPFCliente.setEnabled(true);
            txtRazaoSocialCliente.setEnabled(true);
            txtCEPCliente.setEnabled(true);
            txtEnderecoCliente.setEnabled(true);
            txtNumeroCliente.setEnabled(true);
            txtBairroCliente.setEnabled(true);
            txtCidadeCliente.setEnabled(true);
            txtComplementoCliente.setEnabled(true);
            comboEstadoCliente.setEnabled(true);
            btnCadastrarCliente.setText("Salvar");
            btnEditarCliente.setVisible(false);
            btnCadastrarCliente.setVisible(true);
            clicked = true;
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCadastrarCliente;
    public javax.swing.JButton btnEditarCliente;
    public javax.swing.JComboBox<String> comboEstadoCliente;
    public javax.swing.JComboBox<String> comboSexoCliente;
    public javax.swing.JComboBox<String> comboTipoCliente;
    private javax.swing.JLabel lblBairroCliente;
    private javax.swing.JLabel lblCEPCliente;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JLabel lblCidadeCliente;
    private javax.swing.JLabel lblComplementoCliente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblEnderecoCliente;
    private javax.swing.JLabel lblEstadoCliente;
    private javax.swing.JLabel lblNascCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNumeroCliente;
    private javax.swing.JLabel lblRazaoSocialCliente;
    private javax.swing.JLabel lblSexoCliente;
    private javax.swing.JLabel lblTelCliente;
    private javax.swing.JLabel lblTipoCliente;
    private javax.swing.JPanel painelDadosCliente;
    private javax.swing.JPanel painelEnderecoCli;
    private javax.swing.JPanel painelPessoaFisicaCliente;
    public javax.swing.JTextField txtBairroCliente;
    public javax.swing.JFormattedTextField txtCEPCliente;
    public javax.swing.JFormattedTextField txtCPFCliente;
    public javax.swing.JTextField txtCidadeCliente;
    public javax.swing.JTextField txtComplementoCliente;
    public javax.swing.JTextField txtEmailCliente;
    public javax.swing.JTextField txtEnderecoCliente;
    public javax.swing.JFormattedTextField txtNascimentoCliente;
    public javax.swing.JTextField txtNomeCliente;
    public javax.swing.JTextField txtNumeroCliente;
    public javax.swing.JTextField txtRazaoSocialCliente;
    public javax.swing.JFormattedTextField txtTelCliente;
    // End of variables declaration//GEN-END:variables
}
