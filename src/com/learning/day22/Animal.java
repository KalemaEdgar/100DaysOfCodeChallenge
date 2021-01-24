package com.learning.day22;

// An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
// Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
// Methods in an interface are implicitly public.
public interface Animal {
    public void eat();
    public void travel();
}