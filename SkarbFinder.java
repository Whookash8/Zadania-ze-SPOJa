import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-26.
 */
public class SkarbFinder
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int D = load.nextInt();
        int direction;
        int steps;
        while(D > 0)
        {
            int NS = 0;
            int WE = 0;
            int N = load.nextInt();
            while(N > 0)
            {
                direction = load.nextInt();
                steps = load.nextInt();
                switch (direction)
                {
                    case 0:
                        NS += steps;
                        break;
                    case 1:
                        NS -= steps;
                        break;
                    case 2:
                        WE -= steps;
                        break;
                    case 3:
                        WE += steps;
                        break;
                }
                N--;
            }
            if(NS == 0)
            {
                if(WE == 0)
                    System.out.println("studnia");
                else
                {
                    if(WE < 0)
                        System.out.println("2 " + (-WE));
                    else
                        System.out.println("3 " + WE);
                }
            }
            else
            {
                if(NS > 0)
                    System.out.println("0 " + NS);
                else
                    System.out.println("1 " + (-NS));
                if(WE != 0)
                {
                    if(WE < 0)
                        System.out.println("2 " + (-WE));
                    else
                        System.out.println("3 " + WE);
                }
            }
            D--;
        }
    }
}
