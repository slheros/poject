package cn.com.slhero.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {
	public static void main(String[] args) {
		try {
			Class<?> invokeTestClass = Class.forName("cn.com.slhero.invoke.InvokeTest");//得到类文件
			Method method = invokeTestClass.getDeclaredMethod("sum",int.class,int.class);//得到类方法（包括私有方法，但是没有访问权限method.setAccessible(true);）
			Object invokeTest = invokeTestClass.newInstance();//得到类对象
			method.invoke(invokeTest, 1111,5);//通过反射调用方法：方法.invoke(类,参数..)
			

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
