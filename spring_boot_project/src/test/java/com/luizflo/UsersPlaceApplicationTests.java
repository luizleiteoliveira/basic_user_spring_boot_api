package com.luizflo;

import com.luizflo.Entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.luizflo.testEntity.UserBuilder.user;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersPlaceApplicationTests {

    @Test
    public void firstTest() {
        User user = user()
                        .withEmail("email@fromUser.com")
                        .withName("name so cool")
                        .build();
        Assert.assertEquals("name.so.cool", user.getUsername());

    }

    @Test
    public void ucodeMustBeDifferentForEachUser() {
        User user = user()
                        .withName("not so hard")
                        .withEmail("email@fromUser.com")
                        .build();
        User user2 = user()
                        .withEmail("email@fromUser2.com")
                        .withName("not so hard")
                        .build();
        Assert.assertNotEquals(user.hashCode(), user2.hashCode());
    }

    @Test
    public void checkSizePassword() {
        User user = user()
                        .withName("not so hard")
                        .withEmail("email@fromUser.com")
                        .withPassword("notpassword")
                        .build();
        Assert.assertEquals(60, user.getPassword().length());
        Assert.assertNotEquals("notpassword",user.getPassword());

    }
}
