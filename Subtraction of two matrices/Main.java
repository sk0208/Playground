import java.util.Scanner;
class Main
{ 
  public static void main(String args[]) 
  { 
    int rows,columns,c,d;
    Scanner in = new Scanner(System.in);
    rows = in.nextInt();
    columns = in.nextInt();
    int matrix1[][] = new int[rows][columns];
    int matrix2[][] = new int[rows][columns];
    int diff[][] = new int[rows][columns];
    for(c = 0; c<rows; c++)
    {
      for(d = 0;d<columns; d++)
      {
        matrix1[c][d] = in.nextInt();
      }
    }
      for( c = 0; c<rows; c++)
      {
        for( d= 0; d<columns; d++)
        {
          matrix2[c][d] = in.nextInt();
        }
    }
    for( c= 0; c<rows; c++)
    {
      for( d = 0; d<columns; d++)
      {
        diff[c][d] = matrix1[c][d] - matrix2[c][d];
      }
    }
    for( c = 0; c<rows;c++)
    {
      for( d= 0; d<columns; d++)
      {
        System.out.print(diff[c][d]+ " ");
      }
      System.out.println();
    }
  }
}