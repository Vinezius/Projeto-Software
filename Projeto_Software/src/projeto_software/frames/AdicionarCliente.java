/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_software.frames;

import helpers.ConexaoCliente;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author User
 */
public class AdicionarCliente extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarCliete
     */
    public AdicionarCliente() {
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

        btnRelatorio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtfCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        txtfData = new javax.swing.JTextField();
        txtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkAtivo = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfEndereco = new javax.swing.JTextField();
        txtfTelefone = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuItemCadastrarCliente = new javax.swing.JMenuItem();
        menuItemCadastrarEntregador = new javax.swing.JMenuItem();
        menuItemCadastrarFuncionario = new javax.swing.JMenuItem();
        menuItemCadastrarPromocao = new javax.swing.JMenuItem();
        menuItemCadastrarSabor = new javax.swing.JMenuItem();
        menuItemCadastrarPedidos = new javax.swing.JMenuItem();
        menuPedidos2 = new javax.swing.JMenu();
        menuItemVisualizarClientes1 = new javax.swing.JMenuItem();
        menuItemVisualizarEntregadores1 = new javax.swing.JMenuItem();
        menuItemVisualizarFuncionarios1 = new javax.swing.JMenuItem();
        menuItemVisualizarPromocao1 = new javax.swing.JMenuItem();
        menuItemVisualizarPedidos2 = new javax.swing.JMenuItem();
        menuItemVisualizarFormaEntrega1 = new javax.swing.JMenuItem();
        menuItemSabores = new javax.swing.JMenuItem();
        menuItemVisualizarTamanho1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Controle de Pizzaria - Cadastrar Cliente");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("CPF:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Data Cadastro:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        checkAtivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkAtivo.setText("Ativo");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");

        menuCadastros.setText("Cadastros ↓");
        menuCadastros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuCadastros.setMinimumSize(new java.awt.Dimension(90, 90));

        menuItemCadastrarCliente.setText("Cliente");
        menuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemCadastrarCliente);

        menuItemCadastrarEntregador.setText("Entregador");
        menuItemCadastrarEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarEntregadorActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemCadastrarEntregador);

        menuItemCadastrarFuncionario.setText("Funcionario");
        menuItemCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemCadastrarFuncionario);

        menuItemCadastrarPromocao.setText("Promoção");
        menuItemCadastrarPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarPromocaoActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemCadastrarPromocao);

        menuItemCadastrarSabor.setText("Sabor");
        menuItemCadastrarSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarSaborActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemCadastrarSabor);

        menuItemCadastrarPedidos.setText("Pedidos");
        menuItemCadastrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarPedidosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuItemCadastrarPedidos);

        jMenuBar1.add(menuCadastros);

        menuPedidos2.setText("Visualizar ↓");
        menuPedidos2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuPedidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidos2ActionPerformed(evt);
            }
        });

        menuItemVisualizarClientes1.setText("Visualizar Clientes");
        menuItemVisualizarClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarClientes1ActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemVisualizarClientes1);

        menuItemVisualizarEntregadores1.setText("Visualizar Entregadores");
        menuItemVisualizarEntregadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarEntregadores1ActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemVisualizarEntregadores1);

        menuItemVisualizarFuncionarios1.setText("Visualizar Funcionários");
        menuItemVisualizarFuncionarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarFuncionarios1ActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemVisualizarFuncionarios1);

        menuItemVisualizarPromocao1.setText("Visualizar Promoções");
        menuItemVisualizarPromocao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPromocao1ActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemVisualizarPromocao1);

        menuItemVisualizarPedidos2.setText("Visualizar Pedidos");
        menuItemVisualizarPedidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPedidos2ActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemVisualizarPedidos2);

        menuItemVisualizarFormaEntrega1.setText("Visualizar Formas de Entrega");
        menuItemVisualizarFormaEntrega1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarFormaEntrega1ActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemVisualizarFormaEntrega1);

        menuItemSabores.setText("Visualizar Sabores");
        menuItemSabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaboresActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemSabores);

        menuItemVisualizarTamanho1.setText("Visualizar Tamanhos");
        menuItemVisualizarTamanho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarTamanho1ActionPerformed(evt);
            }
        });
        menuPedidos2.add(menuItemVisualizarTamanho1);

        jMenuBar1.add(menuPedidos2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(332, 332, 332)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkAtivo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3))
                                                    .addGap(29, 29, 29))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(80, 80, 80)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtfData, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                .addComponent(txtfNome)
                                                .addComponent(txtfCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                .addComponent(txtfEndereco)
                                                .addComponent(txtfTelefone))))
                                    .addComponent(jLabel5))
                                .addGap(262, 262, 262)))
                        .addGap(0, 227, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnRelatorio)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(checkAtivo)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatorio relatorio = new Relatorio();
        relatorio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtfCpf.setText("");
        txtfData.setText("");
        txtfEndereco.setText("");
        txtfNome.setText("");
        txtfTelefone.setText("");
        checkAtivo.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String cpf = txtfCpf.getText();
        String data = txtfData.getText();
        String endereco = txtfEndereco.getText();
        String nome = txtfNome.getText();
        String telefone = txtfTelefone.getText();
        Boolean ativo = checkAtivo.isSelected();

        try {
            JSONObject json = new JSONObject();
            json.put("cpf", cpf);
            json.put("data", data);
            json.put("endereco", endereco);
            json.put("nome", nome);
            json.put("telefone", telefone);
            json.put("ativo", ativo);
            json.put("operacao", 1);

            JSONObject response = ConexaoCliente.ConectarServidor(json);
            String status = response.getString("status");

            if (status.equals("OK")) {

                JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente!");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void menuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarClienteActionPerformed
        AdicionarCliente adicionarCliente = new AdicionarCliente();
        adicionarCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadastrarClienteActionPerformed

    private void menuItemCadastrarEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarEntregadorActionPerformed
        AdicionarEntregador adicionarEntregador = new AdicionarEntregador();
        adicionarEntregador.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadastrarEntregadorActionPerformed

    private void menuItemCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarFuncionarioActionPerformed
        AdicionarFuncionario adicionarFuncionario = new AdicionarFuncionario();
        adicionarFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadastrarFuncionarioActionPerformed

    private void menuItemCadastrarPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarPromocaoActionPerformed
        AdicionarPromocao adicionarPromocao = new AdicionarPromocao();
        adicionarPromocao.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadastrarPromocaoActionPerformed

    private void menuItemCadastrarSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarSaborActionPerformed
        AdicionarSabor adicionarSabor = new AdicionarSabor();
        adicionarSabor.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadastrarSaborActionPerformed

    private void menuItemCadastrarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarPedidosActionPerformed
        AdicionarPedido novopedido = new AdicionarPedido();
        novopedido.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadastrarPedidosActionPerformed

    private void menuItemVisualizarClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarClientes1ActionPerformed
        VisualizarClientes visualizarClientes = new VisualizarClientes();
        visualizarClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarClientes1ActionPerformed

    private void menuItemVisualizarEntregadores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarEntregadores1ActionPerformed
        VisualizarEntregadores visualizarEntregadores = new VisualizarEntregadores();
        visualizarEntregadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarEntregadores1ActionPerformed

    private void menuItemVisualizarFuncionarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarFuncionarios1ActionPerformed
        VisualizarFuncionarios visualizarFuncionarios = new VisualizarFuncionarios();
        visualizarFuncionarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarFuncionarios1ActionPerformed

    private void menuItemVisualizarPromocao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarPromocao1ActionPerformed
        VisualizarPromocao visualizarPromocao = new VisualizarPromocao();
        visualizarPromocao.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarPromocao1ActionPerformed

    private void menuItemVisualizarPedidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarPedidos2ActionPerformed
        VisualizarPedidos visualizarPedidos = new VisualizarPedidos();
        visualizarPedidos.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarPedidos2ActionPerformed

    private void menuItemVisualizarFormaEntrega1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarFormaEntrega1ActionPerformed
        VisualizarEntregas visualizarEntregas = new VisualizarEntregas();
        visualizarEntregas.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarFormaEntrega1ActionPerformed

    private void menuItemSaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaboresActionPerformed
        VisualizarSabor visualizarSabor = new VisualizarSabor();
        visualizarSabor.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemSaboresActionPerformed

    private void menuItemVisualizarTamanho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarTamanho1ActionPerformed
        VisualizarTamanho visualizarTamanho = new VisualizarTamanho();
        visualizarTamanho.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarTamanho1ActionPerformed

    private void menuPedidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPedidos2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuItemCadastrarCliente;
    private javax.swing.JMenuItem menuItemCadastrarEntregador;
    private javax.swing.JMenuItem menuItemCadastrarFuncionario;
    private javax.swing.JMenuItem menuItemCadastrarPedidos;
    private javax.swing.JMenuItem menuItemCadastrarPromocao;
    private javax.swing.JMenuItem menuItemCadastrarSabor;
    private javax.swing.JMenuItem menuItemSabores;
    private javax.swing.JMenuItem menuItemVisualizarClientes1;
    private javax.swing.JMenuItem menuItemVisualizarEntregadores1;
    private javax.swing.JMenuItem menuItemVisualizarFormaEntrega1;
    private javax.swing.JMenuItem menuItemVisualizarFuncionarios1;
    private javax.swing.JMenuItem menuItemVisualizarPedidos2;
    private javax.swing.JMenuItem menuItemVisualizarPromocao1;
    private javax.swing.JMenuItem menuItemVisualizarTamanho1;
    private javax.swing.JMenu menuPedidos2;
    private javax.swing.JTextField txtfCpf;
    private javax.swing.JTextField txtfData;
    private javax.swing.JTextField txtfEndereco;
    private javax.swing.JTextField txtfNome;
    private javax.swing.JTextField txtfTelefone;
    // End of variables declaration//GEN-END:variables
}
