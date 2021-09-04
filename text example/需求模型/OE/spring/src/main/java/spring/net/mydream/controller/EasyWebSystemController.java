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
@RequestMapping("/EasyWebSystem")
public class EasyWebSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private EasyWebSystem easyWebSystem;
	
	@RequestMapping(value="/createDictionary",method=RequestMethod.POST)	
	public String createDictionary(CreateDictionaryMessage createDictionaryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createDictionary(createDictionaryMsg.id,createDictionaryMsg.dictcode,createDictionaryMsg.dictname));
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
	@RequestMapping(value="/queryDictionary",method=RequestMethod.GET)	
	public String queryDictionary(QueryDictionaryMessage queryDictionaryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryDictionary(queryDictionaryMsg.id));
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
	@RequestMapping(value="/modifyDictionary",method=RequestMethod.PUT)	
	public String modifyDictionary(ModifyDictionaryMessage modifyDictionaryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyDictionary(modifyDictionaryMsg.id,modifyDictionaryMsg.dictcode,modifyDictionaryMsg.dictname));
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
	@RequestMapping(value="/deleteDictionary",method=RequestMethod.DELETE)	
	public String deleteDictionary(DeleteDictionaryMessage deleteDictionaryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteDictionary(deleteDictionaryMsg.id));
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
	@RequestMapping(value="/createDictionaryData",method=RequestMethod.POST)	
	public String createDictionaryData(CreateDictionaryDataMessage createDictionaryDataMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createDictionaryData(createDictionaryDataMsg.id,createDictionaryDataMsg.dictcode,createDictionaryDataMsg.dictname));
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
	@RequestMapping(value="/queryDictionaryData",method=RequestMethod.GET)	
	public String queryDictionaryData(QueryDictionaryDataMessage queryDictionaryDataMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryDictionaryData(queryDictionaryDataMsg.id));
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
	@RequestMapping(value="/modifyDictionaryData",method=RequestMethod.PUT)	
	public String modifyDictionaryData(ModifyDictionaryDataMessage modifyDictionaryDataMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyDictionaryData(modifyDictionaryDataMsg.id));
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
	@RequestMapping(value="/deleteDictionaryData",method=RequestMethod.DELETE)	
	public String deleteDictionaryData(DeleteDictionaryDataMessage deleteDictionaryDataMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteDictionaryData(deleteDictionaryDataMsg.id));
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
	@RequestMapping(value="/createLoginRecord",method=RequestMethod.POST)	
	public String createLoginRecord(CreateLoginRecordMessage createLoginRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createLoginRecord(createLoginRecordMsg.id));
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
	@RequestMapping(value="/queryLoginRecord",method=RequestMethod.GET)	
	public String queryLoginRecord(QueryLoginRecordMessage queryLoginRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryLoginRecord(queryLoginRecordMsg.id));
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
	@RequestMapping(value="/modifyLoginRecord",method=RequestMethod.PUT)	
	public String modifyLoginRecord(ModifyLoginRecordMessage modifyLoginRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyLoginRecord(modifyLoginRecordMsg.id));
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
	@RequestMapping(value="/deleteLoginRecord",method=RequestMethod.DELETE)	
	public String deleteLoginRecord(DeleteLoginRecordMessage deleteLoginRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteLoginRecord(deleteLoginRecordMsg.id));
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
	@RequestMapping(value="/createMenu",method=RequestMethod.POST)	
	public String createMenu(CreateMenuMessage createMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createMenu(createMenuMsg.id));
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
	@RequestMapping(value="/queryMenu",method=RequestMethod.GET)	
	public String queryMenu(QueryMenuMessage queryMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryMenu(queryMenuMsg.id));
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
	@RequestMapping(value="/modifyMenu",method=RequestMethod.PUT)	
	public String modifyMenu(ModifyMenuMessage modifyMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyMenu(modifyMenuMsg.id));
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
	@RequestMapping(value="/deleteMenu",method=RequestMethod.DELETE)	
	public String deleteMenu(DeleteMenuMessage deleteMenuMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteMenu(deleteMenuMsg.id));
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
	@RequestMapping(value="/createOperRecord",method=RequestMethod.POST)	
	public String createOperRecord(CreateOperRecordMessage createOperRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createOperRecord(createOperRecordMsg.id));
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
	@RequestMapping(value="/queryOperRecord",method=RequestMethod.GET)	
	public String queryOperRecord(QueryOperRecordMessage queryOperRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryOperRecord(queryOperRecordMsg.id));
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
	@RequestMapping(value="/modifyOperRecord",method=RequestMethod.PUT)	
	public String modifyOperRecord(ModifyOperRecordMessage modifyOperRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyOperRecord(modifyOperRecordMsg.id));
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
	@RequestMapping(value="/deleteOperRecord",method=RequestMethod.DELETE)	
	public String deleteOperRecord(DeleteOperRecordMessage deleteOperRecordMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteOperRecord(deleteOperRecordMsg.id));
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
	@RequestMapping(value="/createOrganization",method=RequestMethod.POST)	
	public String createOrganization(CreateOrganizationMessage createOrganizationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createOrganization(createOrganizationMsg.id));
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
	@RequestMapping(value="/queryOrganization",method=RequestMethod.GET)	
	public String queryOrganization(QueryOrganizationMessage queryOrganizationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryOrganization(queryOrganizationMsg.id));
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
	@RequestMapping(value="/modifyOrganization",method=RequestMethod.PUT)	
	public String modifyOrganization(ModifyOrganizationMessage modifyOrganizationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyOrganization(modifyOrganizationMsg.id));
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
	@RequestMapping(value="/deleteOrganization",method=RequestMethod.DELETE)	
	public String deleteOrganization(DeleteOrganizationMessage deleteOrganizationMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteOrganization(deleteOrganizationMsg.id));
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
	@RequestMapping(value="/createUser",method=RequestMethod.POST)	
	public String createUser(CreateUserMessage createUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createUser(createUserMsg.id));
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
	@RequestMapping(value="/queryUser",method=RequestMethod.GET)	
	public String queryUser(QueryUserMessage queryUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryUser(queryUserMsg.id));
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
	@RequestMapping(value="/modifyUser",method=RequestMethod.PUT)	
	public String modifyUser(ModifyUserMessage modifyUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyUser(modifyUserMsg.id));
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
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)	
	public String deleteUser(DeleteUserMessage deleteUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteUser(deleteUserMsg.id));
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
	@RequestMapping(value="/createRole",method=RequestMethod.POST)	
	public String createRole(CreateRoleMessage createRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createRole(createRoleMsg.id));
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
	@RequestMapping(value="/queryRole",method=RequestMethod.GET)	
	public String queryRole(QueryRoleMessage queryRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryRole(queryRoleMsg.id));
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
	@RequestMapping(value="/modifyRole",method=RequestMethod.PUT)	
	public String modifyRole(ModifyRoleMessage modifyRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyRole(modifyRoleMsg.id));
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
	@RequestMapping(value="/deleteRole",method=RequestMethod.DELETE)	
	public String deleteRole(DeleteRoleMessage deleteRoleMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteRole(deleteRoleMsg.id));
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
	@RequestMapping(value="/createUserTwo",method=RequestMethod.POST)	
	public String createUserTwo(CreateUserTwoMessage createUserTwoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.createUserTwo(createUserTwoMsg.id));
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
	@RequestMapping(value="/queryUserTwo",method=RequestMethod.GET)	
	public String queryUserTwo(QueryUserTwoMessage queryUserTwoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.queryUserTwo(queryUserTwoMsg.id));
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
	@RequestMapping(value="/modifyUserTwo",method=RequestMethod.PUT)	
	public String modifyUserTwo(ModifyUserTwoMessage modifyUserTwoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.modifyUserTwo(modifyUserTwoMsg.id));
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
	@RequestMapping(value="/deleteUserTwo",method=RequestMethod.DELETE)	
	public String deleteUserTwo(DeleteUserTwoMessage deleteUserTwoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", easyWebSystem.deleteUserTwo(deleteUserTwoMsg.id));
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
