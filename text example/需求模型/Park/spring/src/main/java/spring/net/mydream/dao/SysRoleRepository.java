package spring.net.mydream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;
import java.util.Date;
import spring.net.mydream.entity.*;

public interface SysRoleRepository extends JpaRepository<SysRole, Integer> ,JpaSpecificationExecutor<SysRole>{
	SysRole findByLinkedMenu(SysMenu sysMenu);
	List<SysRole> findByLinkedUser(SysUser sysUser);
}
