package com.company


public class Builder{

    static Builder instance = null;
    private Script script = null;
    public Builder(Script script){
        this.script = script;
    }
    public static getInstance(Script script){
        if(!instance) {
            instance = Builder(script);
        }
        return instance
    }

    def echo(){
        sh "Hello world!"
    }

}