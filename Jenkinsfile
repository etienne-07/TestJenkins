node {
	    stage('Checkout'){
	    	checkout scm
	    }
        stage('Build') {
            sh "./gradlew clean"
            sh "./gradlew assembleRelease"
        }
        stage('Test') {
            sh "./gradlew testFullReleaseUnitTest"
        }
    
}