import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int m,n,sum=0;
      Scanner in = new Scanner (System.in);
      
      m = in.nextInt();
      while(m>0)
      {
        n = m%10;
        sum = sum+n;
       m = m/10;
      }
      System.out.println(sum);
	}
}