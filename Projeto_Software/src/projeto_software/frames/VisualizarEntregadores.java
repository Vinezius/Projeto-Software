/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_software.frames;

import helpers.ConexaoCliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author User
 */
public class VisualizarEntregadores extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarEntregadores
     */
    public VisualizarEntregadores() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEntregadores = new javax.swing.JTable();
        btnBuscarEntregadores = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnAdicionarEntregador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtfPlaca = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        checkAtivo = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros1 = new javax.swing.JMenu();
        menuItemCadastrarCliente = new javax.swing.JMenuItem();
        menuItemCadastrarEntregador = new javax.swing.JMenuItem();
        menuItemCadastrarFuncionario = new javax.swing.JMenuItem();
        menuItemCadastrarPromocao = new javax.swing.JMenuItem();
        menuItemCadastrarSabor = new javax.swing.JMenuItem();
        menuItemCadastrarPedidos1 = new javax.swing.JMenuItem();
        menuPedidos7 = new javax.swing.JMenu();
        menuItemVisualizarClientes6 = new javax.swing.JMenuItem();
        menuItemVisualizarEntregadores1 = new javax.swing.JMenuItem();
        menuItemVisualizarFuncionarios1 = new javax.swing.JMenuItem();
        menuItemVisualizarPromocao1 = new javax.swing.JMenuItem();
        menuItemVisualizarPedidos2 = new javax.swing.JMenuItem();
        menuItemVisualizarFormaEntrega1 = new javax.swing.JMenuItem();
        menuItemSabores = new javax.swing.JMenuItem();
        menuItemVisualizarTamanho1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaEntregadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Placa", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(tabelaEntregadores);
        if (tabelaEntregadores.getColumnModel().getColumnCount() > 0) {
            tabelaEntregadores.getColumnModel().getColumn(2).setHeaderValue("Placa");
        }

        btnBuscarEntregadores.setText("Buscar Entregadores");
        btnBuscarEntregadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEntregadoresActionPerformed(evt);
            }
        });

        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Controle de Pizzaria - Visualizar Entregadores");

        btnAdicionarEntregador.setText("Cadastrar Entregador");
        btnAdicionarEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEntregadorActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Para editar um Entregador, preencha as informações abaixo e clique em editar. Para excluir apenas insira o CPF e clique em excluir.");

        jLabel3.setText("Nome:");

        jLabel4.setText("CPF:");

        txtfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCpfActionPerformed(evt);
            }
        });

        jLabel5.setText("Placa:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        checkAtivo.setText("Ativo");

        menuCadastros1.setText("Cadastros ↓");
        menuCadastros1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuCadastros1.setMinimumSize(new java.awt.Dimension(90, 90));

        menuItemCadastrarCliente.setText("Cliente");
        menuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarClienteActionPerformed(evt);
            }
        });
        menuCadastros1.add(menuItemCadastrarCliente);

        menuItemCadastrarEntregador.setText("Entregador");
        menuItemCadastrarEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarEntregadorActionPerformed(evt);
            }
        });
        menuCadastros1.add(menuItemCadastrarEntregador);

        menuItemCadastrarFuncionario.setText("Funcionario");
        menuItemCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuCadastros1.add(menuItemCadastrarFuncionario);

        menuItemCadastrarPromocao.setText("Promoção");
        menuItemCadastrarPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarPromocaoActionPerformed(evt);
            }
        });
        menuCadastros1.add(menuItemCadastrarPromocao);

        menuItemCadastrarSabor.setText("Sabor");
        menuItemCadastrarSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarSaborActionPerformed(evt);
            }
        });
        menuCadastros1.add(menuItemCadastrarSabor);

        menuItemCadastrarPedidos1.setText("Pedidos");
        menuItemCadastrarPedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarPedidos1ActionPerformed(evt);
            }
        });
        menuCadastros1.add(menuItemCadastrarPedidos1);

        jMenuBar1.add(menuCadastros1);

        menuPedidos7.setText("Visualizar ↓");
        menuPedidos7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuPedidos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidos7ActionPerformed(evt);
            }
        });

        menuItemVisualizarClientes6.setText("Visualizar Clientes");
        menuItemVisualizarClientes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarClientes6ActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemVisualizarClientes6);

        menuItemVisualizarEntregadores1.setText("Visualizar Entregadores");
        menuItemVisualizarEntregadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarEntregadores1ActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemVisualizarEntregadores1);

        menuItemVisualizarFuncionarios1.setText("Visualizar Funcionários");
        menuItemVisualizarFuncionarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarFuncionarios1ActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemVisualizarFuncionarios1);

        menuItemVisualizarPromocao1.setText("Visualizar Promoções");
        menuItemVisualizarPromocao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPromocao1ActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemVisualizarPromocao1);

        menuItemVisualizarPedidos2.setText("Visualizar Pedidos");
        menuItemVisualizarPedidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPedidos2ActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemVisualizarPedidos2);

        menuItemVisualizarFormaEntrega1.setText("Visualizar Formas de Entrega");
        menuItemVisualizarFormaEntrega1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarFormaEntrega1ActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemVisualizarFormaEntrega1);

        menuItemSabores.setText("Visualizar Sabores");
        menuItemSabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaboresActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemSabores);

        menuItemVisualizarTamanho1.setText("Visualizar Tamanhos");
        menuItemVisualizarTamanho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarTamanho1ActionPerformed(evt);
            }
        });
        menuPedidos7.add(menuItemVisualizarTamanho1);

        jMenuBar1.add(menuPedidos7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuscarEntregadores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdicionarEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(txtfCpf)
                                            .addComponent(txtfPlaca)))
                                    .addComponent(checkAtivo, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnRelatorio))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnAdicionarEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarEntregadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(checkAtivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAdicionarEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEntregadorActionPerformed
        AdicionarEntregador adicionarEntregador = new AdicionarEntregador();
        adicionarEntregador.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdicionarEntregadorActionPerformed

    private void txtfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCpfActionPerformed

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

    private void menuItemCadastrarPedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarPedidos1ActionPerformed
        AdicionarPedido novopedido = new AdicionarPedido();
        novopedido.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCadastrarPedidos1ActionPerformed

    private void menuItemVisualizarClientes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarClientes6ActionPerformed
        VisualizarClientes visualizarClientes = new VisualizarClientes();
        visualizarClientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVisualizarClientes6ActionPerformed

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
        VisualizarFormaDeEntregas visualizarEntregas = new VisualizarFormaDeEntregas();
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

    private void menuPedidos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidos7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPedidos7ActionPerformed

    private void btnBuscarEntregadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEntregadoresActionPerformed

        String colunas[] = {"Nome", "CPF", "Placa", "Ativo"};
        String dadosLimpeza[][] = {{"", "", ""}};
        DefaultTableModel model = new DefaultTableModel(dadosLimpeza, colunas);
        tabelaEntregadores.setModel(model);

        try {
            JSONObject json = new JSONObject();
            json.put("operacao", 18);
            JSONObject response = ConexaoCliente.ConectarServidor(json);
            String status = response.getString("status");

            if (status.equals("OK")) {

                JOptionPane.showMessageDialog(this, "Filtrado com sucesso!");
                JSONArray jsonArrayEntregadores = (JSONArray) response.get("entregadores");

                for (int i = 0; i < jsonArrayEntregadores.length(); i++) {
                    String ativo = "";
                    JSONObject entregador = jsonArrayEntregadores.getJSONObject(i);
                    String nome = entregador.getString("nome");
                    String cpf = entregador.getString("cpf");
                    String placa = entregador.getString("placa");
                    String ativoBinario = entregador.getString("ativo");

                    switch (ativoBinario) {
                        case "0":
                            ativo = "Não";
                            break;
                        case "1":
                            ativo = "Sim";
                            break;
                    }
                    String dados[] = {nome, cpf, placa, ativo};

                    DefaultTableModel tabela = (DefaultTableModel) tabelaEntregadores.getModel();

                    tabela.addRow(dados);

                }
            } else {
                JOptionPane.showMessageDialog(this, "Erro!");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarEntregadoresActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {

            String cpf = txtfCpf.getText();
            JSONObject json = new JSONObject();
            json.put("cpf", cpf);
            json.put("operacao", 17);
            JSONObject response = ConexaoCliente.ConectarServidor(json);
            String status = response.getString("status");

            if (status.equals("OK")) {

                JOptionPane.showMessageDialog(this, "Excluído com sucesso!");

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir!");

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            String cpf = txtfCpf.getText();
            String nome = txtfNome.getText();
            String placa = txtfPlaca.getText();
            Boolean ativo = checkAtivo.isSelected();

            JSONObject json = new JSONObject();
            json.put("cpf", cpf);
            json.put("nome", nome);
            json.put("placa", placa);
            json.put("ativo", ativo);
            json.put("operacao", 16);

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
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarEntregadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarEntregadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEntregador;
    private javax.swing.JButton btnBuscarEntregadores;
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
    private javax.swing.JMenu menuCadastros1;
    private javax.swing.JMenuItem menuItemCadastrarCliente;
    private javax.swing.JMenuItem menuItemCadastrarEntregador;
    private javax.swing.JMenuItem menuItemCadastrarFuncionario;
    private javax.swing.JMenuItem menuItemCadastrarPedidos1;
    private javax.swing.JMenuItem menuItemCadastrarPromocao;
    private javax.swing.JMenuItem menuItemCadastrarSabor;
    private javax.swing.JMenuItem menuItemSabores;
    private javax.swing.JMenuItem menuItemVisualizarClientes6;
    private javax.swing.JMenuItem menuItemVisualizarEntregadores1;
    private javax.swing.JMenuItem menuItemVisualizarFormaEntrega1;
    private javax.swing.JMenuItem menuItemVisualizarFuncionarios1;
    private javax.swing.JMenuItem menuItemVisualizarPedidos2;
    private javax.swing.JMenuItem menuItemVisualizarPromocao1;
    private javax.swing.JMenuItem menuItemVisualizarTamanho1;
    private javax.swing.JMenu menuPedidos7;
    private javax.swing.JTable tabelaEntregadores;
    private javax.swing.JTextField txtfCpf;
    private javax.swing.JTextField txtfNome;
    private javax.swing.JTextField txtfPlaca;
    // End of variables declaration//GEN-END:variables
}
