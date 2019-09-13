import java.util.ArrayList;

/**
 * Class for the analysis of the sales
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class SaleAnalysis extends Identity {

    private Print printer = new Print();

    private ArrayList<String> dataSale = new ArrayList<>();


    private String idBiggestSale;
    private float saleValue = 0;


    public void add(String data) {
        dataSale.add(data);
    }

    public void clear() {
        dataSale.clear();
    }

    public int count() { return dataSale.size(); }


    public String analyseSale() {

        //String idType;
        String idSale;
        String itens;
        //String salesman;
        String[] itensAndValues;

        String[] splitter;

        float itensValues;

        for( String data : dataSale) {

            splitter = data.split("ç");

            //idType = splitter[0];
            idSale = splitter[1];
            itens = splitter[2];
            //salesman = splitter[3];

            itens = itens.replace("[", "").replace("]", "");

            itensAndValues = itens.split(",");

            itensValues = getItensValue(itensAndValues);


            if(itensValues > saleValue) {
                idBiggestSale = idSale;
                saleValue = itensValues;
            }
        }

        return idBiggestSale;
    }

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
