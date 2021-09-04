package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface CarManageRepository extends JpaRepository<CarManage, Integer> ,JpaSpecificationExecutor<CarManage>{
	CarManage findByPlateNumberAndParkManageId(Object plate_number,Object park_manage_id);
}
