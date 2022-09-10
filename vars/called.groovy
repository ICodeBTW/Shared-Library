import com.company.Builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        def instance = Builder.getInstance(script);
        instance.echo()

    }
}
