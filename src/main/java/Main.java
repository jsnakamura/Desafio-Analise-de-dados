/*
 * @author Juliano Nakamura
 *
 * @Version 1.0 11/09/2019
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Print printer = new Print();

        DirectoryWatch folderWatcher = new DirectoryWatch();

        FileReading readFolder = new FileReading();

        FileWriting writeDocument = new FileWriting();

        Analysis dataAnalyser = new Analysis();

        ArrayList<String> data = new ArrayList<>();

        int numberClients;
        int numberSellers;
        String idSale;


        do
        {
            data.clear();


            data = readFolder.getData();

            dataAnalyser.resetData(data);


            numberSellers = dataAnalyser.quantitySellers();

            numberClients = dataAnalyser.quantityClients();

            idSale = dataAnalyser.mostExpensiveSale();


            writeDocument.writeFile(numberSellers, numberClients, idSale);


            printer.printing("Monitoring folder 'Data/In' for changes...\n");

        }while(folderWatcher.startWatching());

        printer.printing("exit!");

    }
}