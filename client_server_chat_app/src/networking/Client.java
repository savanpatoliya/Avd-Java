package networking;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
public static void main(String args[]) throws Exception{
Socket s = new Socket("localhost", 12312);

BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); // for input stream
PrintStream out = new PrintStream(s.getOutputStream()); // - for output
Scanner reader = new Scanner(System.in);


System.out.println("server is sending msgs...");
String got = "";
String data = "";
while(true) {
got = in.readLine();
if(got.equals("exit"))break;
System.out.println(got);
data = reader.nextLine();
if(data.equals("exit"))break;
out.println(data);


}

System.out.println("msg recieved from server");



// System.out.println("client is sending msgs...");
//
// while(true) {
// if(data.equals("exit"))break;
// out.println();
// data = reader.nextLine();
// }
//
//
// System.out.println("");



}
}
