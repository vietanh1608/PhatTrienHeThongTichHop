package BookFind;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class MyClient {

	public static void main(String[] args) throws IOException {
		
		try {
			
			Socket client = new Socket("LocalHost", 1100);
			System.out.println("Client da duoc tao");
			Scanner inFromServer = new Scanner(client.getInputStream());
			PrintStream outToServer = new PrintStream(client.getOutputStream());
			System.out.println("server: " + inFromServer.nextLine());
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			outToServer.println(name);
			System.out.println("server: " + inFromServer.nextLine());
			} catch (UnknownHostException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}

	}

}