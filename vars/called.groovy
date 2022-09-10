import com.company.build.Builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def instance = Builder.getInstance();
        instance.echo()

    }
}
