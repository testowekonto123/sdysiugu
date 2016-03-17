package Cw1;
import java.io.*;

public class Wybor 
{
	public static void main(String args[]) throws IOException
   {
   	System.out.println("Wybor z MENU");
      System.out.println(" [1] - Wybor nr 1");
      System.out.println(" [2] - Wybor nr 2");
      System.out.print("Twoj wybor:");
      int option = System.in.read();  // odczyt jednego znaku
      switch (option)
      {
      	case '1': System.out.println("Wybrano opcj� 1"); break;
         case '2': System.out.println("Wybrano opcj� 2"); break;
         default:  System.out.println("Wybrano cos innego"); break;
            
      } // koniec switch
	} // koniec main
} // koniec Wybor
