def call(CredentialsId){

    withSonarQubeEnv( CredentialsId : CredentialsId){
        sh ' mvn clean package sonar:sonar'
    }


}