package cn.com.slhero.classload;
/**
 * ��̬����������˳��ִ�м�class�ļ�
 * ��̬����-->���๹����-->���๹����	
 * @author slhero
 *
 */
public class ClassloadaTest {
	private static int a = 100;

	static {
		System.out.println("��̬�����ʼ��������");
		a = 300;
	}

	private static int b = 200;

	public ClassloadaTest() {
		System.out.println("��������ʼ��������");
	}

	public static void main(String[] args) {
		ClassloadaTest classloadaTest = new ClassloadaTest();
		System.out.println(classloadaTest.a+"__"+classloadaTest.b);
	}
}
