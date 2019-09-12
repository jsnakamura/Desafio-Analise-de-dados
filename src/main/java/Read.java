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

    public String reader()
    {
        readln = readline.nextLine();

        return readln;
    }
}