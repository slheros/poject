package cn.com.slhero.jvm;

/**
 * 本次  最大深度：18525
 * 
 * 
 * -Xss5m  最大深度：272628
 * @author slher
 *
 */
public class JVMTest_Stackoverflow {
	private static int count;

	public static void count() {
		try {
			count++;
			count();
		} catch (Throwable e) {
			System.out.println("最大深度：" + count);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		count();

	}
}
