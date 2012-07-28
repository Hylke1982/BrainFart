package nl.bstoi.brainfart.scala.stripes.web.action;

import scala.reflect.BeanProperty
import net.sourceforge.stripes.action.DefaultHandler
import net.sourceforge.stripes.action.HandlesEvent
import net.sourceforge.stripes.action.UrlBinding
import net.sourceforge.stripes.action.ActionBean
import net.sourceforge.stripes.action.ActionBeanContext
import net.sourceforge.stripes.action.Resolution
import nl.bstoi.brainfart.scala.stripes.web.util.ResolutionHandling
import net.sourceforge.stripes.validation.ValidationMethod
import net.sourceforge.stripes.action.RedirectResolution

class BaseActionBean extends ActionBean with ResolutionHandling {

  @BeanProperty var context: ActionBeanContext = null

}

@UrlBinding("/login")
class LoginAction extends BaseActionBean {

  final val JSPDIRECTORY = "login"
  
  @BeanProperty
  var username,password : String = null

  @DefaultHandler
  @HandlesEvent(INDEX)
  def index: Resolution = forward(viewPath(JSPDIRECTORY, INDEX))
  
  def login: Resolution = new RedirectResolution(classOf[HomeAction],INDEX)
  
}

@UrlBinding("/home")
class HomeAction extends BaseActionBean {
	
	final val JSPDIRECTORY = "home"
    
	@DefaultHandler
	@HandlesEvent(INDEX)
    def index: Resolution = forward(viewPath(JSPDIRECTORY,INDEX))
    
    @HandlesEvent(CREATE)
    def create : Resolution = forward(viewPath(JSPDIRECTORY,INDEX))
  
}

