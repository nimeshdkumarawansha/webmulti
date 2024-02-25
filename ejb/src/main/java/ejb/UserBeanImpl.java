package ejb;

import core.UserBean;
import jakarta.ejb.Stateless;

@Stateless(name = "UserBean")
public class UserBeanImpl implements UserBean {
    public UserBeanImpl() {
        System.out.println("UserBeanImpl()");
    }

    public String getDetails() {
        return "This is getDetails() method";
    }
}
