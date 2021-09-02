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
	@RequestMapping("/saveCM")
	public String saveCM() {
		return "views/saveCM";
	}
	@RequestMapping("/listCM")
	public String listCM() {
		return "views/listCM";
	}
	@RequestMapping("/renewCM")
	public String renewCM() {
		return "views/renewCM";
	}
	@RequestMapping("/getByPlateNumberCM")
	public String getByPlateNumberCM() {
		return "views/getByPlateNumberCM";
	}
	@RequestMapping("/exportDataCM")
	public String exportDataCM() {
		return "views/exportDataCM";
	}
	@RequestMapping("/saveCR")
	public String saveCR() {
		return "views/saveCR";
	}
	@RequestMapping("/listCR")
	public String listCR() {
		return "views/listCR";
	}
	@RequestMapping("/getByPlateNumberCR")
	public String getByPlateNumberCR() {
		return "views/getByPlateNumberCR";
	}
	@RequestMapping("/getByCarParkId")
	public String getByCarParkId() {
		return "views/getByCarParkId";
	}
	@RequestMapping("/deleteP")
	public String deleteP() {
		return "views/deleteP";
	}
	@RequestMapping("/exportDataOM")
	public String exportDataOM() {
		return "views/exportDataOM";
	}
	@RequestMapping("/listOM")
	public String listOM() {
		return "views/listOM";
	}
	@RequestMapping("/saveOM")
	public String saveOM() {
		return "views/saveOM";
	}
	@RequestMapping("/updateInfo")
	public String updateInfo() {
		return "views/updateInfo";
	}
	@RequestMapping("/info")
	public String info() {
		return "views/info";
	}
	@RequestMapping("/updatePwd")
	public String updatePwd() {
		return "views/updatePwd";
	}
	@RequestMapping("/selectPM")
	public String selectPM() {
		return "views/selectPM";
	}
	@RequestMapping("/listPM")
	public String listPM() {
		return "views/listPM";
	}
	@RequestMapping("/savePM")
	public String savePM() {
		return "views/savePM";
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
	@RequestMapping("/createSysMenu")
	public String createSysMenu() {
		return "views/createSysMenu";
	}
	@RequestMapping("/querySysMenu")
	public String querySysMenu() {
		return "views/querySysMenu";
	}
	@RequestMapping("/modifySysMenu")
	public String modifySysMenu() {
		return "views/modifySysMenu";
	}
	@RequestMapping("/deleteSysMenu")
	public String deleteSysMenu() {
		return "views/deleteSysMenu";
	}
	@RequestMapping("/createSysOrg")
	public String createSysOrg() {
		return "views/createSysOrg";
	}
	@RequestMapping("/querySysOrg")
	public String querySysOrg() {
		return "views/querySysOrg";
	}
	@RequestMapping("/modifySysOrg")
	public String modifySysOrg() {
		return "views/modifySysOrg";
	}
	@RequestMapping("/deleteSysOrg")
	public String deleteSysOrg() {
		return "views/deleteSysOrg";
	}
	@RequestMapping("/createSysRole")
	public String createSysRole() {
		return "views/createSysRole";
	}
	@RequestMapping("/querySysRole")
	public String querySysRole() {
		return "views/querySysRole";
	}
	@RequestMapping("/modifySysRole")
	public String modifySysRole() {
		return "views/modifySysRole";
	}
	@RequestMapping("/deleteSysRole")
	public String deleteSysRole() {
		return "views/deleteSysRole";
	}
	@RequestMapping("/getByUser")
	public String getByUser() {
		return "views/getByUser";
	}
	@RequestMapping("/drop")
	public String drop() {
		return "views/drop";
	}
	@RequestMapping("/selectByUser")
	public String selectByUser() {
		return "views/selectByUser";
	}
	@RequestMapping("/getMenuByRole")
	public String getMenuByRole() {
		return "views/getMenuByRole";
	}
	@RequestMapping("/saveMenuByRole")
	public String saveMenuByRole() {
		return "views/saveMenuByRole";
	}
	@RequestMapping("/getOrgByRole")
	public String getOrgByRole() {
		return "views/getOrgByRole";
	}
	@RequestMapping("/saveOrgByRole")
	public String saveOrgByRole() {
		return "views/saveOrgByRole";
	}
	@RequestMapping("/listUserByRole")
	public String listUserByRole() {
		return "views/listUserByRole";
	}
	@RequestMapping("/listUserRoles")
	public String listUserRoles() {
		return "views/listUserRoles";
	}
	@RequestMapping("/listUserPerms")
	public String listUserPerms() {
		return "views/listUserPerms";
	}
	@RequestMapping("/thirdPartyServices")
	public String thirdPartyServices() {
		return "views/thirdPartyServices";
	}
	}