import NCD.NCD_Builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def resource = NCD_Builder.getResources(script)
        println(resource)
        NCD_Builder.uri = "ansible"
        def loc = NCD_Builder.loc()
        println(loc)
    }
}
