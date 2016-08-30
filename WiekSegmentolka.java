import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-30.
 */
public class WiekSegmentolka
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int t = load.nextInt();
        while(t > 0)
        {
            int n = load.nextInt();
            int sum = n - 1;
            while(n > 0)
            {
                sum += load.nextInt();
                n--;
            }
            System.out.println(sum);
            t--;
        }
    }
}
