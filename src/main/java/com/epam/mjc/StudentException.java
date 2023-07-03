package com.epam.mjc;

public class StudentException extends IllegalArgumentException{

    public StudentException(String s){
        super(s);
    }

    public StudentException(String s, Throwable t){
        super(s, t);
    }
}
