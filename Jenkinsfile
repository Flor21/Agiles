pipeline{
  agent{
    docker{
      image 'maven 2.3 alpine'
      args '-v /root/.m2:/root/.m2'
    }
  }
      stages{
        stage('Buil'){
          steps{
            sh 'mvn -B clean package'
          }
        }
      }
}
