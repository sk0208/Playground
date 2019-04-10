import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      int x = num/10;
      int y = x%10;
      int value = (y);
      System.out.println(value);
	}
}