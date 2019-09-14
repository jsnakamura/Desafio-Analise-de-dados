import org.junit.Test;

import static org.junit.Assert.*;

public class ClientAnalysisTest {

    @Test
    public void addAndCount() {
        //GIVEN
        ClientAnalysis client = new ClientAnalysis();

        String testClient1 = "002ç2345675434544345çJose da SilvaçRural";
        String testClient2 = "002ç2345675433444345çEduardo PereiraçRural";


        //WHEN
        client.add(testClient1);
        client.add(testClient2);

        //THEN
        assertEquals(2, client.count());
    }

    @Test
    public void clearAndCount() {
        //GIVEN
        ClientAnalysis client = new ClientAnalysis();

        String testClient1 = "002ç2345675434544345çJose da SilvaçRural";
        String testClient2 = "002ç2345675433444345çEduardo PereiraçRural";


        //WHEN
        client.add(testClient1);
        client.add(testClient2);
        client.clear();

        //THEN
        assertEquals(0, client.count());
    }
}