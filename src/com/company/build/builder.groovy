package com.company.build


public class builder {

    static builder instance = null;

    public static getInstance(){
        if(!instance) {
            instance = builder();
        }
        return instance
    }

    def echo(){
        sh "Hello world!"
    }

}