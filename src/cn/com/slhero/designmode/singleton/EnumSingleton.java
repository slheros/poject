package cn.com.slhero.designmode.singleton;

public class EnumSingleton {

	// ���캯��˽�л�
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
