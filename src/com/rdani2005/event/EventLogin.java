package com.rdani2005.event;

import java.awt.Frame;

public interface EventLogin {

    public void loginDone(String username, String password);

    public void logOut(Frame f);
}
