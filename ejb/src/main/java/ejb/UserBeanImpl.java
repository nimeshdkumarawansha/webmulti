package ejb;

import core.UserBean;
import jakarta.ejb.Stateless;

@Stateless
public class UserBeanImpl implements UserBean {
    public String getDetails() {
        return "This is getDetails() method";
    }
}
