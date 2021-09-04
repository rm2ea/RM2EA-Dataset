package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface TbRepairRepository extends JpaRepository<TbRepair, Integer> ,JpaSpecificationExecutor<TbRepair>{
	List<TbRepair> findByBelongedUser(User user);
	List<TbRepair> findByBelongedDepartment(Department department);
	TbRepair findByAssoicatedTRE(TbRepairExtra tbRepairExtra);
	List<TbRepair> findByBelongedEFT(EquipmentFailureType equipmentFailureType);
	List<TbRepair> findByStatusAndBelongedUser(Object param2,Object currentUser);
}
