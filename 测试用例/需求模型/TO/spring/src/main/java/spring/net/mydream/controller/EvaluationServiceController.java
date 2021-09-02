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
@RequestMapping("/EvaluationService")
public class EvaluationServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private EvaluationService evaluationService;
	
	@RequestMapping(value="/toEvaluationCheck",method=RequestMethod.GET)	
	public String toEvaluationCheck() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluationService.toEvaluationCheck());
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
	@RequestMapping(value="/submitEvaluation2",method=RequestMethod.POST)	
	public String submitEvaluation2(SubmitEvaluation2Message submitEvaluation2Msg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluationService.submitEvaluation2(submitEvaluation2Msg.orderingId,submitEvaluation2Msg.uid,submitEvaluation2Msg.evluation));
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
	@RequestMapping(value="/toEvaluateOrdering",method=RequestMethod.GET)	
	public String toEvaluateOrdering(ToEvaluateOrderingMessage toEvaluateOrderingMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluationService.toEvaluateOrdering(toEvaluateOrderingMsg.orderingId));
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
	@RequestMapping(value="/toEvaluateStore",method=RequestMethod.GET)	
	public String toEvaluateStore(ToEvaluateStoreMessage toEvaluateStoreMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluationService.toEvaluateStore(toEvaluateStoreMsg.orderingId));
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
	@RequestMapping(value="/submitEvaluation1",method=RequestMethod.GET)	
	public String submitEvaluation1() {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", evaluationService.submitEvaluation1());
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
