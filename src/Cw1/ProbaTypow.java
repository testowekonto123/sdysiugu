package Cw1;
import java.io.*;

public class ProbaTypow
{
    public static void main(String args[]) throws IOException
    {
          byte b[]= new byte[20];  // tablica 20 zmiennych typu byte
          String s;
          System.out.print("Jak masz na imie? ");
          System.out.flush();
          System.in.read(b);       // odczyt danych ze strumienia wej.
          s = new String(b);       // zainicjowanie s - zawarto�� z tablicy b
          System.out.println("Witaj " + s + "!");
          // dodałem komentarz
    }
}

