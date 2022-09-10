package com.company.build;

public class SpecialBuilder{

    static SpecialBuilder instance = null;
    private Script script = null;
    public SpecialBuilder(script){
        this.script = script;
    }
    public static getInstance(script){
        if(!instance) {
            instance = SpecialBuilder(script);
        }
        return instance
    }

    def echo(){
        sh "Hello world!"
    }

}