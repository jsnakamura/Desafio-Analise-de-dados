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
    private String dataType;

    private ClientAnalysis clients = new ClientAnalysis();
    private SellerAnalysis sellers = new SellerAnalysis();
    private SaleAnalysis sales = new SaleAnalysis();

    /**
     * Reseter of the data in case of chenge
     *
     * @param dataEntry Data received for analysis
     */
    public void resetData(ArrayList<String> dataEntry) {
        this.dataEntry = dataEntry;

        clients.clear();
        sellers.clear();
        sales.clear();

        //ISSO EU NÃO SEI SE FUNCIONA AINDA
        analyse();
    }



    public void analyse() {

        // AQUI TEM QUE CUIDAR SE O INDICE DA SUBSTRING TA CERTO!!!!!
        for(String data : dataEntry) {
             dataType = data.substring(0,3);

             switch(dataType) {
                 case "001":
                     clients.add(data);
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

    public int quantityClients() {
        return clients.analyseClient();
    }

    public int quantitySellers() {
        return sellers.analyseSeller();
    }

    public String mostExpensiveSale() {
        return sales.analyseSale();
    }
}