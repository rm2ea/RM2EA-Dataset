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
@RequestMapping("/ParkManageService")
public class ParkManageServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ParkManageService parkManageService;
	
	@RequestMapping(value="/selectPM",method=RequestMethod.GET)	
	public String selectPM(SelectPMMessage selectPMMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkManageService.selectPM(selectPMMsg.id,selectPMMsg.org_id));
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
	@RequestMapping(value="/listPM",method=RequestMethod.GET)	
	public String listPM() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkManageService.listPM());
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
	@RequestMapping(value="/savePM",method=RequestMethod.POST)	
	public String savePM(SavePMMessage savePMMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", parkManageService.savePM(savePMMsg.entity));
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
