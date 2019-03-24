package cn.com.slhero.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {
	public static void main(String[] args) {
		try {
			Class<?> invokeTestClass = Class.forName("cn.com.slhero.invoke.InvokeTest");//�õ����ļ�
			Method method = invokeTestClass.getDeclaredMethod("sum",int.class,int.class);//�õ��෽��������˽�з���������û�з���Ȩ��method.setAccessible(true);��
			Object invokeTest = invokeTestClass.newInstance();//�õ������
			method.invoke(invokeTest, 1111,5);//ͨ��������÷���������.invoke(��,����..)
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void sum(int a, int b) {
		System.out.println("sum=" + (a + b));
	}
}
