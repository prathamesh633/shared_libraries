def call(String GitUrl, String GitBranch){
  sh "sudo yum install git -y"
  git url: "${GitUrl}", branch: "${GitBranch}"
}
