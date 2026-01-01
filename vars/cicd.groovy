def gitdownload(repo){
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def buildartifacts(){
  sh "mvn package"
}
