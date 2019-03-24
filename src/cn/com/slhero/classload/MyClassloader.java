package cn.com.slhero.classload;

import java.io.InputStream;

public class MyClassloader extends ClassLoader {
	/**
	 * name class����·����ַ
	 */
@Override
protected Class<?> findClass(String name) throws ClassNotFoundException {

	try {
		//��ȡ�ļ���
		String findName = 	name.substring(name.lastIndexOf('.')+1)+".class";
		//��ȡ�ļ��ֽ���
		InputStream in = this.getClass().getResourceAsStream(findName);
		//��ȡ�ֽ�
		byte[] bytes = new byte[in.available()];
		in.read(bytes);
		//����ȡ��byte�����JVMʶ��class����
		return defineClass(name, bytes, 0,bytes.length);
	} catch (Exception e) {
		throw new ClassNotFoundException();
	}
}
}
