package spring.net.mydream.utils;
	import java.util.Optional;
	import org.springframework.stereotype.Component;
	import org.springframework.beans.factory.annotation.Autowired;
	import spring.net.mydream.dao.*;
	import spring.net.mydream.entity.*;
	@Component
	public class DaoManage {
		@Autowired
		private CustomerRepository customerRepository;
		public CustomerRepository getCustomerDao() {
			return customerRepository;
		}
		@Autowired
		private DishesRepository dishesRepository;
		public DishesRepository getDishesDao() {
			return dishesRepository;
		}
		@Autowired
		private EvaluationRepository evaluationRepository;
		public EvaluationRepository getEvaluationDao() {
			return evaluationRepository;
		}
		@Autowired
		private OrderingRepository orderingRepository;
		public OrderingRepository getOrderingDao() {
			return orderingRepository;
		}
		@Autowired
		private OrderingDishesRepository orderingDishesRepository;
		public OrderingDishesRepository getOrderingDishesDao() {
			return orderingDishesRepository;
		}
		@Autowired
		private StoreRepository storeRepository;
		public StoreRepository getStoreDao() {
			return storeRepository;
		}
	}
	