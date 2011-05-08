import sbt._

trait Defaults {
  def androidPlatformName = "android-8"
}
class Parent(info: ProjectInfo) extends ParentProject(info) {
  override def shouldCheckOutputDirectories = false
  override def updateAction = task { None }
}
