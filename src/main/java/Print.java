/**
 * Class for console print
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class Print {

    public void printing(String line)
    {
        System.out.println(line);
    }

    public void printing(int value)
    {
        System.out.println(value);
    }

    public void printing(float value)
    {
        System.out.println(value);
    }

    public static void clearScreen()
    {
        for(int tmp = 0; tmp < 50; tmp ++)
            System.out.println();
    }
}