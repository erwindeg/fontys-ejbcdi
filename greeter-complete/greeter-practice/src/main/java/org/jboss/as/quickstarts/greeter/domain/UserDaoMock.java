package org.jboss.as.quickstarts.greeter.domain;

/**
 * Created by Erwin on 09/02/2017.
 */
public class UserDaoMock implements UserDao {
    @Override
    public User getForUsername(String username) {
        return new User();
    }

    @Override
    public void createUser(User user) {

    }
}
