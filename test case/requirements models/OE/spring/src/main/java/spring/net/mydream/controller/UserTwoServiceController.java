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
@RequestMapping("/UserTwoService")
public class UserTwoServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private UserTwoService userTwoService;
	
	@RequestMapping(value="/encodePsw",method=RequestMethod.GET)	
	public String encodePsw(EncodePswMessage encodePswMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userTwoService.encodePsw(encodePswMsg.psw));
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
	@RequestMapping(value="/comparePsw",method=RequestMethod.GET)	
	public String comparePsw(ComparePswMessage comparePswMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userTwoService.comparePsw(comparePswMsg.dbPsw,comparePswMsg.inputPsw));
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
	@RequestMapping(value="/getByUserTwoname",method=RequestMethod.GET)	
	public String getByUserTwoname(GetByUserTwonameMessage getByUserTwonameMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", userTwoService.getByUserTwoname(getByUserTwonameMsg.usertwoname));
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