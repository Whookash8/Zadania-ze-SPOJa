import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-31.
 */
public class ZliczanieLinii
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        int lines = 0;
        while(load.hasNextLine())
        {
            lines ++;
            load.nextLine();
        }
        System.out.println(lines);
    }
}
