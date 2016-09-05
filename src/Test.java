/**
 * Created by Vu Tung on 9/5/2016.
 */
import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void test() {
        Hello hello = new Hello();
        int mang[] = {1,2,3,4,5,6};
        int tong = hello.tongSoChan(mang);
        assertEquals(12, tong);
    }

    @org.junit.Test
    public void test2() {
        Hello hello = new Hello();
        int mang[] = {1,-2,3,16,5,6};
        int tong = hello.tongSoChan(mang);
        assertEquals(20, tong);
    }
    @org.junit.Test
    public void test3() {
        Hello hello = new Hello();
        int mang[] = {1,3,5};
        int tong = hello.tongSoChan(mang);
        assertEquals(0, tong);
    }

    @org.junit.Test
    public void test4() {
        Hello hello = new Hello();
        int mang[] = {1,3,5,-12,-6};
        int tong = hello.tongSoChan(mang);
        assertEquals(-18, tong);
    }

}