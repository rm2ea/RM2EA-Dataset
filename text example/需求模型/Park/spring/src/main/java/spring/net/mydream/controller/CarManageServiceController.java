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
@RequestMapping("/CarManageService")
public class CarManageServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private CarManageService carManageService;
	
	@RequestMapping(value="/saveCM",method=RequestMethod.POST)	
	public String saveCM(SaveCMMessage saveCMMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carManageService.saveCM(saveCMMsg.description,saveCMMsg.name,saveCMMsg.org_id,saveCMMsg.park_manage_id));
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
	@RequestMapping(value="/listCM",method=RequestMethod.GET)	
	public String listCM(ListCMMessage listCMMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carManageService.listCM(listCMMsg.description,listCMMsg.name,listCMMsg.org_id,listCMMsg.park_manage_id));
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
	@RequestMapping(value="/renewCM",method=RequestMethod.POST)	
	public String renewCM(RenewCMMessage renewCMMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carManageService.renewCM(renewCMMsg.oId,renewCMMsg.carId,renewCMMsg.userid));
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
	@RequestMapping(value="/getByPlateNumberCM",method=RequestMethod.GET)	
	public String getByPlateNumberCM(GetByPlateNumberCMMessage getByPlateNumberCMMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carManageService.getByPlateNumberCM(getByPlateNumberCMMsg.plateNumber,getByPlateNumberCMMsg.parkManageId));
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
	@RequestMapping(value="/exportDataCM",method=RequestMethod.GET)	
	public String exportDataCM(ExportDataCMMessage exportDataCMMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", carManageService.exportDataCM(exportDataCMMsg.orgId,exportDataCMMsg.parkManageId));
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
