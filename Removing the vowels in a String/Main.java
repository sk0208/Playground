import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   
    Scanner in = new Scanner(System.in);
   String inputString = in.nextLine();
    String newInputString = inputString.replaceAll("[AEIOUaeiou]","");
      System.out.println(newInputString);
  }
}