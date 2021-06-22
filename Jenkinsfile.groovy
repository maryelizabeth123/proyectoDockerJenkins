node {
  try {
    stage('checkout') {
      checkout scm
    }
    stage('prepare') {
      sh "git clean -fdx"
    }
    stage('compile') {
      echo "Nada que compilar"
    }
    
    stage('package') {
      sh "tar -cvzf holamundo.tar.gz holamundo.sh"
    }
    stage('publish') {
      echo "actualizar paquete..."
    }
  } finally {
    stage('cleanup') {
      echo "haciendo limpieza..."
    }
  }
}
