import java.util.Scanner;

/**
 * Created by Łukasz on 2016-09-06.
 */
public class WarunekWTablicy
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int n = load.nextInt();
        int[] tab = new int[n];
        int i=0;
        while(i < n)
        {
            tab[i] = load.nextInt();
            i++;
        }
        String symbol = load.next();
        int number = load.nextInt();

        if(symbol.charAt(0) == '<')
        {
            for(int element : tab)
            {
                if(element < number)
                    System.out.println(element);
            }
        }
        if(symbol.charAt(0) == '>')
        {
            for (int element : tab)
            {
                if (element > number)
                    System.out.println(element);
            }
        }
    }
}

