
/**
 *  Calculate X in power of N
 */
public class RecursionExponentiation
{
    static double X=5;

    public static double Expo(int n)
    {
              if (n ==1) return X;
                    
              else return Expo(n-1)*X;
    }

    public static void main(String[] arg)
    {
        int N=3;        

        System.out.println("X(N) = "+X+"("+N+") = " + Expo(N));      
        
    }
}
