import com.company.build.SpecialBuilder

def call(Script script) {
    node('any',  {
        println('Hello world!')
        script.stage('new Stage') {
            def instance = SpecialBuilder.getInstance(script)
            instance.echo()
        }
    } )
}
