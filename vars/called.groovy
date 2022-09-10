import NCD.NcdBuild;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def resource = NcdBuild.getResources(script)
        println(resource)
        sh " ls ${NcdBuild.loc()}/ansible/Folder"
        println(loc)
    }
}
