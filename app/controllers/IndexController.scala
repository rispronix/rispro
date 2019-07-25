package controllers

import javax.inject._
import play.api.mvc._

class IndexController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  
  def index = Action {
    val user = Map("username" -> "Richard")
    val posts = List(
      Map("author" -> "RichardR", "body" -> "Develop a Play! app"),
      Map("author" -> "RichardR", "body" -> "Deploying to Google Cloud"))
    Ok(views.html.index("Welcome to the rispro blog", user, posts))
  }

}
