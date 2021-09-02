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
@RequestMapping("/HandleService")
public class HandleServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private HandleService handleService;
	
	@RequestMapping(value="/notAcceptBa",method=RequestMethod.GET)	
	public String notAcceptBa() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.notAcceptBa());
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
	@RequestMapping(value="/acceptedBa",method=RequestMethod.GET)	
	public String acceptedBa() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.acceptedBa());
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
	@RequestMapping(value="/completedBa",method=RequestMethod.GET)	
	public String completedBa() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.completedBa());
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
	@RequestMapping(value="/allocation",method=RequestMethod.PUT)	
	public String allocation(AllocationMessage allocationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.allocation(allocationMsg.userId,allocationMsg.tbId));
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
	@RequestMapping(value="/transmit",method=RequestMethod.PUT)	
	public String transmit(TransmitMessage transmitMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.transmit(transmitMsg.departId,transmitMsg.tbId));
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
	@RequestMapping(value="/backtransmit",method=RequestMethod.PUT)	
	public String backtransmit(BacktransmitMessage backtransmitMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.backtransmit(backtransmitMsg.tbId,backtransmitMsg.rejectCause));
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
	@RequestMapping(value="/setWorkTask",method=RequestMethod.POST)	
	public String setWorkTask(SetWorkTaskMessage setWorkTaskMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.setWorkTask(setWorkTaskMsg.staffName,setWorkTaskMsg.adminName,setWorkTaskMsg.phone,setWorkTaskMsg.section,setWorkTaskMsg.remark));
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
	@RequestMapping(value="/setTerminalEquipment",method=RequestMethod.POST)	
	public String setTerminalEquipment(SetTerminalEquipmentMessage setTerminalEquipmentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", handleService.setTerminalEquipment(setTerminalEquipmentMsg.name,setTerminalEquipmentMsg.address,setTerminalEquipmentMsg.description,setTerminalEquipmentMsg.type,setTerminalEquipmentMsg.remark,setTerminalEquipmentMsg.deviceInfoId));
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
