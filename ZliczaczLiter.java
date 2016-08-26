import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-26.
 */
public class ZliczaczLiter
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        load.reset();
        int N = load.nextInt();
        int[] tab = new int[60];
        while(N >= 0)
        {
            String line = load.nextLine();
            int i = 0;
            while(i < line.length())
            {
                char letter = line.charAt(i);
                if(letter != ' ')
                {
                    tab[((int) letter) - 65]++;
                }
                i++;
            }
            --N;
            load.reset();
        }
        int i = 27;
        while(i < tab.length)
        {
            if(tab[i] > 0)
            {
                System.out.println((char) (i + 65) + " " + tab[i]);
            }
            i++;
        }
        i = 0;
        while(i < 27)
        {
            if(tab[i] > 0)
            {
                System.out.println((char) (i + 65) + " " + tab[i]);
            }
            i++;
        }
        load.close();
    }
}
