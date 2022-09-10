package com.company


public class Builder{

    static Builder instance = null;

    public static getInstance(){
        if(!instance) {
            instance = Builder();
        }
        return instance
    }

    def echo(){
        sh "Hello world!"
    }

}