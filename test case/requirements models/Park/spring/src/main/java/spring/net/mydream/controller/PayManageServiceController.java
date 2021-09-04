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
@RequestMapping("/PayManageService")
public class PayManageServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private PayManageService payManageService;
	
	@RequestMapping(value="/getByCarParkId",method=RequestMethod.GET)	
	public String getByCarParkId(GetByCarParkIdMessage getByCarParkIdMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", payManageService.getByCarParkId(getByCarParkIdMsg.id));
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
	@RequestMapping(value="/deleteP",method=RequestMethod.DELETE)	
	public String deleteP(DeletePMessage deletePMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", payManageService.deleteP(deletePMsg.id));
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
