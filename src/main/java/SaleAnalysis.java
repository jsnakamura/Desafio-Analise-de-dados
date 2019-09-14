import java.util.ArrayList;

/**
 * Class for the analysis of the sales
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class SaleAnalysis extends Identity {

    /** ArrayList with the data of sales*/
    private ArrayList<String> dataSale = new ArrayList<>();

    /** String with the most expensive sale */
    private String idBiggestSale;

    /** Float number with the value of the most expensive sale */
    private float saleValue = 0;


    /**
     * Method to add a new sale in the data.
     * @param data is the string to add in the data.
     */
    public void add(String data) {
        dataSale.add(data);
    }

    /**
     * Method to clear all the sales data.
     */
    public void clear() {
        dataSale.clear();
    }

    /**
     * Method to count the number os sales stored.
     * @return number of sales.
     */
    public int count() { return dataSale.size(); }

    /**
     * Method to analyse all the sales and find the most expensive.
     * @return string with the id of the most expensive sale.
     */
    public String analyseSale() {

        String idSale;
        String itens;
        String[] itensAndValues;

        String[] splitter;

        float itensValues;

        for( String data : dataSale) {

            splitter = data.split("ç");

            idSale = splitter[1];

            itens = splitter[2];
            itens = itens.replace("[", "").replace("]", "");

            itensAndValues = itens.split(",");

            itensValues = getItensValue(itensAndValues);


            if(itensValues > saleValue) {
                idBiggestSale = idSale;
                saleValue = itensValues;
            }
        }



        return dataSale.isEmpty() ? "There are no Sales!" : idBiggestSale;
    }

    /**
     * Method to get the sum of the itens in a sale.
     * @param itensAndValues is an array with all the itens and their values in a sale.
     * @return totalValue is the sum of all the itens values.
     */
    public float getItensValue(String[] itensAndValues) {

        String[] eachItens;

        int quantity;
        float itemPrice;
        float totalValue = 0;

        for (String venda : itensAndValues) {

            eachItens = venda.split("-");

            quantity = Integer.parseInt(eachItens[1]);
            itemPrice = Float.parseFloat(eachItens[2]);

            totalValue += quantity*itemPrice;
        }

        return totalValue;
    }
}