import java.util.*;

 class MatrixAdd {
  public static void main(String[] args) {
    int row, col;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter Number of Rows and Columns of Matrix : ");
    row = in.nextInt();
    col = in.nextInt();
    
    int M1[][] = new int[row][col];
    int M2[][] = new int[row][col];
    int result[][] = new int[row][col];
        
    System.out.print("Enter elements of First Matrix : ");
    
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        M1[i][j] = in.nextInt();
      }
    }
    System.out.println("First Matrix : " );
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        System.out.print(M1[i][j]+"\t");
      }
      System.out.println();
    }
        
    System.out.print("Enter elements of Second Matrix : ");    
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        M2[i][j] = in.nextInt();
      }
    }
    System.out.println("Second Matrix : " );
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        System.out.print(M2[i][j] + "\t");
      }
      System.out.println();
    }
        
    
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        result[i][j] = M1[i][j] + M2[i][j];
      }
    }
        
    
    System.out.println("Result Matrix : " );
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        System.out.print(result[i][j]+"\t");
      }
      System.out.println();
    }
  }
}