import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
      int marks = in.nextInt();
      if (marks >= 85)
      {
        System.out.print("A");
      }
      else if (marks >= 75)
      {
        System.out.print("B");
      }
      else if (marks >=65)
      {
        System.out.print("C");
      }
      else if (marks >=55)
      {
        System.out.print("D");
      }
      else if (marks>=45)
      {
        System.out.print("E");
      }
      else
      {
        System.out.print("Fail");
      }
    }
  
}