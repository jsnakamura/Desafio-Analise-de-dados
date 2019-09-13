import java.util.ArrayList;

/**
 * Class for the analysis of the clients
 *
 * @Version 1.0 11/09/2019
 *
 * @Author Juliano Nakamura
 */
public class ClientAnalysis extends Identity {

    /** ArrayList with all the data of clients */
    private ArrayList<String> dataClient = new ArrayList<>();

    /**
     * Method to add a new client in the data.
     * @param data is a string with the client information.
     */
    public void add(String data) {
        dataClient.add(data);
    }

    /**
     * Method to clear all the clients data.
     */
    public void clear() {
        dataClient.clear();
    }

    /**
     * Method to count the number os clients in the data.
     * @return the number of clients.
     */
    public int count() { return dataClient.size(); }
}
