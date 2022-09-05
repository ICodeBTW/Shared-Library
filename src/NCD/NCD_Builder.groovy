package NCD
import groovy.transform.SourceURI
import java.nio.file.Path
import java.nio.file.Paths

class NCD_Builder {

    static int works = 604
    @SourceURI
    public static URI uri;


    public static void main(String[] args) {
        println('Hello ')
    }

    public static getMethod() {
        return works
    }

    public static String getResources(Script script) {
        String string = script.libraryResource 'text.txt'
        string = hello()
        return string
    }

    private String hello(){
        return 'Hello'
    }


    public static def loc() {
        Path scriptLocation = Paths.get(NCD_Builder.uri)
        return scriptLocation.getParent().getParent().resolve('resources').toString()
    }
 

}
