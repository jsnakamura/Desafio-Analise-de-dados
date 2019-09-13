import java.util.ArrayList;

/**
 * Class for the analysis of the sellers
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class SellerAnalysis extends Identity {

    /** ArrayList with all the data of the sellers */
    private ArrayList<String> dataSeller = new ArrayList<>();

    /**
     * Method to add a new seller in the data.
     * @param data is a stirng with the seller information.
     */
    public void add(String data) {
        dataSeller.add(data);
    }

    /**
     * Method to clear all the seller data.
     */
    public void clear() {
        dataSeller.clear();
    }

    /**
     * Method to count the number os sellers in the data.
     * @return the number of sellers.
     */
    public int count() { return dataSeller.size(); }
}
