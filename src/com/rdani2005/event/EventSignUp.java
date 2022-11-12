package com.rdani2005.event;

import java.awt.Frame;

public interface EventSignUp {
    public void SignUp(String name, String username, String email, String password);
    
    public void logOut(Frame f);
}
