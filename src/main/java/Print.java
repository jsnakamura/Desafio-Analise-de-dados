/**
 * Class for console print
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class Print {

    public void printer(String line)
    {
        System.out.println(line);
    }

    public static void clearScreen()
    {
        for(int tmp = 0; tmp < 50; tmp ++)
            System.out.println();
    }
}