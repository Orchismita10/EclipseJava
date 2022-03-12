package NetworkProgramming;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		try
		{
			ServerSocket server=new ServerSocket(1794);
			Socket client=server.accept();
			Scanner sc=new Scanner(System.in);
			Scanner in=new Scanner(client.getInputStream());
			PrintWriter out=new PrintWriter(client.getOutputStream(),true);
			int i;
			System.out.println("Client Connected"+"\n");
			do
			{
				i=sc.nextInt();
				System.out.println("Client:"+i);
				System.out.println("Server:");
				i=in.nextInt();
				out.println(i);
			}while(i!=0);
			server.close();
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}


	}

}
