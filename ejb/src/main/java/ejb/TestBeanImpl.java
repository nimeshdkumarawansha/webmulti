package ejb;

import core.TestBean;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;

@Stateless
public class TestBeanImpl implements TestBean {
    @PostConstruct
    public void m() {
        System.out.println("TestBeanImpl()");
    }

    @Override
    public void test() {
        System.out.println("Test");
    }
    @PreDestroy
    public void m1() {
        System.out.println("preDestroy...");
    }
}
