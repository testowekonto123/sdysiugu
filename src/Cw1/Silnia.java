package Cw1;
import java.io.*;

public class Silnia
{
	public static void main(String args[])
   {
   	long S = 1L;
      int n = 3, i = 0;
      System.out.println("Program oblicza silnie liczby n = " + n);
      for (i = 1; i<=n; i++)
      {
      	S*=i;
      }
      System.out.println(" n!= " + n + "! = " + S);
	}
}

