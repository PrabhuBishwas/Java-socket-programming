/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author H P
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, UnknownHostException {
        // TODO code application logic here
        String rep,temp;
        Scanner sc= new Scanner(System.in);
        ServerSocket ss= new ServerSocket(4444);
        Socket s1= ss.accept();
        Scanner sc1= new Scanner(s1.getInputStream());
        temp= sc1.nextLine();
        System.out.println(temp);
        PrintStream p= new PrintStream(s1.getOutputStream());
        rep=sc.nextLine();
        p.println(rep);
    }
    
}
