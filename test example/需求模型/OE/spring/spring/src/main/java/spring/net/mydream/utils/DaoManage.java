package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private DictionaryRepository dictionaryRepository;
		public DictionaryRepository getDictionaryDao() {
			return dictionaryRepository;
		}
		@Autowired
		private DictionaryDataRepository dictionaryDataRepository;
		public DictionaryDataRepository getDictionaryDataDao() {
			return dictionaryDataRepository;
		}
		@Autowired
		private LoginRecordRepository loginRecordRepository;
		public LoginRecordRepository getLoginRecordDao() {
			return loginRecordRepository;
		}
		@Autowired
		private MenuRepository menuRepository;
		public MenuRepository getMenuDao() {
			return menuRepository;
		}
		@Autowired
		private OperRecordRepository operRecordRepository;
		public OperRecordRepository getOperRecordDao() {
			return operRecordRepository;
		}
		@Autowired
		private OrganizationRepository organizationRepository;
		public OrganizationRepository getOrganizationDao() {
			return organizationRepository;
		}
		@Autowired
		private RoleRepository roleRepository;
		public RoleRepository getRoleDao() {
			return roleRepository;
		}
		@Autowired
		private UserTwoRepository userTwoRepository;
		public UserTwoRepository getUserTwoDao() {
			return userTwoRepository;
		}
		@Autowired
		private UserRepository userRepository;
		public UserRepository getUserDao() {
			return userRepository;
		}
	}
	