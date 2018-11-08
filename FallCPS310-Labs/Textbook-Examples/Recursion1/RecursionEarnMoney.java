
/**
 *  How to become a millionair ?
 */
public class RecursionEarnMoney
{

    public static int bag(int n)
    {
              System.out.println("This is the " +n + "th dollar I've earned and put into the bag");
              
              if (n==1) return 1;
              else return bag(n-1)+1;
                
    }

    public static void main(String[] arg)
    {
        int N=3;

         System.out.println("In total I have made " + bag(N)+" dollars !");      
        
    }
}
