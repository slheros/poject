package cn.com.slhero.designmode.singleton;

public class LazySingleton {
	// static����������GC�������
	private static LazySingleton lazySingleton;

	// ���캯��˽�л�
	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}
