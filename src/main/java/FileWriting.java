import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class for file wrinting
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class FileWriting {

    /**
     * Method to write a file with the number of clients, the number of sellers and the id of the most expensive sale.
     * @param sellerCount int with the number of sellers.
     * @param clientCount int with the number of clients.
     * @param biggestSale string with the id of the biggest sale.
     */
    public void writeFile(int sellerCount, int clientCount, String biggestSale) {

        String path = "E:\\Projects\\Desafio-Analise-de-dados\\Data\\Out\\Results.txt";


        try {
            FileWriter file = new FileWriter(path);
            PrintWriter printFile = new PrintWriter(file);

            printFile.printf("-----Result-----%n");
            printFile.printf("%n");
            printFile.printf("Number of clients: %d %n", clientCount);
            printFile.printf("%n");
            printFile.printf("Number of sellers: %d %n", sellerCount);
            printFile.printf("%n");
            printFile.printf("Id of the most expensive Sale: %s %n", biggestSale);


            file.close();

        }catch (IOException e)
        {
            System.err.printf("Failed writing file", e.getMessage());
        }

    }



}
