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
public class EasyWebSystem{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean createDictionary(Integer id,String dictcode,String dictname) throws PreconditionException{
		Dictionary d = (Dictionary)GetData(DM.getDictionaryDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(d).equals(true))
		{
			Dictionary dd = new Dictionary();
			dd.setId(id);
			dd.setDictcode(dictcode);
			dd.setDictname(dictname);
			DM.getDictionaryDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Dictionary queryDictionary(Integer id) throws PreconditionException{
		Dictionary d = (Dictionary)GetData(DM.getDictionaryDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(d).equals(false))
		{
			return d;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDictionary(Integer id,String dictcode,String dictname) throws PreconditionException{
		Dictionary d = (Dictionary)GetData(DM.getDictionaryDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(d).equals(false))
		{
			d.setId(id);
			d.setDictcode(dictcode);
			d.setDictname(dictname);
			DM.getDictionaryDao().save(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDictionary(Integer id) throws PreconditionException{
		Dictionary d = (Dictionary)GetData(DM.getDictionaryDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(d).equals(false))
		{
			DM.getDictionaryDao().delete(d);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createDictionaryData(Integer id,String dictcode,String dictname) throws PreconditionException{
		DictionaryData dd = (DictionaryData)GetData(DM.getDictionaryDataDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			DictionaryData ddd = new DictionaryData();
			ddd.setId(id);
			DM.getDictionaryDataDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public DictionaryData queryDictionaryData(Integer id) throws PreconditionException{
		DictionaryData dd = (DictionaryData)GetData(DM.getDictionaryDataDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyDictionaryData(Integer id) throws PreconditionException{
		DictionaryData dd = (DictionaryData)GetData(DM.getDictionaryDataDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getDictionaryDataDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteDictionaryData(Integer id) throws PreconditionException{
		DictionaryData dd = (DictionaryData)GetData(DM.getDictionaryDataDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getDictionaryDataDao().delete(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createLoginRecord(Integer id) throws PreconditionException{
		LoginRecord dd = (LoginRecord)GetData(DM.getLoginRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			LoginRecord ddd = new LoginRecord();
			ddd.setId(id);
			DM.getLoginRecordDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public LoginRecord queryLoginRecord(Integer id) throws PreconditionException{
		LoginRecord dd = (LoginRecord)GetData(DM.getLoginRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyLoginRecord(Integer id) throws PreconditionException{
		LoginRecord dd = (LoginRecord)GetData(DM.getLoginRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getLoginRecordDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteLoginRecord(Integer id) throws PreconditionException{
		LoginRecord dd = (LoginRecord)GetData(DM.getLoginRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getLoginRecordDao().delete(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createMenu(Integer id) throws PreconditionException{
		Menu dd = (Menu)GetData(DM.getMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			Menu ddd = new Menu();
			ddd.setId(id);
			DM.getMenuDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Menu queryMenu(Integer id) throws PreconditionException{
		Menu dd = (Menu)GetData(DM.getMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyMenu(Integer id) throws PreconditionException{
		Menu dd = (Menu)GetData(DM.getMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getMenuDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteMenu(Integer id) throws PreconditionException{
		Menu dd = (Menu)GetData(DM.getMenuDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getMenuDao().delete(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createOperRecord(Integer id) throws PreconditionException{
		OperRecord dd = (OperRecord)GetData(DM.getOperRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			OperRecord ddd = new OperRecord();
			ddd.setId(id);
			DM.getOperRecordDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public OperRecord queryOperRecord(Integer id) throws PreconditionException{
		OperRecord dd = (OperRecord)GetData(DM.getOperRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyOperRecord(Integer id) throws PreconditionException{
		OperRecord dd = (OperRecord)GetData(DM.getOperRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getOperRecordDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteOperRecord(Integer id) throws PreconditionException{
		OperRecord dd = (OperRecord)GetData(DM.getOperRecordDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getOperRecordDao().delete(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createOrganization(Integer id) throws PreconditionException{
		Organization dd = (Organization)GetData(DM.getOrganizationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			Organization ddd = new Organization();
			ddd.setId(id);
			DM.getOrganizationDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Organization queryOrganization(Integer id) throws PreconditionException{
		Organization dd = (Organization)GetData(DM.getOrganizationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyOrganization(Integer id) throws PreconditionException{
		Organization dd = (Organization)GetData(DM.getOrganizationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getOrganizationDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteOrganization(Integer id) throws PreconditionException{
		Organization dd = (Organization)GetData(DM.getOrganizationDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getOrganizationDao().delete(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createUser(Integer id) throws PreconditionException{
		User dd = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			User ddd = new User();
			ddd.setId(id);
			DM.getUserDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public User queryUser(Integer id) throws PreconditionException{
		User dd = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyUser(Integer id) throws PreconditionException{
		User dd = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getUserDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteUser(Integer id) throws PreconditionException{
		User dd = (User)GetData(DM.getUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getUserDao().delete(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createRole(Integer id) throws PreconditionException{
		Role dd = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			Role ddd = new Role();
			ddd.setId(id);
			DM.getRoleDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Role queryRole(Integer id) throws PreconditionException{
		Role dd = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyRole(Integer id) throws PreconditionException{
		Role dd = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getRoleDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteRole(Integer id) throws PreconditionException{
		Role dd = (Role)GetData(DM.getRoleDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getRoleDao().delete(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean createUserTwo(Integer id) throws PreconditionException{
		UserTwo dd = (UserTwo)GetData(DM.getUserTwoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(true))
		{
			UserTwo ddd = new UserTwo();
			ddd.setId(id);
			DM.getUserTwoDao().save(ddd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public UserTwo queryUserTwo(Integer id) throws PreconditionException{
		UserTwo dd = (UserTwo)GetData(DM.getUserTwoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			return dd;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean modifyUserTwo(Integer id) throws PreconditionException{
		UserTwo dd = (UserTwo)GetData(DM.getUserTwoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			dd.setId(id);
			DM.getUserTwoDao().save(dd);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean deleteUserTwo(Integer id) throws PreconditionException{
		UserTwo dd = (UserTwo)GetData(DM.getUserTwoDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(dd).equals(false))
		{
			DM.getUserTwoDao().delete(dd);
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
