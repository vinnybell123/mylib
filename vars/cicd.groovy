def Download(repo)
{
git "${repo}"
}
def build()
{
  sh 'mvn package'
}
def deploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: '2a9c8782-4838-42ff-bbdd-4d8facd689ca', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
def testing(pathname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${pathname}/testing.jar"
}
