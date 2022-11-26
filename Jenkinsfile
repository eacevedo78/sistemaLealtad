pipeline {

    agent any
    
    stages {

        stage('Build') {
            steps {
                echo 'Build'
                sh "mvn clean install" 
            }
        }

        stage('Testing') {
            steps {
                echo 'Ejecutando Pruebas'
                sh "mvn test"
            }
        }
    }
}
