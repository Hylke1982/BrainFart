package nl.bstoi.brainfart.scala.stripes.web.util

import net.sourceforge.stripes.action.ForwardResolution
import net.sourceforge.stripes.action.RedirectResolution
import net.sourceforge.stripes.action.Resolution

trait ResolutionHandling {
  
  final val INDEX = "index"
  final val CREATE = "create"
  final val LOGIN = "login"

  final val MAIN_JSPDIRECTORY_PATH = "/WEB-INF/jsp/"

  def redirect(redirectPath: String): Resolution = new RedirectResolution(redirectPath)

  def forward(completeViewPath: String): Resolution = new ForwardResolution(completeViewPath)

  def viewPath(subDirectory: String, view: String): String = MAIN_JSPDIRECTORY_PATH + subDirectory + "/" + view + ".jsp"

  def redirectPath(subDirectory: String, view: String): String = "/" + subDirectory + "/" + view;

}