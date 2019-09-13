import java.util.ArrayList;

/**
 * Class for analising the Data entry
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class Analysis {

    private ArrayList<String> dataEntry = new ArrayList<>();
    Print printer = new Print();


    private ClientAnalysis clients = new ClientAnalysis();
    private SellerAnalysis sellers = new SellerAnalysis();
    private SaleAnalysis sales = new SaleAnalysis();

    /**
     * Reseter of the data in case of change
     *
     * @param dataEntry Data received for analysis
     */
    public void resetData(ArrayList<String> dataEntry) {

        clients.clear();
        sellers.clear();
        sales.clear();

        this.dataEntry = dataEntry;

        analyse();
    }


    /**
     *
     */
    public void analyse() {

        String[] dataSplit;
        String dataType;


        for(String data : dataEntry) {
             dataSplit = data.split("ç");
             dataType = data.substring(0,4);

             printer.printing(dataType);

             if (dataType.compareTo("001") == 0)
                 printer.printing("ok!");

             switch(dataType) {
                 case "001":
                     clients.add(data);
                     printer.printing("ok");
                     break;

                 case "002":
                     sellers.add(data);
                     break;

                 case "003":
                     sales.add(data);
                     break;
             }
        }
    }

    /**
     *
     * @return
     */
    public int quantityClients() {
        return clients.count();
    }

    /**
     *
     * @return
     */
    public int quantitySellers() {
        return sellers.count();
    }

    /**
     *
     * @return
     */
    public String mostExpensiveSale() {
        return sales.analyseSale();
    }
}