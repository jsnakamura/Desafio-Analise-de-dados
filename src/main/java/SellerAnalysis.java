import java.util.ArrayList;

/**
 * Class for the analysis of the sellers
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class SellerAnalysis extends Identity {

    private ArrayList<String> dataSeller = new ArrayList<>();

    public void add(String data) {
        dataSeller.add(data);
    }

    public void clear() {
        dataSeller.clear();
    }

    public int analyseSeller() {
        return dataSeller.size();
    }
}
