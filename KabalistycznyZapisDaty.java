import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-31.
 */
public class KabalistycznyZapisDaty
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        String word = load.nextLine().trim();
        char[] letters = word.toCharArray();
        int result = 0;
        for(char elem : letters)
        {
            if((int) elem - 96 < 10)
            {
                result += (int) elem - 96;
            }
            else if((int) elem - 96 <= 20)
            {
                result += ((int) elem - 106) * 10;
            }
            else if((int) elem - 96 <= 22)
            {
                result += ((int) elem - 116) * 100;
            }
            else
            {
                result += ((int) elem - 117) * 100;
            }
        }
        System.out.println(result);
    }
}
