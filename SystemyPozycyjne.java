import java.util.Scanner;

/**
 * Created by Łukasz on 2016-09-06.
 */
public class SystemyPozycyjne
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int n= load.nextInt();
        while(n>0)
        {
            int number = load.nextInt();
            int copyOfNumber = number;
            StringBuilder result16 = new StringBuilder();
            StringBuilder result11 = new StringBuilder();
            while(number>0)
            {
                if (number%16 < 10)
                {
                    result16.append(number % 16);
                }
                else
                {
                    switch (number%16)
                    {
                        case 10:
                            result16.append('A');
                            break;
                        case 11:
                            result16.append('B');
                            break;
                        case 12:
                            result16.append('C');
                            break;
                        case 13:
                            result16.append('D');
                            break;
                        case 14:
                            result16.append('E');
                            break;
                        case 15:
                            result16.append('F');
                            break;
                    }
                }
                number = number/16;
            }
            while(copyOfNumber>0)
            {
                if (copyOfNumber%11 < 10)
                {
                    result11.append(copyOfNumber % 11);
                }
                else
                {
                    result11.append('A');
                }
                copyOfNumber = copyOfNumber/11;
            }
            System.out.println(result16.reverse() + " " + result11.reverse());
            n--;
        }
    }
}
