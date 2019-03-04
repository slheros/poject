package cn.com.slhero.designmode.singleton;

public class EagerSingleton {
	// static在永久区，GC不会回收
	private static final EagerSingleton eagerSingleton = new EagerSingleton();

	// 构造函数私有化
	private EagerSingleton() {}

	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}
}
