import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-31.
 */
public class ZabawneDodawaniePiotrusia
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int t = load.nextInt();
        while(t > 0)
        {
            String number = load.next();
            String reverse = new StringBuffer(number).reverse().toString();
            int operations = 0;
            while(!number.equals(reverse))
            {
                number = Integer.toString((Integer.parseInt(number) + Integer.parseInt(reverse)));
                reverse = new StringBuffer(number).reverse().toString();
                operations++;
            }
            System.out.println(number + " " + operations);
            t--;
        }
    }
}
