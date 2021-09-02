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
@RequestMapping("/MaintainService")
public class MaintainServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private MaintainService maintainService;
	
	@RequestMapping(value="/receiveTb",method=RequestMethod.PUT)	
	public String receiveTb(ReceiveTbMessage receiveTbMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", maintainService.receiveTb(receiveTbMsg.tbId));
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
	@RequestMapping(value="/completeTb",method=RequestMethod.PUT)	
	public String completeTb(CompleteTbMessage completeTbMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", maintainService.completeTb(completeTbMsg.tbId,completeTbMsg.cause,completeTbMsg.resolvent));
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
	@RequestMapping(value="/rocessingFees",method=RequestMethod.POST)	
	public String rocessingFees(RocessingFeesMessage rocessingFeesMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", maintainService.rocessingFees(rocessingFeesMsg.tbId,rocessingFeesMsg.projectName,rocessingFeesMsg.price,rocessingFeesMsg.number,rocessingFeesMsg.remake));
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
	@RequestMapping(value="/setOperationStatus",method=RequestMethod.POST)	
	public String setOperationStatus(SetOperationStatusMessage setOperationStatusMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", maintainService.setOperationStatus(setOperationStatusMsg.name,setOperationStatusMsg.value,setOperationStatusMsg.valueUnit,setOperationStatusMsg.status,setOperationStatusMsg.remark,setOperationStatusMsg.equipmentId));
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
