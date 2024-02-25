package ejb;

import core.UserBean;
import jakarta.ejb.Stateless;

@Stateless
public class AdminBeanImpl implements UserBean {

    @Override
    public String getDetails() {
        return "This is  Admin details";
    }
}
