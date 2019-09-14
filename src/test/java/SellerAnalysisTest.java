import org.junit.Test;

import static org.junit.Assert.*;

public class SellerAnalysisTest {

    @Test
    public void addAndCount() {
        //GIVEN
        SellerAnalysis seller = new SellerAnalysis();

        String testSeller1 = "001ç1234567891234çPedroç50000";
        String testSeller2 = "001ç3245678865434çPauloç40000.99";


        //WHEN
        seller.add(testSeller1);
        seller.add(testSeller2);


        //THEN
        assertEquals(2, seller.count());
    }

    @Test
    public void clearAndCount() {
        //GIVEN
        SellerAnalysis seller = new SellerAnalysis();

        String testSeller1 = "001ç1234567891234çPedroç50000";
        String testSeller2 = "001ç3245678865434çPauloç40000.99";


        //WHEN
        seller.add(testSeller1);
        seller.add(testSeller2);

        seller.clear();


        //THEN
        assertEquals(0, seller.count());
    }
}