node {
  echo "My branch is: ${env}"
    echo "My branch is: ${env.BRANCH_NAME}"
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
    	stage("Archive"){
    		archiveArtifacts artifacts: 'app/build/outputs/apk/*.apk'
    	}
}