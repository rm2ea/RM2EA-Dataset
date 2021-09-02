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
@RequestMapping("/UserService")
public class UserServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private UserService userService;
	
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)	
	public String addUser() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userService.addUser("zhc","123456"));
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
	
	@RequestMapping(value="/selectRoleAndAuth",method=RequestMethod.GET)	
	public String selectRoleAndAuth() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", null);
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
	@RequestMapping(value="/getFullById",method=RequestMethod.GET)	
	public String getFullById() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", null);
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
	@RequestMapping(value="/getRoleIds",method=RequestMethod.GET)	
	public String getRoleIds() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data",null);
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
	@RequestMapping(value="/getByUsername",method=RequestMethod.GET)	
	public String getByUsername() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data",null);
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
	@RequestMapping(value="/freezeA",method=RequestMethod.POST)	
	public String freezeA(FreezeAMessage freezeAMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userService.freezeA(freezeAMsg.id,freezeAMsg.state));
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
	@RequestMapping(value="/resetPsw",method=RequestMethod.PUT)	
	public String resetPsw(ResetPswMessage resetPswMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userService.resetPsw(resetPswMsg.id,resetPswMsg.newpwd,resetPswMsg.oldpwd));
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
