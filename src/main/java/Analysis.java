import java.util.ArrayList;

/**
 * Class for analising the Data entry
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class Analysis {

    /** Object used to print information in the console */
    Print printer = new Print();

    /** ArrayList with the entry data */
    private ArrayList<String> dataEntry = new ArrayList<>();

    /** Object with clients informations */
    private ClientAnalysis clients = new ClientAnalysis();

    /** Object with sellers informations */
    private SellerAnalysis sellers = new SellerAnalysis();

    /** Object with sales information */
    private SaleAnalysis sales = new SaleAnalysis();


    /**
     * Reset the data in case of some change in the data and initialization of the data.
     *
     * @param dataEntry is the data received for analysis.
     */
    public void resetData(ArrayList<String> dataEntry) {

        sellers.clear();
        clients.clear();
        sales.clear();

        this.dataEntry = dataEntry;

        analyse();
    }


    /**
     * Method to separete the data in seller, client and sale type.
     */
    public void analyse() {

        String dataType;

        for(String data : dataEntry) {

             dataType = data.substring(0,3);

             switch(dataType) {
                 case "001":
                     sellers.add(data);
                     break;

                 case "002":
                     clients.add(data);
                     break;

                 case "003":
                     sales.add(data);
                     break;

                 default:
                     printer.printing(dataType);
                     break;
             }
        }
    }

    /**
     * Method to know the number of sellers in the object "sellers".
     * @return number of sellers.
     */
    public int quantitySellers() {
        return sellers.count();
    }

    /**
     * Method to know the number of clients in the object "clients".
     * @return number os clients.
     */
    public int quantityClients() {
        return clients.count();
    }

    /**
     * Method to know the id of the most expensive sale of all the data.
     * @return string with the id of the most expensive sale.
     */
    public String mostExpensiveSale() {
        return sales.analyseSale();
    }
}