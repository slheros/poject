package cn.com.slhero.jvm;

/**
 * ����  �����ȣ�18525
 * 
 * 
 * -Xss5m  �����ȣ�272628
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
			System.out.println("�����ȣ�" + count);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		count();

	}
}
