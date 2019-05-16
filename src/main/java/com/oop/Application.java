package com.oop;

import com.oop.phone.AbstractPhone;
import com.oop.phone.Smartphone;
import com.oop.phone.ThomasEdisonPhone;
import com.oop.phone.VideoPhone;

public class Application {

    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone smartphone = new Smartphone(2010, 5, "symbian os");
        AbstractPhone videoPhone = new VideoPhone(2019);

        User user = new User("Andrew");
        user.callAnotherUser(216084, firstPhone);

        user.callAnotherUser(216084, smartphone);

        user.callAnotherUser(216084, videoPhone);
    }
}
