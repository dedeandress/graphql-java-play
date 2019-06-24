// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/dedeandres/DANA_Project/danainstant_be_services/conf/routes
// @DATE:Fri Jun 21 15:36:07 WIB 2019


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
