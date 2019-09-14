import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnalysisTest {

    @Test
    public void quantitySellers() {
        //GIVEN
        Analysis dataAnalyser = new Analysis();

        String testSeller1 = "001ç1234567891234çPedroç50000";
        String testSeller2 = "001ç3245678865434çPauloç40000.99";

        ArrayList<String> testData = new ArrayList<>();


        //WHEN
        testData.add(testSeller1);
        testData.add(testSeller2);

        dataAnalyser.resetData(testData);


        //THEN
        assertEquals(2, dataAnalyser.quantitySellers());
    }

    @Test
    public void quantityClients() {
        //GIVEN
        Analysis dataAnalyser = new Analysis();

        String testClient1 = "002ç2345675434544345çJose da SilvaçRural";
        String testClient2 = "002ç2345675433444345çEduardo PereiraçRural";

        ArrayList<String> testData = new ArrayList<>();


        //WHEN
        testData.add(testClient1);
        testData.add(testClient2);

        dataAnalyser.resetData(testData);


        //THEN
        assertEquals(2, dataAnalyser.quantityClients());
    }

    @Test
    public void mostExpensiveSale() {
        //GIVEN
        Analysis dataAnalyser = new Analysis();

        String testSale1 = "003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro";
        String testSale2 = "003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo";

        ArrayList<String> testData = new ArrayList<>();


        //WHEN
        testData.add(testSale1);
        testData.add(testSale2);

        dataAnalyser.resetData(testData);


        //THEN
        assertEquals("10", dataAnalyser.mostExpensiveSale());

    }
}