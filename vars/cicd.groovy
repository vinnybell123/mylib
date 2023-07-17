def Download(repo)
{
git "${repo}"
}
def build()
{
  sh 'mvn package'
}
