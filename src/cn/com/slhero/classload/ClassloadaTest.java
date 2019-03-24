package cn.com.slhero.classload;
/**
 * 静态语句从上至下顺序执行见class文件
 * 静态代码-->父类构造器-->本类构造器	
 * @author slhero
 *
 */
public class ClassloadaTest {
	private static int a = 100;

	static {
		System.out.println("静态代码初始化。。。");
		a = 300;
	}

	private static int b = 200;

	public ClassloadaTest() {
		System.out.println("构造器初始化。。。");
	}

	public static void main(String[] args) {
		ClassloadaTest classloadaTest = new ClassloadaTest();
		System.out.println(classloadaTest.a+"__"+classloadaTest.b);
	}
}
