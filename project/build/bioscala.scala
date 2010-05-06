
import sbt._

class BioScalaProject(info: ProjectInfo) extends DefaultProject(info)
{
  override def unmanagedClasspath = super.unmanagedClasspath +++ ("lib" / "scala" / "biojava.jar") 

  val scalaToolsSnapshots = "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"                                                
  val scalatest = "org.scalatest" % "scalatest" % "1.0"                                               
}


