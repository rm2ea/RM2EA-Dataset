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
@RequestMapping("/AirportSystem")
public class AirportSystemController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private AirportSystem airportSystem;
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST)	
	public String createUser(CreateUserMessage createUserMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createUser(createUserMsg.id,createUserMsg.name,createUserMsg.password,createUserMsg.phone,createUserMsg.roleCode,createUserMsg.departmentid));
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
			object.put("data", airportSystem.queryUser(queryUserMsg.id));
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
			object.put("data", airportSystem.modifyUser(modifyUserMsg.id,modifyUserMsg.name,modifyUserMsg.password,modifyUserMsg.phone,modifyUserMsg.roleCode,modifyUserMsg.departmentid));
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
			object.put("data", airportSystem.deleteUser(deleteUserMsg.id));
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
			object.put("data", airportSystem.createRole(createRoleMsg.id,createRoleMsg.remark,createRoleMsg.roleCode));
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
			object.put("data", airportSystem.queryRole(queryRoleMsg.id));
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
			object.put("data", airportSystem.modifyRole(modifyRoleMsg.id,modifyRoleMsg.remark,modifyRoleMsg.roleCode));
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
			object.put("data", airportSystem.deleteRole(deleteRoleMsg.id));
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
	@RequestMapping(value="/createDepartment",method=RequestMethod.POST)	
	public String createDepartment(CreateDepartmentMessage createDepartmentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createDepartment(createDepartmentMsg.id,createDepartmentMsg.name,createDepartmentMsg.contactRerson,createDepartmentMsg.principal,createDepartmentMsg.phone,createDepartmentMsg.briefInfo,createDepartmentMsg.describeContent,createDepartmentMsg.remark));
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
	@RequestMapping(value="/queryDepartment",method=RequestMethod.GET)	
	public String queryDepartment(QueryDepartmentMessage queryDepartmentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.queryDepartment(queryDepartmentMsg.id));
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
	@RequestMapping(value="/modifyDepartment",method=RequestMethod.PUT)	
	public String modifyDepartment(ModifyDepartmentMessage modifyDepartmentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.modifyDepartment(modifyDepartmentMsg.id,modifyDepartmentMsg.name,modifyDepartmentMsg.contactRerson,modifyDepartmentMsg.principal,modifyDepartmentMsg.phone,modifyDepartmentMsg.briefInfo,modifyDepartmentMsg.describeContent,modifyDepartmentMsg.remark));
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
	@RequestMapping(value="/deleteDepartment",method=RequestMethod.DELETE)	
	public String deleteDepartment(DeleteDepartmentMessage deleteDepartmentMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.deleteDepartment(deleteDepartmentMsg.id));
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
	@RequestMapping(value="/createDeviceInfo",method=RequestMethod.POST)	
	public String createDeviceInfo(CreateDeviceInfoMessage createDeviceInfoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createDeviceInfo(createDeviceInfoMsg.id,createDeviceInfoMsg.name,createDeviceInfoMsg.brand,createDeviceInfoMsg.type,createDeviceInfoMsg.address,createDeviceInfoMsg.adminName,createDeviceInfoMsg.contactsName,createDeviceInfoMsg.remark));
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
	@RequestMapping(value="/queryDeviceInfo",method=RequestMethod.GET)	
	public String queryDeviceInfo(QueryDeviceInfoMessage queryDeviceInfoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.queryDeviceInfo(queryDeviceInfoMsg.id));
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
	@RequestMapping(value="/modifyDeviceInfo",method=RequestMethod.PUT)	
	public String modifyDeviceInfo(ModifyDeviceInfoMessage modifyDeviceInfoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.modifyDeviceInfo(modifyDeviceInfoMsg.id,modifyDeviceInfoMsg.name,modifyDeviceInfoMsg.brand,modifyDeviceInfoMsg.type,modifyDeviceInfoMsg.address,modifyDeviceInfoMsg.adminName,modifyDeviceInfoMsg.contactsName,modifyDeviceInfoMsg.remark));
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
	@RequestMapping(value="/deleteDeviceInfo",method=RequestMethod.DELETE)	
	public String deleteDeviceInfo(DeleteDeviceInfoMessage deleteDeviceInfoMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.deleteDeviceInfo(deleteDeviceInfoMsg.id));
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
	@RequestMapping(value="/createDeviceLocationGroup",method=RequestMethod.POST)	
	public String createDeviceLocationGroup(CreateDeviceLocationGroupMessage createDeviceLocationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createDeviceLocationGroup(createDeviceLocationGroupMsg.id,createDeviceLocationGroupMsg.name,createDeviceLocationGroupMsg.remark));
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
	@RequestMapping(value="/queryDeviceLocationGroup",method=RequestMethod.GET)	
	public String queryDeviceLocationGroup(QueryDeviceLocationGroupMessage queryDeviceLocationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.queryDeviceLocationGroup(queryDeviceLocationGroupMsg.id));
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
	@RequestMapping(value="/modifyDeviceLocationGroup",method=RequestMethod.PUT)	
	public String modifyDeviceLocationGroup(ModifyDeviceLocationGroupMessage modifyDeviceLocationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.modifyDeviceLocationGroup(modifyDeviceLocationGroupMsg.id,modifyDeviceLocationGroupMsg.name,modifyDeviceLocationGroupMsg.remark));
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
	@RequestMapping(value="/deleteDeviceLocationGroup",method=RequestMethod.DELETE)	
	public String deleteDeviceLocationGroup(DeleteDeviceLocationGroupMessage deleteDeviceLocationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.deleteDeviceLocationGroup(deleteDeviceLocationGroupMsg.id));
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
	@RequestMapping(value="/createEquipmentFailureType",method=RequestMethod.POST)	
	public String createEquipmentFailureType(CreateEquipmentFailureTypeMessage createEquipmentFailureTypeMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createEquipmentFailureType(createEquipmentFailureTypeMsg.id,createEquipmentFailureTypeMsg.name,createEquipmentFailureTypeMsg.describeContent,createEquipmentFailureTypeMsg.remark));
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
	@RequestMapping(value="/queryEquipmentFailureType",method=RequestMethod.GET)	
	public String queryEquipmentFailureType(QueryEquipmentFailureTypeMessage queryEquipmentFailureTypeMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.queryEquipmentFailureType(queryEquipmentFailureTypeMsg.id));
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
	@RequestMapping(value="/modifyEquipmentFailureType",method=RequestMethod.PUT)	
	public String modifyEquipmentFailureType(ModifyEquipmentFailureTypeMessage modifyEquipmentFailureTypeMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.modifyEquipmentFailureType(modifyEquipmentFailureTypeMsg.id,modifyEquipmentFailureTypeMsg.name,modifyEquipmentFailureTypeMsg.describeContent,modifyEquipmentFailureTypeMsg.remark));
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
	@RequestMapping(value="/deleteEquipmentFailureType",method=RequestMethod.DELETE)	
	public String deleteEquipmentFailureType(DeleteEquipmentFailureTypeMessage deleteEquipmentFailureTypeMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.deleteEquipmentFailureType(deleteEquipmentFailureTypeMsg.id));
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
	@RequestMapping(value="/createDeviceStatus",method=RequestMethod.POST)	
	public String createDeviceStatus(CreateDeviceStatusMessage createDeviceStatusMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createDeviceStatus(createDeviceStatusMsg.id,createDeviceStatusMsg.name,createDeviceStatusMsg.remark));
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
	@RequestMapping(value="/queryDeviceStatus",method=RequestMethod.GET)	
	public String queryDeviceStatus(QueryDeviceStatusMessage queryDeviceStatusMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.queryDeviceStatus(queryDeviceStatusMsg.id));
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
	@RequestMapping(value="/modifyDeviceStatus",method=RequestMethod.PUT)	
	public String modifyDeviceStatus(ModifyDeviceStatusMessage modifyDeviceStatusMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.modifyDeviceStatus(modifyDeviceStatusMsg.id,modifyDeviceStatusMsg.name,modifyDeviceStatusMsg.remark));
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
	@RequestMapping(value="/deleteDeviceStatus",method=RequestMethod.DELETE)	
	public String deleteDeviceStatus(DeleteDeviceStatusMessage deleteDeviceStatusMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.deleteDeviceStatus(deleteDeviceStatusMsg.id));
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
	@RequestMapping(value="/createDeviceAssociationGroup",method=RequestMethod.POST)	
	public String createDeviceAssociationGroup(CreateDeviceAssociationGroupMessage createDeviceAssociationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.createDeviceAssociationGroup(createDeviceAssociationGroupMsg.id,createDeviceAssociationGroupMsg.name,createDeviceAssociationGroupMsg.remark));
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
	@RequestMapping(value="/queryDeviceAssociationGroup",method=RequestMethod.GET)	
	public String queryDeviceAssociationGroup(QueryDeviceAssociationGroupMessage queryDeviceAssociationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.queryDeviceAssociationGroup(queryDeviceAssociationGroupMsg.id));
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
	@RequestMapping(value="/modifyDeviceAssociationGroup",method=RequestMethod.PUT)	
	public String modifyDeviceAssociationGroup(ModifyDeviceAssociationGroupMessage modifyDeviceAssociationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.modifyDeviceAssociationGroup(modifyDeviceAssociationGroupMsg.id,modifyDeviceAssociationGroupMsg.name,modifyDeviceAssociationGroupMsg.remark));
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
	@RequestMapping(value="/deleteDeviceAssociationGroup",method=RequestMethod.DELETE)	
	public String deleteDeviceAssociationGroup(DeleteDeviceAssociationGroupMessage deleteDeviceAssociationGroupMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", airportSystem.deleteDeviceAssociationGroup(deleteDeviceAssociationGroupMsg.id));
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
