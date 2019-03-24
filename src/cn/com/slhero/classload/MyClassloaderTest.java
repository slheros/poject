package cn.com.slhero.classload;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;

public class MyClassloaderTest extends ClassLoader {
	public static void main(String[] args) {
		try {
			System.out.println("开始加载UserV1.0版本......");
			loadUser();
			System.gc();//先回收，不然无法删除
			File file1 =new File("E:\\Poject\\Eclipse\\MyPoject\\bin\\cn\\com\\slhero\\classload\\User.class");
			File file2 =new File("C:\\Users\\slhero\\Desktop\\User.class");
			if (!file1.exists()) {
				System.out.println("热部署失败,file1不存在.......");
				return;
			}
			if (!file2.exists()) {
				System.out.println("热部署失败,file2不存在.......");
				return;
			}

			if (!file1.delete()) {//删除文件
				System.out.println("热部署失败,无法删除文件.......");
				return;
			}
			file2.renameTo(file1);//把file2移动到file1位置
			
			System.out.println("开始加载UserV2.0版本......");
			loadUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadUser() throws Exception {
		MyClassloader myClassloader = new MyClassloader();
		Class<?> findUser = myClassloader.findClass("cn.com.slhero.classload.User");
		Method method = findUser.getDeclaredMethod("add");// 得到类方法（包括私有方法）
		method.setAccessible(true);
		Object invokeUser = findUser.newInstance();// 得到类对象
		method.invoke(invokeUser);// 通过反射调用方法：方法.invoke(类,参数..)
	}
}
