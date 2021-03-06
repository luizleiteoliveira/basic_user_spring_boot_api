package com.luizflo.testEntity;

import com.luizflo.Entity.User;

public class UserBuilder {

    private final User user;
    private UserBuilder() {
        user = new User();
    }
    public static UserBuilder user() {
        return new UserBuilder();
    }

    public UserBuilder withEmail(String email) {
        user.setEmail(email);
        return this;
    }

    public UserBuilder withName(String email) {
        user.setName(email);
        return this;
    }

    public UserBuilder withPassword(String password) {
        user.setPassword(password);
        return this;
    }

    public User build() {
        return user;
    }

}
