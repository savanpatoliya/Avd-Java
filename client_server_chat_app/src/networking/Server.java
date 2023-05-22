package networking;


import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server {
public static void main(String args[]) throws Exception
{
System.out.println("Server Started"+'\n');
ServerSocket ss= new ServerSocket(12312);
Socket s=ss.accept();

System.out.println("Connection done");
OutputStream o =s.getOutputStream();
InputStream in=s.getInputStream();

PrintStream ps=new PrintStream(o);
BufferedReader br=new BufferedReader(new InputStreamReader(in));

Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String data="";
// System.out.println(str);
while(true) {
if(str.equals("exit")) {
break;
}

ps.println(str);
data=br.readLine();
if(data.equals("exit")) {
break;
}
System.out.println(data);

str=sc.nextLine();
}

s.close();
ss.close();


}
}
