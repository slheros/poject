package cn.com.slhero.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
 * -XX:SurvivorRatio=2 x新生代中eden : from :to =2:1:1
 * [GC (Allocation Failure) [DefNew: 1024K->1024K(2560K), 0.0000138 secs][Tenured: 6677K->6677K(6848K), 0.0032589 secs] 7701K->7701K(9408K), [Metaspace: 2656K->2656K(1056768K)], 0.0038759 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
*  [Full GC (Allocation Failure) [Tenured: 6677K->6664K(6848K), 0.0051089 secs] 7701K->7688K(9408K), [Metaspace: 2656K->2656K(1056768K)], 0.0051698 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
 * 
 * [GC (Allocation Failure)--->回收新生代
 * [Full GC (Allocation Failure)--->回收新生代和老年代
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
 *新生代：
 *eden区
 *from(s1)区
 *to（s0）区
 *s0=s1
 *
 *
 *老年代
 *the space
 *
 *
 *
 *
 *
 * @author slhero
 *
 */
public class JVMTest_OutOfMemoryError {
	public static void main(String[] args) {
		List<Object> listObject = new ArrayList<Object>();
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			System.out.println("i:"+i);
			b= new  byte[1 * 1024 * 1024 ];
			listObject.add(b);
		}
		System.out.println("添加成功。。。。。");
	}
}
