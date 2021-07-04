import java.net.*;
import java.io.*;
class Server extends Thread
{
Socket s;
ServerSocket ss;
BufferedReader br;
PrintWriter pw;
Server()
{
try
{

ss=new ServerSocket(1200);
s=ss.accept();

br=new BufferedReader(new InputStreamReader(s.getInputStream()));
start();
ServerInner ci=new ServerInner();
}

catch(Exception e)
{
}
}
public void run()
{
try
{

while(true)
{
String s1=br.readLine();
System.out.println(&quot;Message from client:&quot;+s1);
}
}

catch(Exception e)
{}
}
class ServerInner
{
BufferedReader br1;
PrintWriter pw;
ServerInner()
{
try
{
br1=new BufferedReader(new InputStreamReader(System.in));
pw=new PrintWriter(s.getOutputStream(),true);

start();
}
catch(Exception e)

{
}
}
public void run()
{
try
{
while(true)
{
String P=br1.readLine();
pw.println(P);

}
}
catch(Exception e)
{
}
}
}
public static void main(String args[])
{
Server s=new Server();
}
}