package com.company.build


class builder {

    static builder instance = null;

    public static def getInstance(){
        if(!instance) {
            instance = builder();
        }
        return instance
    }

    def echo(){
        sh "Hello world!"
    }

}