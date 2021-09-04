package spring.net.mydream.controller;
import spring.net.mydream.service.*;
import spring.net.mydream.Message.*;
import java.util.Date;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.StandardOPs;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/UserManageService")
public class UserManageServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private UserManageService userManageService;
	
	@RequestMapping(value="/updateInfo",method=RequestMethod.PUT)	
	public String updateInfo(UpdateInfoMessage updateInfoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userManageService.updateInfo(updateInfoMsg.id,updateInfoMsg.name));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/info",method=RequestMethod.GET)	
	public String info(InfoMessage infoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userManageService.info(infoMsg.id));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/updatePwd",method=RequestMethod.PUT)	
	public String updatePwd(UpdatePwdMessage updatePwdMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userManageService.updatePwd(updatePwdMsg.id,updatePwdMsg.pwd));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/listUserByRole",method=RequestMethod.GET)	
	public String listUserByRole(ListUserByRoleMessage listUserByRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userManageService.listUserByRole(listUserByRoleMsg.roleId));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/listUserRoles",method=RequestMethod.GET)	
	public String listUserRoles(ListUserRolesMessage listUserRolesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userManageService.listUserRoles(listUserRolesMsg.userid));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	@RequestMapping(value="/listUserPerms",method=RequestMethod.GET)	
	public String listUserPerms() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userManageService.listUserPerms());
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	
}
