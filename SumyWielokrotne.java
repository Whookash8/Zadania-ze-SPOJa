import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-30.
 */
public class SumyWielokrotne
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        long sum = 0;
        long total = 0;
        while(load.hasNext())
        {
            int n = load.nextInt();
            if(n == 0)
            {
                System.out.println(sum);
                total += sum;
                sum = 0;
            }
            else
            {
                sum += n;
            }
        }
        System.out.println(total);
    }
}
