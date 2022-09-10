
def call(Script script) {
    println('Hello world!')
    script.stage('new Stage') {

        import com.company.build.SpecialBuilder;
        def instance = SpecialBuilder.getInstance(script);
        instance.echo()
      
        
    }
}
