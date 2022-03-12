 package NetworkProgramming;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {

	public static void main(String[] args) {
		try {
			//Connection with Server
			Socket server=new Socket("localhost",1794);
			Scanner sc=new Scanner(System.in);
			//Object of Scanner to read from Server(Receive Data)
			Scanner in=new Scanner(server.getInputStream());
			//Object of PrintWriter to write on to the Server(Send Data)
			PrintWriter out=new PrintWriter(server.getOutputStream(),true);//true means autoflush enabled no need to flush everytime(While Sending Data)
			String s=" ";
			System.out.println("Connected with Server"+"\n");
			do {
				System.out.print("Client:");
				//accept input from user
				s=sc.nextLine();
				//send data
				out.println(s);
				//Receive Data
				s=in.nextLine();
				System.out.println("Server:"+s);
			}while(!s.equalsIgnoreCase("Bye"));
			server.close();//close the socket
		}catch(Exception e) {
			System.out.println("Error :"+e);
		}
			
	}

}
