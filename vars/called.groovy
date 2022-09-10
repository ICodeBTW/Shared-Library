import com.company.build.Builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        Builder instance = Builder.getInstance();
        instance.echo()

    }
}
