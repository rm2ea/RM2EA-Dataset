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
@RequestMapping("/CarParkingRecordService")
public class CarParkingRecordServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private CarParkingRecordService carParkingRecordService;
	
	@RequestMapping(value="/saveCR",method=RequestMethod.POST)	
	public String saveCR(SaveCRMessage saveCRMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carParkingRecordService.saveCR(saveCRMsg.entity));
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
	@RequestMapping(value="/listCR",method=RequestMethod.GET)	
	public String listCR(ListCRMessage listCRMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carParkingRecordService.listCR(listCRMsg.orgId,listCRMsg.parkManageId));
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
	@RequestMapping(value="/getByPlateNumberCR",method=RequestMethod.GET)	
	public String getByPlateNumberCR(GetByPlateNumberCRMessage getByPlateNumberCRMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carParkingRecordService.getByPlateNumberCR(getByPlateNumberCRMsg.plate_number,getByPlateNumberCRMsg.park_manage_id));
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
