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
@RequestMapping("/ParkSystem")
public class ParkSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ParkSystem parkSystem;
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)	
	public String createUser(CreateUserMessage createUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.createUser(createUserMsg.id));
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
	@RequestMapping(value="/queryUser",method=RequestMethod.GET)	
	public String queryUser(QueryUserMessage queryUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.queryUser(queryUserMsg.id));
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
	@RequestMapping(value="/modifyUser",method=RequestMethod.PUT)	
	public String modifyUser(ModifyUserMessage modifyUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.modifyUser(modifyUserMsg.id,modifyUserMsg.name));
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
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)	
	public String deleteUser(DeleteUserMessage deleteUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.deleteUser(deleteUserMsg.id));
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
	@RequestMapping(value="/createSysMenu",method=RequestMethod.POST)	
	public String createSysMenu(CreateSysMenuMessage createSysMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.createSysMenu(createSysMenuMsg.id));
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
	@RequestMapping(value="/querySysMenu",method=RequestMethod.GET)	
	public String querySysMenu(QuerySysMenuMessage querySysMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.querySysMenu(querySysMenuMsg.id));
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
	@RequestMapping(value="/modifySysMenu",method=RequestMethod.PUT)	
	public String modifySysMenu(ModifySysMenuMessage modifySysMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.modifySysMenu(modifySysMenuMsg.id,modifySysMenuMsg.name));
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
	@RequestMapping(value="/deleteSysMenu",method=RequestMethod.DELETE)	
	public String deleteSysMenu(DeleteSysMenuMessage deleteSysMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.deleteSysMenu(deleteSysMenuMsg.id));
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
	@RequestMapping(value="/createSysOrg",method=RequestMethod.POST)	
	public String createSysOrg(CreateSysOrgMessage createSysOrgMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.createSysOrg(createSysOrgMsg.id));
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
	@RequestMapping(value="/querySysOrg",method=RequestMethod.GET)	
	public String querySysOrg(QuerySysOrgMessage querySysOrgMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.querySysOrg(querySysOrgMsg.id));
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
	@RequestMapping(value="/modifySysOrg",method=RequestMethod.PUT)	
	public String modifySysOrg(ModifySysOrgMessage modifySysOrgMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.modifySysOrg(modifySysOrgMsg.id,modifySysOrgMsg.name));
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
	@RequestMapping(value="/deleteSysOrg",method=RequestMethod.DELETE)	
	public String deleteSysOrg(DeleteSysOrgMessage deleteSysOrgMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.deleteSysOrg(deleteSysOrgMsg.id));
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
	@RequestMapping(value="/createSysRole",method=RequestMethod.POST)	
	public String createSysRole(CreateSysRoleMessage createSysRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.createSysRole(createSysRoleMsg.id));
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
	@RequestMapping(value="/querySysRole",method=RequestMethod.GET)	
	public String querySysRole(QuerySysRoleMessage querySysRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.querySysRole(querySysRoleMsg.id));
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
	@RequestMapping(value="/modifySysRole",method=RequestMethod.PUT)	
	public String modifySysRole(ModifySysRoleMessage modifySysRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.modifySysRole(modifySysRoleMsg.id,modifySysRoleMsg.name));
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
	@RequestMapping(value="/deleteSysRole",method=RequestMethod.DELETE)	
	public String deleteSysRole(DeleteSysRoleMessage deleteSysRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkSystem.deleteSysRole(deleteSysRoleMsg.id));
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
