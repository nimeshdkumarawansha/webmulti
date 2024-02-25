package ejb;

import core.UserBean;
import jakarta.ejb.Stateless;

@Stateless(name = "UserBean")
public class UserBeanImpl implements UserBean {
    public UserBeanImpl() {
        System.out.println("UserBeanImpl()");
    }

    public String getDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "This is getDetails() method";
    }
}
