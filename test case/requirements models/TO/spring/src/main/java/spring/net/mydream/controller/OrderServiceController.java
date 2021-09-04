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
@RequestMapping("/OrderService")
public class OrderServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private OrderService orderService;
	
	@RequestMapping(value="/selectOne",method=RequestMethod.GET)	
	public String selectOne(SelectOneMessage selectOneMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", orderService.selectOne(selectOneMsg.id));
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
	@RequestMapping(value="/submitOrdering",method=RequestMethod.GET)	
	public String submitOrdering(SubmitOrderingMessage submitOrderingMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", orderService.submitOrdering(submitOrderingMsg.storeId,submitOrderingMsg.customerid,submitOrderingMsg.dishesid));
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
	@RequestMapping(value="/deliveryConfirmine",method=RequestMethod.PUT)	
	public String deliveryConfirmine(DeliveryConfirmineMessage deliveryConfirmineMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", orderService.deliveryConfirmine(deliveryConfirmineMsg.customerId));
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
	@RequestMapping(value="/toOrderingCheck",method=RequestMethod.GET)	
	public String toOrderingCheck() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", orderService.toOrderingCheck());
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
