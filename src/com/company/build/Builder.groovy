package com.company.build;

public class SpecialBuilder{

    static SpecialBuilder instance = null;
    private Script script = null;
    public SpecialBuilder(Script script){
        this.script = script;
    }
    public static getInstance(Script script){
        if(!instance) {
            instance = SpecialBuilder(script);
        }
        return instance
    }

    def echo(){
        sh "Hello world!"
    }

}