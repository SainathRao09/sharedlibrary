def gitdownload(repo){
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def buildartifacts(){
  sh "mvn package"
}

def depolyment(foldername, IP, filename){
  sh "scp /var/lib/jenkins/workspace/${foldername}/webapp/target/webapp.war ubuntu@${IP}:/var/lib/tomcat10/webapps/${filename}.war"
}

def Tesing(foldername){
  sh "java -jar /var/lib/jenkins/workspace/${foldername}/testing.jar"
}
