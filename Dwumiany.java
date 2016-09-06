import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-31.
 */
public class Dwumiany
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int T = load.nextInt();
        while(T > 0)
        {
            int n = load.nextInt();
            int k = load.nextInt();
            int wynik = 1;
            if(n-k < k) k = n-k;
            if(n==0 || n==1 | n==k) wynik = 1;
            else
            {
                int[] pascal = new int[k+1];
                int[] result = new int[k+1];
                for(int i=0 ; i<pascal.length ; i++)
                {
                    pascal[i] = 1;
                }

                for(int i=0 ; i<result.length ; i++)
                {
                    result[i] = 1;
                }

                for(int i=2 ; i<n+1 ; i++)
                {
                    for(int j=1 ; j<i && j<=k ; j++)
                    {
                        result[j] = pascal[j] + pascal[j-1];
                    }
                    pascal = Arrays.copyOf(result , k+1);
                }
                wynik = pascal[k];
            }

            System.out.println(wynik);
            T--;
        }
    }
}
