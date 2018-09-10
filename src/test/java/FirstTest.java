import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void FirstTestTask(){
        Assert.assertEquals(2+2, 4, "Math addition operation failed");
    }
}
