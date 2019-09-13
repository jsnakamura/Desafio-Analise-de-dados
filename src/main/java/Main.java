/*
 * @author Juliano Nakamura
 *
 * @Version 1.0 11/09/2019
 */

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Print printer = new Print();


        String testClient1 = "001ç1234567891234çPedroç50000";
        String testClient2 = "001ç3245678865434çPauloç40000.99";

        String testSeller1 = "002ç2345675434544345çJose da SilvaçRural";
        String testSeller2 = "002ç2345675433444345çEduardo PereiraçRural";

        String testSale1 = "003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro";
        String testSale2 = "003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo";

        ArrayList<String> testData = new ArrayList<>();



        //TESTE CLIENTE

//        ClientAnalysis clients = new ClientAnalysis();
//        int value;
//
//        clients.add(testClient1);
//        clients.add(testClient2);
//
//        value = clients.count();
//
//        System.out.println("Numero de clientes: ");
//        System.out.println(value);
//
//        clients.clear();
//
//        System.out.println();
//        System.out.println("tem que ser 0: ");
//        value = clients.count();
//
//        System.out.println(value);
//        System.out.println();
//        System.out.println("--------------");
//
//
//
//
//        //TESTE SELLER
//
//        SellerAnalysis sellers = new SellerAnalysis();
//        int valueSeller;
//
//        sellers.add(testSeller1);
//        sellers.add(testSeller2);
//
//        valueSeller = sellers.count();
//
//        System.out.println("Numero de vendedores: ");
//        System.out.println(valueSeller);
//
//        sellers.clear();
//
//        System.out.println();
//        System.out.println("tem que ser 0: ");
//        valueSeller = sellers.count();
//
//        System.out.println(valueSeller);
//        System.out.println();
//        System.out.println("--------------");




        //TESTE SALES

//        SaleAnalysis sales = new SaleAnalysis();
//        int valueSale;
//
//        sales.add(testSale2);
//        sales.add(testSale1);
//
//        valueSale = sales.count();
//
//        printer.printing("Teste sales.count(): ");
//        System.out.println(valueSale);
//
//
//
//        printer.printing("Teste sales.analyseSale: ");
//
//        sales.analyseSale();
//
//        sales.clear();
//
//        printer.printing("");
//        printer.printing("Teste sales.clear(): ");
//        valueSale = sales.count();
//
//        System.out.println(valueSale);
//        printer.printing("");
//        printer.printing("--------------");


        // TESTE ANALYSIS

//        Analysis dataAnalyser = new Analysis();
//
//        String val;
//
//        testData.add(testClient1);
//        testData.add(testClient2);
//        testData.add(testSeller1);
//        testData.add(testSeller2);
//        testData.add(testSale1);
//        testData.add(testSale2);
//
//        dataAnalyser.resetData(testData);
//
//        printer.printing("");
//        printer.printing(dataAnalyser.quantitySellers());
//
//        printer.printing("");
//        printer.printing(dataAnalyser.quantityClients());


//        testData.add(testClient2);
//
//        dataAnalyser.resetData(testData);
//        printer.printing("");
//        printer.printing(dataAnalyser.quantitySellers());
//
//        printer.printing("");
//        printer.printing(dataAnalyser.quantityClients());
//        printer.printing("");

//        val = dataAnalyser.mostExpensiveSale();
//
//        printer.printing(val);






        FileReading readFile = new FileReading();

        ArrayList<String> text;
        String val;

        text = readFile.getData();

        Analysis dataAnalyser = new Analysis();
        dataAnalyser.resetData(text);

        printer.printing(dataAnalyser.quantityClients());

        printer.printing("");
        printer.printing(dataAnalyser.quantitySellers());


        val = dataAnalyser.mostExpensiveSale();

        printer.printing(val);


        // TESTE WRINTING FILE

//        FileWriting fileWriter = new FileWriting();
//
//        fileWriter.writeFile(2, 3, "001");



        /*

        1 Inicia lendo Data/In

        2 analisa informações

        3 escreve no Data/Out

        4 se modificar Data/In
            volta pra 1
          else
            wait

         */


        //opcional

        printer.printing("Type the path to the folder:");

        while(true)
        {





        }





    }
}