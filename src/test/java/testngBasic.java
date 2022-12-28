import org.testng.Assert;
import org.testng.annotations.Test;

public class testngBasic {

    @Test
    public void test1(){

        System.out.println("Hello world1");
    }

    @Test(enabled=false)
    public void test2(){

        System.out.println("Hello world2");
    }
    @Test
    public void test3(){

        String s="Hello world3";

        Assert.assertEquals(s,"Hello world3");
        System.out.println("passed");
    }
}
