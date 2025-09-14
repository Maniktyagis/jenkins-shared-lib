def call(){
  echo "Deploying Application"
  sh "docker compose up -d"
}
