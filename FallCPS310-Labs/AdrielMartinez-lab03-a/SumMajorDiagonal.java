import java.util.Scanner;
public class SumMajorDiagonal{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter dimension n of nxn matrix:");
        int n= input.nextInt();
        //array created
        double[][] array=new double[n][n];
        for(int x=0;x<n;x++){
            System.out.print("Enter row "+ x +":");
            for(int y=0;y<n;y++){
                array[x][y]=input.nextDouble();
              }
          }
        System.out.println(sumMajorDiagonal(array));
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum=0;
        for(int j=0; j<m.length;j++){
            sum+=m[j][j];
        }
        return sum;
    }
}