import NCD.NCD_Builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def resource = NCD_Builder.getResources()
        println(resource)
    }
}
