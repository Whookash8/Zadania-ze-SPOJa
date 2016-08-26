import java.util.Scanner;
/**
 * Created by Łukasz on 2016-08-26.
 */
public class ProsteDodawanie
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int t = load.nextInt();
        int n;
        int[] sum = new int[t];
        for (int i=0 ; i<t ; i++)
        {
            sum[i]=0;
            n = load.nextInt();
            int[][] tab = new int[t][n];
            for (int j=0 ; j<n ; j++)
            {
                tab[i][j] = load.nextInt();
                sum[i] = sum[i] + tab[i][j];
            }
        }

        for (int l=0 ; l<t ; l++)
        {
            System.out.println(sum[l]);
        }
    }
}
