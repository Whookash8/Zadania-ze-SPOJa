import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-26.
 */
public class Spacje
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        while(load.hasNextLine())
        {
            String line = load.nextLine();
            boolean status = false;
            char[] characters = line.toCharArray();
            char[] result = new char[characters.length];
            for(int i=0 ; i<characters.length ; i++)
            {
                if(status == true && (int)characters[i] > 96 && (int)characters[i] < 123) characters[i] -= 32;
                if(characters[i] == ' ')
                    status = true;
                else
                    status = false;
                result[i] = characters[i];
            }
            line = new String(result);
            line = line.replaceAll("\\s" , "");
            System.out.println(line);
        }
    }
}
