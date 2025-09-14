def call(String imageName,String imageTag,String dockerDubName){
  echo "This is building stage...."
  sh "whoami"
  sh "docker build -t ${dockerHubName}/${imageName}:${imageTag} ."
  echo "Building done!"
}
