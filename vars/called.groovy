import NCD.NCD_Builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def resource = NCD_Builder.getResources(script)
        println(resource)
        sh "${NCD_Builder.loc()}/ansible/Folder"
        println(loc)
    }
}
