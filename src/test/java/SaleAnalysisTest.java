import org.junit.Test;

import static org.junit.Assert.*;

public class SaleAnalysisTest {

    @Test
    public void addAndCount() {
        //GIVEN
        SaleAnalysis sale = new SaleAnalysis();

        String testSale1 = "003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro";
        String testSale2 = "003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo";


        //WHEN
        sale.add(testSale1);
        sale.add(testSale2);


        //THEN
        assertEquals(2, sale.count());
    }

    @Test
    public void clearAndCount() {
        //GIVEN
        SaleAnalysis sale = new SaleAnalysis();

        String testSale1 = "003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro";
        String testSale2 = "003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo";


        //WHEN
        sale.add(testSale1);
        sale.add(testSale2);

        sale.clear();


        //THEN
        assertEquals(0, sale.count());
    }

    @Test
    public void getItensValue() {
        //GIVEN
        SaleAnalysis sale = new SaleAnalysis();

        String itensAndValuesConcat = "1-10-100,2-30-2.50,3-40-3.10";


        //WHEN
        String[] eachItensAndValues = itensAndValuesConcat.split(",");


        //THEN
        assertEquals(1199.0, sale.getItensValue(eachItensAndValues), 0.000f);
    }

    @Test
    public void analyseSale() {
        //GIVEN
        SaleAnalysis sale = new SaleAnalysis();

        String testSale1 = "003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro";
        String testSale2 = "003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo";


        //WHEN
        sale.add(testSale1);
        sale.add(testSale2);


        //THEN
        assertEquals("10", sale.analyseSale());
    }
}