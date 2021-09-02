package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface CarParkingRecordRepository extends JpaRepository<CarParkingRecord, Integer> ,JpaSpecificationExecutor<CarParkingRecord>{
	List<CarParkingRecord> findByOrgIdAndParkManageId(Object orgId,Object parkManageId);
}
