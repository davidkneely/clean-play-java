package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Play Framework application.
 */
public class Application extends Controller {
  /**
   * Renders the application contents.
   * @return Status code 200 and contents of index page.
   */
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
