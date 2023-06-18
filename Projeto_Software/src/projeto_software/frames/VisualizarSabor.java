/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_software.frames;

import helpers.ConexaoCliente;
import org.json.JSONObject;

/**
 *
 * @author User
 */
public class VisualizarSabor extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarSabor
     */
    public VisualizarSabor() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAdicionarSabor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfTamanho = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfPreco = new javax.swing.JTextField();
        checkAtivo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtfNumFatias = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnBuscarSabores = new javax.swing.JButton();
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
        menuItemSabores = new javax.swing.JMenuItem();
        menuItemVisualizarTamanho = new javax.swing.JMenuItem();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Promoção", "Desconto", "Ativo", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnAdicionarSabor.setText("Adicionar Sabor");
        btnAdicionarSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSaborActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Controle de Pizzaria - Visualizar Sabores");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Para editar um tamanho, preencha as informações abaixo e clique em editar. Para excluir apenas insira o tamanho e clique em excluir.");

        jLabel3.setText("Promoção:");

        jLabel4.setText("Desconto:");

        txtfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPrecoActionPerformed(evt);
            }
        });

        checkAtivo.setText("Ativo");

        jLabel5.setText("Observação:");

        txtfNumFatias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNumFatiasActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnExcluir.setText("Excluir");

        btnBuscarSabores.setText("Buscar Sabores");
        btnBuscarSabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSaboresActionPerformed(evt);
            }
        });

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

        menuItemSabores.setText("Visualizar Sabores");
        menuItemSabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaboresActionPerformed(evt);
            }
        });
        menuPedidos1.add(menuItemSabores);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkAtivo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfNumFatias))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtfTamanho)
                                            .addComponent(txtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarSabores, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdicionarSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnRelatorio))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarSabores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAdicionarSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtfTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(checkAtivo)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtfNumFatias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Relatorio relatorio = new Relatorio();
        relatorio.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void txtfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPrecoActionPerformed

    private void txtfNumFatiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNumFatiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNumFatiasActionPerformed

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
        VisualizarFormaDeEntregas visualizarEntregas = new VisualizarFormaDeEntregas();
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

    private void menuItemSaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaboresActionPerformed
        VisualizarSabor visualizarSabor = new VisualizarSabor();
        visualizarSabor.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemSaboresActionPerformed

    private void btnAdicionarSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSaborActionPerformed
        AdicionarSabor adicionarSabor = new AdicionarSabor();
        adicionarSabor.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdicionarSaborActionPerformed

    private void btnBuscarSaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSaboresActionPerformed
         try {
             JSONObject json = new JSONObject();
            json.put("operacao", 8);
            JSONObject response = ConexaoCliente.ConectarServidor(json);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarSaboresActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarSabor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarSabor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarSabor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarSabor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarSabor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarSabor;
    private javax.swing.JButton btnBuscarSabores;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JCheckBox checkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuItemCadastrarCliente;
    private javax.swing.JMenuItem menuItemCadastrarEntregador;
    private javax.swing.JMenuItem menuItemCadastrarFuncionario;
    private javax.swing.JMenuItem menuItemCadastrarPedidos;
    private javax.swing.JMenuItem menuItemCadastrarPromocao;
    private javax.swing.JMenuItem menuItemCadastrarSabor;
    private javax.swing.JMenuItem menuItemSabores;
    private javax.swing.JMenuItem menuItemVisualizarClientes;
    private javax.swing.JMenuItem menuItemVisualizarEntregadores;
    private javax.swing.JMenuItem menuItemVisualizarFormaEntrega;
    private javax.swing.JMenuItem menuItemVisualizarFuncionarios;
    private javax.swing.JMenuItem menuItemVisualizarPedidos1;
    private javax.swing.JMenuItem menuItemVisualizarPromocao;
    private javax.swing.JMenuItem menuItemVisualizarTamanho;
    private javax.swing.JMenu menuPedidos1;
    private javax.swing.JTextField txtfNumFatias;
    private javax.swing.JTextField txtfPreco;
    private javax.swing.JTextField txtfTamanho;
    // End of variables declaration//GEN-END:variables
}