package com.company.build;

public class SpecialBuilder{

    static SpecialBuilder instance = null;
    private Script script = null;

    // public SpecialBuilder(script){
    //     this.script = script;
    // }

    public SpecialBuilder(){}

    // public static getInstance(script){
    //     println("Here")
    //     if(!instance) {
    //         instance = SpecialBuilder(script);
    //     }
    //     return instance
    // }
    public static getInstance(){
        println("Here")
        if(!instance) {
            instance = SpecialBuilder();
        }
        return instance
    }

    def echo(){
        sh "Hello world!"
    }

}