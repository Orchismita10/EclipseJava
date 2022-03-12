package NetworkProgramming;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {

	public static void main(String[] args) {
		try {
			//Create Server Socket
			ServerSocket server=new ServerSocket(1794);
			//Connection with client
			Socket client=server.accept();
			Scanner sc=new Scanner(System.in);
			//Object of Scanner to read from Server(Receive Data)
			Scanner in=new Scanner(client.getInputStream());
			//Object of PrintWriter to write on to the Server(Send Data)
			PrintWriter out=new PrintWriter(client.getOutputStream(),true);//true means autoflush enabled no need to flush everytime(While Sending Data)
			String s="";
			System.out.println("Client Connected"+"\n");
			do {
				//Receive Data
				s=in.nextLine();
				System.out.println("Client:"+s);
				System.out.print("Server:");
				//accept input from user
				s=sc.nextLine();
				//send data
				out.println(s);
			}while(!s.equalsIgnoreCase("Bye"));
			server.close();//close the socket
		}catch (Exception e) {
			System.out.println("Error :"+e);
		}
	}

}
