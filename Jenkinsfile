pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'git remote add branch1 https://github.com/2675549107/pipline_test2.git'
                bat 'git fetch branch1'
                bat 'git merge branch1/master'
                bat 'git push branch1 master'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
	junit '**/target/surefire-reports/TEST-pipline_test.MyUtilsTest.xml'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}