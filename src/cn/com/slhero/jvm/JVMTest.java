package cn.com.slhero.jvm;

/**
 * -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
 * -XX:SurvivorRatio=2 x新生代中eden : from :to =2:1:1
 * @author slher
 *
 */
public class JVMTest {
	public static void main(String[] args) {
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b= new  byte[1 * 1024 * 1024 ];
			System.out.println("分配了" + b.length / 1024 / 1024 + "M内存");
		}

		// byte[] b = new byte[4 * 1024 * 1024 ];
		//System.out.println("分配了" + b.length / 1024 / 1024 + "M内存");

		System.out.println("最大内存：" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
		System.out.println("可以内存：" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
		System.out.println("已使用内存：" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
	}
}
