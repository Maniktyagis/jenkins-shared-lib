def call(String imageName,String imageTag){
  echo "This is building stage...."
  sh "whoami"
  sh "docker build -t ${imageName}:${imageTag} ."
  echo "Building done!"
}
