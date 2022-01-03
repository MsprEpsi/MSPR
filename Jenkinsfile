pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing..'
      }
    }

    stage('Deploying') {
      steps {
        echo 'Deploying..'
      }
    }

    stage('html') {
      steps {
        git(url: 'git@github.com:MsprEpsi/MSPR.git', branch: 'main')
      }
    }

  }
}