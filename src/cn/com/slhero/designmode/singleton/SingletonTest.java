package cn.com.slhero.designmode.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		//EagerSingletonTest();
		//LazySingletonTest();
		EnumSingletonTest();
	}

	private static void EnumSingletonTest() {
		EnumSingleton enumSingleton_1 = EnumSingleton.getInstance();
		EnumSingleton enumSingleton_2 = EnumSingleton.getInstance();
		System.out.println(enumSingleton_1 == enumSingleton_2);
		
	}

	private static void LazySingletonTest() {
		LazySingleton lazySingleton_1 = LazySingleton.getInstance();
		LazySingleton lazySingleton_2 = LazySingleton.getInstance();
		System.out.println(lazySingleton_1 == lazySingleton_2);
		
	}

	private static void EagerSingletonTest() {
		EagerSingleton esSingleton_1 = EagerSingleton.getInstance();
		EagerSingleton esSingleton_2 = EagerSingleton.getInstance();
		System.out.println(esSingleton_1 == esSingleton_2);
	}
}
