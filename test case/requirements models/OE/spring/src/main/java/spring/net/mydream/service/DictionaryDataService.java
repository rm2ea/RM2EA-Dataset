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
public class DictionaryDataService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public List<DictionaryData> listByDictCodeAndName(String dictCode,String dictDataName) throws PreconditionException{
		List<DictionaryData> dds = new ArrayList<DictionaryData>();
		
		if(StandardOPs.oclIsUndefined(dds).equals(false))
		{
			return dds;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<DictionaryData> listByDictCode(String dictCode) throws PreconditionException{
		List<DictionaryData> dds = new ArrayList<DictionaryData>();
		
		if(StandardOPs.oclIsUndefined(dds).equals(false))
		{
			return dds;
			
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
