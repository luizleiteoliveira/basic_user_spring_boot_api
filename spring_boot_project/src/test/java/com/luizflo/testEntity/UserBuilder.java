package com.luizflo.testEntity;

import com.luizflo.Entity.User;

/**
 * Created by luizoliveira on 15/07/17.
 */
public class UserBuilder {

    private final User user;
    private UserBuilder() {
        user = new User();
    }
    private static UserBuilder user() {
        return new UserBuilder();
    }

    public UserBuilder withEmail(String email) {
        user.setEmail(email);
        return this;
    }

    public UserBuilder withName(String email) {
        user.setEmail(email);
        return this;
    }

}