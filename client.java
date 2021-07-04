//CLIENT SIDE
import java.net.*;
import java.io.*;

class client extends Thread
{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	client()
	{
		try
		{
			s=new Socket(InetAddress.getLocalHost(),1201);
			br=new BufferedReader(new InputStreamReader(System.in));
			pw=new PrintWriter(s.getOutputStream(),true);
			start();
			ClientInner c1=new ClientInner();
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
		{
		}
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
				String p=br1.readLine();
				System.out.println("Message is :\n"+p);
			}
		}
		catch(Exception e)
		{
		}
	}
	}
	public static void main(String args[])
	{
		client c=new client();
	}
}