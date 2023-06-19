package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Normalizer;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

public class Controller extends Thread {

    final BufferedReader In;
    final PrintWriter Out;
    final Socket clientSocket;

    public Controller(Socket mynewSocket, BufferedReader In, PrintWriter Out) {
        this.clientSocket = mynewSocket;
        this.In = In;
        this.Out = Out;
    }

    public void fecharThread() {
        try {
            this.Out.close();
            this.In.close();
            System.out.println("Thread fechada");
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String isCpfClienteUsed(String cpf) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Cliente WHERE Cpf =?;");

            preparedStatement.setString(1, cpf);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public static String isCpfEntregadorUsed(String cpf) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Entregador WHERE Cpf =?;");

            preparedStatement.setString(1, cpf);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public static String flavorExist(String sabor) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Sabor WHERE Sabor=?;");

            preparedStatement.setString(1, sabor);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public static String employeeExist(String nome) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Funcionario WHERE Nome=?;");

            preparedStatement.setString(1, nome);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public static boolean clientExist(String nome) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Cliente WHERE Nome=?;");

            preparedStatement.setString(1, nome);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return true;
            } else {
                sql.close();
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static String promotionExist(String promocao) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Promocao WHERE promocao=?;");

            preparedStatement.setString(1, promocao);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public static String sizeExist(String tamanho) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Tamanho WHERE tamanho=?;");

            preparedStatement.setString(1, tamanho);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public static String modalityExist(String modalidade) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Modalidade WHERE modalidade=?;");

            preparedStatement.setString(1, modalidade);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public static String orderExist(int numPedido) {
        try {
            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

            PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Pedido WHERE idPedido=?;");

            preparedStatement.setInt(1, numPedido);

            ResultSet n = preparedStatement.executeQuery();
            if (n.next()) {
                sql.close();
                return "0";
            } else {
                sql.close();
                return "1";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "-1";
    }

    public void run() {
        String message;
        try {
            while (true) {
                message = In.readLine();

                if (message == null || "".equals(message)) {
                    fecharThread();
                    return;
                }
                JSONObject obj = new JSONObject(message);
                int tipo = obj.getInt("operacao");
                if (tipo == 1) {
                    if (obj.getString("nome").isBlank() || obj.getString("cpf").isBlank() || obj.getString("data").isBlank() || obj.getString("endereco").isBlank() || obj.getString("telefone").isBlank()) {
                        Out.println("{\"operacao\": 1,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (isCpfClienteUsed(obj.getString("cpf")).equals("0")) {
                            Out.println("{\"operacao\": 1,\"status\": \"Cpf já cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("INSERT INTO Cliente (Nome, Cpf, DataCadastro, Endereco, Telefone, Ativo) VALUES(?,?,?,?,?,?);");

                                preparedStatement.setString(1, obj.getString("nome"));
                                preparedStatement.setString(2, obj.getString("cpf"));
                                preparedStatement.setString(3, obj.getString("dataCadastro"));
                                preparedStatement.setString(4, obj.getString("endereco"));
                                preparedStatement.setString(5, obj.getString("telefone"));
                                preparedStatement.setBoolean(6, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 1,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 1,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 1,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 2) {
                    if (obj.getString("nome").isBlank() || obj.getString("cpf").isBlank() || obj.getString("endereco").isBlank() || obj.getString("Telefone").isBlank()) {
                        Out.println("{\"operacao\": 2,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        try {
                            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                            PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Cliente SET Nome=?, Endereco=?, Telefone=?, Ativo=? WHERE Cpf=?");

                            preparedStatement.setString(1, obj.getString("nome"));
                            preparedStatement.setString(2, obj.getString("endereco"));
                            preparedStatement.setString(3, obj.getString("telefone"));
                            preparedStatement.setBoolean(4, obj.getBoolean("ativo"));

                            preparedStatement.executeUpdate();
                            Out.println("{\"operacao\": 2,\"status\": \"OK\"}");
                            try {
                                sql.close();
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 2,\"status\": \"Erro no banco de dados\"}");
                            }
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 2,\"status\": \"Erro no banco de dados\"}");
                        }
                    }
                } else if (tipo == 3) {
                    if (obj.getString("cpf").isBlank()) {
                        Out.println("{\"operacao\": 3,\"status\": \"Campo cpf não preenchido\"}");
                    } else {
                        if (!isCpfClienteUsed(obj.getString("cpf")).equals("0")) {
                            Out.println("{\"operacao\": 3,\"status\": \"Cpf não cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("DELETE FROM Cliente WHERE Cpf=?");

                                preparedStatement.setString(1, obj.getString("cpf"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 3,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 3,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 3,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 4) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Cliente");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"nome\": " + n.getString("nome") + ",\"cpf\":\"" + n.getString("cpf") + "\",\"data\":\"" + n.getString("data") + "\",\"endereco\":\"" + n.getString("endereco") + "\",\"telefone\":\"" + n.getString("telefone") + "\",\"ativo\":\"" + n.getString("ativo") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 4,\"status\": \"OK\", \"clientes\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 4,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 4,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 5) {
                    if (obj.getString("sabor").isBlank() || obj.getString("observacao").isBlank()) {
                        Out.println("{\"operacao\": 5,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (flavorExist(obj.getString("sabor")).equals("0")) {
                            Out.println("{\"operacao\": 5,\"status\": \"Sabor já existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("INSERT INTO Sabor (Sabor, Observacao, Ativo) VALUES(?,?,?);");

                                preparedStatement.setString(1, obj.getString("sabor"));
                                preparedStatement.setString(2, obj.getString("observacao"));
                                preparedStatement.setBoolean(3, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 5,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 5,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 5,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 6) {
                    if (obj.getString("sabor").isBlank() || obj.getString("observacao").isBlank()) {
                        Out.println("{\"operacao\": 6,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (!flavorExist(obj.getString("sabor")).equals("0")) {
                            Out.println("{\"operacao\": 6,\"status\": \"Sabor não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Sabor SET Observacao=?, Ativo=? WHERE Sabor=?");

                                preparedStatement.setString(1, obj.getString("observacao"));
                                preparedStatement.setBoolean(2, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 6,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 6,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 6,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 7) {
                    if (obj.getString("sabor").isBlank()) {
                        Out.println("{\"operacao\": 7,\"status\": \"Preencha o campo sabor para excluir\"}");
                    } else {
                        if (!flavorExist(obj.getString("sabor")).equals("0")) {
                            Out.println("{\"operacao\": 7,\"status\": \"Sabor não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("DELETE FROM Sabor WHERE Sabor=?");

                                preparedStatement.setString(1, obj.getString("sabor"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 7,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 7,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 7,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 8) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Sabor");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"sabor\": " + n.getString("sabor") + ",\"observacao\":\"" + n.getString("observacao") + "\",\"ativo\":\"" + n.getString("ativo") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 8,\"status\": \"OK\", \"sabores\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 8,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 8,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 9) {
                    if (obj.getString("nome").isBlank() || obj.getString("status").isBlank() || obj.getString("data").isBlank() || obj.getString("hora").isBlank() || obj.getString("modalidade").isBlank() || obj.getString("funcionario").isBlank() || obj.getString("endereco").isBlank() || obj.getString("promocao").isBlank() || obj.getString("quantidade").isBlank() || obj.getString("sabor").isBlank() || obj.getString("tamanho").isBlank()) {
                        Out.println("{\"operacao\": 9,\"status\": \"Preencha os campos obrigatórios\"}");
                    } else {
                        try {
                            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                            PreparedStatement preparedStatement = sql.prepareStatement("INSERT INTO Pedido (Nome, Data, Hora, Endereco, Funcionario, Entregador, Promocao, Quantidade, Sabor, Tamanho, NumFatias, Acrescimo, Observacoes, Valor) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?);");

                            preparedStatement.setString(1, obj.getString("nome"));
                            preparedStatement.setString(2, obj.getString("data"));
                            preparedStatement.setString(3, obj.getString("hora"));
                            preparedStatement.setString(4, obj.getString("endereco"));
                            preparedStatement.setString(5, obj.getString("funcionario"));
                            preparedStatement.setString(6, obj.getString("entregador"));
                            preparedStatement.setString(7, obj.getString("promocao"));
                            preparedStatement.setInt(8, obj.getInt("quantidade"));
                            preparedStatement.setString(9, obj.getString("sabor"));
                            preparedStatement.setString(10, obj.getString("tamanho"));
                            preparedStatement.setString(11, obj.getString("numFatias"));
                            preparedStatement.setString(12, obj.getString("acrescimo"));
                            preparedStatement.setString(13, obj.getString("observacoes"));
                            preparedStatement.setString(14, obj.getString("status"));

                            preparedStatement.executeUpdate();
                            Out.println("{\"operacao\": 9,\"status\": \"OK\"}");
                            try {
                                sql.close();
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 9,\"status\": \"Erro no banco de dados\"}");
                            }
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 9,\"status\": \"Erro no banco de dados\"}");
                        }
                    }
                } else if (tipo == 10) {
                    if (obj.getString("status").isBlank() || obj.getString("cliente").isBlank() || obj.getString("pedido").isBlank() || obj.getString("numPedido").isBlank() || obj.getInt("numPedido") < 1) {
                        Out.println("{\"operacao\": 10,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (!orderExist(obj.getInt("numPedido")).equals("0")) {
                            Out.println("{\"operacao\": 10,\"status\": \"Pedido não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Pedido SET Status=?, Cliente=?, Pedido=? WHERE IDPedido=?");

                                preparedStatement.setString(1, obj.getString("status"));
                                preparedStatement.setString(2, obj.getString("cliente"));
                                preparedStatement.setString(3, obj.getString("pedido"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 10,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 10,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 10,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 11) {
                    if (obj.getInt("numPedido") < 1) {
                        Out.println("{\"operacao\": 11,\"status\": \"Coloque um número de pedido válido para excluir\"}");
                    } else {
                        if (!orderExist(obj.getInt("numPedido")).equals("0")) {
                            Out.println("{\"operacao\": 11,\"status\": \"Pedido não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("DELETE FROM Pedido WHERE IDPedido=?");

                                preparedStatement.setInt(1, obj.getInt("numPedido"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 11,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 11,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 11,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 12) {
                    if (!orderExist(obj.getInt("idPedido")).equals(obj.getInt("numPedido"))) {
                        Out.println("{\"operacao\": 12,\"status\": \"Pedido não existe\"}");
                    } else {
                        try {
                            java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                            PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Pedido SET Status=? WHERE IDPedido=?");

                            preparedStatement.setString(1, obj.getString("status"));

                            preparedStatement.executeUpdate();
                            Out.println("{\"operacao\": 12,\"status\": \"OK\"}");
                            try {
                                sql.close();
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 12,\"status\": \"Erro no banco de dados\"}");
                            }
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 12,\"status\": \"Erro no banco de dados\"}");
                        }
                    }
                } else if (tipo == 13) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Pedido");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"numPedido\": " + n.getInt("numPedido") + ",\"status\":\"" + n.getString("status") + "\",\"data\":\"" + n.getString("data") + "\",\"hora\":\"" + n.getString("hora") + "\",\"cliente\":\"" + n.getString("cliente") + "\",\"cadastrado\":\"" + n.getBoolean("cadastrado") + ",\"pedido\":\"" + n.getString("pedido") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 13,\"status\": \"OK\", \"pedidos\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 13,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 13,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 14) {

                } else if (tipo == 15) {
                    if (obj.getString("nome").isBlank() || obj.getString("cpf").isBlank() || obj.getString("placa").isBlank()) {
                        Out.println("{\"operacao\": 15,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (isCpfEntregadorUsed(obj.getString("cpf")).equals("0")) {
                            Out.println("{\"operacao\": 15,\"status\": \"Cpf já cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("INSERT INTO Entregador (Nome, Cpf, Placa, Ativo) VALUES(?,?,?,?);");

                                preparedStatement.setString(1, obj.getString("nome"));
                                preparedStatement.setString(2, obj.getString("cpf"));
                                preparedStatement.setString(3, obj.getString("placa"));
                                preparedStatement.setBoolean(4, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 15,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 15,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 15,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 16) {
                    if (obj.getString("nome").isBlank() || obj.getString("cpf").isBlank() || obj.getString("placa").isBlank()) {
                        Out.println("{\"operacao\": 16,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (!isCpfEntregadorUsed(obj.getString("cpf")).equals("0")) {
                            Out.println("{\"operacao\": 16,\"status\": \"Entregador não cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Entregador SET Nome=?, Placa=?, Ativo=? WHERE Cpf=?");

                                preparedStatement.setString(1, obj.getString("nome"));
                                preparedStatement.setString(2, obj.getString("placa"));
                                preparedStatement.setBoolean(3, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 16,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 16,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 16,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 17) {
                    if (obj.getString("cpf").isBlank()) {
                        Out.println("{\"operacao\": 17,\"status\": \"Campo cpf não preenchido\"}");
                    } else {
                        if (!isCpfEntregadorUsed(obj.getString("cpf")).equals("0")) {
                            Out.println("{\"operacao\": 17,\"status\": \"Cpf não cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("DELETE FROM Entregador WHERE Cpf=?");

                                preparedStatement.setString(1, obj.getString("cpf"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 17,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 17,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 17,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 18) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Entregador");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"nome\": " + n.getString("nome") + ",\"cpf\":\"" + n.getString("cpf") + "\",\"placa\":\"" + n.getString("placa") + "\",\"ativo\":\"" + n.getString("ativo") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 18,\"status\": \"OK\", \"entregadores\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 18,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 18,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 19) {
                    if (obj.getString("promocao").isBlank() || obj.getString("desconto").isBlank() || obj.getString("observacao").isBlank()) {
                        Out.println("{\"operacao\": 19,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (promotionExist(obj.getString("promocao")).equals("0")) {
                            Out.println("{\"operacao\": 19,\"status\": \"Promoção já existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("INSERT INTO Promocao (Promocao, Desconto, Observacao, Ativo) VALUES(?,?,?,?);");

                                preparedStatement.setString(1, obj.getString("promocao"));
                                preparedStatement.setString(2, obj.getString("desconto"));
                                preparedStatement.setString(3, obj.getString("observacao"));
                                preparedStatement.setBoolean(4, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 19,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 19,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 19,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 20) {
                    if (obj.getString("promocao").isBlank() || obj.getString("desconto").isBlank() || obj.getString("observacao").isBlank()) {
                        Out.println("{\"operacao\": 20,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (!promotionExist(obj.getString("promocao")).equals("0")) {
                            Out.println("{\"operacao\": 20,\"status\": \"Promoção não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Promocao SET Desconto=?, Observacao=?, Status=? WHERE Promocao=?");

                                preparedStatement.setString(1, obj.getString("desconto"));
                                preparedStatement.setString(2, obj.getString("observacao"));
                                preparedStatement.setBoolean(3, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 20,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 20,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 20,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 21) {
                    if (obj.getString("promocao").isBlank()) {
                        Out.println("{\"operacao\": 21,\"status\": \"Campo promoção não preenchido\"}");
                    } else {
                        if (!promotionExist(obj.getString("cpf")).equals("0")) {
                            Out.println("{\"operacao\": 21,\"status\": \"Promoção não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("DELETE FROM Promocao WHERE Promocao=?");

                                preparedStatement.setString(1, obj.getString("promocao"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 21,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 21,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 21,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 22) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Promocao");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"promocao\": " + n.getString("promocao") + ",\"desconto\":\"" + n.getString("desconto") + "\",\"ativo\":\"" + n.getString("ativo") + "\",\"observacao\":\"" + n.getString("observacao") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 22,\"status\": \"OK\", \"promocoes\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 22,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 22,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 23) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Cliente");
                        //JSON Cliente
                        ResultSet a = preparedStatement.executeQuery();

                        String jsonCliente = "";

                        while (a.next()) {
                            jsonCliente += "{\"nome\": " + a.getString("nome") + ",\"cpf\":\"" + a.getString("cpf") + "\",\"data\":\"" + a.getString("data") + "\",\"endereco\":\"" + a.getString("endereco") + "\",\"telefone\":\"" + a.getString("telefone") + "\",\"ativo\":\"" + a.getString("ativo") + "\"}";
                        }
                        jsonCliente = jsonCliente.replace("}{", "},{");
                        //JSON Sabor    
                        PreparedStatement preparedStatement2 = sql.prepareStatement("SELECT * FROM Sabor");

                        ResultSet b = preparedStatement2.executeQuery();

                        String jsonSabor = "";

                        while (b.next()) {
                            jsonSabor += "{\"sabor\": " + b.getString("sabor") + ",\"observacao\":\"" + b.getString("observacao") + "\",\"ativo\":\"" + b.getString("ativo") + "\"}";
                        }
                        jsonSabor = jsonSabor.replace("}{", "},{");
                        //JSON Pedido
                        PreparedStatement preparedStatement3 = sql.prepareStatement("SELECT * FROM Pedido");

                        ResultSet c = preparedStatement3.executeQuery();

                        String jsonPedido = "";

                        while (c.next()) {
                            jsonPedido += "{\"numPedido\": " + c.getInt("numPedido") + ",\"status\":\"" + c.getString("status") + "\",\"data\":\"" + c.getString("data") + "\",\"hora\":\"" + c.getString("hora") + "\",\"cliente\":\"" + c.getString("cliente") + "\",\"cadastrado\":\"" + c.getBoolean("cadastrado") + ",\"pedido\":\"" + c.getString("pedido") + "\"}";
                        }
                        jsonPedido = jsonPedido.replace("}{", "},{");
                        //JSON Entregador
                        PreparedStatement preparedStatement4 = sql.prepareStatement("SELECT * FROM Entregador");

                        ResultSet d = preparedStatement4.executeQuery();

                        String jsonEntregador = "";

                        while (d.next()) {
                            jsonEntregador += "{\"nome\": " + d.getString("nome") + ",\"cpf\":\"" + d.getString("cpf") + "\",\"placa\":\"" + d.getString("placa") + "\",\"ativo\":\"" + d.getString("ativo") + "\"}";
                        }
                        jsonEntregador = jsonEntregador.replace("}{", "},{");
                        //JSON Promocao
                        PreparedStatement preparedStatement5 = sql.prepareStatement("SELECT * FROM Promocao");

                        ResultSet f = preparedStatement5.executeQuery();

                        String jsonPromocao = "";

                        while (f.next()) {
                            jsonPromocao += "{\"promocao\": " + f.getString("promocao") + ",\"desconto\":\"" + f.getString("desconto") + "\",\"ativo\":\"" + f.getString("ativo") + "\",\"observacao\":\"" + f.getString("observacao") + "\"}";
                        }
                        jsonPromocao = jsonPromocao.replace("}{", "},{");
                        //JSON Funcionario
                        PreparedStatement preparedStatement6 = sql.prepareStatement("SELECT * FROM Funcionario");

                        ResultSet g = preparedStatement6.executeQuery();

                        String jsonFuncionario = "";

                        while (g.next()) {
                            jsonFuncionario += "{\"nome\": " + g.getString("nome") + ",\"cargo\":\"" + g.getString("cargo") + "\",\"ativo\":\"" + g.getString("ativo") + "\"}";
                        }
                        jsonFuncionario = jsonFuncionario.replace("}{", "},{");
                        //JSON Tamanho
                        PreparedStatement preparedStatement7 = sql.prepareStatement("SELECT * FROM Tamanho");

                        ResultSet h = preparedStatement7.executeQuery();

                        String jsonTamanho = "";

                        while (h.next()) {
                            jsonTamanho += "{\"tamanho\": " + h.getString("tamanho") + ",\"preco\":\"" + h.getString("preco") + "\",\"numFatias\":\"" + h.getString("numFatias") + "\"}";
                        }
                        jsonTamanho = jsonTamanho.replace("}{", "},{");
                        //JSON Modalidade
                        PreparedStatement preparedStatement8 = sql.prepareStatement("SELECT * FROM Modalidade");

                        ResultSet n = preparedStatement8.executeQuery();

                        String jsonModalidade = "";

                        while (n.next()) {
                            jsonModalidade += "{\"modalidade\": " + n.getString("modalidade") + ",\"preco\":\"" + n.getString("preco") + ",\"ativo\":\"" + n.getString("ativo") + "\"}";
                        }
                        jsonModalidade = jsonModalidade.replace("}{", "},{");
                        //MENSAGEM
                        Out.println("{\"operacao\": 23,\"status\": \"OK\", \"clientes\":[" + jsonCliente + "], \"sabores\":[" + jsonSabor + "], \"pedidos\":[" + jsonPedido + "], \"entregadores\":[" + jsonEntregador + "], \"promocoes\":[" + jsonPromocao + "], \"funcionarios\":[" + jsonFuncionario + "], \"tamanhos\":[" + jsonTamanho + "], \"modalidades\":[" + jsonModalidade + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 23,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 23,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 24) {
                    clientExist(obj.getString("nome"));
                } else if (tipo == 25) {
                    if (obj.getString("nome").isBlank() || obj.getString("cargo").isBlank()) {
                        Out.println("{\"operacao\": 25,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (employeeExist(obj.getString("nome")).equals("0")) {
                            Out.println("{\"operacao\": 25,\"status\": \"Funcionário já cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("INSERT INTO Funcionario (Nome, Cargo, Ativo) VALUES(?,?,?);");

                                preparedStatement.setString(1, obj.getString("nome"));
                                preparedStatement.setString(2, obj.getString("cargo"));
                                preparedStatement.setBoolean(3, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 25,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 25,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 25,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 26) {
                    if (obj.getString("nome").isBlank() || obj.getString("cargo").isBlank()) {
                        Out.println("{\"operacao\": 26,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (!employeeExist(obj.getString("nome")).equals("0")) {
                            Out.println("{\"operacao\": 26,\"status\": \"Funcionário não cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Funcionario SET Cargo=?, Ativo=? WHERE Nome=?");

                                preparedStatement.setString(1, obj.getString("cargo"));
                                preparedStatement.setBoolean(2, obj.getBoolean("ativo"));
                                preparedStatement.setString(3, obj.getString("nome"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 26,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 26,\"status\": \"Erro no banco de dados\"}");

                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 26,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 27) {
                    if (obj.getString("nome").isBlank()) {
                        Out.println("{\"operacao\": 27,\"status\": \"Campo nome não preenchido\"}");
                    } else {
                        if (!employeeExist(obj.getString("nome")).equals("0")) {
                            Out.println("{\"operacao\": 27,\"status\": \"Nome não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("DELETE FROM Funcionario WHERE Nome=?");

                                preparedStatement.setString(1, obj.getString("nome"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 27,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 27,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 27,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 28) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Funcionario");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"nome\": " + n.getString("nome") + ",\"cargo\":\"" + n.getString("cargo") + "\",\"ativo\":\"" + n.getString("ativo") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 28,\"status\": \"OK\", \"funcionarios\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 28,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 28,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 29) {
                    if (obj.getString("tamanho").isBlank() || obj.getString("preco").isBlank() || obj.getString("numFatias").isBlank()) {
                        Out.println("{\"operacao\": 29,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (sizeExist(obj.getString("tamanho")).equals("0")) {
                            Out.println("{\"operacao\": 29,\"status\": \"Tamanho já cadastrado\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("INSERT INTO Tamanho (Tamanho, Preco, NumFatias) VALUES(?,?,?);");

                                preparedStatement.setString(1, obj.getString("tamanho"));
                                preparedStatement.setString(2, obj.getString("preco"));
                                preparedStatement.setString(3, obj.getString("numFatias"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 29,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 29,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 29,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 30) {
                    if (obj.getString("tamanho").isBlank() || obj.getString("preco").isBlank() || obj.getString("numFatias").isBlank()) {
                        Out.println("{\"operacao\": 30,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (!sizeExist(obj.getString("tamanho")).equals("0")) {
                            Out.println("{\"operacao\": 31,\"status\": \"Tamanho não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Tamanho SET Preco=?, NumFatias=? WHERE Tamanho=?");

                                preparedStatement.setString(1, obj.getString("preco"));
                                preparedStatement.setString(2, obj.getString("numFatias"));
                                preparedStatement.setString(3, obj.getString("tamanho"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 30,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 30,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 30,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 31) {
                    if (obj.getString("tamanho").isBlank()) {
                        Out.println("{\"operacao\": 31,\"status\": \"Campo tamanho não preenchido\"}");
                    } else {
                        if (!sizeExist(obj.getString("tamanho")).equals("0")) {
                            Out.println("{\"operacao\": 31,\"status\": \"Tamanho não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("DELETE FROM Tamanho WHERE Tamanho=?");

                                preparedStatement.setString(1, obj.getString("tamanho"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 31,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 31,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 31,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 32) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Tamanho");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"tamanho\": " + n.getString("tamanho") + ",\"preco\":\"" + n.getString("preco") + "\",\"numFatias\":\"" + n.getString("numFatias") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 32,\"status\": \"OK\", \"tamanhos\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 32,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 32,\"status\": \"Erro no banco de dados\"}");
                    }
                } else if (tipo == 33) {
                    if (obj.getString("modalidade").isBlank() || obj.getString("preco").isBlank()) {
                        Out.println("{\"operacao\": 33,\"status\": \"Todos os campos são obrigatórios\"}");
                    } else {
                        if (modalityExist(obj.getString("modalidade")).equals("0")) {
                            Out.println("{\"operacao\": 33,\"status\": \"Modalidade não existe\"}");
                        } else {
                            try {
                                java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                                PreparedStatement preparedStatement = sql.prepareStatement("UPDATE Modalidade SET Preco=?, Ativo=? WHERE Modalidade=?");

                                preparedStatement.setString(1, obj.getString("preco"));
                                preparedStatement.setBoolean(2, obj.getBoolean("ativo"));

                                preparedStatement.executeUpdate();
                                Out.println("{\"operacao\": 33,\"status\": \"OK\"}");
                                try {
                                    sql.close();
                                } catch (SQLException e) {
                                    Out.println("{\"operacao\": 33,\"status\": \"Erro no banco de dados\"}");
                                }
                            } catch (SQLException e) {
                                Out.println("{\"operacao\": 33,\"status\": \"Erro no banco de dados\"}");
                            }
                        }
                    }
                } else if (tipo == 34) {
                    try {
                        java.sql.Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");

                        PreparedStatement preparedStatement = sql.prepareStatement("SELECT * FROM Modalidade");

                        ResultSet n = preparedStatement.executeQuery();

                        String json = "";

                        while (n.next()) {
                            json += "{\"modalidade\": " + n.getString("modalidade") + ",\"preco\":\"" + n.getString("preco") + ",\"ativo\":\"" + n.getString("ativo") + "\"}";
                        }
                        json = json.replace("}{", "},{");

                        Out.println("{\"operacao\": 34,\"status\": \"OK\", \"modalidades\":[" + json + "]}");

                        try {
                            sql.close();
                        } catch (SQLException e) {
                            Out.println("{\"operacao\": 34,\"status\": \"Erro no banco de dados\"}");
                        }
                    } catch (SQLException e) {
                        Out.println("{\"operacao\": 34,\"status\": \"Erro no banco de dados\"}");
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
