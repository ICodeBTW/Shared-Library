import NCD.NCD_Builder.*;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        NCD_Builder ncd = new NCD_Builder()
        ncd.getMethod()
    }
}
