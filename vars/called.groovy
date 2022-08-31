import NCD.NCD_Builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def number = NCD_Builder.getMethod()
        echo number
    }
}
