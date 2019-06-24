// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/dedeandres/DANA_Project/danainstant_be_services/conf/routes
// @DATE:Fri Jun 21 15:36:07 WIB 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseGraphQLController GraphQLController = new controllers.ReverseGraphQLController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseGraphQLController GraphQLController = new controllers.javascript.ReverseGraphQLController(RoutesPrefix.byNamePrefix());
  }

}
