
package client;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    
    public static void main(String[] args) throws IOException, UnknownHostException {
        
        String msg,temp;
        Scanner sc= new Scanner(System.in);
        Socket s= new Socket("127.0.0.1",4444);
        Scanner sc1= new Scanner(s.getInputStream());
        System.out.println("Enter the message:");
        msg=sc.nextLine();
        PrintStream p= new PrintStream(s.getOutputStream());
        p.println(msg);
        temp=sc1.nextLine();
        System.out.println(temp);
    }

    
}
