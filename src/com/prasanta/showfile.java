package com.prasanta;

import java.io.*;
class  showfile
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream fin= new FileInputStream(args[0]);
		do
		{
			i=fin.read();
			if(i != -1)
			{
				System.out.print((char)i);
			}
		}
		while (i != -1);
		fin.close();	
	}
}
