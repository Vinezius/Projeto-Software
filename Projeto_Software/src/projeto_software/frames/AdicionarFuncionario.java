/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_software.frames;

/**
 *
 * @author User
 */
public class AdicionarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarFuncionaro
     */
    public AdicionarFuncionario() {
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

        jLabel1 = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtfCargo = new javax.swing.JTextField();
        txtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkAtivo = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuItemCadastrarCliente = new javax.swing.JMenuItem();
        menuItemCadastrarEntregador = new javax.swing.JMenuItem();
        menuItemCadastrarFuncionario = new javax.swing.JMenuItem();
        menuItemCadastrarPromocao = new javax.swing.JMenuItem();
        menuItemCadastrarSabor = new javax.swing.JMenuItem();
        menuItemCadastrarPedidos = new javax.swing.JMenuItem();
        menuPedidos1 = new javax.swing.JMenu();
        menuItemVisualizarClientes = new javax.swing.JMenuItem();
        menuItemVisualizarEntregadores = new javax.swing.JMenuItem();
        menuItemVisualizarFuncionarios = new javax.swing.JMenuItem();
        menuItemVisualizarPromocao = new javax.swing.JMenuItem();
        menuItemVisualizarPedidos1 = new javax.swing.JMenuItem();
        menuItemVisualizarFormaEntrega = new javax.swing.JMenuItem();
        menuItemVisualizarTamanho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Controle de Pizzaria - Cadastrar Funcionário");

        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Limpar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cargo");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        checkAtivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkAtivo.setText("Ativo");

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

        menuPedidos1.setText("Visualizar ↓");
        menuPedidos1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuPedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidos1ActionPerformed(evt);
            }
        });

        menuItemVisualizarClientes.setText("Visualizar Clientes");
        menuItemVisualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarClientesActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemVisualizarClientes);

        menuItemVisualizarEntregadores.setText("Visualizar Entregadores");
        menuItemVisualizarEntregadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarEntregadoresActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemVisualizarEntregadores);

        menuItemVisualizarFuncionarios.setText("Visualizar Funcionários");
        menuItemVisualizarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarFuncionariosActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemVisualizarFuncionarios);

        menuItemVisualizarPromocao.setText("Visualizar Promoções");
        menuItemVisualizarPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPromocaoActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemVisualizarPromocao);

        menuItemVisualizarPedidos1.setText("Visualizar Pedidos");
        menuItemVisualizarPedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPedidos1ActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemVisualizarPedidos1);

        menuItemVisualizarFormaEntrega.setText("Visualizar Formas de Entrega");
        menuItemVisualizarFormaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarFormaEntregaActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemVisualizarFormaEntrega);

        menuItemVisualizarTamanho.setText("Visualizar Tamanhos");
        menuItemVisualizarTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarTamanhoActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemVisualizarTamanho);

        jMenuBar1.add(menuPedidos1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(309, 309, 309)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(89, 89, 89)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtfNome)
                                                .addComponent(txtfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkAtivo))
                                .addGap(231, 231, 231)))
                        .addGap(0, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnRelatorio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(checkAtivo)
                                .addGap(124, 124, 124)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatorio relatorio = new Relatorio();
        relatorio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    private void menuItemVisualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarClientesActionPerformed
        VisualizarClientes visualizarClientes = new VisualizarClientes();
        visualizarClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarClientesActionPerformed

    private void menuItemVisualizarEntregadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarEntregadoresActionPerformed
        VisualizarEntregadores visualizarEntregadores = new VisualizarEntregadores();
        visualizarEntregadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarEntregadoresActionPerformed

    private void menuItemVisualizarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarFuncionariosActionPerformed
        VisualizarFuncionarios visualizarFuncionarios = new VisualizarFuncionarios();
        visualizarFuncionarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarFuncionariosActionPerformed

    private void menuItemVisualizarPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarPromocaoActionPerformed
        VisualizarPromocao visualizarPromocao = new VisualizarPromocao();
        visualizarPromocao.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarPromocaoActionPerformed

    private void menuItemVisualizarPedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarPedidos1ActionPerformed
        VisualizarPedidos visualizarPedidos = new VisualizarPedidos();
        visualizarPedidos.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarPedidos1ActionPerformed

    private void menuItemVisualizarFormaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarFormaEntregaActionPerformed
        VisualizarEntregas visualizarEntregas = new VisualizarEntregas();
        visualizarEntregas.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarFormaEntregaActionPerformed

    private void menuItemVisualizarTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarTamanhoActionPerformed
        VisualizarTamanho visualizarTamanho = new VisualizarTamanho();
        visualizarTamanho.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarTamanhoActionPerformed

    private void menuPedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPedidos1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JMenuItem menuItemVisualizarClientes;
    private javax.swing.JMenuItem menuItemVisualizarEntregadores;
    private javax.swing.JMenuItem menuItemVisualizarFormaEntrega;
    private javax.swing.JMenuItem menuItemVisualizarFuncionarios;
    private javax.swing.JMenuItem menuItemVisualizarPedidos1;
    private javax.swing.JMenuItem menuItemVisualizarPromocao;
    private javax.swing.JMenuItem menuItemVisualizarTamanho;
    private javax.swing.JMenu menuPedidos1;
    private javax.swing.JTextField txtfCargo;
    private javax.swing.JTextField txtfNome;
    // End of variables declaration//GEN-END:variables
}
