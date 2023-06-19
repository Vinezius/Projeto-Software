package helpers;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static ServerSocket serverSocket;
    static PrintWriter out;
    static BufferedReader in;
    
    public static void start(int port) throws IOException {
        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Servidor Iniciado");
            while(true){
                Socket clientSocket = null;
                try{
                    clientSocket = serverSocket.accept();
                    try{
                        System.out.println(clientSocket+"Nova conexao identificada: ");
                        out = new PrintWriter(clientSocket.getOutputStream(), true);
                        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        Thread myThread = new Controller(clientSocket, in, out);
                        System.out.println(clientSocket+"Thread atribuida: ");
                        myThread.start();
                        clientSocket.isClosed();
                    }
                    catch (IOException e){
                        System.out.println("Erro de conexão");
                    }
                }
                catch (IOException e){
                    System.out.println("Conexão não aceita"); 
                }
            }
        }
        catch (IOException e){
            System.out.println("Não foi possivel abrir a porta " + port);
        }
        finally{
            try{
                serverSocket.close();
            }
            catch(IOException e){
                System.out.println("Não foi possível fechar o servidor");
                System.exit(1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        start(20000);
    }
}
