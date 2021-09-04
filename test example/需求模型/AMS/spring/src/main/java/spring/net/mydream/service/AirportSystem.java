package spring.net.mydream.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.net.mydream.entity.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.ServiceManage;
import spring.net.mydream.utils.StandardOPs;
import spring.net.mydream.redis.CurrentUtils;

@Service
public class AirportSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createUser(Integer id,String name,String password,String phone,Integer roleCode,Integer departmentid) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(id));
		Role role = DM.getRoleDao().findByRoleCode(roleCode);
		Department dp = (Department)GetData(DM.getDepartmentDao().findById(departmentid));
		
		if(StandardOPs.oclIsUndefined(user).equals(true) && StandardOPs.oclIsUndefined(role).equals(false) && StandardOPs.oclIsUndefined(dp).equals(false))
		{
			User u = new User();
			u.setId(id);
			u.setName(name);
			u.setPassword(password);
			u.setPhone(phone);
			u.setBelongedDepartment(dp);
			u.setBelongedRole(role);
			DM.getUserDao().save(u);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public User queryUser(Integer id) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			return user;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyUser(Integer id,String name,String password,String phone,Integer roleCode,Integer departmentid) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(id));
		Role role = DM.getRoleDao().findByRoleCode(roleCode);
		Department dp = (Department)GetData(DM.getDepartmentDao().findById(departmentid));
		
		if(StandardOPs.oclIsUndefined(user).equals(false) && StandardOPs.oclIsUndefined(dp).equals(false))
		{
			user.setId(id);
			user.setName(name);
			user.setPassword(password);
			user.setBelongedDepartment(dp);
			user.setPhone(phone);
			user.setBelongedRole(role);
			DM.getUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteUser(Integer id) throws PreconditionException{
		User user = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			DM.getUserDao().delete(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createRole(Integer id,String remark,Integer roleCode) throws PreconditionException{
		Role role = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(true))
		{
			Role r = new Role();
			r.setId(id);
			r.setRemark(remark);
			r.setRoleCode(roleCode);
			DM.getRoleDao().save(r);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Role queryRole(Integer id) throws PreconditionException{
		Role role = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			return role;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyRole(Integer id,String remark,Integer roleCode) throws PreconditionException{
		Role role = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			role.setId(id);
			role.setRemark(remark);
			role.setRoleCode(roleCode);
			DM.getRoleDao().save(role);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteRole(Integer id) throws PreconditionException{
		Role role = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			DM.getRoleDao().delete(role);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDepartment(Integer id,String name,String contactRerson,String principal,String phone,String briefInfo,String describeContent,String remark) throws PreconditionException{
		Department dep = (Department)GetData(DM.getDepartmentDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dep).equals(true))
		{
			Department d = new Department();
			d.setId(id);
			d.setName(name);
			d.setContactRerson(contactRerson);
			d.setPrincipal(principal);
			d.setPhone(phone);
			d.setBriefInfo(briefInfo);
			d.setDescribeContent(describeContent);
			d.setRemark(remark);
			DM.getDepartmentDao().save(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Department queryDepartment(Integer id) throws PreconditionException{
		Department dep = (Department)GetData(DM.getDepartmentDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dep).equals(false))
		{
			return dep;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDepartment(Integer id,String name,String contactRerson,String principal,String phone,String briefInfo,String describeContent,String remark) throws PreconditionException{
		Department dep = (Department)GetData(DM.getDepartmentDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dep).equals(false))
		{
			dep.setName(name);
			dep.setContactRerson(contactRerson);
			dep.setPrincipal(principal);
			dep.setPhone(phone);
			dep.setBriefInfo(briefInfo);
			dep.setDescribeContent(describeContent);
			dep.setRemark(remark);
			DM.getDepartmentDao().save(dep);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDepartment(Integer id) throws PreconditionException{
		Department dep = (Department)GetData(DM.getDepartmentDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dep).equals(false))
		{
			DM.getDepartmentDao().delete(dep);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDeviceInfo(Integer id,String name,String brand,String type,String address,String adminName,String contactsName,String remark) throws PreconditionException{
		DeviceInfo di = (DeviceInfo)GetData(DM.getDeviceInfoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(di).equals(true))
		{
			DeviceInfo d = new DeviceInfo();
			d.setId(id);
			d.setName(name);
			d.setBrand(brand);
			d.setType(type);
			d.setAddress(address);
			d.setAdminName(adminName);
			d.setContactsName(contactsName);
			d.setRemark(remark);
			DM.getDeviceInfoDao().save(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public DeviceInfo queryDeviceInfo(Integer id) throws PreconditionException{
		DeviceInfo dep = (DeviceInfo)GetData(DM.getDeviceInfoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dep).equals(false))
		{
			return dep;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDeviceInfo(Integer id,String name,String brand,String type,String address,String adminName,String contactsName,String remark) throws PreconditionException{
		DeviceInfo dep = (DeviceInfo)GetData(DM.getDeviceInfoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dep).equals(false))
		{
			dep.setName(name);
			dep.setBrand(brand);
			dep.setType(type);
			dep.setAddress(address);
			dep.setAdminName(adminName);
			dep.setContactsName(contactsName);
			dep.setRemark(remark);
			DM.getDeviceInfoDao().save(dep);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDeviceInfo(Integer id) throws PreconditionException{
		DeviceInfo dep = (DeviceInfo)GetData(DM.getDeviceInfoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dep).equals(false))
		{
			DM.getDeviceInfoDao().delete(dep);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDeviceLocationGroup(Integer id,String name,String remark) throws PreconditionException{
		DeviceLocationGroup dg = (DeviceLocationGroup)GetData(DM.getDeviceLocationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dg).equals(true))
		{
			DeviceLocationGroup d = new DeviceLocationGroup();
			d.setId(id);
			d.setName(name);
			d.setRemark(remark);
			DM.getDeviceLocationGroupDao().save(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public DeviceLocationGroup queryDeviceLocationGroup(Integer id) throws PreconditionException{
		DeviceLocationGroup dg = (DeviceLocationGroup)GetData(DM.getDeviceLocationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dg).equals(false))
		{
			return dg;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDeviceLocationGroup(Integer id,String name,String remark) throws PreconditionException{
		DeviceLocationGroup dg = (DeviceLocationGroup)GetData(DM.getDeviceLocationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dg).equals(false))
		{
			dg.setId(id);
			dg.setName(name);
			dg.setRemark(remark);
			DM.getDeviceLocationGroupDao().save(dg);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDeviceLocationGroup(Integer id) throws PreconditionException{
		DeviceLocationGroup dg = (DeviceLocationGroup)GetData(DM.getDeviceLocationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dg).equals(false))
		{
			DM.getDeviceLocationGroupDao().delete(dg);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createEquipmentFailureType(Integer id,String name,String describeContent,String remark) throws PreconditionException{
		EquipmentFailureType eft = (EquipmentFailureType)GetData(DM.getEquipmentFailureTypeDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(eft).equals(true))
		{
			EquipmentFailureType e = new EquipmentFailureType();
			e.setId(id);
			e.setName(name);
			e.setRemark(remark);
			e.setDescribeContent(describeContent);
			DM.getEquipmentFailureTypeDao().save(e);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public EquipmentFailureType queryEquipmentFailureType(Integer id) throws PreconditionException{
		EquipmentFailureType eft = (EquipmentFailureType)GetData(DM.getEquipmentFailureTypeDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(eft).equals(false))
		{
			return eft;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyEquipmentFailureType(Integer id,String name,String describeContent,String remark) throws PreconditionException{
		EquipmentFailureType eft = (EquipmentFailureType)GetData(DM.getEquipmentFailureTypeDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(eft).equals(false))
		{
			eft.setId(id);
			eft.setName(name);
			eft.setRemark(remark);
			eft.setDescribeContent(describeContent);
			DM.getEquipmentFailureTypeDao().save(eft);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteEquipmentFailureType(Integer id) throws PreconditionException{
		EquipmentFailureType eft = (EquipmentFailureType)GetData(DM.getEquipmentFailureTypeDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(eft).equals(false))
		{
			DM.getEquipmentFailureTypeDao().delete(eft);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDeviceStatus(Integer id,String name,String remark) throws PreconditionException{
		DeviceStatus ds = (DeviceStatus)GetData(DM.getDeviceStatusDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ds).equals(true))
		{
			DeviceStatus d = new DeviceStatus();
			d.setId(id);
			d.setName(name);
			d.setRemark(remark);
			DM.getDeviceStatusDao().save(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public DeviceStatus queryDeviceStatus(Integer id) throws PreconditionException{
		DeviceStatus ds = (DeviceStatus)GetData(DM.getDeviceStatusDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ds).equals(false))
		{
			return ds;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDeviceStatus(Integer id,String name,String remark) throws PreconditionException{
		DeviceStatus ds = (DeviceStatus)GetData(DM.getDeviceStatusDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ds).equals(false))
		{
			ds.setId(id);
			ds.setName(name);
			ds.setRemark(remark);
			DM.getDeviceStatusDao().save(ds);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDeviceStatus(Integer id) throws PreconditionException{
		DeviceStatus ds = (DeviceStatus)GetData(DM.getDeviceStatusDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(ds).equals(false))
		{
			DM.getDeviceStatusDao().delete(ds);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDeviceAssociationGroup(Integer id,String name,String remark) throws PreconditionException{
		DeviceAssociationGroup dag = (DeviceAssociationGroup)GetData(DM.getDeviceAssociationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dag).equals(true))
		{
			DeviceAssociationGroup d = new DeviceAssociationGroup();
			d.setId(id);
			d.setName(name);
			d.setRemark(remark);
			DM.getDeviceAssociationGroupDao().save(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public DeviceAssociationGroup queryDeviceAssociationGroup(Integer id) throws PreconditionException{
		DeviceAssociationGroup dag = (DeviceAssociationGroup)GetData(DM.getDeviceAssociationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dag).equals(false))
		{
			return dag;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDeviceAssociationGroup(Integer id,String name,String remark) throws PreconditionException{
		DeviceAssociationGroup dag = (DeviceAssociationGroup)GetData(DM.getDeviceAssociationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dag).equals(false))
		{
			dag.setId(id);
			dag.setName(name);
			dag.setRemark(remark);
			DM.getDeviceAssociationGroupDao().save(dag);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDeviceAssociationGroup(Integer id) throws PreconditionException{
		DeviceAssociationGroup dag = (DeviceAssociationGroup)GetData(DM.getDeviceAssociationGroupDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dag).equals(false))
		{
			DM.getDeviceAssociationGroupDao().delete(dag);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
