package spring.net.mydream.controller;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/main")
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/listByDictCodeAndName")
	public String listByDictCodeAndName() {
		return "views/listByDictCodeAndName";
	}
	@RequestMapping("/listByDictCode")
	public String listByDictCode() {
		return "views/listByDictCode";
	}
	@RequestMapping("/sendHtmlEmail")
	public String sendHtmlEmail() {
		return "views/sendHtmlEmail";
	}
	@RequestMapping("/sendFullTextEmail")
	public String sendFullTextEmail() {
		return "views/sendFullTextEmail";
	}
	@RequestMapping("/sendTextEmail")
	public String sendTextEmail() {
		return "views/sendTextEmail";
	}
	@RequestMapping("/getUserMenu")
	public String getUserMenu() {
		return "views/getUserMenu";
	}
	@RequestMapping("/toMenuTree")
	public String toMenuTree() {
		return "views/toMenuTree";
	}
	@RequestMapping("/selectRoleAndAuth")
	public String selectRoleAndAuth() {
		return "views/selectRoleAndAuth";
	}
	@RequestMapping("/getFullById")
	public String getFullById() {
		return "views/getFullById";
	}
	@RequestMapping("/getRoleIds")
	public String getRoleIds() {
		return "views/getRoleIds";
	}
	@RequestMapping("/getByUsername")
	public String getByUsername() {
		return "views/getByUsername";
	}
	@RequestMapping("/encodePsw")
	public String encodePsw() {
		return "views/encodePsw";
	}
	@RequestMapping("/comparePsw")
	public String comparePsw() {
		return "views/comparePsw";
	}
	@RequestMapping("/getByUserTwoname")
	public String getByUserTwoname() {
		return "views/getByUserTwoname";
	}
	@RequestMapping("/freezeA")
	public String freezeA() {
		return "views/freezeA";
	}
	@RequestMapping("/resetPsw")
	public String resetPsw() {
		return "views/resetPsw";
	}
	}