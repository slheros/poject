package cn.com.slhero.jvm;

/**
 * -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
 * -XX:SurvivorRatio=2 x��������eden : from :to =2:1:1
 * 
 * 
 *  def new generation   total 5120K, used 3204K [0x00000000fec00000, 0x00000000ff2a0000, 0x00000000ff2a0000)
 * eden space 3456K,  63% used [0x00000000fec00000, 0x00000000fee210b0, 0x00000000fef60000)
 * from space 1664K,  61% used [0x00000000ff100000, 0x00000000ff200010, 0x00000000ff2a0000)
 * to   space 1664K,   0% used [0x00000000fef60000, 0x00000000fef60000, 0x00000000ff100000)
 * tenured generation   total 13696K, used 532K [0x00000000ff2a0000, 0x0000000100000000, 0x0000000100000000)
 *  the space 13696K,   3% used [0x00000000ff2a0000, 0x00000000ff325250, 0x00000000ff325400, 0x0000000100000000)
 * Metaspace       used 2665K, capacity 4486K, committed 4864K, reserved 1056768K
 * class space    used 288K, capacity 386K, committed 512K, reserved 1048576K
 *
 *��������
 *eden��
 *from(s1)��
 *to��s0����
 *s0=s1
 *
 *
 *�����
 *the space
 *
 *
 *
 *
 *
 * @author slher
 *
 */
public class JVMTestNewRatio {
	public static void main(String[] args) {
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b= new  byte[1 * 1024 * 1024 ];
			//System.out.println("������" + b.length / 1024 / 1024 + "M�ڴ�");
		}

		// byte[] b = new byte[4 * 1024 * 1024 ];
		//System.out.println("������" + b.length / 1024 / 1024 + "M�ڴ�");

		System.out.println("����ڴ棺" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
		System.out.println("�����ڴ棺" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
		System.out.println("��ʹ���ڴ棺" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
	}
}
