package cn.com.slhero.designmode.singleton;

public class EagerSingleton {
	// static����������GC�������
	private static final EagerSingleton eagerSingleton = new EagerSingleton();

	// ���캯��˽�л�
	private EagerSingleton() {}

	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}
}
