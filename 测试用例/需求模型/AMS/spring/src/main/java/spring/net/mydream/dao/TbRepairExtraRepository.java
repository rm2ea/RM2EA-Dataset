package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface TbRepairExtraRepository extends JpaRepository<TbRepairExtra, Integer> ,JpaSpecificationExecutor<TbRepairExtra>{
	TbRepairExtra findByBelongedTbRepair(TbRepair tbRepair);
	List<TbRepairExtra> findByBelongedAssignDepart(Department department);
	List<TbRepairExtra> findByBelongedDistribution(User user);
	List<TbRepairExtra> findByBelongedRelayDep(Department department);
	List<TbRepairExtra> findByIsAcceptAndAdminAndBelongedAssignDepart(Object paramFalse,Object paramTrue,Object depart4);
	List<TbRepairExtra> findByIsAcceptAndIsCompleteAndBelongedAssignDepart(Object paramTrue,Object paramFalse,Object depart4);
	List<TbRepairExtra> findByIsCompleteAndBelongedAssignDepart(Object paramTrue,Object depart4);
}
