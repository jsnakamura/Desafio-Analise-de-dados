import java.util.Scanner;

/**
 * Class for console read
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class Read {

    Scanner readline = new Scanner(System.in);
    private String readln;

    /**
     * Method for reading keyboard.
     * @return readln is a string with the characters typed.
     */
    public String reading()
    {
        readln = readline.nextLine();

        return readln;
    }
}