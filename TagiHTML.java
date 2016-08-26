import java.util.Scanner;

/**
 * Created by Łukasz on 2016-08-26.
 */
public class TagiHTML
{
    public static void main(String[] args)
    {
        Scanner load = new Scanner(System.in);
        while(load.hasNextLine())
        {
            String line = load.nextLine();
            char[] characters = line.toCharArray();
            boolean status = false;
            for(int i=0 ; i<characters.length ; i++)
            {
                if(characters[i] == '<') status = true;
                if(characters[i] == '>') status = false;
                if(status == true && (int)characters[i] > 96 && (int)characters[i] < 123)
                {
                    int num = (int)characters[i] - 32;
                    characters[i] = (char)num;
                }
            }
            line = new String(characters);
            System.out.println(line);
        }
    }
}
