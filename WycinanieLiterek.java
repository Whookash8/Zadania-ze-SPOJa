import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-31.
 */
public class WycinanieLiterek
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        while(load.hasNextLine())
        {
            String line = load.nextLine();
            String word = line.substring(2);
            char c = line.charAt(0);
            String result = word.replace("" + c , "");
            System.out.println(result);
        }
    }
}
