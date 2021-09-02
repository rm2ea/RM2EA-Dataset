package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private WorkReportRepository workReportRepository;
		public WorkReportRepository getWorkReportDao() {
			return workReportRepository;
		}
		@Autowired
		private WorkTaskRepository workTaskRepository;
		public WorkTaskRepository getWorkTaskDao() {
			return workTaskRepository;
		}
		@Autowired
		private TerminalEquipmentRepository terminalEquipmentRepository;
		public TerminalEquipmentRepository getTerminalEquipmentDao() {
			return terminalEquipmentRepository;
		}
		@Autowired
		private OperationStatusRepository operationStatusRepository;
		public OperationStatusRepository getOperationStatusDao() {
			return operationStatusRepository;
		}
		@Autowired
		private UserRepository userRepository;
		public UserRepository getUserDao() {
			return userRepository;
		}
		@Autowired
		private RoleRepository roleRepository;
		public RoleRepository getRoleDao() {
			return roleRepository;
		}
		@Autowired
		private DepartmentRepository departmentRepository;
		public DepartmentRepository getDepartmentDao() {
			return departmentRepository;
		}
		@Autowired
		private TbRepairRepository tbRepairRepository;
		public TbRepairRepository getTbRepairDao() {
			return tbRepairRepository;
		}
		@Autowired
		private TbRepairExtraRepository tbRepairExtraRepository;
		public TbRepairExtraRepository getTbRepairExtraDao() {
			return tbRepairExtraRepository;
		}
		@Autowired
		private ProcessingFeesRepository processingFeesRepository;
		public ProcessingFeesRepository getProcessingFeesDao() {
			return processingFeesRepository;
		}
		@Autowired
		private DeviceInfoRepository deviceInfoRepository;
		public DeviceInfoRepository getDeviceInfoDao() {
			return deviceInfoRepository;
		}
		@Autowired
		private DeviceLocationGroupRepository deviceLocationGroupRepository;
		public DeviceLocationGroupRepository getDeviceLocationGroupDao() {
			return deviceLocationGroupRepository;
		}
		@Autowired
		private EquipmentFailureTypeRepository equipmentFailureTypeRepository;
		public EquipmentFailureTypeRepository getEquipmentFailureTypeDao() {
			return equipmentFailureTypeRepository;
		}
		@Autowired
		private DeviceStatusRepository deviceStatusRepository;
		public DeviceStatusRepository getDeviceStatusDao() {
			return deviceStatusRepository;
		}
		@Autowired
		private DeviceAssociationGroupRepository deviceAssociationGroupRepository;
		public DeviceAssociationGroupRepository getDeviceAssociationGroupDao() {
			return deviceAssociationGroupRepository;
		}
	}
	