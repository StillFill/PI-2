/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import connection.MockCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.bean.Cliente;

/**
 *
 * @author Ana Carolina
 */
public class InternalFormConsultarCliente extends javax.swing.JInternalFrame {

    String tipo, id;
    Cliente a;
    boolean consultandoCliente = false;

    /**
     * Creates new form InternalFormConsultarCliente
     */
    public InternalFormConsultarCliente() {
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

        painelConsultaCliente = new javax.swing.JPanel();
        txtPesquisarCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tipoConsultarCliente = new javax.swing.JComboBox<>();
        lblCodigoCliente1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResultadoCliente = new javax.swing.JTable();

        setClosable(true);
        setTitle("Consultar Cliente");

        painelConsultaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Clientes"));

        txtPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tipoConsultarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME", "CPF", "CNPJ" }));
        tipoConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoConsultarClienteActionPerformed(evt);
            }
        });

        lblCodigoCliente1.setText("Pesquisar por:");

        tabelaResultadoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "E-Mail", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaResultadoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaResultadoClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaResultadoCliente);

        javax.swing.GroupLayout painelConsultaClienteLayout = new javax.swing.GroupLayout(painelConsultaCliente);
        painelConsultaCliente.setLayout(painelConsultaClienteLayout);
        painelConsultaClienteLayout.setHorizontalGroup(
            painelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(painelConsultaClienteLayout.createSequentialGroup()
                        .addComponent(lblCodigoCliente1)
                        .addGap(18, 18, 18)
                        .addComponent(tipoConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelConsultaClienteLayout.setVerticalGroup(
            painelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaClienteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelConsultaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoCliente1)
                    .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConsultaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelConsultaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MockCliente mock = new MockCliente();
        tipo = (String) tipoConsultarCliente.getSelectedItem();
        id = txtPesquisarCliente.getText();
        ArrayList<Cliente> resultado = mock.consultar(tipo, id);
        DefaultTableModel model = (DefaultTableModel) tabelaResultadoCliente.getModel();
        model.setRowCount(0);
        for (int i = 0; i < resultado.size(); i++) {
            model.addRow(new Object[]{resultado.get(i).name, resultado.get(i).phoneNumber, resultado.get(i).email, resultado.get(i).state});
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tipoConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoConsultarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoConsultarClienteActionPerformed

    private void tabelaResultadoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaResultadoClienteMouseClicked
        int row = tabelaResultadoCliente.getSelectedRow();
        String nome = (String) tabelaResultadoCliente.getValueAt(row, 0);
        String phone = (String) tabelaResultadoCliente.getValueAt(row, 1);

        MockCliente mock = new MockCliente();
        ArrayList<Cliente> resultado = mock.consultar(tipo, id);

        Cliente editing = resultado.get(0);

        for (int i = 0; i < resultado.size(); i++) {
            if (resultado.get(i).name.equals(nome) && resultado.get(i).phoneNumber.equals(phone)) {
                editing = resultado.get(i);
            }
        }

        InternalCadastrarCliente cliente = new InternalCadastrarCliente();
        if (!consultandoCliente) {
            this.getDesktopPane().add(cliente);
            this.dispose();
            cliente.show();
            cliente.txtNomeCliente.setText(editing.name);
            cliente.txtNascimentoCliente.setText(editing.birthday);
            cliente.txtTelCliente.setText(editing.phoneNumber);
            cliente.txtEmailCliente.setText(editing.email);
            cliente.comboTipoCliente.setSelectedItem(editing.type);
            cliente.comboSexoCliente.setSelectedItem(editing.gender);
            cliente.txtCPFCliente.setText(editing.documentNumber);
            cliente.txtRazaoSocialCliente.setText(editing.razaoSocial);
            cliente.txtCEPCliente.setText(editing.cep);
            cliente.txtEnderecoCliente.setText(editing.adress);
            cliente.txtNumeroCliente.setText(editing.adressNumber);
            cliente.txtBairroCliente.setText(editing.neighborHood);
            cliente.txtCidadeCliente.setText(editing.city);
            cliente.txtComplementoCliente.setText(editing.complement);
            cliente.comboEstadoCliente.setSelectedItem(editing.state);

            cliente.txtNomeCliente.setEnabled(false);
            cliente.txtNascimentoCliente.setEnabled(false);
            cliente.txtTelCliente.setEnabled(false);
            cliente.txtEmailCliente.setEnabled(false);
            cliente.comboTipoCliente.setEnabled(false);
            cliente.comboSexoCliente.setEnabled(false);
            cliente.txtCPFCliente.setEnabled(false);
            cliente.txtRazaoSocialCliente.setEnabled(false);
            cliente.txtCEPCliente.setEnabled(false);
            cliente.txtEnderecoCliente.setEnabled(false);
            cliente.txtNumeroCliente.setEnabled(false);
            cliente.txtBairroCliente.setEnabled(false);
            cliente.txtCidadeCliente.setEnabled(false);
            cliente.txtComplementoCliente.setEnabled(false);
            cliente.comboEstadoCliente.setEnabled(false);

            cliente.btnCadastrarCliente.setText("Editar");
            cliente.btnEditarCliente.setVisible(true);
            cliente.btnCadastrarCliente.setVisible(false);
            System.out.println("aqui tem q estar chegando no segundo");
        } else {
        }

    }//GEN-LAST:event_tabelaResultadoClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoCliente1;
    private javax.swing.JPanel painelConsultaCliente;
    private javax.swing.JTable tabelaResultadoCliente;
    private javax.swing.JComboBox<String> tipoConsultarCliente;
    private javax.swing.JTextField txtPesquisarCliente;
    // End of variables declaration//GEN-END:variables
}
