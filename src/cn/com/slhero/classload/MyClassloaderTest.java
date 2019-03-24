package cn.com.slhero.classload;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;

public class MyClassloaderTest extends ClassLoader {
	public static void main(String[] args) {
		try {
			System.out.println("��ʼ����UserV1.0�汾......");
			loadUser();
			System.gc();//�Ȼ��գ���Ȼ�޷�ɾ��
			File file1 =new File("E:\\Poject\\Eclipse\\MyPoject\\bin\\cn\\com\\slhero\\classload\\User.class");
			File file2 =new File("C:\\Users\\slhero\\Desktop\\User.class");
			if (!file1.exists()) {
				System.out.println("�Ȳ���ʧ��,file1������.......");
				return;
			}
			if (!file2.exists()) {
				System.out.println("�Ȳ���ʧ��,file2������.......");
				return;
			}

			if (!file1.delete()) {//ɾ���ļ�
				System.out.println("�Ȳ���ʧ��,�޷�ɾ���ļ�.......");
				return;
			}
			file2.renameTo(file1);//��file2�ƶ���file1λ��
			
			System.out.println("��ʼ����UserV2.0�汾......");
			loadUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadUser() throws Exception {
		MyClassloader myClassloader = new MyClassloader();
		Class<?> findUser = myClassloader.findClass("cn.com.slhero.classload.User");
		Method method = findUser.getDeclaredMethod("add");// �õ��෽��������˽�з�����
		method.setAccessible(true);
		Object invokeUser = findUser.newInstance();// �õ������
		method.invoke(invokeUser);// ͨ��������÷���������.invoke(��,����..)
	}
}
