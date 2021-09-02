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
@RequestMapping("/CustomerService")
public class CustomerServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private CustomerService customerService;
	
	@RequestMapping(value="/getByPhone",method=RequestMethod.GET)	
	public String getByPhone(GetByPhoneMessage getByPhoneMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", customerService.getByPhone(getByPhoneMsg.phone));
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
	@RequestMapping(value="/getByName",method=RequestMethod.GET)	
	public String getByName(GetByNameMessage getByNameMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", customerService.getByName(getByNameMsg.name));
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
	@RequestMapping(value="/loginByPhone",method=RequestMethod.GET)	
	public String loginByPhone(LoginByPhoneMessage loginByPhoneMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", customerService.loginByPhone(loginByPhoneMsg.phone,loginByPhoneMsg.password));
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
