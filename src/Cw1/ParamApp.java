package Cw1;
public class ParamApp
{
	public static void main(String args[])
   {
   	System.out.println("Parametry aplikacji");
      for (int i=0; i < args.length; i++)
      {
      	System.out.println("Parametr nr " + i + ": " + args[i]);
      }
	}
}

