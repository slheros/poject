package cn.com.slhero.designmode.singleton;

public class EnumSingleton {

	// 构造函数私有化
	private EnumSingleton() {}
	public static EnumSingleton getInstance() {
		return SingletonEnum.INSTANCE.getInstance();
	}
	static enum SingletonEnum{
		INSTANCE;
		private EnumSingleton enumSingleton;
		private SingletonEnum() {
			enumSingleton = new EnumSingleton();
		}
		public EnumSingleton getInstance() {
			return enumSingleton;
		}
	}
}
