import com.company.build.builder;

def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {
        builder instance = builder.getInstance();
        instance.echo()

    }
}
