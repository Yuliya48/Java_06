import org.testng.Assert;
import org.testng.annotations.Test;
public class UtilsTest {

    @Test
    public void testSum() {
        Assert.assertEquals(Method.sum(2,4), 6);

    }


    @Test
    public void testAbbr() {
        Assert.assertEquals(Method.abbr("1234567890", 11), "1234567890");

    }




}




