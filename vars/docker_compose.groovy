def call() {
  sh "sudo docker-compose down && sudo docker-compose up -d"
}
