package NetworkProgramming;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		try
		{
			Socket server=new Socket("localhost",1794);
			Scanner sc=new Scanner(System.in);
			Scanner in=new Scanner(server.getInputStream());
			PrintWriter out=new PrintWriter(server.getOutputStream(),true);
			int i;
			System.out.println("Connected with Server"+"\n");
			do
			{
				System.out.println("Client:");
				i=sc.nextInt();
				out.println(i);
				i=in.nextInt();
				System.out.println("Server:"+i);
			}while(i!=0);
			server.close();
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
		}
		

	}

