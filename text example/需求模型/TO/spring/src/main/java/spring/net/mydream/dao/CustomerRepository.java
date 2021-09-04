package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface CustomerRepository extends JpaRepository<Customer, Integer> ,JpaSpecificationExecutor<Customer>{
	Customer findByPhone(Object phone);
	Customer findByName(Object name);
	Customer findByPhoneAndPassword(Object phone,Object password);
}
