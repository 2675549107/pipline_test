pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'git remote add branch2 pipline_test2'
                bat 'git fetch branch2'
                bat 'git merge branch2/master'
                bat 'git push branch2 master'
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