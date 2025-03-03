import org.example.Bai1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Bai1Test {
    Bai1 bai1 = new Bai1();
    @Test
    public void testBai31(){
        int exp = 650;
        int act = bai1.tinhTong();
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testBai1(){
        int exp = 650;
        int act =  bai1.tinhTong();;
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testBai2(){
        int exp = 650;
        int act = bai1.tinhTong();
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testBai11(){
        int exp = 650;
        int act = bai1.tinhTong();
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testBai14(){
        int exp = 650;
        int act = bai1.tinhTong();
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testBai13(){
        int exp = 650;
        int act = bai1.tinhTong();
        Assertions.assertEquals(exp, act);
    }
}
