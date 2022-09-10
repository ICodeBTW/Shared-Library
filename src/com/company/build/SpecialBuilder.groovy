package com.company.build;

public class SpecialBuilder{

    static SpecialBuilder instance = null;
    private Script script = null;

    public SpecialBuilder(script){
        this.script = script;
    }

 

    public static getInstance(script){
        println("Here")
        if(!instance) {
            instance = new SpecialBuilder(script);
        }
        return instance
    }
 

    def echo(){
        this.script.sh """echo 'Hello world!'"""
    }

}