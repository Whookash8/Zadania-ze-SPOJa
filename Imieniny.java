import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-26.
 */
public class Imieniny
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int D = load.nextInt();
        int students;
        int sweets;
        while(D > 0)
        {
            students = load.nextInt() - 1;
            sweets = load.nextInt();

            if(students == 0)
                System.out.println("TAK");
            else
            {
                if(sweets >= students && sweets % students == 0)
                    System.out.println("NIE");
                else
                    System.out.println("TAK");
            }
            D--;
        }
        load.close();
    }
}
