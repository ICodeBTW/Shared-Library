import NCD.NcdBuild;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def resource = NcdBuild.getResources(script)
        println(resource)
        sh " ls ${NCD_Builder.loc()}/ansible/Folder"
        println(loc)
    }
}
