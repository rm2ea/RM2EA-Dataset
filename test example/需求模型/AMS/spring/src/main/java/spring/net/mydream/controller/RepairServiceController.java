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
@RequestMapping("/RepairService")
public class RepairServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private RepairService repairService;
	
	@RequestMapping(value="/submitRepair",method=RequestMethod.POST)	
	public String submitRepair(SubmitRepairMessage submitRepairMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.submitRepair(submitRepairMsg.departmentid,submitRepairMsg.assignDepartId,submitRepairMsg.repairName,submitRepairMsg.phone,submitRepairMsg.place,submitRepairMsg.repairsStatus,submitRepairMsg.deviceId,submitRepairMsg.describeContent,submitRepairMsg.failureTypeId));
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
	@RequestMapping(value="/notAcceptAa",method=RequestMethod.GET)	
	public String notAcceptAa() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.notAcceptAa());
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
	@RequestMapping(value="/acceptedAa",method=RequestMethod.GET)	
	public String acceptedAa() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.acceptedAa());
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
	@RequestMapping(value="/completedAa",method=RequestMethod.GET)	
	public String completedAa() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.completedAa());
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
	@RequestMapping(value="/scoring",method=RequestMethod.PUT)	
	public String scoring(ScoringMessage scoringMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.scoring(scoringMsg.tbid,scoringMsg.score,scoringMsg.remark));
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
	@RequestMapping(value="/tbInfo",method=RequestMethod.GET)	
	public String tbInfo(TbInfoMessage tbInfoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.tbInfo(tbInfoMsg.id));
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
	@RequestMapping(value="/sendVoice",method=RequestMethod.GET)	
	public String sendVoice() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.sendVoice());
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
	@RequestMapping(value="/pushInfo",method=RequestMethod.GET)	
	public String pushInfo() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.pushInfo());
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
	@RequestMapping(value="/savePwd",method=RequestMethod.GET)	
	public String savePwd() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", repairService.savePwd());
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
