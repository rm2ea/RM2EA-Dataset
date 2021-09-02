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
@RequestMapping("/RoleService")
public class RoleServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private RoleService roleService;
	
	@RequestMapping(value="/selectByUser",method=RequestMethod.GET)	
	public String selectByUser(SelectByUserMessage selectByUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", roleService.selectByUser(selectByUserMsg.id));
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
	@RequestMapping(value="/getMenuByRole",method=RequestMethod.GET)	
	public String getMenuByRole(GetMenuByRoleMessage getMenuByRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", roleService.getMenuByRole(getMenuByRoleMsg.roleId));
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
	@RequestMapping(value="/saveMenuByRole",method=RequestMethod.POST)	
	public String saveMenuByRole(SaveMenuByRoleMessage saveMenuByRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", roleService.saveMenuByRole(saveMenuByRoleMsg.roleId));
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
	@RequestMapping(value="/getOrgByRole",method=RequestMethod.GET)	
	public String getOrgByRole(GetOrgByRoleMessage getOrgByRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", roleService.getOrgByRole(getOrgByRoleMsg.roleId));
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
	@RequestMapping(value="/saveOrgByRole",method=RequestMethod.POST)	
	public String saveOrgByRole(SaveOrgByRoleMessage saveOrgByRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", roleService.saveOrgByRole(saveOrgByRoleMsg.roleId));
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
