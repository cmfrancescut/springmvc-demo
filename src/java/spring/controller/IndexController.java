package spring.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 
 * @author Carly Francescut 000710713
 */
@Controller
public class IndexController {
    
@RequestMapping(value="index")
public ModelAndView index(RedirectAttributes redirect){
  ModelAndView view = new ModelAndView();
  view.setViewName("index");
  String error = (String) redirect.getFlashAttributes().get("error");
  if(error != null)
  {
     String msg = "Invalid login!";
     view.addObject("error", msg);
  }
  return view;
}
    
    @RequestMapping(value="login")
public RedirectView login(HttpServletRequest request, RedirectAttributes redirect){
  RedirectView view = new RedirectView();
  view.setContextRelative(true);
  if(request.getParameter("username").equals("adam") && request.getParameter("password").equals("password"))
  {
     view.setUrl("/dashboard");
     return view;
  }
  view.setUrl("/index");
  redirect.addFlashAttribute("error", "true");
  return view;
}

}
