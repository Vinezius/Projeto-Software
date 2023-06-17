/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author User
 */
public class ConexaoCliente {
    
    static JSONObject mensagemFinal;

    public static JSONObject ConectarServidor(JSONObject mensagem) throws IOException, JSONException {
        
        System.out.println("Porta do cliente: " + 20000);

        Socket socketCliente = new Socket("localhost", 20000);

        PrintWriter pr = new PrintWriter(socketCliente.getOutputStream());

        pr.println(mensagem);
        pr.flush();

        InputStreamReader in = new InputStreamReader(socketCliente.getInputStream());

        BufferedReader bf = new BufferedReader(in);

        String mensagemRecebida = bf.readLine();
        System.out.println("Mensagem recebida: " + mensagemRecebida);
        
        mensagemFinal = new JSONObject(mensagemRecebida);
        
        return mensagemFinal;

    }
    
    public static JSONObject getMensagemFinal(){
        return mensagemFinal;
    }

}
