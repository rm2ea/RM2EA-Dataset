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
@RequestMapping("/StoreService")
public class StoreServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private StoreService storeService;
	
	@RequestMapping(value="/search",method=RequestMethod.GET)	
	public String search(SearchMessage searchMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", storeService.search(searchMsg.name));
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
	@RequestMapping(value="/suggestByStr",method=RequestMethod.GET)	
	public String suggestByStr(SuggestByStrMessage suggestByStrMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", storeService.suggestByStr(suggestByStrMsg.str));
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
	@RequestMapping(value="/enterStoreBystoreId",method=RequestMethod.GET)	
	public String enterStoreBystoreId(EnterStoreBystoreIdMessage enterStoreBystoreIdMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", storeService.enterStoreBystoreId(enterStoreBystoreIdMsg.storeId));
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
	@RequestMapping(value="/enterStoreBystoreId2",method=RequestMethod.GET)	
	public String enterStoreBystoreId2(EnterStoreBystoreId2Message enterStoreBystoreId2Msg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", storeService.enterStoreBystoreId2(enterStoreBystoreId2Msg.storeId));
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
	@RequestMapping(value="/toStreet",method=RequestMethod.GET)	
	public String toStreet() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", storeService.toStreet());
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
