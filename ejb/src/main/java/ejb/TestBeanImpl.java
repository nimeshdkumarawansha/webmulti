package ejb;

import core.TestBean;
import jakarta.ejb.Stateless;

@Stateless
public class TestBeanImpl implements TestBean {
    public TestBeanImpl() {
        System.out.println("TestBeanImpl()");
    }

    @Override
    public void test() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Test");
    }
}
