package cn.com.slhero.jvm;

/**
 * -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
 * -XX:SurvivorRatio=2 x��������eden : from :to =2:1:1
 * @author slher
 *
 */
public class JVMTest {
	public static void main(String[] args) {
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b= new  byte[1 * 1024 * 1024 ];
			System.out.println("������" + b.length / 1024 / 1024 + "M�ڴ�");
		}

		// byte[] b = new byte[4 * 1024 * 1024 ];
		//System.out.println("������" + b.length / 1024 / 1024 + "M�ڴ�");

		System.out.println("����ڴ棺" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
		System.out.println("�����ڴ棺" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
		System.out.println("��ʹ���ڴ棺" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
	}
}
