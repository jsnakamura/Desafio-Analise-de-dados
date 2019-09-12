import java.util.ArrayList;

/**
 * Class for the analysis of the clients
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class ClientAnalysis extends Identity {

    private ArrayList<String> dataClient = new ArrayList<>();

    public void add(String data) {
        dataClient.add(data);
    }

    public void clear() {
        dataClient.clear();
    }

    public int analyseClient() {
        return dataClient.size();
    }
}