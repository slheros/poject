package cn.com.slhero.classload;

import java.io.InputStream;

public class MyClassloader extends ClassLoader {
	/**
	 * name class完整路径地址
	 */
@Override
protected Class<?> findClass(String name) throws ClassNotFoundException {

	try {
		//获取文件名
		String findName = 	name.substring(name.lastIndexOf('.')+1)+".class";
		//获取文件字节流
		InputStream in = this.getClass().getResourceAsStream(findName);
		//读取字节
		byte[] bytes = new byte[in.available()];
		in.read(bytes);
		//将读取的byte数组给JVM识别class对象
		return defineClass(name, bytes, 0,bytes.length);
	} catch (Exception e) {
		throw new ClassNotFoundException();
	}
}
}
