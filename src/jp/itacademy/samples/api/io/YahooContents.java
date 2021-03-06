package jp.itacademy.samples.api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class YahooContents {
public static void main(String[] args) throws IOException{
	try (Socket sock=new Socket("www.yahoo.co.jp",80)){
		OutputStream out=sock.getOutputStream();
		PrintWriter writer=new PrintWriter(out);
		writer.println("GET/HTTP/1.1");
		writer.println("Host:wwwyahoo.co.jp");
		writer.println();
		writer.flush();
		
		InputStream in=sock.getInputStream();
		Scanner scanner=new Scanner(in);
		while(scanner.hasNext()){
			System.out.println(scanner.nextLine());
		}
	}		
}
}
