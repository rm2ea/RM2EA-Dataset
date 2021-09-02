package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private CarManageRepository carManageRepository;
		public CarManageRepository getCarManageDao() {
			return carManageRepository;
		}
		@Autowired
		private Order_SRepository order_SRepository;
		public Order_SRepository getOrder_SDao() {
			return order_SRepository;
		}
		@Autowired
		private CarParkingRecordRepository carParkingRecordRepository;
		public CarParkingRecordRepository getCarParkingRecordDao() {
			return carParkingRecordRepository;
		}
		@Autowired
		private CarParkManageRepository carParkManageRepository;
		public CarParkManageRepository getCarParkManageDao() {
			return carParkManageRepository;
		}
		@Autowired
		private AppPayConfigRepository appPayConfigRepository;
		public AppPayConfigRepository getAppPayConfigDao() {
			return appPayConfigRepository;
		}
		@Autowired
		private SysUserRepository sysUserRepository;
		public SysUserRepository getSysUserDao() {
			return sysUserRepository;
		}
		@Autowired
		private SysMenuRepository sysMenuRepository;
		public SysMenuRepository getSysMenuDao() {
			return sysMenuRepository;
		}
		@Autowired
		private SysOrgRepository sysOrgRepository;
		public SysOrgRepository getSysOrgDao() {
			return sysOrgRepository;
		}
		@Autowired
		private SysRoleRepository sysRoleRepository;
		public SysRoleRepository getSysRoleDao() {
			return sysRoleRepository;
		}
	}
	