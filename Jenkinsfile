node {
    stage('Checkout'){
    	deleteDir()
    	checkout scm
    }
    stage('Test') {
        sh "./gradlew testFullReleaseUnitTest"
    }
    stage('Build') {
        sh "./gradlew assembleRelease"
    }
	stage("Archive"){
		archiveArtifacts artifacts: 'app/build/outputs/apk/*.apk'
	}
	stage("Clean"){
		deleteDir()
	}
}