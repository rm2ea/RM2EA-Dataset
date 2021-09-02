package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface DeviceInfoRepository extends JpaRepository<DeviceInfo, Integer> ,JpaSpecificationExecutor<DeviceInfo>{
	List<DeviceInfo> findByBelongedDLG(DeviceLocationGroup deviceLocationGroup);
	List<DeviceInfo> findByBelongedEFT(EquipmentFailureType equipmentFailureType);
	List<DeviceInfo> findByBelongedDAG(DeviceAssociationGroup deviceAssociationGroup);
	List<DeviceInfo> findByBelongedDepartment(Department department);
}
