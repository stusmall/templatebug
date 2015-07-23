
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/stusmall/workspace/templatebug/conf/routes
// @DATE:Wed Jul 22 22:41:23 MDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
