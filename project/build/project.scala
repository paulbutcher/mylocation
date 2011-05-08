import sbt._

trait Defaults {
  def androidPlatformName = "android-8"
}
class Parent(info: ProjectInfo) extends ParentProject(info) {
  override def shouldCheckOutputDirectories = false
  override def updateAction = task { None }

  lazy val lib = project("library", "My Location Library", new LibraryProject(_))
  lazy val trial = project("trial", "My Location Trial", new MainProject(_), lib)
  lazy val paid = project("paid", "My Location Paid", new MainProject(_), lib)

  class MainProject(info: ProjectInfo) extends AndroidProject(info) with Defaults

  class LibraryProject(info: ProjectInfo) extends AndroidLibraryProject(info) with Defaults
}
