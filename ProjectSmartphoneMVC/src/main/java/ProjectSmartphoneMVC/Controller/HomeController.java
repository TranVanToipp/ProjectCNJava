package ProjectSmartphoneMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Dao.HomeDao;

@Controller
public class HomeController {
	
	@Autowired
	HomeDao homedao;
	@RequestMapping(value={"/","/trang-chu"},method = RequestMethod.GET)
	public ModelAndView Index() {
		ModelAndView in = new ModelAndView("user");
		in.addObject("user", homedao.GetDataUser());
		return in;
	}
}
