/**
 * Class for console print
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class Print {

    /**
     * Method for printing strings.
     * @param line the string printed.
     */
    public void printing(String line)
    {
        System.out.println(line);
    }

    /**
     * Method for printing int numbers.
     * @param value the number printed.
     */
    public void printing(int value)
    {
        System.out.println(value);
    }

    /**
     * Method for printing float numbers.
     * @param value the number printed.
     */
    public void printing(float value)
    {
        System.out.println(value);
    }

    /**
     * Method for clearing console screen.
     */
    public static void clearScreen()
    {
        for(int tmp = 0; tmp < 50; tmp ++)
            System.out.println();
    }
}