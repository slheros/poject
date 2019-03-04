package cn.com.slhero.designmode.singleton;

public class LazySingleton {
	// static在永久区，GC不会回收
	private static LazySingleton lazySingleton;

	// 构造函数私有化
	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}
