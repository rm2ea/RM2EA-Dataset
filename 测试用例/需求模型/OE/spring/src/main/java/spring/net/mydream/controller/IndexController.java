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
	@RequestMapping("/getFullById")
	public String getFullById() {
		return "views/getFullById";
	}
	@RequestMapping("/toMenuTree")
	public String toMenuTree() {
		return "views/toMenuTree";
	}
	@RequestMapping("/selectRoleAndAuth")
	public String selectRoleAndAuth() {
		return "views/selectRoleAndAuth";
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
	@RequestMapping("/createDictionary")
	public String createDictionary() {
		return "views/createDictionary";
	}
	@RequestMapping("/queryDictionary")
	public String queryDictionary() {
		return "views/queryDictionary";
	}
	@RequestMapping("/modifyDictionary")
	public String modifyDictionary() {
		return "views/modifyDictionary";
	}
	@RequestMapping("/deleteDictionary")
	public String deleteDictionary() {
		return "views/deleteDictionary";
	}
	@RequestMapping("/createDictionaryData")
	public String createDictionaryData() {
		return "views/createDictionaryData";
	}
	@RequestMapping("/queryDictionaryData")
	public String queryDictionaryData() {
		return "views/queryDictionaryData";
	}
	@RequestMapping("/modifyDictionaryData")
	public String modifyDictionaryData() {
		return "views/modifyDictionaryData";
	}
	@RequestMapping("/deleteDictionaryData")
	public String deleteDictionaryData() {
		return "views/deleteDictionaryData";
	}
	@RequestMapping("/createLoginRecord")
	public String createLoginRecord() {
		return "views/createLoginRecord";
	}
	@RequestMapping("/queryLoginRecord")
	public String queryLoginRecord() {
		return "views/queryLoginRecord";
	}
	@RequestMapping("/modifyLoginRecord")
	public String modifyLoginRecord() {
		return "views/modifyLoginRecord";
	}
	@RequestMapping("/deleteLoginRecord")
	public String deleteLoginRecord() {
		return "views/deleteLoginRecord";
	}
	@RequestMapping("/createMenu")
	public String createMenu() {
		return "views/createMenu";
	}
	@RequestMapping("/queryMenu")
	public String queryMenu() {
		return "views/queryMenu";
	}
	@RequestMapping("/modifyMenu")
	public String modifyMenu() {
		return "views/modifyMenu";
	}
	@RequestMapping("/deleteMenu")
	public String deleteMenu() {
		return "views/deleteMenu";
	}
	@RequestMapping("/createOperRecord")
	public String createOperRecord() {
		return "views/createOperRecord";
	}
	@RequestMapping("/queryOperRecord")
	public String queryOperRecord() {
		return "views/queryOperRecord";
	}
	@RequestMapping("/modifyOperRecord")
	public String modifyOperRecord() {
		return "views/modifyOperRecord";
	}
	@RequestMapping("/deleteOperRecord")
	public String deleteOperRecord() {
		return "views/deleteOperRecord";
	}
	@RequestMapping("/createOrganization")
	public String createOrganization() {
		return "views/createOrganization";
	}
	@RequestMapping("/queryOrganization")
	public String queryOrganization() {
		return "views/queryOrganization";
	}
	@RequestMapping("/modifyOrganization")
	public String modifyOrganization() {
		return "views/modifyOrganization";
	}
	@RequestMapping("/deleteOrganization")
	public String deleteOrganization() {
		return "views/deleteOrganization";
	}
	@RequestMapping("/createUser")
	public String createUser() {
		return "views/createUser";
	}
	@RequestMapping("/queryUser")
	public String queryUser() {
		return "views/queryUser";
	}
	@RequestMapping("/modifyUser")
	public String modifyUser() {
		return "views/modifyUser";
	}
	@RequestMapping("/deleteUser")
	public String deleteUser() {
		return "views/deleteUser";
	}
	@RequestMapping("/createRole")
	public String createRole() {
		return "views/createRole";
	}
	@RequestMapping("/queryRole")
	public String queryRole() {
		return "views/queryRole";
	}
	@RequestMapping("/modifyRole")
	public String modifyRole() {
		return "views/modifyRole";
	}
	@RequestMapping("/deleteRole")
	public String deleteRole() {
		return "views/deleteRole";
	}
	@RequestMapping("/createUserTwo")
	public String createUserTwo() {
		return "views/createUserTwo";
	}
	@RequestMapping("/queryUserTwo")
	public String queryUserTwo() {
		return "views/queryUserTwo";
	}
	@RequestMapping("/modifyUserTwo")
	public String modifyUserTwo() {
		return "views/modifyUserTwo";
	}
	@RequestMapping("/deleteUserTwo")
	public String deleteUserTwo() {
		return "views/deleteUserTwo";
	}
	@RequestMapping("/thirdPartyServices")
	public String thirdPartyServices() {
		return "views/thirdPartyServices";
	}
	}