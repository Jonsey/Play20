import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "helloworld"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(
      // Add your own project settings here      
    )

}
