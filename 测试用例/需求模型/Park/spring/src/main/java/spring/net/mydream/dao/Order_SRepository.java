package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface Order_SRepository extends JpaRepository<Order_S, Integer> ,JpaSpecificationExecutor<Order_S>{
	Order_S findByPlateNumberAndParkManageId(Object plateNumber,Object parkManageId);
}
