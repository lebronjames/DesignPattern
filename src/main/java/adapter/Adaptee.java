package adapter;

/**
 * 源(Adapee)角色
 * 
 * Adaptee类并没有sampleOperation2()方法，而客户端则期待这个方法。
 * 为使客户端能够使用Adaptee类，提供一个中间环节，即类Adapter，把Adaptee的API与Target类的API衔接起来。
 * Adapter与Adaptee是继承关系，这决定了这个适配器模式是类的
 */
public class Adaptee {

	public void sampleOperation1(){
		System.out.println("sampleOperation1");
	}
}
