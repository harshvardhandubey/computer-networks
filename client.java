import java.net.*;
import java.io.*;
class Client extends Thread
{
Socket s;
BufferedReader br;
PrintWriter pw;
Client()
{
try
{

s=new Socket(InetAddress.getLocalHost(),1200);

br=new BufferedReader(new InputStreamReader(System.in));
pw=new PrintWriter(s.getOutputStream(),true);
start();
ClientInner ci=new ClientInner();
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
pw.println(s1);

sleep(10000);
}
}

catch(Exception e)
{}
}
class ClientInner
{
BufferedReader br1;
PrintWriter pw;
ClientInner()
{
try
{
br1=new BufferedReader(new InputStreamReader(s.getInputStream()));

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
System.out.println(&quot;message is:&quot;+P);

}

}
catch(Exception e)
{
}
}
}
public static void main(String args[])
{
Client c=new Client();
}
}